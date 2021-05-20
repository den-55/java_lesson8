package ru.lesson8;

public class Program {
    public static Integer mValue = 0;

    public static void main(String[] args) {
        /*Incriminator incriminator = new Incriminator();
        System.out.println("Начальное значение " + mValue);

        incriminator.start();

        for(int i = 0; i < 3; i++) {
            try {
                Thread.sleep(i * 2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            incriminator.changeAction();
        }

        incriminator.finish();*/

       /* CommonResource commonResource = new CommonResource();
        for(int i = 0; i < 5; i++) {
            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Thread " + i);
            t.start();
        }

        System.out.println(commonResource.x);*/

        Store store = new Store();

        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
