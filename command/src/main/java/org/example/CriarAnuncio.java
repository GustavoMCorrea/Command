package org.example;

public class CriarAnuncio implements Anuncio {

    private Produto produto;

    public CriarAnuncio(Produto produto) {
        this.produto = produto;
    }

    @Override
    public void executar() {
        this.produto.CriarAnuncio();
    }

    @Override
    public void cancelar() {
        this.produto.DesativarAnuncio();
    }
}
