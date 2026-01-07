import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Exercicio7 {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Exercicio6.gerarPessoas();

        List<String> listaNomes = listaPessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= 18)
                .map(Pessoa::getNome)
                .toList();

        listaNomes.forEach(System.out::println);
    }

}
