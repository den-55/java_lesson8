package ru.lesson8;

public class SomeClass extends Thread {

    @Override
    public void run() {
        System.out.println("some thread print");
    }
}
