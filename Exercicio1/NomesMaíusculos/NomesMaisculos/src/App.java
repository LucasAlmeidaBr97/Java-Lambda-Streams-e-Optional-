
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> listNames = Arrays.asList("lucas", "cassio", "joao");

        listNames.stream()
                .map(s -> toUpper(s))
                .forEach(System.out::println);
        ;

        System.out.println(" Segundo método ");

        List<String> listNames1 = Arrays.asList("lucas", "cassio", "joao");

        listNames1.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .forEach(System.out::println);

        System.out.println(" Terceiro método");

        List<String> listNames2 = Arrays.asList("lucas", "cassio", "joao");

        listNames2.replaceAll(name -> name.substring(0, 1).toUpperCase() + name.substring(1));

        listNames2.forEach(System.out::println);
    }

    public static String toUpper(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (Character.isLowerCase(c) && i == 0) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
