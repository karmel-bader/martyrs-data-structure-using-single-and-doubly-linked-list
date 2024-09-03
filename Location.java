package phase1;

public class Location implements Comparable<Location>{
	private String location;
	private SingleLinkedList<Martyr> martyr;

	

	public Location(String location) {
		this.location = location;
		martyr = new SingleLinkedList<Martyr>();
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	public SingleLinkedList<Martyr> getMartyr() {
		return martyr;
	}

	public void setMartyr(SingleLinkedList<Martyr> martyr) {
		this.martyr = martyr;
		
	}

	@Override
	public int compareTo(Location o) {
		return this.location.toLowerCase().compareTo(o.getLocation().toLowerCase());
	}


	@Override
	public String toString() {
		return  this.location;
	}

	public boolean addMartyr(Martyr newMartyr) {
		if(martyr.insert(newMartyr) == false) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public boolean equals(Object obj) {
		return this.location.equals(((Location)obj).getLocation());
	}

	
	

}

