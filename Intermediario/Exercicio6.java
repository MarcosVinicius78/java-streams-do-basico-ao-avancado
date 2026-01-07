import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio6 {

    private static List<Pessoa> listaPessoas;

    public static void main(String[] args) {

        gerarPessoas();

        listaPessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= 18)
                .forEach(System.out::println);
    }

    public static void gerarPessoas() {
        listaPessoas = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int idade = random.nextInt(1, 30);
            Pessoa novaPessoa = new Pessoa("Pessoa" + i, idade, "Cidade"+i);

            listaPessoas.add(novaPessoa);
        }
    }
}
