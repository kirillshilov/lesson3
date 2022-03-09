package ru.skypro;

public class Main {

    public static void main(String[] args) {
        {

            // Задача 1
            int clientOs = 1; // ios -0     android - 1
            if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");

            } else System.out.println("Установите версию приложения для IOS по ссылке");
        }

        // Задача 2
        {
            int clientOs = 0;
            int сlientDeviceYear = 2015;
            if (clientOs == 1 && сlientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOs == 1 && сlientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOs == 0 && сlientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }

        {
            // Задача 3
                  int year = 2021;
                  int eachFourYear = year % 4;
                  int eachHundredYear = year % 100;
                  int eachFourHundredYear = year % 400;
                  if (eachHundredYear == 0){
                      System.out.println("Год не весокосный");}
                  else if (eachFourYear == 0 || eachFourHundredYear == 0){
                      System.out.println("Год весокосный");}
                      else {
                          System.out.println("Год не весокосный");
                      }}
        {

            // Задача 4

          int  deliveryDistance = 95;
          if (deliveryDistance <= 20) {
              System.out.println("Потребуется дней: " + 1 );
          } else if (deliveryDistance >= 21 && deliveryDistance <= 60){
              System.out.println ("Потребуется дней: " + 2);}
          else if (deliveryDistance >= 61 && deliveryDistance <=100) {
              System.out.println("Потребуется дней: " + 3);
          }
          }
        {

            // Задача 5

            int monthNumber = 12;
            switch (monthNumber){
                case 1 : System.out.println ("зима");
                break;
                case 2 : System.out.println ("зима");
                    break;
                case 3 : System.out.println ("весна");
                    break;
                case 4 : System.out.println ("весна");
                    break;
                case 5 : System.out.println ("весна");
                    break;
                case 6 : System.out.println ("лето");
                    break;
                case 7 : System.out.println ("лето");
                    break;
                case 8 : System.out.println ("лето");
                    break;
                case 9 : System.out.println ("осень");
                    break;
                case 10 : System.out.println ("осень");
                    break;
                case 11 : System.out.println ("осень");
                    break; case 12 : System.out.println ("зима");
                    break;
                default : System.out.println ("Такого месяца не суцществует!");
            }




        }

        }



        }




