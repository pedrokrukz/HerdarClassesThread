/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.herdarclassethread;

/**
 *
 * @author ppok3
 */

public class Herdarclassethread extends Thread {

    private final String produto;
    private final int tempo;

    // O construtor deve ter o mesmo nome da classe
    public Herdarclassethread(String produto, int tempo) {
        this.produto = produto;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " " + produto);
            try {
                sleep((long) (Math.random() * tempo));
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Terminei " + produto);
    }

    // Método main para testar
    public static void main(String[] args) {
        Herdarclassethread t1 = new Herdarclassethread("Sapato", 100);
        Herdarclassethread t2 = new Herdarclassethread("bota", 150);

        t1.start();
        t2.start();
}
}
