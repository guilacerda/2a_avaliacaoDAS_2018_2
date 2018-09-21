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
}
