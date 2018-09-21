package Tests;

import Calculos.Rentabilidade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImpostoRendaTeste {

    @Test
    public void gerarImpostoRendaTest(){
        Rentabilidade rentabilidade = new Rentabilidade();
        assertEquals(3.14f, rentabilidade.calculoImpostoRenda(), 0.1f);
    }

    @Test
    public void gerarImpostoRendaTest2(){
        Rentabilidade rentabilidade = new Rentabilidade();
        assertEquals(2.98f, rentabilidade.calculoImpostoRenda(), 0.1f);
    }
}
