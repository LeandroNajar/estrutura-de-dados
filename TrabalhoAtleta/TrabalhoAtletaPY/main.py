from TrabalhoAtletaPY.atleta import Atleta
from TrabalhoAtletaPY.sistema_atletas import SistemaAtletas

def main():
    sistema = SistemaAtletas()

    while True:
        # Exibe o menu e aguarda a entrada do usuário
        print("\nMenu\n1 - Listar atletas (nome ou por pontuação decrescente)\n2 - Cadastrar atleta\n3 - Procurar por atleta (nome ou apelido)\n4 - Remover atleta (nome ou apelido)\nOpcao:")
        opcao = input()

        if opcao == '1':
            sistema.listar_atletas()
        elif opcao == '2':
            # Solicita os dados do novo atleta e o cadastra no sistema
            fone = input("Telefone: ")
            nome = input("Nome: ")
            apelido = input("Apelido: ")
            data_nascimento = input("Data de Nascimento: ")
            pontuacao_acumulada = input("Pontuação Acumulada: ")
            atleta = Atleta(fone, nome, apelido, data_nascimento, pontuacao_acumulada)
            sistema.adicionar_atleta(atleta)
        elif opcao == '3':
            # Solicita o nome ou apelido do atleta a ser procurado
            chave = input("Digite o nome ou apelido do atleta: ")
            sistema.procurar_atleta(chave)
        elif opcao == '4':
            # Solicita o nome ou apelido do atleta a ser removido
            chave = input("Digite o nome ou apelido do atleta a ser removido: ")
            sistema.remover_atleta(chave)
        else:
            print("Opcao invalida.")

if __name__ == "__main__":
    main()