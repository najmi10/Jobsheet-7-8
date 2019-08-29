/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resepanda;
import java.util.Scanner;

/**
 *
 * @author ica
 */
public class ResepAnda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String identitas = "Naisya Najmi / X RPL 2 / 23";
        System.out.println("Identitas= " + identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukkan no pilihan anda :");
        int bahan1 = baca.nextInt();
        
    if(bahan1 == 1 || bahan1 == 2)
    {
        System.out.println("Bahan Kedua: ");
        if(bahan1 == 1) {
            System.out.println("1. Susu");
            System.out.println("2. Minyak Goreng");
            System.out.println("3. Tidak ada");
        }else{
            System.out.println("1. Minyak Goreng");
            System.out.println("2. Roti");
            System.out.println("3. Tidak ada");
        }
        System.out.print("Masukkan no pilihan anda :");
        int bahan2 = baca.nextInt();
       
    
    
    }else
        System.out.println("Mohon Maaf, Pilihan tidak ditemukan, " 
               + "tidak dapat memberikan saran resep");
    
    int bahan2 = baca.nextInt();
    
    if(bahan2 >= 1 && bahan2 <= 3)
    {
        if(bahan1==1)
            switch(bahan2)
            {
                case 1: System.out.println(
                "Anda dapat membuat milkshake banana"); break;
                case 2: System.out.println(
                "Anda dapat membuat pisang goreng"); break;
                case 3: System.out.println(
                "Anda dapat membuat pisang rebus");
            }
        else
            switch(bahan2)
            {
                case 1: System.out.println(
                "Anda dapat membuat telur mata sapi"); break;
                case 2: System.out.println(
                "Anda dapat membuat sandwich telur"); break;
                case 3: System.out.println(
                "Anda dapat membuat telur rebus");
            }
    }else
        System.out.print("Mohon Maaf, pilihan tidak ditemukan, "
        + "tidak dapat memberikan saran resep");
    }
    
}
