public class ControleRemoto {
    private TV tv;

    public ControleRemoto(TV tv) {
        this.tv = tv;
    }

    public void apertarBotaoLigar() {
        tv.ligar(); // Chama diretamente a TV
    }

    public void apertarBotaoDesligar() {
        tv.desligar();
    }
}
