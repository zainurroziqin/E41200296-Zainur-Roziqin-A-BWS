/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasobjekclassB;
class Mahasiswa
{
    String Name; 
    int Age;
    
    Mahasiswa(String inputNama, int inputUmur){
        Name = inputNama;
        Age = inputUmur;
    }
}

/**
 *
 * @author zia
 */
public class Managingpeople {
    public static void main (String [] Args){
        Mahasiswa Mahasiswa1= new Mahasiswa("Bahrul",30);
        Mahasiswa Mahasiswa2= new Mahasiswa("Dimas",20);
        
        if(Mahasiswa1.Age==Mahasiswa2.Age){
            System.out.println(Mahasiswa1.Name + " is the same age as " + Mahasiswa2.Name);
        }
        else{
            System.out.println(Mahasiswa1.Name + " is NOT same age as " + Mahasiswa2.Name);
        } 
        
    }
    
}
