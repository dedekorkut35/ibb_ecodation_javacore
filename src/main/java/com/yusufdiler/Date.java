package com.yusufdiler;


public class Date {
public static void dateMethod () {
    java.util.Date date= new java.util.Date();
    System.out.println(date);
    System.out.println("Gün :"+date.getDate());
    System.out.println("Ay:" +date.getDay() );
    System.out.println("Yıl:" +date.getYear() );
    System.out.println("Tarih:" +date.toString() );
    }

//PSVM
    public static void main(String[] args) {
dateMethod();

    }
}
