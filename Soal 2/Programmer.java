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
public class Programmer extends Pegawai{
    
    private int bonus;
    
    public Programmer (String nama, int gaji, int bonus){
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }
    
    @Override
    public void InfoGaji() {
    System.out.println("Gaji :" + gaji); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void InfoBonus() {
    System.out.println("Bonus :" + bonus); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
    return "Nama Programmer :" + nama;
    }
}
