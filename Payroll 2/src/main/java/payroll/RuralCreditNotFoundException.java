package payroll;

public class RuralCreditNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private Long id;
	public RuralCreditNotFoundException(Long id) {
		super("Could not find employee " + id);
		this.id = id;
	}
	public Long getId() {
		return id;
	}
}