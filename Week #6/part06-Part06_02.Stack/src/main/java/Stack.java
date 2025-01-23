import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return stack;
    }

    public String take() {
        int lastItemIndex = stack.size() - 1;
        return stack.remove(lastItemIndex);
    }
}