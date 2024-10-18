package Basics.Arithemetic;

import java.util.Scanner;

public class Triangle {
    private static float base;
    private static float height;
    private static float area;

    public static void CalcArea()
    {
        area = 0.5f * base * height;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base of triangle");
        base = in.nextFloat();
        System.out.println("Enter height of triangle");
        height = in.nextFloat();
        CalcArea();
        System.out.println(area);

    }
}
