package com.masai;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
public class Main {

	
	
	

	
public static void main(String[] args) {
	CunsomerService cunsomerService=new CunsomerService();
	
	boolean flag=true;
	
	while(flag){
	
		System.out.println("  0 :  Exit         ");
		System.out.println("  1 :  Admin Login  ");
		System.out.println("  2 :  User Login   ");
		
		
		Scanner sc = new Scanner(System.in);
		try {
			int res=sc.nextInt();
			if(res==1) {
				
				
				Admin admin = new Admin();
				
				flag = admin.adminMethod(cunsomerService);
			}else if(res==2) {
				flag=cunsomerService.consumerFunction();
			}else {
				
			flag=false;
			cunsomerService.consumerFileSaver("resourse//newConsumer.txt");
			cunsomerService.consumerFileSaver("resourse//Consumer.txt");
				System.out.println("Program Exited");
				
			}
		}
		catch (Exception e) {
            System.out.println(e.getMessage());
            cunsomerService.consumerFileSaver("resourse//newConsumer.txt");
            cunsomerService.consumerFileSaver("resourse//Consumer.txt");
			System.err.println("Program Ended");
			flag =false;
		}
		
		
	}
	
	
}






}
