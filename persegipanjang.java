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
public class persegipanjang {
     public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
                 int p,l,hasil;
                 System.out.println("Masukkan nilai panjang = ");
                 p = input.nextInt();
                 System.out.println("Masukkan nilai lebar = ");
                 l = input.nextInt();
                 hasil = p * l;
                 System.out.println("hasil = "+hasil);
     }
}