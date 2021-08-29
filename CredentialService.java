package com.greatlearning.lab1OOPs;

import java.util.*;

public class CredentialService {
	
	private String fName;
	private String lName;
	private String deprt;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getdeprt() {
		return deprt;
	}
	
	public void setdeprt(String deprt) {
		this.deprt = deprt;
	}
	
	String generatePassword() {
		String pwd = "";
		int r = 0;
		
		Random rnd = new Random();
		r = rnd.nextInt(999);
		
		if (r<10) {
			r += 100;
		} else if (r < 100) {
			r += 10;
		}
		
		pwd = r + "Aa@";
		
		return pwd;
	}
	
	String generateEmailAddress() {
		return fName + lName + "." + deprt + "@abc.com";
	}
	
	void showCredentials() {
		System.out.println("Dear " + fName + " your generated credentials are as follows : ");
		System.out.println("Email --> " + this.generateEmailAddress());
		System.out.println("Password --> " + this.generatePassword() + "\n\n");
		
	}
}
