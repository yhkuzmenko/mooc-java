public class Container {
    private int waterLevel;

    public int contains() {
        return waterLevel;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        waterLevel = waterLevel + amount;

        if (waterLevel > 100) {
            waterLevel = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        waterLevel = waterLevel - amount;

        if (waterLevel < 0) {
            waterLevel = 0;
        }
    }

    @Override
    public String toString() {
        return waterLevel + "/100";
    }
}