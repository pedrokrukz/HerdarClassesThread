/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herdarclassethread;

/**
 *
 * @author ppok3
 */
public class Principal {
    public static void main(String[] args) {
        Herdarclassethread severino = new Herdarclassethread("sapato", 100);
        Herdarclassethread raimundo = new Herdarclassethread("bota", 50);

        severino.start();
        raimundo.start();
}
}

   
