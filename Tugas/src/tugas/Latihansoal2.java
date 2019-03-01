/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.io.FileInputStream;


/**
 *
 * @author user
 */
public class Latihansoal2 {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("Lirik lagu.txt");
            int x;
            while ((x = input.read())!= -1){
                 if((char)x == ' '){
                     System.out.print('_');
                 }else{
                     System.out.print((char)x);
                 }
            }
            
            input.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
}
}