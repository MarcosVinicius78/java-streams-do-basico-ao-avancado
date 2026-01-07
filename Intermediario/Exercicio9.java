import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio9 {
    public static void main(String[] args) {
        List<Pessoa> listaPessoas = Exercicio6.gerarPessoas();

        Map<String, Long> pessoasAgrupadas = listaPessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCidade, Collectors.counting()));

        pessoasAgrupadas.forEach((cidade, quantidadePessoas) -> {
            System.out.println("Cidade " + cidade + " Quantidade de pessoas nessa cidade: " + quantidadePessoas);
        });
    }
}
