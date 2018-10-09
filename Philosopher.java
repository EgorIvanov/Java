public class Philosopher extends Thread {
    Table t;

   public Philosopher(Table t) {
       this.t = t;
   }

    @Override
    public void run() {
        while (!t.eating_over) {
            t.search_dish();
        }
    }
}
