import app.browser.Browser;
import app.musicplayer.Music;
import app.phone.Phone;
import iphone.Ios;

public class Iphone {
    public static void main(String[] args) {

            Ios iphone = new Ios();

                iphone.ligarIphone();
                iphone.desbloquearIphone();


        System.out.println("-------------------------");

            Browser browserApp = new Browser();

                browserApp.abrirBrowser();
                browserApp.adicionarNovaAba();
                browserApp.exibirPagina();
                browserApp.atualizarPagina();
                browserApp.fecharPagina();
        
        System.out.println("-------------------------");

            Music musicApp = new Music();

                musicApp.tocarMusica();
                musicApp.pausarMusica();
                musicApp.selecionarMusica();
                musicApp.proximaMusica();
                musicApp.voltarMusica();
                musicApp.modoAleatorioMusica();
                musicApp.desligarModoAleatorioMusica();
                musicApp.deletarMusica();

        System.out.println("-------------------------");
            
            Phone phoneApp = new Phone();

                phoneApp.verificarSinal();
                phoneApp.ligar();
                phoneApp.atender();
                phoneApp.finalizarLigacao();
                phoneApp.iniciarCorrerioVoz();
                phoneApp.finalizarCorreioVoz();

        System.out.println("-------------------------");

                iphone.bloquearIphone();
                iphone.desligarIphone();
                
    }
}