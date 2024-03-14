package pacote;

public class Pessoa {
    public String nome;
    String sobrenome;
    private int ddd;
    protected int telefone;

    public Pessoa() {
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getDdd() {
        return this.ddd;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa \n" +
                "\nNome: " + this.nome +
                "\nSobrenome: " + this.sobrenome +
                "\nDDD: " + this.ddd +
                "\nTelefoe :" + this.telefone;
    }
}
