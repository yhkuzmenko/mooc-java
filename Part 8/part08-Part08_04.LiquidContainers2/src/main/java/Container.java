public class Container {
    private int capacity = 0;

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        this.capacity = this.capacity + amount;

        if (this.capacity > 100) {
            this.capacity = 100;
        }
    }

    public void move(int amount, Container second) {
        if (amount < 0) {
            return;
        }

        if (amount > this.capacity) {
            amount = this.capacity;
        }

        this.capacity = this.capacity - amount;
        second.add(amount);

        if (second.contains() > 100) {
            second.add(amount);
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.capacity = this.capacity - amount;

        if (this.capacity < 0) {
            this.capacity = 0;
        }
    }

    public int contains() {
        return this.capacity;
    }

    @Override
    public String toString() {
        return this.capacity + "/100";
    }
}