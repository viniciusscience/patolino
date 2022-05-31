package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public abstract class PessoaFisica extends Pessoa {


    public PessoaFisica() {
        List<String> cpf = new ArrayList<>();
        cpf.add("099.932.213-31");
        cpf.add("099.323.293-30");
        cpf.add("030.302.303.02");
        var ny = new SplittableRandom();

        this.documento = cpf.get(ny.nextInt(0,cpf.size()));
    }

    public String getDocumento() {
        return super.documento;
    }
}
