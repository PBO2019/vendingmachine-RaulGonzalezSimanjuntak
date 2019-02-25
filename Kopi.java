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
public class Kopi {
    private String JenisKopi;
    private String Topping;
    private int JumlahStokKopi;
    private Topping Toping;

    public Kopi() {
    }

    public Kopi(String JenisKopi, String Topping, int JumlahStokKopi, Topping Toping) {
        this.JenisKopi = JenisKopi;
        this.Topping = Topping;
        this.JumlahStokKopi = JumlahStokKopi;
        this.Toping = Toping;
    }
    public void infoKopi(){
        System.out.println("Jenis Kopi  :" + this.JenisKopi);
        System.out.println("Topping     :" + Topping);
        System.out.println("Jumlah Stok Kopi    :" + this.JumlahStokKopi);
        Toping.InfoTopping();
    }

    public String getJenisKopi() {
        return JenisKopi;
    }

    public void setJenisKopi(String JenisKopi) {
        this.JenisKopi = JenisKopi;
    }

    public String getTopping() {
        return Topping;
    }

    public void setTopping(String Topping) {
        this.Topping = Topping;
    }

    public int getJumlahStokKopi() {
        return JumlahStokKopi;
    }

    public void setJumlahStokKopi(int JumlahStokKopi) {
        this.JumlahStokKopi = JumlahStokKopi;
    }

    public Topping getToping() {
        return Toping;
    }

    public void setToping(Topping Toping) {
        this.Toping = Toping;
    }
    
    
}
