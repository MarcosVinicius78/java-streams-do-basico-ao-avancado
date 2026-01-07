import java.util.List;

public class Exercicio12 {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Exercicio6.gerarPessoas();

        listaPessoas.stream()
                .mapToInt(Pessoa::getIdade)
                .average()
                .ifPresent(System.out::println);
    }
}
