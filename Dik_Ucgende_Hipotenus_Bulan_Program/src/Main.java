import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        //Değişken belirleyelim

        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Kenarı Giriniz : ");
        a = input. nextDouble();

        System.out.println("İkinci Kenarı Giriniz : ");
        b= input. nextDouble();

        System.out.println("Üçüncü Kenarı Giriniz : ");
                c= input.nextDouble();

        double u = (a+b+c)/2;
        System.out.println("Üçgenin Çevresi : " + 2*u);

        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double alan = Math.sqrt((u* (u-a)*(u-b)*(u-c)));

        System.out.println("Üçgenin Alanı : " + alan);





    }
}



