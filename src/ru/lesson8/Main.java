package ru.lesson8;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("Приложение запускается");

        Something something = new Something();

        Thread thread = new Thread(something, "potok2");
        Thread thread2 = new Thread(something, "potok1");
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println("Приложение завершилось");*/


        /*Thread thread = new Thread(() -> System.out.println("Hello"));

        thread.start();
        System.out.println("Приложение завершилось");*/

        Thread thread = new SomeClass();
        thread.start();
        System.out.println("Приложение завершилось");


    }
}
