package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double v = 0; double h = 0; double r = 0;

    System.out.print("Введите R");
        r = scanner.nextDouble();
    System.out.print("Введите H");
        h = scanner.nextDouble();

     v = Math.PI * r*r * h;
        double roundV = Math.round(v*100)/100; // округлим

    System.out.println("Объем цилиндра = " + roundV );
    }
}
