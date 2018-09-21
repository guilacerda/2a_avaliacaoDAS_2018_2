package Tests;

import Calculos.Rentabilidade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RendimentoBrutoTestes {

    @Test
    public void gerarRendimentoBrutoTest(){
        Rentabilidade rentabilidade = new Rentabilidade();

        assertEquals(13.97f, rentabilidade.rendimentoBruto(0.1644f, 1000.0f, 0.085f), 0.1f);
    }

    @Test
    public void gerarNovoRendimentoBrutoTest(){
        Rentabilidade rentabilidade = new Rentabilidade();

        assertEquals(13.15f, rentabilidade.rendimentoBruto(0.3288f, 500.0f, 0.08f), 0.1f);
    }
}
