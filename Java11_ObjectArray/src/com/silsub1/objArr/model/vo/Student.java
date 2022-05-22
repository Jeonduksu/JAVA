package com.silsub1.objArr.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private int number;
	private String name;
	
	public Student() {}
	
	
			
	public Student(int grade,int classroom, int number, String name) {
	  this.grade = grade;
	  this.classroom = classroom;
	  this.number = number;
	  this.name = name;
	}
	
	public int setGrade() {
		return grade;
	}
	public int setClassroom() {
		return classroom;
	}
	public int setNumber() {
		return number;
	}
	public String setName() {
		return name;
	}
	public void getGrade(int grade) {
		this.grade = grade;
	}
	public void getClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void getNumber(int number) {
		this.number = number;
	}
	public void getName(String name) {
		this.name = name;
	}
	
	public String information() {
		return grade + "학년" + classroom + "반" + number + "번" + name;
	}
}
