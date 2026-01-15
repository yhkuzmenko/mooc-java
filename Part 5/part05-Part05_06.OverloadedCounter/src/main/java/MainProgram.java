public class MainProgram {

    public static void main(String[] args) {
        Counter counter = new Counter(5);
        
        counter.increase();
        counter.increase();
        counter.decrease();
        counter.increase(4);
        counter.decrease(10);
        counter.decrease(-100);
        counter.increase(-100);

        System.out.println(counter.value());
    }
}