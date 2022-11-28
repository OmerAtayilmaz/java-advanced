package dev.omeratayilmaz.threads;

public class ThreadsApplication {

    public static void main(String[] args) {
        CustomThread c1=new CustomThread();
        c1.start();
        //c1.interrupt();
        //System.out.println(c1.isInterrupted());
        for (int i=0;i<=100;i++){
            System.out.println("SEC:"+i);
        }
    }

}
