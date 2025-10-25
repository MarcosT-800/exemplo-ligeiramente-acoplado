public class Ventilador implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("🌀 Ventilador ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("🌀 Ventilador desligado!");
    }
}
