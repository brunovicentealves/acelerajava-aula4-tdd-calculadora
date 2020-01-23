import exceptions.NumeroNull;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TesteSoma {

    @Test
public void DadoDoisNumerosPositivosQuandoExecutarFazerSomaEntaoSoma(){
        //dados
        Double numero1 = 2.0,numero2 = 2.0;

        //Execução

        Soma soma = new Soma();
        Double atual = soma.Somar(numero1,numero2);
        Double esperado = 4.0;

        assertEquals(esperado,atual);

    }

    @Test
    public void DadoDoisNumerosNegativosQuandoExecutarFazerSomaEntaoSoma(){
        //dados
        Double numero1 = -2.0,numero2 = -2.0;

        //Execução

        Soma soma = new Soma();
        Double atual = soma.Somar(numero1,numero2);
        Double esperado = -4.0;

        assertEquals(esperado,atual);

    }
    @Test
    public void DadoUmNumerosNegativoEUmNumeroPositivoQuandoExecutarFazerSomaEntaoSoma(){
        //dados
        Double numero1 = -2.0,numero2 = 2.0;

        //Execução

        Soma soma = new Soma();
        Double atual = soma.Somar(numero1,numero2);
        Double esperado = 0.0;

        assertEquals(esperado,atual);

    }
    @Test
    public void DadoUmNumerooPositivoEUmNumeroNegativoQuandoExecutarFazerSomaEntaoSoma(){
        //dados
        Double numero1 = 2.0,numero2 = -2.0;

        //Execução

        Soma soma = new Soma();
        Double atual = soma.Somar(numero1,numero2);
        Double esperado = 0.0;

        assertEquals(esperado,atual);

    }
    @Test(expected = NumeroNull.class)
    public void DadoUmNullEUmNumeroNegativoQuandoExecutarFazerSomaEntaoDaErro(){
        //dados
        Double numero1 = null,numero2 = -2.0;

        //Execução

        Soma soma = new Soma();

        soma.Somar(numero1,numero2);

    }
    @Test(expected = NumeroNull.class)
    public void DadoEUmNumeroNegativoEUmNullQuandoExecutarFazerSomaEntaoDaErro(){
        //dados
        Double numero1 = -2.0,numero2 = null;

        //Execução

        Soma soma = new Soma();

        soma.Somar(numero1,numero2);

    }


}
