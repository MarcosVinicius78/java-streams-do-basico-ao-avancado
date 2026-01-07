import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio6 {

    public static void main(String[] args) {

        List<Pessoa> listaPessoas = gerarPessoas();

        listaPessoas.stream()
                .filter(pessoa -> pessoa.getIdade() >= 18)
                .forEach(System.out::println);
    }

    public static List<Pessoa> gerarPessoas() {
        List<Pessoa> listaPessoas = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            int idade = random.nextInt(1, 30);
            Pessoa novaPessoa = new Pessoa("Pessoa" + i, idade, "Cidade"+i);

            listaPessoas.add(novaPessoa);
        }

        return listaPessoas;
    }
}
