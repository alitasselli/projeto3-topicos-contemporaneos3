package payroll;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class RuralCreditController {

  private final RuralCreditRepository repository;

  RuralCreditController(RuralCreditRepository repository) {
    this.repository = repository;
  }


  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/RuralCredit")
  List<RuralCredit> all() {
    return repository.findAll();
  }
  // end::get-aggregate-root[]

  @PostMapping("/RuralCredit")
  RuralCredit newRuralCredit(@RequestBody RuralCredit newRuralCredit) {
    return repository.save(newRuralCredit);
  }

  // Single item
  
  @GetMapping("/RuralCredit/{id}")
  RuralCredit one(@PathVariable Long id) {
    
    return repository.findById(id)
      .orElseThrow(() -> new RuralCreditNotFoundException(id));
  }
  
  @DeleteMapping("/RuralCredit/{id}")
  void deleteRuralCredit(@PathVariable Long id) {
    repository.deleteById(id);
  }

 // @PutMapping("/RuralCredit/{id}")
 // RuralCredit replaceRuralCredit(@RequestBody RuralCredit newRuralCredit, @PathVariable Long id) {
    
   // return repository.findById(id)
     // .map(RuralCredit -> {
    	// RuralCredit.setCpf(newRuralCredit.getCpf());
    	// RuralCredit.setDateCredit(newBusiness.getDateCredit());
    	// RuralCredit.setNumCredit(newBusiness.getNumCredit());
       // return repository.save(Business);
     // })
     // .orElseGet(() -> {
       // newRuralCredit.setId(id);
       // return repository.save(newRuralCredit);
     // });
  //}

}