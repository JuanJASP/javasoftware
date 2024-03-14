import pacote.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("metodos acessores e modificadores!");

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Pedro";

        pessoa1.setSobrenome("Pinheiro");
        pessoa1.setDdd(41);
        pessoa1.setTelefone(412232424);

        System.out.println(pessoa1);
    }
}
