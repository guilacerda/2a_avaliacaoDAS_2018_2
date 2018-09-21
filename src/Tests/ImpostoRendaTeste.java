package Tests;

import Calculos.Rentabilidade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ImpostoRendaTeste {
    Rentabilidade rentabilidade = new Rentabilidade();

    @Parameterized.Parameters
    public static Collection<Object[]> Composto() {
        return Arrays.asList(new Object[][]{
                {0.1644f, 1000.0f, 0.085f, 0.225f, 3.14f},
                {0.3288f, 500.0f, 0.08f, 0.225f, 2.98f},
                {0.6576f, 3000.0f, 0.09f, 0.20f, 35.51f}
        });
    }

    @Parameterized.Parameter()
    public float tempo;

    @Parameterized.Parameter(1)
    public float aInicial;

    @Parameterized.Parameter(2)
    public float tJuros;

    @Parameterized.Parameter(3)
    public float aliquota;

    @Parameterized.Parameter(4)
    public float expected;

    static final float DELTA = 0.1f;

    @Test
    public void gerarImpostoRendaTest(){
        float rendimentoBruto  = rentabilidade.rendimentoBruto(tempo,aInicial, tJuros);

        assertEquals(expected, rentabilidade.calculoImpostoRenda(aliquota, rendimentoBruto), DELTA);
    }

}
