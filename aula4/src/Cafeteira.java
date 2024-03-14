public class Cafeteira {
    public boolean ligado;
    public int qtdCafe, qtdAgua;

    public Cafeteira() {
        this.ligado = false;
        this.qtdAgua = 0;
        this.qtdCafe = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void encherCafe(int cafe) {
        if (this.ligado && cafe > 0)
            this.qtdCafe += cafe;
    }

    public void encherAgua(int agua) {
        if (this.ligado && agua > 0)
            this.qtdAgua += agua;
    }

    public String status() {
        return "Cafeteira está ligada " + (this.ligado) + "a quantidade de café é " + this.qtdCafe + "gramas"
                + "e a quantidade de agua é "
                + this.qtdAgua + "ml";
    }

    public boolean fazerCafe() {
        if (this.ligado && this.qtdAgua >= 30 && this.qtdCafe >= 7) {
            this.qtdAgua -= 30;
            this.qtdCafe -= 7;

            return true;
        }

        return false;
    }

}
