public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 1");

        Triangulo Triangulo1 = new Triangulo(10, 5);

        System.out.println("A area do triangulo é: " + Triangulo1.area());

        System.out.println("Exercicio 2");

        Cafeteira britania = new Cafeteira();

        britania.ligar();
        britania.encherAgua(30);
        britania.encherCafe(14);

        System.out.println(britania.status());
        if (britania.fazerCafe()) {
            System.out.println("café pronto!");
            System.out.println(britania.status());
        } else {
            System.out.println("Nao foi possivel fazer o café!");
            System.out.println(britania.status());
        }
    }
}
