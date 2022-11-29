package dev.omeratayilmaz.threads;


public class CustomThread extends Thread
{
    @Override
    public void run(){
        System.out.println("Thread is running");
        for (int i=0;i<=100;i++){
            System.out.println("First:"+i);
        }
    }

    @Override
    public void interrupt() {
        System.out.println("Thread interrupted");
        super.interrupt();
    }
}
