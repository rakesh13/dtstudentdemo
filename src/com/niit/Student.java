package com.niit;

public class Student implements Comparable<Student>{

	private int sid;
	private String name,emailId;
	
	
	public int getSid() {
		return sid;
	}
	public Student(int sid,String name, String emailId) {
		this.sid=sid;
		this.name=name;
		this.emailId=emailId;
	}
	public String getName() {
		return name;
	}
	public String getEmailId() {
		return emailId;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.getName());
	}

}
