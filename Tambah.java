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
public class Tambah {
     public static void main(String args[]) {
         Scanner input = new Scanner(System.in);
                 int a,b,hasil;
                 System.out.println("Masukkan nilai n =");
                 a = input.nextInt();
                 b = input.nextInt();
                 hasil = a+b;
                 System.out.println("hasil ="+hasil);
     }
}