package com.yusufdiler;


import java.util.Formatter;

public class Format {

    public static void formatter1(){
        Formatter formatter=new Formatter();
        formatter.format("hoşgeldiniz Adınız: %s Şanlı Numaranız : %d Ödlülünüz: %f %s", "Asaf", 7,3.4, "milyon dolar");
        System.out.println(formatter);
    }
    public static void main(String[] args) {
formatter1();
    }
}
