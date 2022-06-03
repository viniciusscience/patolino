package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Fornecedor extends PessoaJuridica{
    private String Produto;

    public String getProduto() {
        return Produto;
    }

     Fornecedor() {

        List<String> produtos = new ArrayList<>();
    produtos.add("racao");
    produtos.add("remedio");
    produtos.add("acessorios");
    var na = new SplittableRandom();
    this.Produto=produtos.get(na.nextInt(0,produtos.size()));


    }


    public String getDocumento() {
        return super.documento;
    }
}
