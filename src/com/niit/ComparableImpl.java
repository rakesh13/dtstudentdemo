package com.niit;

import java.util.Set;
import java.util.TreeSet;

public class ComparableImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Student> students=new TreeSet<>();
		students.add(new Student(101,"Chandan","chandan@gmail.com"));
		students.add(new Student(102, "Rakesh", "rakesh@gmail.com"));
		students.add(new Student(103,"Purushottam","purushottam@gmail.com"));
		
		for(Student s:students)
		{
			System.out.println("Sid : "+s.getSid()+" Name : "+s.getName()+" Email ID : "+s.getEmailId());
		}
	}

}
