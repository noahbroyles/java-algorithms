package vectors;

public class Vector {
	
	private Student[] students = new Student[100];
	private int totalStudents = 0;
	
	private boolean occupiedPosition(int position) {
		return position >= 0 && position <= this.totalStudents;
	}
	
	public void add(Student student) {
		moreSpace();
		this.students[this.totalStudents] = student;
		this.totalStudents++;
	}
	
	public void add(int position, Student student) {
		moreSpace();
		if(!this.occupiedPosition(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		
		for(int i = this.totalStudents -1; i >= position; i -=1) {
			this.students[i + 1] = this.students[i];
		}
		
		this.students[position] = student;
		this.totalStudents ++;
	}
	
	public Student take(int position) {
		if(!this.occupiedPosition(position)) {
			throw new IllegalArgumentException("Invalid position");
		}
		return this.students[position];
	}
	
	public void remove(int position) {
		this.students[position] = null;
	}
	
	public boolean contains(Student student) {
		for(int i = 0; i < this.totalStudents; i++) {
			if(student.equals(this.students[i])) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return this.totalStudents;
	}
	
	public String toString() {
		if(this.totalStudents == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("[");
		for(int i = 0; i < this.totalStudents - 1; i++) {
			builder.append(this.students[i]);
			builder.append(",");
			
		}
		builder.append(this.students[this.totalStudents - 1]);
		builder.append("]");
		return builder.toString();
	}
	
	private void moreSpace() {
		if(this.totalStudents == this.students.length) {
			Student[] newArray = new Student[this.students.length * 2];
			for(int i = 0; i < this.students.length; i++) {
				newArray[i] = this.students[i];
			}
			this.students = newArray;
		}
	}

}
