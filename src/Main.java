import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Soda> sodaList = new ArrayList<>();
       List<Beer> beerList = new ArrayList<>();
       List<Drink> drinkList = new ArrayList<>();

        Producer producer = new Producer(drinkList);
        Splitter splitter = new Splitter(beerList, sodaList, drinkList);
        BeerConsumer beerConsumer = new BeerConsumer(beerList);
        SodaConsumer sodaConsumer = new SodaConsumer(sodaList);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(splitter);
        Thread thread3 = new Thread(beerConsumer);
        Thread thread4 = new Thread(sodaConsumer);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}