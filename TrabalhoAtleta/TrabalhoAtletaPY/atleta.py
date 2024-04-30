class Atleta:
    def __init__(self, fone, nome, apelido, data_nascimento, pontuacao_acumulada):
        # Atributos do atleta
        self.fone = fone
        self.nome = nome
        self.apelido = apelido
        self.data_nascimento = data_nascimento
        self.pontuacao_acumulada = pontuacao_acumulada

    def __str__(self):
        # Método para representação em string do objeto Atleta
        return f"Nome: {self.nome}, Apelido: {self.apelido}, Telefone: {self.fone}, Data de Nascimento: {self.data_nascimento}, Pontuacao Acumulada: {self.pontuacao_acumulada}"

    def __eq__(self, other):
        # Método para verificar se dois objetos Atleta são iguais
        return self.fone == other.fone

    def __hash__(self):
        # Método para calcular o hash do objeto Atleta
        return hash(self.fone)