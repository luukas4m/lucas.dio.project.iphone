package app.musicplayer;

import appinterface.MusicInterface;

public class Music implements MusicInterface {

    @Override
    public void deletarMusica() {
        System.out.println("Música Deletada");
    }

    @Override
    public void modoAleatorioMusica() {
        System.out.println("Tocando no Modo Aleatório");
    }

    @Override
    public void desligarModoAleatorioMusica() {
        System.out.println("Tocar no Modo Aleatório desligado");
    }


    @Override
    public void pausarMusica() {
        System.out.println("Música Pausada");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Você pulou para próxima música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo a Música");
    }

    @Override
    public void voltarMusica() {
        System.out.println("Você voltou para música anterior");
    }
    
}
