package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;
import com.cisc181.exceptions.PersonExceptions;

@SuppressWarnings("serial")
public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email) throws PersonExceptions
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.setMajor(Major);
		
	}
	
	public String getMajor ( )
    {
        return this.Major.name();
    }
	
    public void setMajor (String Major)
    {
        this.Major = eMajor.valueOf("Major");    
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}