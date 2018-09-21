package Tests;

import Calculos.Rentabilidade;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RendimentoBrutoTestes {

    @Test
    public void gerarRendimentoBrutoTest(){
        Rentabilidade rentabilidade = new Rentabilidade();

        assertEquals(13.97f, rentabilidade.rendimentoBruto(), 0f);
    }

}
