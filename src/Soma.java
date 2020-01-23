import exceptions.NumeroNull;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Soma {
    public Double Somar(Double numero1 ,Double numero2) {
        if(numero1 == null){

            throw new NumeroNull();
        }

        if(numero2 == null){

            throw new NumeroNull();
        }

        Double somar = numero1 + numero2;
          return somar;





        }

    public static class TesteDivisao {
        @Test
        public void dadoDoisNumerosPositivosQunadoExecutarDivisaoEntaoDividi(){
            //dados
            Double numero1=10.0;
            Double numero2=2.0;

            Divisao divisao = new Divisao();
           Double esperado = divisao.realizarDivisao(numero1,numero2);
            Double atual=5.0;
            assertEquals(esperado,atual);

        }

        @Test
        public void dadoUmNumeroNegativoOutroNUmeroNegativoQuandoExecutarEntaoDividi(){

            //dados
            Double numero1=10.0;
            Double numero2=-2.0;

            Divisao divisao = new Divisao();
            Double esperado = divisao.realizarDivisao(numero1,numero2);

            Double atual=-5.0;
            assertEquals(esperado,atual);


        }

        @Test(expected = NumeroNull.class)
        public void dadosUmNumeropositivoOutroNullQuandoExecutarFazerdivisaoEntaoDaErro(){

            //dados
            Double numero1=10.0;
            Double numero2=null;

            Divisao divisao = new Divisao();
            divisao.realizarDivisao(numero1,numero2);


        }


        @Test(expected = NumeroNull.class)
        public void dadosUmNumeroNullOutroPositivoQuandoExecutarFazerdivisaoEntaoDaErro(){

            //dados
            Double numero1=null;
            Double numero2=2.0;

            Divisao divisao = new Divisao();
            divisao.realizarDivisao(numero1,numero2);


        }
    }

    public static class TesteMultiplicacao {

        @Test
        public void dadosdoisnumerosPositivosQuandoExecutarRealizarMultiplicacaoEntaoMultiplica(){
            //dado

            Double numero1 = 3.0;
            Double numero2 = 4.0;

            Multiplicacao multiplicacao = new Multiplicacao();
           Double Esperado= multiplicacao.realizarMultiplicacao(numero1,numero2);
            Double Atual = 12.0;
            assertEquals(Esperado,Atual);
        }

        @Test
        public void dadosdoisnumerosNegativosQuandoExecutarRealizarMultiplicacaoEntaoMultiplica(){
            //dado

            Double numero1 = -3.0;
            Double numero2 = -4.0;

            Multiplicacao multiplicacao = new Multiplicacao();
            Double Esperado= multiplicacao.realizarMultiplicacao(numero1,numero2);
            Double Atual = 12.0;
            assertEquals(Esperado,Atual);
        }


        @Test
        public void dadosUmnumerosNegativosOutroNumeroPositivoQuandoExecutarRealizarMultiplicacaoEntaoMultiplica(){
            //dado

            Double numero1 = -3.0;
            Double numero2 = 4.0;

            Multiplicacao multiplicacao = new Multiplicacao();
            Double Esperado= multiplicacao.realizarMultiplicacao(numero1,numero2);
            Double Atual = -12.0;
            assertEquals(Esperado,Atual);
        }


        @Test
        public void dadosUmnumerospositivoOutroNumeroNegativoQuandoExecutarRealizarMultiplicacaoEntaoMultiplica(){
            //dado

            Double numero1 = 3.0;
            Double numero2 =-4.0;

            Multiplicacao multiplicacao = new Multiplicacao();
            Double Esperado= multiplicacao.realizarMultiplicacao(numero1,numero2);
            Double Atual = -12.0;
            assertEquals(Esperado,Atual);
        }
    }
}
