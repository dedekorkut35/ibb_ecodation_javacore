package com.yusufdiler;


public class Date {
public static void dateMethod () {
    java.util.Date date= new java.util.Date();
    System.out.println(date);
    System.out.println("Gün :"+date.getDate());
    System.out.println("Ay:" + (1 + date.getMonth() )); //ocak 0 dan başlar
    System.out.println("Yıl:" + (1900+date.getYear()) ); //yıl için 1900 ekliyoruz
    System.out.println("Tarih:" +date.toString() );
    }

//PSVM
    public static void main(String[] args) {
dateMethod();

    }
}
