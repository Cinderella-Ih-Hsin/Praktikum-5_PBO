/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak5;

/**
 *
 * @author Cinderella
 */
public class Manajer extends Pegawai{
    
    public Manajer (String nama, int gaji){
        this.nama = nama;
        this.gaji = gaji;
    }
    
    @Override
    public void InfoGaji() {
    System.out.println("Gaji :" + gaji); //To change body of generated methods, choose Tools | Templates.
    }   
    
    @Override
    public String toString() {
    return "Nama Manajer :" + nama;
    }
}
