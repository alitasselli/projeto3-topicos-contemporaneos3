package payroll;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name = "business")
public class Business {
  @Id
  @SequenceGenerator(
		  name = "business_sequence",
		  sequenceName = "business_sequence",
		  allocationSize = 1
  )
  @GeneratedValue(
		  strategy = GenerationType.SEQUENCE,
		  generator = "business_sequence"
  )
  private Long id;
  
  @Column(length = 12, nullable = false)
  private String codee;
  
  @Column(length = 50, nullable = false)
  private String description;
  
  @Column(length = 12, nullable = false)
  private Integer tax;
  
  @Column(length = 12, nullable = false)
  private Integer insurance;

  Business() {}

  Business(String description, Long id) {

    this.description = description;
    this.id = id;
  }

  public Long getId() {
    return this.id;
  }

  public String getCodee() {
	    return this.codee;
  }
  
  public String getDescription() {
    return this.description;
  }

  public Integer getTax() {
    return this.tax;
  }

  public Integer getInsurance() {
	return this.insurance;
  }
  
  public void setId(Long id) {
    this.id = id;
  }

  public void setCodee(String codee) {
	    this.codee = codee;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }
  
  public void setInsurance(Integer insurance) {
	    this.insurance = insurance;
  }
 
  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Business))
      return false;
    Business employee = (Business) o;
    return Objects.equals(this.id, employee.id) && Objects.equals(this.description, employee.description)
        && Objects.equals(this.tax, employee.tax) && Objects.equals(this.insurance, employee.insurance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.codee, this.description, this.tax, this.insurance);
  }

 
  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", description='" + this.description + ", codee='" + this.codee +  ", insurance='" + this.insurance + '\'' + ", tax='" + this.tax + '\'' + '}';
  }
}
