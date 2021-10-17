package EmailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "anycompany.com";
	
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setDepartment();
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New worker: " + firstName + " "+ "DEPARTMENT CODES\n 1 for Sales\n 2 for Development\n 3 for Accounting");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "development";}
		else if (depChoice == 3){return "accounting";}
		else {return "";}
	}
	
	
	// Generate the random password
	private String randomPassword(int length) {
		String passwordSet = "ABCEDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+";
		char[] password = new char[length]; 
		for (int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	
	// Set the alternate email
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
	
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity; }
	public String getAlternateEnail() {return alternateEmail; }
	public String getPassword() {return password; }
	
	
	public String showInfo() {
		return ("DISPLAY NAME: " + firstName + " " + lastName + 
			    "\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
