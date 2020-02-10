package vectors;

public class Student {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
	
	public boolean equals(Object o) {
		Student other = (Student)o;
		return this.name.equals(other.name);
	}
	

}
