/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasperulangan;
import java.util.*;

/**
 *
 * @author zia
 */
public class TugasPerulanganA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int angkaPertama,angkaTerakhir;
        
        System.out.print("Masukkan Angka Pertama : ");
        angkaPertama = input.nextInt();
        System.out.print("Masukkan Angka Terakhir : ");
        angkaTerakhir = input.nextInt();
        
        for (int i = angkaPertama; i <= angkaTerakhir; i++){
            if (i%2==0){
                System.out.print(i +" ");
            }
        }
        
    }
    
}
