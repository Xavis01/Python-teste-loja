package Class.Exercicio2;

public class Vendedor {

    private int codigo;
    private String nome;
    private char tipoAlimento;

    public Vendedor(int codigo, String nome, char tipoAlimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoAlimento = tipoAlimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public char getTipoAlimento() {
        return tipoAlimento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoAlimento(char tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String toString() {
        return "Código do vendedor: " + codigo +
        "Nome do vendedor: " + nome +
        "Tipo de alimento: " + tipoAlimento;
    }
}