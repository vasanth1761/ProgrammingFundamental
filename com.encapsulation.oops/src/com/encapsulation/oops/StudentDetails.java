package com.encapsulation.oops;
import java.util.regex.Matcher;
public class StudentDetails {

 
		// TODO Auto-generated method stub
		int studentid;
		String name;
		int year;
		String location;
		String bloodgroup;
		Boolean arrear;
		int percentage;
		
	public StudentDetails()
	
	{
	}
	
	   public int getStudentid() {
			return studentid;
		}
		public void setStudentid(int studentid) {
     	 // Studentid;
//     	 Studentid=studentid;
//		if(studentid.matches("^[a-zA-Z]+$"));
//		{
			
//		}
//		else {
//			
			this.studentid = studentid;
//		}
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			
//			String Name=name;
//			if(name.matches("^[a-zA-Z]+$"));
//			{
				this.name = name;
//			}
//			else
//			{
//				System.out.println("Enter the value in Alphabet:");
			
//			}
			
//			this.name = name;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getBloodgroup() {
			return bloodgroup;
		}
		public void setBloodgroup(String bloodgroup) {
			this.bloodgroup = bloodgroup;
		}
		public int getPercentage() {
			return percentage;
		}
		public void setPercentage(int percentage) {
			this.percentage = percentage;
		}
		public StudentDetails(int studentid, String name, int year, String location, String bloodgroup, Boolean arrear,
				int percentage) {

			this.studentid = studentid;
			this.name = name;
			this.year = year;
			this.location = location;
			this.bloodgroup = bloodgroup;
			this.arrear = arrear;
			this.percentage = percentage;
		}
	
		@Override
		public String toString() {
			return "StudentDetails [studentid=" + studentid + ", name=" + name + ", year=" + year + ", location="
					+ location + ", bloodgroup=" + bloodgroup + ", arrear=" + arrear + ", percentage=" + percentage
					+ "]";
		

	

		}
}

