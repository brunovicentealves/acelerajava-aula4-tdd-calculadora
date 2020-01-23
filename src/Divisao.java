import exceptions.NumeroNull;

public class Divisao {
    public Double realizarDivisao(Double numero1, Double numero2) {

        if(numero1==null){
            throw new NumeroNull();
        }

        if(numero2==null){
            throw new NumeroNull();
        }
        Double resultado = numero1 / numero2;

        return resultado;
    }
}
