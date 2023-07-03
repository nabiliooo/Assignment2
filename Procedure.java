/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: Gets procedure information from the PatientDriverApp.java program, and stores it into different String variables to be returned. 
 * Due: 07/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nabil El-Hage
*/

public class Procedure {
	
	//Fields
	private String procedure, date, name;
	private double cost;
	
	//Class Constructor
	public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCost) {
		
		procedure = procedureName;
		date = procedureDate;
		name = practitionerName;
		cost = procedureCost;
	}
	
	//Get and Set methods for the fields
	/**
	* Function:  getProcedureName
	* Description: Function used to get each procedure information of the patient.
	* Post: Function will return each procedure information of the patient.
	 */
	public String getProcedureName() {
		return procedure;
	}/**
	* Function:  getProcedureDate
	* Description: Function used to get each procedure information of the patient.
	* Post: Function will return each procedure information of the patient.
	 */
	public String getProcedureDate() {
		return date;
	}
	/**
	* Function:  getPractitionerName
	* Description: Function used to get each procedure information of the patient.
	* Post: Function will return each procedure information of the patient.
	 */
	public String getPractitionerName() {
		return name;
	}
	/**
	* Function:  getCost
	* Description: Function used to get each procedure information of the patient.
	* Post: Function will return each procedure information of the patient.
	 */
	public double getCost() {
		return cost;
	}

	
	
	/**
	* Function:  setProcedureName
	* Description: Function used to set each procedure information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setProcedureName(String pName) {
		procedure = pName;
	}
	/**
	* Function:  setProcedureDate
	* Description: Function used to set each procedure information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setProcedureDate(String pDate) {
		date = pDate;
	}
	/**
	* Function:  setPractitionerName
	* Description: Function used to set each procedure information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setPractitionerName(String pracName) {
		name = pracName;
	}
	/**
	* Function:  setProcedureCost
	* Description: Function used to set each procedure information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setProcedureCost(double pCost) {
		cost = pCost;
	}
}
