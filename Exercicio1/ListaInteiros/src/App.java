
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> listaInt = Arrays.asList(1, 2, 3, 4);
        listaInt.stream().forEach(x -> System.out.println(x));

        listaInt.forEach(System.out::println);
    }
}
