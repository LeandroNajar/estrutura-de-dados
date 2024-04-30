import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Atleta> atletas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu\n1 - Listar atletas (nome ou por pontuação decrescente)\n2 - Cadastrar atleta\n3 - Procurar por atleta (nome ou apelido)\n4 - Remover atleta (nome ou apelido)\nOpcao:");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    if (atletas.isEmpty()) {
                        System.out.println("Nenhum atleta cadastrado.");
                    } else {
                        for (Atleta atleta : atletas) {
                            System.out.println(atleta);
                        }
                    }
                    break;
                case "2":
                    System.out.print("Telefone: ");
                    String fone = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Apelido: ");
                    String apelido = scanner.nextLine();
                    System.out.print("Data de Nascimento: ");
                    String dataNascimento = scanner.nextLine();
                    System.out.print("Pontuacao Acumulada: ");
                    int pontuacaoAcumulada = Integer.parseInt(scanner.nextLine());
                    Atleta novoAtleta = new Atleta(fone, nome, apelido, dataNascimento, pontuacaoAcumulada);
                    if (!atletas.contains(novoAtleta)) {
                        atletas.add(novoAtleta);
                        System.out.println("Atleta cadastrado com sucesso.");
                    } else {
                        System.out.println("Atleta já cadastrado.");
                    }
                    break;
                case "3":
                    System.out.print("Digite o nome ou apelido do atleta: ");
                    String chaveProcurar = scanner.nextLine();
                    List<Atleta> encontrados = new ArrayList<>();
                    for (Atleta atleta : atletas) {
                        if (atleta.getNome().toLowerCase().contains(chaveProcurar.toLowerCase()) || atleta.getApelido().toLowerCase().contains(chaveProcurar.toLowerCase())) {
                            encontrados.add(atleta);
                        }
                    }
                    if (encontrados.isEmpty()) {
                        System.out.println("Nenhum atleta encontrado.");
                    } else {
                        for (Atleta atleta : encontrados) {
                            System.out.println(atleta);
                        }
                    }
                    break;
                case "4":
                    System.out.print("Digite o nome ou apelido do atleta a ser removido: ");
                    String chaveRemover = scanner.nextLine();
                    List<Atleta> removidos = new ArrayList<>();
                    for (Atleta atleta : atletas) {
                        if (atleta.getNome().toLowerCase().contains(chaveRemover.toLowerCase()) || atleta.getApelido().toLowerCase().contains(chaveRemover.toLowerCase())) {
                            removidos.add(atleta);
                        }
                    }
                    if (removidos.isEmpty()) {
                        System.out.println("Nenhum atleta encontrado para remover.");
                    } else {
                        atletas.removeAll(removidos);
                        System.out.println("Atleta(s) removido(s) com sucesso.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}