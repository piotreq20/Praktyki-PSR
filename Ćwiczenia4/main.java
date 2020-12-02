package Ćwiczenia4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a, b, c: ");

        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        double delta = b*b - 4 * a * c;

        if (delta == 0){
            double x0 = -b / 2*a;
            System.out.println("x0 wynosi" + x0 + "delta wynosi:" + delta);
        }
        else if (delta > 0){
            double x1 = (-b - Math.sqrt(delta)) /2*a;
            double x2 = (-b + Math.sqrt(delta)) /2*a;
            System.out.println("x1 i x2 wynoszą" + x1 + " " + x2 + " delta wynosi:" + delta);
        }
        else if (delta < 0){
            System.out.println("Brak rozwiązań"+ " delta wynosi:" + delta);
        }
    }
}
