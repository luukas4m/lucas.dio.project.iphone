package iphone;

public class Ios implements IosInterface {

    @Override
    public void bloquearIphone() {
        System.out.println("Tela bloqueada");
        
    }

    @Override
    public void desbloquearIphone() {
        System.out.println("Tela desbloqueada");
        
    }

    @Override
    public void desligarIphone() {
        System.out.println("iPhone Desligado");
        
    }

    @Override
    public void ligarIphone() {
        System.out.println("iPhone Ligado");
        
    }

}