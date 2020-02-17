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
public class Main {
    public static void main(String[] args) {
        Tiket T[] = new Tiket[3];
        T[0] = new Dewasa();
        T[1] = new Bocil();
        T[2] = new Dewasa();
        for (int i = 0; i < 3; i++) {
            System.out.println("Harga Tiket untuk Pengunjung " + i + " adalah " + T[i].getTotalBayar());
        }
        for (int i = 0; i < 3; i++) {
            T[i].hargaPotongan();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Harga Tiket untuk Pengunjung "+ i + " sekarang adalah "
                    + T[i].getTotalBayar());
        }
    }
}
