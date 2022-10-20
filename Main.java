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
public class Main {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kurir po= new Kurir("Beta", 30000);
        System.out.println(po.toString());
        po.InfoGaji();
        
        Manajer lo= new Manajer("Juki", 60000);
        System.out.println(lo.toString());
        lo.InfoGaji();
    }
}
