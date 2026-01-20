
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //API DE STREAM

        //stream - fluxo de dados

        List<Integer> aList = Arrays.asList(1, 2, 3, 4);

        aList.stream().forEach(e -> System.out.println(e));

    }
}
