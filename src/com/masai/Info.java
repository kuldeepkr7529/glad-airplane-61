package com.masai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Info {
	
	
public void showAllConsumer() throws IOException {
	
	FileReader f=new FileReader("C:\\Users\\DeLL\\Desktop\\glad-airplane-61\\resourse\\newConsumer.txt");
	
	BufferedReader br=new BufferedReader(f);
	
	String line=br.readLine();
	

        System.out.println("       All Consumer List       ");
        System.out.println();
        
    while(line != null){

    	
        String[] str= line.split(":");
        String[] addr=str[2].split(",");
       
        System.out.println(" Name"+"-"+str[0]+" "+str[1]);
        System.out.println("           Address         ");
        
        System.out.println(" LandMark/Street -"+addr[2]+" "+addr[3]);
        System.out.println(" City/State/Pin  -"+addr[4]+" "+addr[5]+" "+addr[6]);
        
        System.out.println();
       
        System.out.println();
        line=br.readLine();
        
    }
    
    br.close();
    
}
	public static void main(String[] args) throws IOException {
		Info cls=new Info();
	cls.showAllConsumer();
	}
	
	
}
