import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeightWithSuitcase = totalWeight() + suitcase.totalWeight();

        if (totalWeightWithSuitcase <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    private int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}