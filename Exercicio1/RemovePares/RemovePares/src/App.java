import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        intList.removeIf(i -> i % 2 == 0 );
        System.out.println(intList);

        intList.forEach(System.out::println);
    }
}
