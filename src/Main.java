public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        ControleRemoto controle = new ControleRemoto(tv);

        controle.apertarBotaoLigar();
        controle.apertarBotaoDesligar();
    }
}
