package com.masai;
import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Admin {
	CunsomerService service=null;

	final String admin_Name="Kuldeep";
	final String admin_Password="123456";
	
	boolean Status=false;
	boolean flag=true;
	
	
	
	

	
	public boolean adminLoginSuccess() throws IOException {
		boolean isAvail=!service.newConsumerList.isEmpty();
		Status=true;
		boolean isExit =false;
		while(Status) {
			
			System.out.println("           Admin Section               ");
			
			System.out.println("   1 : Register  New Consumer          ");
			System.out.println("   2 : View All  Bill Of Consumer      ");
			System.out.println("   3 : View All  Bills                 ");
			System.out.println("   4 : Delete Consumer Account         ");
         
        	System.out.println("   5 : View All Consumers              ");
			
			System.out.println("   6 : Back                            ");
			System.out.println("   7 : Generate Bill                   ");
			System.out.println("   8 : Paid & pending Bills            ");
			System.out.println("   0 : Exit                            ");
			
			
			Scanner sc=new Scanner (System.in);
			int res=sc.nextInt();
			switch (res) {
			
			case 5:
				
				service.printAllConsumer();
					
				
				break;
			case 1:
		
				System.out.println("New Register");
				Status=  service.newConsumerRegister();
				if(!Status) {
					isExit=true;
				}
				
				break;
			case 2:
				service.viewAllBillOfConsumer();
				break;
			case 3:
				service.viewAllBill();
				break;
			case 4:
				service.deleteConsumer();
				break;
			case 7:
				service.generateBillForAllConsumer();
				System.out.println("All Bills Generated");
				break;
			case 8:
				service.viewAllBillPaidAndPending();
				break;
			case 6:
				System.out.println("Back");
				Status =false;
				
				break;
				default:
					service.consumerFileSaver("resourse//newConsumer.txt");
					service.consumerFileSaver("resourse//Consumer.txt");
					isExit=true;
					Status=false;
					}
		}
		if(isExit){
			return Status;
		}
		else {
			return true;
		}
		
		}
	
	public boolean adminMethod(CunsomerService service) throws IOException {
		
		
		
		System.out.println(" Admin Name ");
		
		Scanner sc = new Scanner(System.in);
		
		String inputUserName=sc.nextLine();
		if(inputUserName.equals(this.admin_Name)) {
			
			System.out.println(" Admin Password ");
			
			String inputUserPassword=sc.nextLine();
			
			if(inputUserPassword.equals(this.admin_Password)) {
				this.service=service;
				return adminLoginSuccess();
				
			}else {
				
				System.out.println("Wrong Password");
				return true;
			}
		}else {
			System.out.println("Wrong Admin Name");
			return true;
		}
	}
	
}
