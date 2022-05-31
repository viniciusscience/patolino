package br.com.triersistemas.patolino;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {


        Farmacêutico a = new Farmacêutico();
        a.getOfertaDias();
        System.out.println(a.getOfertaDias());
        a.getNome();
        System.out.println(a.getNome());
        Fornecedor ta = new Fornecedor();
        ta.getProduto();
        System.out.println(ta.getProduto());
        a.getDocumento();
    }
}
