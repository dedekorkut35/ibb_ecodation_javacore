package com.yusufdiler;

import java.util.Scanner;

public class Homework3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Tek bir Scanner nesnesi açılıyor

    System.out.println("Lütfen soyadınızı giriniz:");
    String surname = scanner.nextLine();  // Kullanıcı girdisi alınıyor

    System.out.println("Lütfen adınızı giriniz:");
    String name = scanner.nextLine();  // Kullanıcıdan isim alınıyor

    System.out.println("Lütfen yaşınızı giriniz:");
    int age = scanner.nextInt();  // Kullanıcıdan yaş alınıyor

    System.out.println("Girdiğiniz bilgiler:");
    System.out.println("Ad: " + name);
    System.out.println("Soyad: " + surname);
    System.out.println("Yaş: " + age);

    scanner.close(); // Scanner nesnesi kapatılıyor
}
}