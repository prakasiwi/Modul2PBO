/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

import java.util.Scanner;

/**
 *
 * @author galih
 */
public class Bus {
    Scanner scanner = new Scanner(System.in);
   public int penumpang;
    public int maxpenumpang;
    
    public Bus(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //Method Mutator
    public void addpenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp> maxpenumpang){
            System.out.println("Penumpang melebihi kuota");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void getpenumpang(int password){
         System.out.print("Masukkan password : ");
         password = scanner.nextInt(); 
         if (password==24){
         System.out.println("Password Benar");
    }else{
    
        System.out.println("Password Salah");
    }
}
    public void getAverage(){
            float x = penumpang/4;
            System.out.println("Rata-ratanya adalah : "+x);

}
    public void cetakpenumpang(){
     System.out.println("Penumpang Bus Sekarang + "+penumpang);
     System.out.println("Maksimum Penumpang yang seharusnya adalah = "+maxpenumpang);
        }
}


