package ru.lesson8;

public class Something implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            String name = Thread.currentThread().getName();

            System.out.println(name + " Привет, это побочный поток, позиция " + i);
        }
    }
}
