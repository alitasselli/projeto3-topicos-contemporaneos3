package payroll;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BusinessController {

  private final BusinessRepository repository;

  BusinessController(BusinessRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/Businesss")
  List<Business> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/Businesss")
  Business newBusiness(@RequestBody Business newBusiness) {
    return repository.save(newBusiness);
  }

  // Single item
  
  @GetMapping("/Businesss/{id}")
  Business one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new BusinessNotFoundException(id));
  }

  @PutMapping("/Businesss/{id}")
  Business replaceBusiness(@RequestBody Business newBusiness, @PathVariable Long id) {
    
    return repository.findById(id)
      .map(Business -> {
        Business.setDescription(newBusiness.getDescription());
        Business.setTax(newBusiness.getTax());
        Business.setInsurance(newBusiness.getInsurance());
        return repository.save(Business);
      })
      .orElseGet(() -> {
        newBusiness.setId(id);
        return repository.save(newBusiness);
      });
  }

  @DeleteMapping("/Businesss/{id}")
  void deleteBusiness(@PathVariable Long id) {
    repository.deleteById(id);
  }
}