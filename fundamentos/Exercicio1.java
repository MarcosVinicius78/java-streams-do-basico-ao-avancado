import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19);

        listaNumeros.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);
    }
}
