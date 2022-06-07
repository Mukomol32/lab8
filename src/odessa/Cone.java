package odessa;

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Cone {
    public void function(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Образующая конуса а:");
        int l = scanner.nextInt();
        System.out.println("Радиус конуса:");
        int r = scanner.nextInt();
        double V = 1/3*Math.PI*2*r*l;
        System.out.println("Объем:" + V);
        double S = Math.PI*2*r+l*r;
        System.out.println("Площадь конуса:" + S);


        System.out.println("Образующая конуса а2:");
        int l2 = scanner.nextInt();
        System.out.println("Радиус конуса:");
        int r2 = scanner.nextInt();
        double V2 = 1/3*Math.PI*2*r2*l2;
        System.out.println("Объем:" + V2);
        double S2 = Math.PI*2*r2+l2*r2;
        System.out.println("Площадь конуса:" + S2);


        System.out.println("Образующая конуса а3:");
        int l3 = scanner.nextInt();
        System.out.println("Радиус конуса:");
        int r3 = scanner.nextInt();
        double V3 = 1/3*Math.PI*2*r3*l3;
        System.out.println("Объем:" + V3);
        double S3 = Math.PI*2*r3+l3*r3;
        System.out.println("Площадь конуса:" + S3);

        if (S > S2) {
            if (S > S3) {
                System.out.println(" Наибольшая Площадь конуса:" + S);
            }
        }

        if (S2 > S) {
            if (S2 > S3) {
                System.out.println("Наибольшая Площадь конуса:" + S2);
            }
        }

        if (S3 > S) {
            if (S3 > S2) {
                System.out.println("Наибольшая Площадь конуса:" + S3);
            }
        }

        File myFile = new File("cone.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println("Образующая конуса а:" + l + "\n" + "Объем конуса:" + V + "\n" + "Площадь конуса:" + S + "\n"
                    + "Образующая конус а2:" + l2 + "\n" + "Объем конуса:" + V2 + "\n" + "Площадь конуса:" + S2
                    + "\n" + "Образующая конуса а3:" + l3 + "\n" + "Объем конуса:" + V3 + "\n" + "Площадь конуса:" + S3);
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}
