package com.bankdetails.over;
import java.util.regex.Matcher;

public class BankDetailsMain {

	 public void deposit(long accountnumber,double amount,long mobileno)
	 {
		 
		 System.out.println("ACC.  "+accountnumber + "  RS."   +amount+ "  PH" +mobileno);
	 
	 }
	 public void deposit(String name,long mobileno,double amount)
	 {
		 System.out.println("HOlder "+name+ "  RS."+amount+ "  PH"+mobileno);
	 
	 }	
	 public void deposit(String ifsc,String location,String bankname)
	 {
		 System.out.println("IFSC"+ifsc+ "  location"+location+ "  Bankname"+bankname);
	 }
	 public void deposit(double amount)
	 {
		 System.out.println("Amount:"+amount);
	 }
		
		
		
	
	
	



}
