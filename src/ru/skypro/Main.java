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
                  int a = year % 4;
                  int b = year % 100;
                  int c = year % 400;
                  if (b == 0){
                      System.out.println("Год не весокосный");}
                  else if (a == 0 || c == 0){
                      System.out.println("Год весокосный");}
                      else {
                          System.out.println("Год не весокосный");
                      }}
        {

            // Задача 4

          int  deliveryDistance = 95;
          int day = 1;
          if (deliveryDistance <= 20) {
              System.out.println("Потребуется дней: " + day );
          } else if (deliveryDistance >= 21 && deliveryDistance <= 60){
              System.out.println ("Потребуется дней: " + day*2);}
          else if (deliveryDistance >= 61 && deliveryDistance <=100) {
              System.out.println("Потребуется дней: " + day * 3);
          }
          }
        {

            // Задача 5

            int monthNumber = 12;
            switch (monthNumber){
                case 1 : System.out.println ("Январь");
                break;
                case 2 : System.out.println ("Февраль");
                    break;
                case 3 : System.out.println ("Март");
                    break;
                case 4 : System.out.println ("Апрель");
                    break;
                case 5 : System.out.println ("Май");
                    break;
                case 6 : System.out.println ("Июнь");
                    break;
                case 7 : System.out.println ("Июль");
                    break;
                case 8 : System.out.println ("Август");
                    break;
                case 9 : System.out.println ("Сентябрь");
                    break;
                case 10 : System.out.println ("Октябрь");
                    break;
                case 11 : System.out.println ("Ноябрь");
                    break;
                case 12 : System.out.println ("Декабрь");
                    break;
               default : System.out.println ("Такого месяца не суцществует!");
            }




        }

        }



        }




