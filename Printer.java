package Threads;

public class Printer extends Thread {


  /*  @Override
    public void start()
    {
        super.start();
        System.out.println("This is start overridden");
        //super.start();
    }*/


    @Override
    public  void run(){
        for (int i =1 ; i <1000 ;i++)
            System.out.println("This is from child " + currentThread().getName() + " " +i);

    }
}
