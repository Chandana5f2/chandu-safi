package com.dfs;

import java.util.Date;

public class Main {
	static StudentArrayOperation studInterface = new StudentGroup(4);
	public static void main(String[] args) {
	
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Student stud1 = new Student(1, "harika", new Date(), 25.20);
		Student stud2 = new Student(2, "bahijith", new Date(), 25.20);
		Student stud3 = new Student(3, "pinky", new Date(), 25.20);
		Student stud4 = new Student(4, "you", new Date(), 25.20);
		studInterface.add(stud1, 0);
		studInterface.add(stud2, 1);
		studInterface.add(stud3, 2);
		studInterface.add(stud4, 3);
		try {
		System.out.println(studInterface.getStudent(0));
		}catch(Exception e) {}
	}

}
