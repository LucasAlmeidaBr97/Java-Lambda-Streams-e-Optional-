import java.util.function.Function;

public class App {
    public static void main(String[] args) throws Exception {
        


        Function<Integer, Integer> quadrado = i -> i * i;

        System.out.println(quadrado.apply(5));

    }
}
