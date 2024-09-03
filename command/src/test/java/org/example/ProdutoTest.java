package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoTest {

    Produto produto;
    Ecommerce ecommerce;

    @BeforeEach
    void setUp() {
        produto = new Produto("202401","Camisa");
        ecommerce = new Ecommerce();

    }

    @Test
    void deveCriarAnuncio() {
        Anuncio criarAnuncio = new CriarAnuncio(produto);
        ecommerce.executarAnuncio(criarAnuncio);

        assertEquals("Anuncio criado", produto.getDisponivel());
    }

    @Test
    void deveDestivarAnuncio() {

        Anuncio desativarAnuncio = new DesativarAnuncio(produto);
        ecommerce.executarAnuncio(desativarAnuncio);

        assertEquals("Anuncio desativado", produto.getDisponivel());

    }

}