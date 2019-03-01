/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.io.FileOutputStream;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Latihansoal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.println("Nama  : Aprilia setyaning p");
        System.out.println("Npm   : 1841812");
        System.out.println("Kelas : Sistem informasi");
        try {
            FileOutputStream output = new
                FileOutputStream ("Tugas.dat");
            String data = x.next();
            output.write (data.getBytes());  
            
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        // TODO code application logic here
    }
    
}
