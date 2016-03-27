package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID sectionID;
	private UUID studentID;
	private UUID enrolmentID;
	private double grade;

	@SuppressWarnings("unused")
	private Enrollment(){
		
	}
	
	public Enrollment(UUID sectionID, UUID studentID){
		enrolmentID = UUID.randomUUID();
	}

	public UUID getSectionID() {
		return sectionID;
	}

	public UUID getStudentID() {
		return studentID;
	}

	public UUID getEnrolmentID() {
		return enrolmentID;
	}

	public double getGrade() {
		return grade;
	}
	
	@SuppressWarnings("unused")
	private void setGrade(double grade){
		this.grade = grade;
	}
}
