/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenna
 */
public class PTE extends EmployeeInfo {
    private double hourlyWage;
    private double hoursPerWeek;
    private int weeksPerYear;
    
    public PTE(int eN, String fN, String lN, String g, int loc, double deduc, double hourly, double hPW, int wPY) {
        super(eN, fN, lN, g, loc, deduc);
        this.hourlyWage = hourly;
        this.hoursPerWeek = hPW;
        this.weeksPerYear = wPY;
    }
            
}
