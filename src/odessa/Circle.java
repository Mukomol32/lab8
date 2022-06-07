package odessa;

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Circle {
    public void function() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Радиус круга:");
        int r = scanner.nextInt();
        //Периметр
        int D = 2 * r;
        System.out.println("Диаметр:" + D);
        //Площадь
        double S =  r * r * Math.PI;
        System.out.println("Площадь:" + S);
        //Диагональ
        double P = r * 2 * Math.PI;
        System.out.println("Длина:" + P);


        System.out.println("Радиус круга 2:");
        int r2 = scanner.nextInt();
        //Периметр
        int D2 = 2 * r2;
        System.out.println("Диаметр:" + D2);
        //Площадь
        double S2 =  r2 * r2 * Math.PI;
        System.out.println("Площадь:" + S2);
        //Диагональ
        double P2 = r2 * 2 * Math.PI;
        System.out.println("Длина:" + P2);


        System.out.println("Радиус круга3:");
        int r3 = scanner.nextInt();
        //Периметр
        int D3 = 2 * r3;
        System.out.println("Диаметр:" + D3);
        //Площадь
        double S3 =  r3 * r3 * Math.PI;
        System.out.println("Площадь:" + S3);
        //Диагональ
        double P3 = r3 * 2 * Math.PI;
        System.out.println("Длина:" + P3);

        int A = (r * r2 * r3) / 3;
        System.out.println("Средняя площадь окружностей " + A);

        if (S > S2) {
            if (S > S3) {
                System.out.println(" Наибольшая Площадь окружности:" + S);
            }
        }

        if (S2 > S) {
            if (S2 > S3) {
                System.out.println("Наибольшая Площадь окружности:" + S2);
            }
        }

        if (S3 > S) {
            if (S3 > S2) {
                System.out.println("Наибольшая Площадь окружности:" + S3);
            }
        }

        File myFile = new File("circle.txt");

        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile)));
            writer.println("Радиус круга r:" + r + "\n" +
                    "Длина:" + P + "\n" + "Площадь:" + S + "\n" + "Диаметр:" + D
                    + "\n" + "Радиус круга r2:" + r2 + "\n" + "Длина:" + P2 + "\n" + "Площадь:" + S2
                    + "\n" + "Диаметр:" + D2 + "\n" + "Радиус круга r3:" + r3 + "\n" + "Длина:" + P3 + "\n" +
                    "Площадь:" + S3 + "\n" + "Диаметр:" + D3 + "\n" + "Средняя площадь окружностей " + A);
            writer.flush();
            writer.close();
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }
    }
}
