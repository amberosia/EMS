/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenna
 */

public class EmployeeInfo {
	public String date;
	public int empNumber;
	public String firstName;
	public String lastName;
        public String gender;
	public String workLoc;
	public double deductRate;
	
	
	public EmployeeInfo(String date, int eN, String fN, String lN, String g, String loc, double deduc) {
		this.date = date;
                this.empNumber = eN;
		this.firstName = fN;
		this.lastName = lN;
                this.gender = g;
		this.workLoc = loc;
		this.deductRate = deduc;
	}
}