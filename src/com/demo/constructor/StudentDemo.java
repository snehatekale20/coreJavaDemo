package com.demo.constructor;

public class StudentDemo {

	String studName;
	int studeRollNo;
	String studEmail;
	String studAddress;
	
	
	public StudentDemo(String studName, int studeRollNo, String studEmail, String studAddress) {
		super();
		this.studName = studName;
		this.studeRollNo = studeRollNo;
		this.studEmail = studEmail;
		this.studAddress = studAddress;
	}
	
	


	public StudentDemo(String studName, int studeRollNo) {
		super();
		this.studName = studName;
		this.studeRollNo = studeRollNo;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo sudarshan = new StudentDemo("Sudershan", 20, "sudarshan@", "pune");
		System.out.println(sudarshan.studEmail);
		System.out.println(sudarshan);
		
		StudentDemo Sneha = new StudentDemo("Sneha", 10);
		System.out.println(Sneha);
		
		
	}


	@Override
	public String toString() {
		return "StudentDemo [studName=" + studName + ", studeRollNo=" + studeRollNo + ", studEmail=" + studEmail
				+ ", studAddress=" + studAddress + "]";
	}

}
