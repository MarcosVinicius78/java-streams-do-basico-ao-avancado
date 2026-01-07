import java.util.Comparator;
import java.util.List;

public class Exercicio10 {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Exercicio6.gerarPessoas();

        // para mostrar em ordem crescente, basta tirar o reversed
        listaPessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade).reversed())
                .forEach(System.out::println);
    }
}
