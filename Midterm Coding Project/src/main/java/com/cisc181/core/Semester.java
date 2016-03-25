package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID SemesterID = UUID.randomUUID();
	private Date startDate = new Date();
	private Date endDate;
	
	public Semester(){
		
	}
	
	public void ending(){
		endDate = new Date();
	}

	public UUID getSemesterID() {
		return SemesterID;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
