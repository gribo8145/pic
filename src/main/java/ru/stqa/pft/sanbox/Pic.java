package ru.stqa.pft.sanbox;

public class Pic {
    public static void main(String[] args){

        hello("world");
        hello("user");
        hello("vova");
        double a = 4;
        double b = 5;
        System.out.println(area(a,b));

        int  f = 5;
        int d = 6;
        System.out.println(klm(f, d));

           }


           public static void hello(String somebody){

               System.out.println("Hello " + somebody + "!");
           }

           public static double area(double a, double b){
        return a * b;

            }
    public static int klm(int f, int d)
    {

        return f * d;
    }
}