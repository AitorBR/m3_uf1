/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 * @author Aitor
 */
public class calchipo {

    public static void main(String[] args) {

        Scanner poner = new Scanner(System.in);


        float x, y;

        System.out.print("Escribe cateto1: ");
        x = poner.nextFloat();
        System.out.print("Escribe cateto2: ");
        y = poner.nextFloat();
        // y = y * y;
        // x = x * x;
        y *= y;


    }
}