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
public class Tugas2 {

    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream("Adressbook.dat");
            int x;
            while ((x = input.read()) != -1) {
                System.out.print((char) x);

            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
