package org.example;

public class Produto {

    private String codigo;
    private String descricao;
    private String disponivel;

    public Produto(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    public String getDisponivel() {
        return disponivel;
    }

    public void CriarAnuncio(){
        this.disponivel = "Anuncio criado";
    }

    public void DesativarAnuncio(){
        this.disponivel = "Anuncio desativado";
    }
}
