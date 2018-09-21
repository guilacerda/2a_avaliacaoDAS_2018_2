package Tests;

import Calculos.Rentabilidade;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RendimentoLiquidoTeste {
    @Test
    public void rendimentoLiquidoTeste(){
        Rentabilidade rentabilidade = new Rentabilidade();

        assertEquals(1.0829f, rentabilidade.rendimentoLiquido(), 0.1f);
    }
}
