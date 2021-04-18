/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanoverloading2;

/**
 *
 * @author MOKLET-2
 */
public class Overloading2 extends Variabel2{
    
    
    public void iden(String nama){
        this.nama = nama;
        System.out.println(nama+"Ainu Azzaria");
    }
    
    public void iden(String nama, String kelas){
        this.nama = nama;
        this.kelas = kelas;
        System.out.println(nama+"Ainu Azzaria");
        System.out.println(kelas+"X RPL 2");
    }
    
            
}
