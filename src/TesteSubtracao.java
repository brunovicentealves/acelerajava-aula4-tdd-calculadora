import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteSubtracao {

    @Test
    public void dadoDoisNumerosPositivosQuandoExecutarFazerSubtracaoEntaoSubtrai(){
        //dados
        Double numero1 = 2.0;
        Double numero2= 2.0;

        //execução
        Subtracao subtracao = new Subtracao();


        //validação
        Double atual = subtracao.realizarsubtracao(numero1,numero2);
        Double esperado = 0.0;
        assertEquals(esperado,atual);

    }
    @Test
    public void dadoDoisNumerosNegativosQuandoExecutarFazerSubtracaoEntaoSubtrai(){
        //dados
        Double numero1 = -2.0;
        Double numero2= -2.0;

        //execução
        Subtracao subtracao = new Subtracao();


        //validação
        Double atual = subtracao.realizarsubtracao(numero1,numero2);
        Double esperado = 0.0;
        assertEquals(esperado,atual);

    }

    @Test
    public void dadoUmNumerosNegativosOutroNumeroPositivoQuandoExecutarFazerSubtracaoEntaoSubtrai(){
        //dados
        Double numero1 = 2.0;
        Double numero2= -2.0;

        //execução
        Subtracao subtracao = new Subtracao();


        //validação
        Double atual = subtracao.realizarsubtracao(numero1,numero2);
        Double esperado = 4.0;
        assertEquals(esperado,atual);

    }


    @Test
    public void dadoUmNumerosPositivoOutronumeronegativoQuandoExecutarFazerSubtracaoEntaoSubtrai(){
        //dados
        Double numero1 = -2.0;
        Double numero2= 2.0;

        //execução
        Subtracao subtracao = new Subtracao();


        //validação
        Double atual = subtracao.realizarsubtracao(numero1,numero2);
        Double esperado = -4.0;
        assertEquals(esperado,atual);

    }
}
