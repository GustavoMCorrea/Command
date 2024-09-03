package org.example;

public class DesativarAnuncio implements Anuncio {

    private Produto produto;

    public DesativarAnuncio(Produto produto) {
        this.produto = produto;
    }

    @Override
    public void executar() {
        this.produto.DesativarAnuncio();
    }

    @Override
    public void cancelar() {
        this.produto.CriarAnuncio();
    }
}
