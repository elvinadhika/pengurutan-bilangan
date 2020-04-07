/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pbo;

import java.util.Scanner;

/**
 *
 * @author Aryadhika
 */
public class Uts_pbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x[];
        int a,b,d,e,f,g,h;
        
        x = new int [100];
        
        System.out.print("====== Program Pengurutan=====\n");
        System.out.print("Masukkan Jumlah Baris = ");
        a = new Scanner(System.in).nextInt();
        
        System.out.print("\n");
        
        
        
        g=a-1;
        for (b=1;b<=a;b++)
        {
            System.out.print("Masukkan Bilangan ke "+b+"= ");
            x[b]=new Scanner(System.in).nextInt();
        }
    
        System.out.print("\n");
       for (h=1;h<=g;h++)
       {
        for (d=1;d<=g;d++)
        {
            if (x[d] <= x[d+1])
            {         
            }
            else
            {
                e      = x[d];  
                x[d]   = x[d+1];
                x[d+1] = e; 
            }}}
       System.out.print("===Hasil Pengurutan===\n");
        
            for (f=1;f<=a;f++)
            {
                System.out.println(x[f]);
            }
       
      System.out.print("\nMax = "+x[a]+"   Min ="+x[1]);
        
    }
                 
}
