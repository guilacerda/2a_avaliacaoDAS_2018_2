package Tests;

import Calculos.Rentabilidade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImpostoRendaTeste {

    @Test
    public void gerarImpostoRendaTest(){
        Rentabilidade rentabilidade = new Rentabilidade();
        float rendimentoBruto  = rentabilidade.rendimentoBruto(0.1644f,1000.0f, 0.085f);

        assertEquals(3.14f, rentabilidade.calculoImpostoRenda(0.225f, rendimentoBruto), 0.1f);
    }

    @Test
    public void gerarImpostoRendaTest2(){
        Rentabilidade rentabilidade = new Rentabilidade();
        float rendimentoBruto = rentabilidade.rendimentoBruto(0.3288f,500.0f, 0.08f);
        assertEquals(2.98f, rentabilidade.calculoImpostoRenda(0.225f, rendimentoBruto), 0.1f);
    }
}
