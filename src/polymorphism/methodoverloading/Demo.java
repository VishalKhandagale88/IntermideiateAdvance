package polymorphism.methodoverloading;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        System.out.print("side 1 : ");
        int side1 = sc.nextInt();
        System.out.print("side 2 : ");
        int side2 = sc.nextInt();
        System.out.print("side 3 : ");
        int side3 = sc.nextInt();
        if (side1 == side2 && side3 !=side1){
            String triangle = triangle(side1, side2);
            System.out.println(triangle);
        } else if (side1 == side2 || side2 == side3) {
            int triangle = triangle();
            System.out.println(triangle);
        } else {
            String triangle = triangle(side1, side2, side3);
            System.out.println(triangle);
        }


    }
    public static String triangle(int side1, int side2 , int side3){
        return "equilateral triangle";

    }

    public static String triangle(int side1,int side2){
        return "isosceles triangle";
    }
    public static int triangle(){
        return 0;
    }

}
