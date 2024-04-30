from TrabalhoAtletaPY.atleta import Atleta

class SistemaAtletas:
    def __init__(self):
        # Inicialização da lista de atletas
        self.atletas = []

    def adicionar_atleta(self, atleta):
        # Método para adicionar um novo atleta ao sistema
        if atleta not in self.atletas:  # Verifica se o atleta já está cadastrado
            self.atletas.append(atleta)
            print("Atleta cadastrado.")
        else:
            print("Atleta ja cadastrado.")

    def listar_atletas(self):
        # Método para listar todos os atletas cadastrados
        if not self.atletas:  # Verifica se não há atletas cadastrados
            print("Atleta nao cadastrado.")
        else:
            for atleta in self.atletas:
                print(atleta)

    def procurar_atleta(self, chave):
        # Método para procurar um atleta pelo nome ou apelido
        encontrados = []
        for atleta in self.atletas:
            if chave.lower() in atleta.nome.lower() or chave.lower() in atleta.apelido.lower():
                encontrados.append(atleta)
        if not encontrados:  # Verifica se nenhum atleta foi encontrado
            print("Atleta nao encontrado.")
        else:
            for atleta in encontrados:
                print(atleta)

    def remover_atleta(self, chave):
        # Método para remover um atleta pelo nome ou apelido
        removidos = []
        for atleta in self.atletas:
            if chave.lower() in atleta.nome.lower() or chave.lower() in atleta.apelido.lower():
                removidos.append(atleta)
        if not removidos:  # Verifica se nenhum atleta foi removido
            print("Nenhum atleta encontrado para remover.")
        else:
            for atleta in removidos:
                self.atletas.remove(atleta)
            print("Atleta removido com sucesso.")