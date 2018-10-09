import static java.lang.Thread.sleep;

public class Dish {
    boolean contain;
    boolean found;
    int EatingTime = 5000;

    public Dish() {
        contain = true;
        found = false;
    }

    public synchronized void beingEated() {
        System.out.println("Eating");
        try {
            sleep(EatingTime);
        } catch (InterruptedException e) {}
    }

}
