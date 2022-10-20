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
public class TesPegawai {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manajer ko= new Manajer("Cika", 70000,12000);
        System.out.println(ko.toString());
        ko.InfoGaji();
        ko.InfoTunjangan();
        
        Programmer bo= new Programmer("Boni", 40000,9000);
        System.out.println(bo.toString());
        bo.InfoGaji();
        bo.InfoBonus();
    }
}
