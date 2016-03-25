package com.cisc181.exceptions;

import java.util.Date;
import com.cisc181.core.Person;

@SuppressWarnings("serial")
public class PersonExceptions extends Exception{
	
	private Person person;

	public PersonExceptions(){
		super();
	}
	
	public PersonExceptions(Date DOB){
		super();
		System.out.println("Birthdate invallid.");
		try {
			this.person.setDOB(DOB);
		} catch (PersonExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	public PersonExceptions(String phoneNumber){
		super();
		System.out.println("Phone number incorrectly formatted, please use(XXX)-XXX-XXXX.");
		try {
			this.person.setPhone(phoneNumber);
		} catch (PersonExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
