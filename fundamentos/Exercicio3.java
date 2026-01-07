import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Eu poderia usar (0, Integer::sum)
        // 0 é o valor inicial, depois e o que ele vai fazer
        int total = listaNumeros.stream()
                .reduce(0, (subTotal, item) -> subTotal + item);

        System.out.println(total);
    }
}
