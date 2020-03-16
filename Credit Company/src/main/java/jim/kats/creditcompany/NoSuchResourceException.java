package jim.kats.creditcompany;

public class NoSuchResourceException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	private int resourceId;
	private String resourceType;

	public NoSuchResourceException(String resourceType, int resourceId) {
		super();
		this.resourceType = resourceType;
		this.resourceId = resourceId;
	}
	
	public int getResourceId() {
		return resourceId;
	}
	
	public String getResourceType() {
		return resourceType;
	}

}
