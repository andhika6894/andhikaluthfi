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
public class persegi {
     public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
                 int s1,s2,hasil;
                 System.out.println("Masukkan nilai sisi = ");
                 s1 = input.nextInt();
                 System.out.println("Masukkan nilai sisi = ");
                 s2 = input.nextInt();
                 hasil = s1 * s2;
                 System.out.println("hasil = "+hasil);
     }
}