package ru.lesson8;

public class Incriminator extends Thread {

    private volatile boolean mIsIncrement = true; // m - marker
    private volatile boolean mFinish = false; // volatile не использовать кеш

    public void changeAction() {
        mIsIncrement = !mIsIncrement;
    }

    public void finish() {
        mFinish = true;
    }

    @Override
    public void run() {
        do {
            if(!mFinish) {
                if(mIsIncrement) {
                    Program.mValue++;
                }else{
                    Program.mValue--;
                }
                System.out.println("Текущее значение " + Program.mValue);
            }else {
                return;
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (true);
    }
}
