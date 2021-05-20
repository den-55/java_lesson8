package ru.lesson8;

public class ChickenVoice {

    public static void main(String[] args) throws InterruptedException {
        EggVoice eggVoice = new EggVoice();
        System.out.println("начинаем спорить...");

        eggVoice.start();

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("кура");
        }

        if(eggVoice.isAlive()) {
            eggVoice.join();
            System.out.println("первым появилось яйцо");
        }else{
            System.out.println("кура первая");
        }

        System.out.println("конец");
    }
}
