import java.util.Comparator;
import java.util.List;

public class Exercicio11 {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Exercicio6.gerarPessoas();

        listaPessoas.forEach(System.out::println);

        listaPessoas.stream()
                .max(Comparator.comparingInt(Pessoa::getIdade))
                .ifPresent(System.out::println);
    }
}
