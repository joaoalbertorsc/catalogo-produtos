import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CatalogoProdutos {

    public List<Produto> todosProdutosDisponiveis(List<Produto> produtos) {
        return produtos;
    }

    public List<Produto> filtrarPorPreco(List<Produto> produtos) {
        return produtos.stream()
                .filter(p -> p.preco > 100)
                .collect(Collectors.toList());
    }

    public List<Produto> ordenarPorNome(List<Produto> produtos) {
        return produtos.stream()
                .sorted(Comparator.comparing(p -> p.nome))
                .toList();
    }

    public void buscarPorNome(List<Produto> produtos, String nome) {
        Optional<Produto> produtoOptional = produtos.stream()
                .filter(p -> p.nome.equalsIgnoreCase(nome))
                .findFirst();

        produtoOptional.ifPresentOrElse(
                p -> System.out.println("Encontrado: " + p),
                () -> System.out.println("Produto não encontrado.")
        );
    }
}