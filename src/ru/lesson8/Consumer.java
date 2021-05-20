package ru.lesson8;

public class Consumer implements Runnable {
    private Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            store.get();
        }
    }
}
