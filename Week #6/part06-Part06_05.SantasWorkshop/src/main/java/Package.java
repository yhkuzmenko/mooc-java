import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> packages;

    public Package() {
        packages = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        packages.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift gift : packages) {
            totalWeight = totalWeight + gift.getWeight();
        }

        return totalWeight;
    }
}