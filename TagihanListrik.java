/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tagihanlistrik;

import java.util.Scanner;

/**
 *
 * @author ica
 */
public class TagihanListrik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kwh;
        double biaya;
        double total;
        
        System.out.print("\nProgram Pembayaran Tagihan Listrik");
        
        //Input
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan kwh");
        kwh = baca.nextInt();
        
        if(kwh <= 450) {
            System.out.println("Golongan C");
            biaya = 20000 + (kwh * 1000);
            System.out.println("biaya : " + biaya);
            
            total = (biaya * 10/100) + biaya;
            System.out.println("total : " + total);
        
        }else if (kwh <= 900) {
            System.out.println("Golongan B");
            biaya = 35000 + (kwh * 2500);
            System.out.println("biaya : " + biaya);
            
            total = (biaya * 15/100) + biaya;
            System.out.println("total : " + total);
        
        }else if (kwh <= 1200) {
            System.out.println("Golongan A");
            biaya = 50000 + (kwh * 3000);
            System.out.println("biaya : " + biaya);
            
            total = (biaya * 20/100) + biaya;
            System.out.println("total : " + total);
        }
        
        
        
        
                    
        
        
        
        
        
        
        
        
    }
    }   


    
    

