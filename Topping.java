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
public class Topping {

    static void add(String jenisTopping) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String JenisTopping;
    private int JumlahStokTopping;

    public Topping() {
    }

    public Topping(String JenisTopping, int JumlahStokTopping) {
        this.JenisTopping = JenisTopping;
        this.JumlahStokTopping = JumlahStokTopping;
    }
    
    public void InfoTopping(){
        System.out.println("Jenis topping : " + this.JenisTopping);
        System.out.println("stok Topping  : " + this.JumlahStokTopping);
    }

    public String getJenisTopping() {
        return JenisTopping;
    }

    public void setJenisTopping(String JenisTopping) {
        this.JenisTopping = JenisTopping;
    }

    public int getJumlahStokTopping() {
        return JumlahStokTopping;
    }

    public void setJumlahStokTopping(int JumlahStokTopping) {
        this.JumlahStokTopping = JumlahStokTopping;
    }
    
    
}
