/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: This program sends information to the Patient.java and Procedure.java programs, and then sent back to be printed. 
 * Due: 07/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nabil El-Hage
*/

public class PatientDriverApp {
	public static void main(String[] args) {
		
		
		//Patient Instance
		Patient patientInfo = new Patient("Nabil", "El-Hage", "Fysal", "423 Moco Street", "Rockville", "MD",
				   "20877", "240-555-0123", "Bob Martin", "301-555-9876");
		
		//Each Procedure instances
		Procedure p1 = new Procedure("Physical Exam", "07/03/2023", "Dr. Irvine", 250);
		Procedure p2 = new Procedure("X-ray", "07/03/2023", "Dr. Jamison", 500);
		Procedure p3 = new Procedure("Blood Test", "07/03/2023", "Dr. Smith", 200);
		
		
		//Display Patients information
		System.out.println("Patient name: " + patientInfo.getFirstName() + " " + patientInfo.getMiddleName() + " " + patientInfo.getLastName());
		System.out.println("Address: " + patientInfo.getAddress());
		System.out.println("City: " + patientInfo.getCity());
		System.out.println("State: " + patientInfo.getState());
		System.out.println("ZIP: " + patientInfo.getZip());
		System.out.println("Emergency Contact: " + patientInfo.getEmergencyName() + " " + patientInfo.getEmergencyNumber());
		
		//Display procedure 1 information
		System.out.println("Procedure: " + p1.getProcedureName());
		System.out.println("Procedure Date: " + p1.getProcedureDate());
		System.out.println("Practitioner: " + p1.getPractitionerName());
		System.out.println("Procedure Charge: " + p1.getCost());
		System.out.println("");
		
		//Display procedure 2 information
		System.out.println("Procedure: " + p2.getProcedureName());
		System.out.println("Procedure Date: " + p2.getProcedureDate());
		System.out.println("Practitioner: " + p2.getPractitionerName());
		System.out.println("Procedure Charge: " + p2.getCost());
		System.out.println("");
		
		//Display procedure 3 information
		System.out.println("Procedure: " + p3.getProcedureName());
		System.out.println("Procedure Date: " + p3.getProcedureDate());
		System.out.println("Practitioner: " + p3.getPractitionerName());
		System.out.println("Procedure Charge: " + p3.getCost());
		System.out.println("");
		
		//Programmer information and END
		System.out.println("Student Name: Nabil El-Hage");
		System.out.println("Student MC M#: M21060474");
		System.out.println("Due Date: 07/03/2023");
		
	}
		
		
		
		
	}

