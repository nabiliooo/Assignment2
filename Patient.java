/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: Gathers personal information from the PatientDriverApp.java program, and stores it into different String variables to be returned. 
 * Due: 07/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Nabil El-Hage
*/

public class Patient {
	//Fields
	private String first, last, middle, address, city, 
	state, zip, number, emergencyNam, emergencyNum;
	
	//Class Constructor
	public Patient(String fName, String lName, String mName, String pAddress, String pCity, String pState,
			String pZip, String pNum, String eName, String eNum) {
		first = fName;
		last = lName;
		middle = mName;
		address = pAddress;
		city = pCity;
		state = pState;
		zip = pZip;
		number = pNum;
		emergencyNam = eName;
		emergencyNum = eNum;
	}
	
	//Get and Set methods for the fields
	/**
	* Function:  getFirstName
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getFirstName() {
		return first;
		}
	/**
	* Function:  getLastName
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getLastName() {
		return last;
		}
	/**
	* Function:  getMiddleName
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getMiddleName() {
		return middle;
		}
	/**
	* Function:  getAddress
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getAddress() {
		return address;
		}
	/**
	* Function:  getCity
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getCity() {
		return city;
		}
	/**
	* Function:  getState
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getState() {
		return state;
		}
	/**
	* Function:  getZip
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getZip() {
		return zip;
		}
	/**
	* Function:  getNumber
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getNumber() {
		return number;
		}
	/**
	* Function:  getEmergencyName
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getEmergencyName() {
		return emergencyNam;
		}/**
	* Function:  getEmergencyNumber
	* Description: Function used to get each personal information of the patient.
	* Post: Function will return each personal information of the patient.
	 */
	public String getEmergencyNumber() {
		return emergencyNum;
		}
	
	
	
	/**
	* Function:  setFirstName
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setFirstName(String firstName) {
		first = firstName;
	}
	/**
	* Function:  setLastName
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setLastName(String lastName) {
		last = lastName;
	}
	/**
	* Function:  setMiddleName
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setMiddleName(String middleName) {
		middle = middleName;
	}
	/**
	* Function:  setAddress
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setAddress(String patientAddress) {
		address = patientAddress;
	}
	/**
	* Function:  setCity
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setCity(String patientCity) {
		city = patientCity;
	}
	/**
	* Function:  setState
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setState(String patientState) {
		state = patientState;
	}
	/**
	* Function:  setZip
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setZip(String patientZip) {
		zip = patientZip;
	}
	/**
	* Function:  setNumber
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setNumber(String patientNumber) {
		number = patientNumber;
	}
	/**
	* Function:  setEmergencyName
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setEmergencyName(String emergencyName) {
		emergencyNam = emergencyName;
	}
	/**
	* Function:  setEmergencyNumber
	* Description: Function used to set each personal information of the patient.
	* Post: Function will set a variable into another variable, identifying the same way.
	 */
	public void setEmergencyNumber(String emergencyNumber) {
		emergencyNum = emergencyNumber;
	}
	

}
