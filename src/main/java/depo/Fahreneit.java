package depo;

import java.util.Scanner;

public class Fahreneit {


    public static void main(String[] args) {

        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli
        //dönmeli diyor ise onun retur y void olmuyor.Yeni bir yere assign et.

        double cel =fahreneit(140);

        System.out.println("cel = " + cel);



        double cel2=fahreneit(75);

        System.out.println(cel2);


        System.out.println(cel+cel2);

       int c= add(56,98);

        System.out.println(c);


    }

    private static double fahreneit(double f) {

        return (f-32)/1.8;
    }
  public static int add(int a,int b){

      return a+b;
  }

}