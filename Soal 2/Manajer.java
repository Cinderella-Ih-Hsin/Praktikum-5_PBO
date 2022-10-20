/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak5;

/**
 *
 * @author Cinderella
 */
public class Manajer extends Pegawai{
    
    private int tunjangan;
    
    public Manajer (String nama, int gaji, int tunjangan){
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void InfoGaji() {
    System.out.println("Gaji :" + gaji); //To change body of generated methods, choose Tools | Templates.
    }   
    
    public void InfoTunjangan() {
    System.out.println("Tunjangan :" + tunjangan); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
    return "Nama Manajer :" + nama;
    }
}
