
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenna
 */

import javax.swing.ImageIcon;

public class FTE extends EmployeeInfo {
    public double yearlySalary;
    
    
    public FTE(String date, ImageIcon pfp, int eN, String fN, String lN, String g, int loc, double deduc, double yearly) {
        super(date, pfp, eN, fN, lN, g, loc, deduc);
        yearlySalary = yearly;
        
    }
    
    public double calcNetIncome() {
        return (Math.round(yearlySalary*(1.0 - deductRate)*100.0)/100.0);
    } 
    
}
