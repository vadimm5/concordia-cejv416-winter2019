/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week1.Class2;

/**
 *
 * @author V_ALINOS
 */
public class Lab2_Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int CURRENT_AGE_YEAR = 1990;
        int currentYear = 2019;
        
        int age = currentYear - CURRENT_AGE_YEAR;
        
        int numberMonths = age * 12;
        
        int numberDays = age * 365;
        
        System.out.println("Person is" + age + "years old." );
        System.out.println("Which is" + numberMonths + "months.");
        System.out.println("Which is" + numberDays + "days.");
    }
    
}
