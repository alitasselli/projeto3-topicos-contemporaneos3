package payroll;

public class BusinessNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private Long id;
	public BusinessNotFoundException(Long id) {
		super("Could not find employee " + id);
		this.id = id;
	}
	public Long getId() {
		return id;
	}
}