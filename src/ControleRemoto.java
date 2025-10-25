public class ControleRemoto {
    private Dispositivo dispositivo;

    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void apertarBotaoLigar() {
        dispositivo.ligar();
    }

    public void apertarBotaoDesligar() {
        dispositivo.desligar();
    }
}
