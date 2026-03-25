import java.util.List;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Java8LambdaStream {
    public static void main(String[] args) {
        

        //API DE STREAM

        // stream - fluxo de dados

        List<Integer> asList = Arrays.asList(1, 2, 3, 4);

        for(Integer integer : asList){
            System.out.println(integer);
        }
    }
}
