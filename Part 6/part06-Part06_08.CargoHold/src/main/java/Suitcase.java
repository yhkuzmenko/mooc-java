import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items = new ArrayList<>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeightWithItem = totalWeight() + item.getWeight();

        if (totalWeightWithItem <= maxWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item : items) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items" + " (" + totalWeight() + " kg)";
        }

        if (items.size() == 1) {
            return items.size() + " item (" + totalWeight() + " kg)";
        }

        return items.size() + " items (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);

        for (Item item : items) {
            if (item.getWeight() >= heaviest.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }
}