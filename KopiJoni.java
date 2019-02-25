/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kopijoni;

/**
 *
 * @author raulgonzalez
 */
import java.util.ArrayList;
import java.util.Scanner;
public class KopiJoni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<String> Kopi   = new ArrayList<String>();
       ArrayList<String> Topping = new ArrayList<String>();
       
       Kopi k = new Kopi();
       Topping t = new Topping();
       
        Kopi robusta = new Kopi();
        robusta.setJenisKopi("Robusta");
        robusta.setJumlahStokKopi(40);
        Kopi.add(robusta.getJenisKopi());
        
        Kopi arabica = new Kopi();
        arabica.setJenisKopi("Arabica");
        arabica.setJumlahStokKopi(40);
        Kopi.add(arabica.getJenisKopi());
        
        Kopi flores = new Kopi();
        flores.setJenisKopi("Flores");
        flores.setJumlahStokKopi(40);
        Kopi.add(flores.getJenisKopi());
        
        System.out.println("             Menu Kopi              ");
            
	for(int i=0; i< Kopi.size();i++){
            int j= i+1;
            
            System.out.println(""+j+" "+Kopi.get(i));
        }
        System.out.println("=====================================");
        Topping susu = new Topping();
        susu.setJenisTopping("Susu");
        susu.setJumlahStokTopping(20);
        Topping.add(susu.getJenisTopping());
        
         Topping gula = new Topping();
        gula.setJenisTopping("Gula");
        gula.setJumlahStokTopping(20);
        Topping.add(gula.getJenisTopping());
        
         Topping cream = new Topping();
        cream.setJenisTopping("Cream");
        cream.setJumlahStokTopping(20);
        Topping.add(cream.getJenisTopping());
        
        System.out.println("             Menu Topping                ");
            
        for (int Y = 0; Y < Topping.size(); Y++) {
            int a = Y+1;
            
            System.out.println("" +a+" "+Topping.get(Y));
            
        }
           System.out.println("=====================================");

        Scanner in = new Scanner(System.in);
        System.out.print("Masukan kopi yang mau dipilih : ");
        int pilihanKopi = in.nextInt() -1;
  
        System.out.print("Masukkan Topping Yang Ingin Dipilih : ");
        int pilihanToping = in.nextInt() -1;
       
        
        System.out.println("Kopi Yang Dipesan " + Kopi.get(pilihanKopi) + " Dengan Pilihan Topping " + Topping.get(pilihanToping));
        
        
       
    }
    
}
