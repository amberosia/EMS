
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jenna
 */
public class PTE extends EmployeeInfo {
    public double hourlyWage;
    public double hoursPerWeek;
    public int weeksPerYear;
    
    public PTE(String date, ImageIcon pfp, int eN, String fN, String lN, String g, int loc, double deduc, double hourly, double hPW, int wPY) {
        super(date, pfp, eN, fN, lN, g, loc, deduc);
        this.hourlyWage = hourly;
        this.hoursPerWeek = hPW;
        this.weeksPerYear = wPY;
    }
    
    public double calcNetIncome() {
        return ((hourlyWage*hoursPerWeek*weeksPerYear)*(1.0 - deductRate));
    }
            
}
