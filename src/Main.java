public class Main {
    public static void main(String[] args) {
        Dispositivo tv = new TV();
        Dispositivo ventilador = new Ventilador();

        ControleRemoto controleTV = new ControleRemoto(tv);
        ControleRemoto controleVentilador = new ControleRemoto(ventilador);

        controleTV.apertarBotaoLigar();
        controleTV.apertarBotaoDesligar();

        controleVentilador.apertarBotaoLigar();
        controleVentilador.apertarBotaoDesligar();
    }
}
