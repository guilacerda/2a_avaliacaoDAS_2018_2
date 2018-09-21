package Calculos;

public class Rentabilidade {
    public Rentabilidade(){

    }

    public float rendimentoBruto(float tempo, float aInicial, float tJuros){
        return tempo * aInicial * tJuros;
    }

    public float calculoImpostoRenda(float aliquota, float rendBruto){
        return rendBruto * aliquota;
    }

    public float rendimentoLiquido(float rendimentoBruto, float impostoRenda, float vInicial){
        float vFinal = vInicial + (rendimentoBruto - impostoRenda);
        float resultado = ((vFinal/vInicial) * 100) - 100;

        return resultado;
    }
}
