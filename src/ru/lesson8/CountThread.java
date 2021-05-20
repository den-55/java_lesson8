package ru.lesson8;

public class CountThread implements Runnable {

    private CommonResource commonResource;

    public CountThread(CommonResource commonResource) {
        this.commonResource = commonResource;
    }

    @Override
    public void run() {
        synchronized (commonResource) {
            commonResource.x = 1;
            for(int i = 1; i < 5; i++) {
                System.out.println(String.format("Thread name %s, value %d", Thread.currentThread().getName(), commonResource.x));
                commonResource.x++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
