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
 * @aprilia setyaning pratiwi
 */
public class Tugas1 {

    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        System.out.println("Nama  : Aprilia setyaning p");
        System.out.println("Npm   : 1841812");
        System.out.println("Kelas : Sistem informasi\n");

        System.out.print("Nama :");
        String nama = z.nextLine()+"\n";
        System.out.print("No Telepon :");
        String Notlp = z.nextLine()+"\n";
        System.out.print("Alamat :");
        String alamat = z.nextLine()+"\n";

        try {
            FileOutputStream output = new FileOutputStream("Adressbook.dat");

            output.write(nama.getBytes());
            output.write(Notlp.getBytes());
            output.write(alamat.getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
