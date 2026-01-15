
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines = null;
        lines.add("now lines points to null");
    }
}
