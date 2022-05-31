package br.com.triersistemas.patolino;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Farmacêutico extends PessoaFisica   {

   private String Ofertas;

    public Farmacêutico(){
        List<String> listaoferta = new ArrayList<String>();
        listaoferta.add("feijao");
        listaoferta.add("arroz");
        listaoferta.add("caju");

        var rn = new SplittableRandom();
       this.Ofertas=listaoferta.get(rn.nextInt(0,listaoferta.size()));

    }

    @Override
    public String getDocumento() {
        return super.documento;
    }

    public String getOfertaDias() {

        return Ofertas;
    }
}
