/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenna
 */
public class FTE extends EmployeeInfo {
    private double yearlySalary;
    
    
    public FTE(int eN, String fN, String lN, String g, int loc, double deduc, double yearly) {
        super(eN, fN, lN, g, loc, deduc);
        yearlySalary = yearly;
        
    }
    
    
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    
    public double calcAnnualNetIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
}
