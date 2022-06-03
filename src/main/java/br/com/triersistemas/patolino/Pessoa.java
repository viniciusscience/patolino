package br.com.triersistemas.patolino;

import java.util.*;

public abstract class Pessoa {
    private String nome;
    private String CPF;
    protected String documento;
    private String cnpj;

    public Pessoa() {
        List<String> nomes = new ArrayList<>();
        nomes.add("ana");
        nomes.add("julio");
        nomes.add("maria");
        nomes.add("vinicius");
        var rd = new SplittableRandom();
        this.nome = nomes.get(rd.nextInt(0, nomes.size()));
        this.documento = geraCPF();

    }

    public String getNome() {

        return nome;
    }

    public abstract String getDocumento();

    public String geraCPF() {
        int digito1 = 0;
        int resto = 0;
        int digito2 = 0;
        String dig;
        String numerosContatenados;
        String numeroGerado;
        Random num = new Random();

        int n1 = num.nextInt(10);
        int n2 = num.nextInt(10);
        int n3 = num.nextInt(10);
        int n4 = num.nextInt(10);
        int n5 = num.nextInt(10);
        int n6 = num.nextInt(10);
        int n7 = num.nextInt(10);
        int n8 = num.nextInt(10);
        int n9 = num.nextInt(10);

        int soma = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

        int valor = (soma / 11) * 11;

        digito1 = soma - valor;

        resto = digito1 % 11;

        if (digito1 < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }

        int soma2 = digito1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

        int valor2 = (soma2 / 11) * 11;

        digito2 = soma2 - valor2;

        resto = (digito2 % 11);

        if (digito2 < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }

        numerosContatenados = String.valueOf(n1) + String.valueOf(n2) + String.valueOf(n3) + "." + String.valueOf(n4) +
                String.valueOf(n5) + String.valueOf(n6) + "." + String.valueOf(n7) + String.valueOf(n8) +
                String.valueOf(n9) + "-";

        dig = String.valueOf(digito1) + String.valueOf(digito2);

        numeroGerado = numerosContatenados + dig;

        System.out.println("CPF " + numeroGerado);

        return numeroGerado;
    }
}

