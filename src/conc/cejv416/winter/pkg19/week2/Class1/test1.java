/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter.pkg19.week2.Class1;

/**
 *
 * @author V_ALINOS
 */
public class test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person p1 = new Person();
        Person p2 = new Person();
        
        
        p1.name = "Mary";
        p1.age = 30;
        p2.name = "Bob";
        p2.age = 35;
       
        
        
        System.out.println("The person's name is " + p1.name);
        System.out.println("The ");

        
     p2.sayAge();
     
     Adder a = new Adder();
             
             a.num1 = 2;
             a.num2 = 3;
      
             a.add();
       
        
      }
    
}
