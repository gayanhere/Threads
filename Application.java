package Threads;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setDaemon(true);
       printer.start();
        //printer.run();
for (int h =0; h <10;h++)
{System.out.println("This is main thread "+ Thread.currentThread().getName() + " " + h);}


        System.out.println("++++++++++++++++++++++++++++++++");
    }

}
