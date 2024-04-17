package com.bankdetails.over;
import java.util.*;
import java.util.Random;

public class BankVerification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   ABCBank bank =new ABCBank();
	   
	
		// TODO Auto-generated method stub
      long accountnumber;
	  System.out.println("Enter the account number");
	  accountnumber=sc.nextLong();
	  while(true)
	  
		  if(accountnumber>0)
		  {	  
		  break;	  
	  }
	  else
	  {
		  System.out.println("Enter the valid data");
		  accountnumber=sc.nextLong();
	  }
	  bank.setAccountnumber( accountnumber);
	  
	  
	  
	  long amount;
	  System.out.println("Enter the amount");
	  amount=sc.nextLong();
	  while(true)
		  
		  if(amount>0)
		  {	  
		  break;	  
	  }
	  else
	  {
		  System.out.println("Enter the valid data");
		  amount=sc.nextLong();
	  }
	  bank.setAmount(amount);
	  
	  long mobileno;
	  System.out.println("Enter the mobileno:");
	  mobileno=sc.nextLong();
      while(true)
		  
		  if(mobileno>0)
		  {	  
		  break;	  
	  }
	  else
	  {
		  System.out.println("Enter the valid data");
		  mobileno=sc.nextLong();
	  }
     bank.setMobileno(mobileno);
      
	  String name;
	  String s1="^[A-Za-z]+$";
	  System.out.println("Enter the name:");
	  name=sc.next();
	  while(true)
	  {
		  if(name.matches(s1)) {
			  break;
		  }
		  System.out.println("Enter the username again:");
		  name=sc.next();
	  }
	  bank.setName(name);
	   
	  
	  String ifsc;
	  String s2="^[A-Za-z0-9]+$";
	  System.out.println("Enter the IFSCCODE:");
	  ifsc=sc.next();
	  while(true)
	  {
		  if(ifsc.matches(s2)) {
			  break;
		  }
		  System.out.println("Enter the IFSCCODE again:");
		  ifsc=sc.next();
	  }
	  bank.setIfsc(ifsc);
	  
	  String location;
	  String s3="^[A-Za-z]+$";
	  System.out.println("Enter the location:");
	  location=sc.next();
	  while(true)
	  {
		  if(location.matches(s3)) {
			  break;
		  }
		  System.out.println("Enter the location again:");
		  location=sc.next();
	  }
	  
	  
	  String bankname;
	  String s4="^[A-Za-z]+$";
	  System.out.println("Enter the bankname:");
	  bankname=sc.next();
	  while(true)
	  {
		  if(bankname.matches(s4)) {
			  break;
		  }
		  System.out.println("Enter the bank name again:");
		  bankname=sc.next();
	  }
	  bank.setBankname(bankname);
	  
	  BankDetailsMain b=new BankDetailsMain();
	  b.deposit(bank.getAccountnumber(),bank.getAmount(),bank.getMobileno());
	  b.deposit(bank.getName(),bank.getMobileno(),bank.getAmount());
	  b.deposit(bank.getIfsc(),bank.getLocation(),bank.getBankname());
	  b.deposit(bank.getAmount());
	  
	 
	  
	}


		// TODO Auto-generated method stub
		
	}