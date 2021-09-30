public class Main {
    public static void main(String[] args) {

        DatePrinter datePrinter=new DatePrinter();
        Thread th1=new Thread(datePrinter);

        CountPrinter countPrinter=new CountPrinter();
        Thread th2=new Thread(countPrinter);

        th1.start();
        th2.start();

        /*
        Bei 2.000 Wiederholungen erfolgten zuerst die Zahlen von 0-2.000 und danach die Daten
        Und bei 20.000 Wiederholungen kamen zwischen den Zahlen auch hin und wieder Daten vor
        Genauergesagt kam nach 5264 Wiederholungen des CountPrinters das erste Datum vor


        Ich glaube DatePrinter braucht länger da das berechnen eines Datums länger dauert
     */

    }
}
