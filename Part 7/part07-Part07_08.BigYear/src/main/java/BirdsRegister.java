import java.util.ArrayList;

public class BirdsRegister {
    private ArrayList<Bird> register = new ArrayList<>();

    public void add(Bird bird) {
        register.add(bird);
    }

    public void observe(String name) {
        for (Bird bird : register) {
            if (bird.getName().equals(name)) {
                bird.increaseObservationCount();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAllBirds() {
        for (Bird bird : register) {
            System.out.println(bird);
        }
    }

    public void printBird(String name) {
        for (Bird bird : register) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
    }
}