import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        List<String> listaNomes = List.of("Marcos", "Matheus", "Carlos", "Amanda", "Ana", "Antonio", "Leticia", "jessica");

        listaNomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .forEach(System.out::println);
    }
}
