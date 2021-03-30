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
public class TugasPerulanganC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyakNilai;
        
        System.out.print("Masukkan banyaknya data nilai : ");
        banyakNilai = input.nextInt();
        
        int[] nilai = new int[banyakNilai];
        
        for(int i = 0; i<nilai.length; i++){
            System.out.print("Masukkan data ke - " + (i+1) + ":" );
            nilai[i] = input.nextInt();
        }
        
        int max = nilai[0];
        for(int i = 0; i<nilai.length; i++){
            if(nilai[i]> max){
                max = nilai[i];
            }
        }
        
        int min = nilai[0];
        for(int i = 0; i<nilai.length; i++){
            if(nilai[i]<min){
                min = nilai[i];
            }
        }
        float banyakAngka = nilai.length;
        float jumlahNilai = 0;
        for(int tambah : nilai){
            jumlahNilai= jumlahNilai + tambah;
        }
        float rata = jumlahNilai/banyakAngka;
        
        System.out.println("Nilai Maksimum : "+ max);
        System.out.println("Nilai Minimum : "+ min);
        System.out.println("Rata-Rata : " + rata);
        
    }
    
}
