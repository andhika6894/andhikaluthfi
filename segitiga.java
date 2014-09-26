/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

/**
 *
 * @author Andhika Revky Fauzi
 */
import java.io.*;
import java.util.Scanner;
public class segitiga {
     public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
                 int a,t,hasil;
                 System.out.println("Masukkan nilai alas = ");
                 a = input.nextInt();
                 System.out.println("Masukkan nilai tinggi = ");
                 t = input.nextInt();
                 hasil = a * t / 2;
                 System.out.println("hasil = "+hasil);
     }
}