/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan57.vehicle;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Vehicle
 */
public class PBO11K10118905Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        b.setMyBrand("Trex Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        System.out.println("Brand : "+b.getMyBrand());
        System.out.println("Model : "+b.getMyModel());
        System.out.println("Jumlah Gear : "+b.getMyGearCount());
        System.out.println("");
        
        Skateboard s = new Skateboard();
        s.setMyBrand("Ally Skate");
        s.setMyModel("Rocket");
        s.setMyBoardLength(54.5);
        System.out.println("Brand : "+s.getMyBrand());
        System.out.println("Model : "+s.getMyModel());
        System.out.println("Jumlah Gear : "+s.getMyBoardLength());
        System.out.println("");
    }
    
}
