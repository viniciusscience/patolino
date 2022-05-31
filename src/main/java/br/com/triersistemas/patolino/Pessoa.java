package br.com.triersistemas.patolino;

import java.util.*;

public abstract class Pessoa {
    private String nome;
    protected String documento;

    public Pessoa() {
        List<String> nome = new ArrayList<>();
        nome.add("ana");
        nome.add("julio");
        nome.add("maria");
        nome.add("vinicius");
        var rd = new SplittableRandom();
        this.nome = nome.get(rd.nextInt(0, nome.size()));


    }


    public String getNome() {

        return nome;
    }

    public abstract String getDocumento();
}

