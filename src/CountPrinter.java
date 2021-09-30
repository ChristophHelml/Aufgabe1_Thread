public class CountPrinter implements Runnable{

    private int counter;

    public CountPrinter() {
        counter =0;
    }

    @Override
    public void run() {
        while (counter <=20000) {
            System.out.println(counter);
            counter++;
        }
    }
}
