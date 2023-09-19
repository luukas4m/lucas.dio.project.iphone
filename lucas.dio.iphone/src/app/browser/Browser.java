package app.browser;

import appinterface.BrowserInterface;

public class Browser implements BrowserInterface {

    @Override
    public void abrirBrowser() {
        System.out.println("Abrindo o navegador");
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova página");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
        
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir a Página");
        
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página Fechada");
        
    }
    
}
