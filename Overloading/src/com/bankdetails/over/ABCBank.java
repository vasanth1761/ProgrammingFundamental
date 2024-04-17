package com.bankdetails.over;

public class ABCBank {

 
		// TODO Auto-generated method stub
		long accountnumber;
		long amount;
		long mobileno;
	    String name;
		String ifsc;
		String location;
		String bankname;
			
		public  ABCBank(){
			
		}
		public long getAccountnumber() {
			return accountnumber;
		}
		public void setAccountnumber(long accountnumber) {
			this.accountnumber = accountnumber;
		}
		public long getAmount() {
			return amount;
		}
		public void setAmount(long amount) {
			this.amount = amount;
		}
		public long getMobileno() {
			return mobileno;
		}
		public void setMobileno(long mobileno) {
			this.mobileno = mobileno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getIfsc() {
			return ifsc;
		}
		public void setIfsc(String ifsc) {
			this.ifsc = ifsc;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		public ABCBank(long accountnumber, long amount, long mobileno, String name, String ifsc, String location,
				String bankname) {
			super();
			this.accountnumber = accountnumber;
			this.amount = amount;
			this.mobileno = mobileno;
			this.name = name;
			this.ifsc = ifsc;
			this.location = location;
			this.bankname = bankname;
		}
		

}
