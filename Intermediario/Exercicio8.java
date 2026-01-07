import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio8 {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Exercicio6.gerarPessoas();

        Map<String, List<Pessoa>> agrupamentoPorCidade = listaPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade));

        agrupamentoPorCidade.forEach((cidade, listaPessoasAgrupadas) -> {
            System.out.println("Cidade " + cidade);

            listaPessoasAgrupadas.forEach(System.out::println);
        });
    }
}
