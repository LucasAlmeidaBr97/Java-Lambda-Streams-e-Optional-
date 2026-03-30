import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> intList = new ArrayList<>(List.of(9, 10, 14, 20, 60, 30, 3, 5, 1));

        Predicate<Integer> maior = n -> n > 10 ;

        List<Integer> filtrados = intList.stream().filter(maior).collect(Collectors.toList());

    

        intList.removeIf(i -> i % 2 == 0 );
        System.out.println(intList);

        intList.stream();
        

        intList.forEach(System.out::println);

        filtrados.forEach(System.out::println);

    
    }
}
