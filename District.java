package phase1;

public class District implements Comparable<District>{
	private String district;
	private SingleLinkedList<Location> location;

	

	public District(String district) {
		super();
		this.district = district;
		this.location = new SingleLinkedList<Location>();
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	
	
	public SingleLinkedList<Location> getLocation() {
		return location;
	}

	public void setLocation(SingleLinkedList<Location> location) {
		this.location = location;
	}

	@Override
	public int compareTo(District o) {
		return this.district.toLowerCase().compareTo(o.getDistrict().toLowerCase());
		
	}

	@Override
	public String toString() {
		return district;
	}
	
	public void insertLocation(Location data) {
		location.insert(data);
	}
	
	

}
