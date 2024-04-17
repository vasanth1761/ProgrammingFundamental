package com.encapsulation.oops;
import java.util.*;

public class StudentDetailsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
	    StudentDetails student=new StudentDetails();
	    System.out.println("Enter the student id:");
	    int no=sc.nextInt();
	    no=checkid(no);
	    student.setStudentid(no);
	    
	    String s1="^[A-Za-z]+$";
	    System.out.println("Enter the student name:");
	    String name=sc.next();
	    while(true)
		  {
			  if(name.matches(s1)) {
				  break;
			  }
			  System.out.println("Enter the username again:");
			  name=sc.next();
		  }
	    student.setName(name);
	    
	    System.out.println("Enter the student year:");
	    int year=sc.nextInt();
	    while(true)
	    	if(year>0)
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		System.out.println("Enter the valid data:");
	    		year=sc.nextInt();
	    	}
	    student.setYear(year);
        
	    String s2="^[A-Za-z]+$";
	    System.out.println("Enter the student location:");
	    String location=sc.next();
	    while(true)
		  {
			  if(location.matches(s2)) {
				  break;
			  }
			  System.out.println("Enter the username again:");
			  location=sc.next();
		  }
	    
	    student.setLocation(location);
	    
	    String s3="^[A-Za-z]+$";
	    System.out.println("Enter the student Blood group:");
	    String bloodgroup=sc.next();
	    while(true)
		  {
			  if(bloodgroup.matches(s1)) {
				  break;
			  }
			  System.out.println("Enter the username again:");
			  bloodgroup=sc.next();
		  }
	    
	    student.setBloodgroup(bloodgroup);
	    
	    System.out.println("Enter the student percentage:");
	    int percentage=sc.nextInt();
	    while(true)
	    	if(percentage>0)
	    	{
	    		break;
	    	}
	    	else
	    	{
	    		System.out.println("Enter the valid data:");
	    		percentage=sc.nextInt();
	    	}
        student.setPercentage(percentage);
       
        
        //print ouput
	    System.out.println("Student id:"+student.getStudentid());
	    System.out.println("Student Name:"+student.getName());
	    System.out.println("Student Year:"+student.getYear());
	    System.out.println("Student Location:"+student.getLocation());
	    System.out.println("Student Bloodgroup:"+student.getBloodgroup());
	    System.out.println("Student Percentage:"+student.getPercentage()+"%");
		          
 
	}
	public static int checkid(int no)
	{
		while(true)
		
	    if(no>0)
		{
			return no;	
		}
		else
		{    
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the valid data:");
			 no=s.nextInt();
			
		}
	}

}
