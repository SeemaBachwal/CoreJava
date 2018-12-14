package com.collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

class Student{

	private int id;
	private String name;
	private String dept;
	
	public Student(int id, String name, String dept) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(108, "John", "Science");
		Student s2 = new Student(110, "Jack", "Physics");
		Student s3 = new Student(101, "Marry", "Chemistry");
		Student s4 = new Student(104, "Jill", "Maths");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()){
			
			Student s = itr.next();
			System.out.println("Name : "+s.getName());
			
			// Below commented code will give me ConcurrentModificationException
			// Student newS = new Student(1, "NewStudent", "NewDept");
			// al.add(newS);
			
			//System.out.println("Removed");
		}
		itr.remove();
		System.out.println("List Size now : "+al.size());
		
		Iterator<Student> itr1 = al.iterator();
		while(itr1.hasNext()){
			
			Student s = itr1.next();
			System.out.println("Name : "+s.getName());
			
			// Below commented code will give me ConcurrentModificationException
			// Student newS = new Student(1, "NewStudent", "NewDept");
			// al.add(newS);
			
			//System.out.println("Removed");
		}
	}
}
