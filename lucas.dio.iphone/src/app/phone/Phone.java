package app.phone;

import appinterface.PhoneInterface;

public class Phone implements PhoneInterface {

    @Override
    public void atender() {
        System.out.println("Ligação Atendida");
    }

    @Override
    public void finalizarCorreioVoz() {
        System.out.println("Encerrando Correio de Voz");
    }

    @Override
    public void finalizarLigacao() {
        System.out.println("Ligação Finalizada");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void verificarSinal() {
        System.out.println("Verificando Sinal...");
    }
    
}
