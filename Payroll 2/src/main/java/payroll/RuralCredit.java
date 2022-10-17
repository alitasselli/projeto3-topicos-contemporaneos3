package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table (name = "ruralCredit")
public class RuralCredit {
  @Id
  @SequenceGenerator(
		  name = "ruralCredit_sequence",
		  sequenceName = "ruralCredit_sequence",
		  allocationSize = 1
  )
  @GeneratedValue(
		  strategy = GenerationType.SEQUENCE,
		  generator = "ruralCredit_sequence"
  )
  private Long id;
  private String cpf;
  private Date dateCredit;
  private Long numCredit;
  
  public Long getId() {
    return this.id;
  }

  public String getCpf() {
	    return this.cpf;
  }
  
  public Date getDateCredit() {
    return this.dateCredit;
  }

  public Long getNumCredit() {
	return this.numCredit;
  }
  
  public void setId(Long id) {
    this.id = id;
  }

  public void setCpf(String cpf) {
	    this.cpf = cpf;
  }
  
  @Temporal(TemporalType.DATE)
  public void setDateCredit(Date dateCredit) {
      this.dateCredit = dateCredit;
  }

  public void setNumCredit(Long numCredit) {
    this.numCredit = numCredit;
  }
}
  
 