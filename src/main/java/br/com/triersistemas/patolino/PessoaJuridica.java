package br.com.triersistemas.patolino;

public abstract class PessoaJuridica extends Pessoa {


    public PessoaJuridica() {

    }

    @Override
    public String getDocumento() {
        return super.documento;
    }
}
