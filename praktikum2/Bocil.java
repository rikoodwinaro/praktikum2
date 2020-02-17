/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.praktikum2;

/**
 *
 * @author rikoo
 */
public class Bocil extends Tiket {
    Bocil() {
        this.harga=harga;
        setPotongan(2000);
    } 
    
    void hargaPotongan() {
        harga -= 2000;
    }
}
