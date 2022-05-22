package silsub4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	
	{
		grade = 3;
		classroom = 5;
		name = "Àü´ö¼ö";
		height = 172.4;
		gender = 'M';
	}
	
	public int setGrade() {
		return grade;
	}
	public int setClassroom() {
		return classroom;
	}
	public String setName() {
		return name;
	}
	public double setHeight() {
		return height;
	}
	public char setGender() {
		return gender;
	}
	public void getGrade(int grade) {
		this.grade = grade;
	}
	public void getClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void getName(String name) {
		this.name = name;
	}
	public void getHeight(double height) {
		this.height = height;
	}
	public void getGender(char gender) {
		this.gender = gender;
	}
	
	public String information () {
		return "grade = " + grade + ",classroom=" + classroom + ",name=" + name 
				+",height=" + height + ",gender=" + gender;
	}
}
