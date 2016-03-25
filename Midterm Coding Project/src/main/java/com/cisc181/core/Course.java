package com.cisc181.core;

import java.util.UUID;

public class Course {
	
	private UUID CourseID = UUID.randomUUID();
	private int gradePoints;
	private String courseName;
	
	public Course(){
		
	}
	
	public Course(String Name, int Grade){
		setCourseName(Name);
		setGradePoints(Grade);
	}

	public UUID getCourseID() {
		return CourseID;
	}

	public int getGradePoints() {
		return gradePoints;
	}

	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
