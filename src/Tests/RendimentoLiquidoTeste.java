package Tests;

import Calculos.Rentabilidade;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RendimentoLiquidoTeste {
    @Test
    public void rendimentoLiquidoTeste(){
        Rentabilidade rentabilidade = new Rentabilidade();
        float rendimentoBruto  = rentabilidade.rendimentoBruto(0.1644f, 1000.0f, 0.085f);
        float impostoRenda = rentabilidade.calculoImpostoRenda(0.225f, rendimentoBruto);

        assertEquals(1.0829f, rentabilidade.rendimentoLiquido(rendimentoBruto, impostoRenda, 1000.0f), 0.1f);
    }

    @Test
    public void rendimentoLiquidoTeste2(){
        Rentabilidade rentabilidade = new Rentabilidade();
        float rendimentoBruto  = rentabilidade.rendimentoBruto(0.3288f, 500.0f, 0.08f);
        float impostoRenda = rentabilidade.calculoImpostoRenda(0.225f, rendimentoBruto);

        assertEquals(2.0348f, rentabilidade.rendimentoLiquido(rendimentoBruto, impostoRenda, 500.0f), 0.1f);
    }
}
