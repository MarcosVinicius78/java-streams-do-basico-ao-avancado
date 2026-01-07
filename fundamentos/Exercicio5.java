import java.util.List;

public class Exercicio5 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1,1,2,3,4,4,5,6,7,8,9);

        listaNumeros.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
