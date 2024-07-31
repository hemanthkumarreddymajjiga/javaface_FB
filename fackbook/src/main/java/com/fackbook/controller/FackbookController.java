package com.fackbook.controller;

import java.util.Scanner;

import com.fackbook.entity.Facebookuser;
import com.fackbook.service.FackbookService;
import com.fackbook.service.FackbookServiceInterface;

public class FackbookController implements FacebookControllerInterface {

	@Override
	public void createProfileController() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("enter your password");
		String pass=sc.next();
		System.out.println("Enter your Email");
		String email=sc.next();
		System.out.println("Enter your Address");
		String address=sc.next();
		
		Facebookuser fu=new Facebookuser();
		
		fu.setName(name);
		fu.setPass(pass);
		fu.setEmail(email);
		fu.setAddress(address);
		
		FackbookServiceInterface fi=new FackbookService();
		
		int i=fi.createProfileService(fu);
		if(i>0) {
			System.out.println("Profile is created");
		}
		else {
			System.out.println("Profile rejected");
		}
		
		
		
		
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		
	}

}
