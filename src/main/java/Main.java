import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Monitor",  900.0),
                new Produto("Mouse",     80.0),
                new Produto("Teclado",  150.0),
                new Produto("Headset",  200.0),
                new Produto("Webcam",    90.0)
        );

        var catalogo = new CatalogoProdutos();
        var scanner  = new Scanner(System.in);
        var opcao    = 4;

        while (opcao != 0) {
            System.out.println("\n=== Catálogo de Produtos ===");
            System.out.println("Produtos disponíveis:");
            System.out.println("\n1 - Listar todos os produtos");
            System.out.println("2 - Produtos com preço > 100");
            System.out.println("3 - Ordenar por nome");
            System.out.println("4 - Buscar por nome");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> catalogo.todosProdutosDisponiveis(produtos).forEach(System.out::println);
                case 2 -> catalogo.filtrarPorPreco(produtos).forEach(System.out::println);
                case 3 -> catalogo.ordenarPorNome(produtos).forEach(System.out::println);
                case 4 -> {
                    System.out.print("Escreva o nome do produto: ");
                    catalogo.buscarPorNome(produtos, scanner.next());
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}