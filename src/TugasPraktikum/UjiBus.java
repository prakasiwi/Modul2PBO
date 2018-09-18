/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author galih
 */
public class UjiBus {
    public static void main(String[]args){
         Bus busBesar = new Bus(100);
         busBesar.getpenumpang(24);
         
         busBesar.addpenumpang(15);
         busBesar.addpenumpang(5);
         busBesar.addpenumpang(26);
         busBesar.getAverage();
         busBesar.cetakpenumpang();
}
}


