public class Atleta {
    private String fone;
    private String nome;
    private String apelido;
    private String dataNascimento;
    private int pontuacaoAcumulada;

    public Atleta(String fone, String nome, String apelido, String dataNascimento, int pontuacaoAcumulada) {
        this.fone = fone;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.pontuacaoAcumulada = pontuacaoAcumulada;
    }

    // Getters e setters

    @Override
    public String toString() {
        return "Nome: " + nome + ", Apelido: " + apelido + ", Fone: " + fone + ", Data de Nascimento: " + dataNascimento + ", Pontuacao Acumulada: " + pontuacaoAcumulada;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Atleta atleta = (Atleta) obj;
        return fone.equals(atleta.fone);
    }

    @Override
    public int hashCode() {
        return fone.hashCode();
    }
}