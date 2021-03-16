/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasobjekclassa;

class Personn {
    String Fname,stuStatus;
    int stuId;
}

/**
 *
 * @author zia
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personn person1 = new Personn();
        person1.Fname = "Lisa Palombo";
        person1.stuId = 123456789;
        person1.stuStatus = "Active";
                
        System.out.println("Student Name   :" + person1.Fname);
        System.out.println("Student Id     :" + person1.stuId);
        System.out.println("Student Status :" + person1.stuStatus);
        
    }
    
}
