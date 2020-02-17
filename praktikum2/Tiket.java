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
public class Tiket {
    double harga;
    private double potongan;

    Tiket() {
        harga = 20000;
        potongan = 2000;
        System.out.println("Harga mula-mula " + harga + " dan potongan " + potongan);
    }

    private double hitungHarga(double harga, double potongan) {
        return harga-potongan;
    }
    
    void hargaPotongan() {
        System.out.println("Harga untuk Dewasa/Bocil");
    }

    void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    double getTotalBayar() {
        return hitungHarga(harga, potongan);
    }
}
