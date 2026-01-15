import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list = new ArrayList<String>();

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println((i + 1) + ": " + this.list.get(i));
        }
    }

    public void remove(int number) {
        if (this.list.size() == 0) {
            this.list.remove(number);
            return;
        }
        
        this.list.remove(number - 1);
    }
}