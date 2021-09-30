
import java.util.Date;

public class DatePrinter implements Runnable{

    private Date date;
    private int counter;

    public DatePrinter() {
        date = new Date();
    }

    @Override
    public void run() {
        while (counter<=20000) {
            System.out.println(date);
            counter++;
        }
    }
}
