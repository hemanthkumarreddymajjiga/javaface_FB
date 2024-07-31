package com.fackbook.view;

import java.util.Scanner;

import com.fackbook.controller.FacebookControllerInterface;
import com.fackbook.controller.FackbookController;

public class FacebookView {

	
	public static void main(String[] args) {
		
		System.out.println("****************MAIN MENU ****************");
		System.out.println("Press 1 to Create profile");
		System.out.println("Press 2 to view profile");
		System.out.println("Press 3 to delete profile");
		System.out.println("Press 4 to edit Profile");
		System.out.println("Press 5 to serach profile");
		System.out.println("Press 6 to view all profile");
		System.out.println("Press 7 to login profile");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		FacebookControllerInterface fc=new FackbookController();
		
		switch(ch) {
		case 1:	fc.createProfileController();
			break;
		case 2: fc.viewProfileController();
			break;
		case 3:	fc.deleteProfileController();
			break;
		case 4:	fc.editProfileController();
			break;
		case 5:	fc.searchProfileController();
			break;
		case 6:	fc.viewAllProfileController();
			break;
		case 7:	fc.loginProfileController();
			break;
		default:
			System.out.println("Worng choice");
		
		}
		
	}

}
