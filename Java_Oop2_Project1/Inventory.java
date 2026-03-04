import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItems() {
        for (Item i : items) {
            System.out.println(i.getItemName());
        }
    }
}