public class Fork {
    Dish right_dish;
    Dish left_dish;
    boolean isAvailable;

    public Fork(Dish ld, Dish rd) {
        right_dish = rd;
        left_dish = ld;
        isAvailable = true;
    }
}
