import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        List<String> listaNomes = List.of("marcos", "vinicius", "leticia", "eduardo", "rosa");

        listaNomes.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
