package phase1;

public class Martyr implements Comparable<Martyr>{
	private String name;
	private String date;
	private int age;
	private String location;
	private String ditrict;
	private String gender;
	
	public Martyr(String name, String date, int age, String location, String ditrict, String gender) {
		this.name = name;
		this.date = date;
		this.age = age;
		this.location = location;
		this.ditrict = ditrict;
		this.gender = gender;
	}
	
	

	public Martyr(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDitrict() {
		return ditrict;
	}

	public void setDitrict(String ditrict) {
		this.ditrict = ditrict;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(Martyr o) {
		return this.age - o.getAge();
	}

	@Override
	public String toString() {
		return name + ", " + age + ", "+ gender + "\n        " + date + ", " + location + ", " + ditrict;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Martyr)obj).getName());
	}
	
	
	
	

}
