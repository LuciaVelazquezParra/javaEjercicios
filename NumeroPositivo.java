public class NumeroPositivo {
    public String verificarNumero(int numero) {
        String resultado = "";
        if (numero == 0) {
            resultado = numero + " es igual a 0";
        } else if (numero > 0) {
            resultado = numero + " es positivo";
        } else {
            resultado = numero + " es negativo";
        }
        return resultado;
    }

    public static void main(String[] args) {
        NumeroPositivo ob=new NumeroPositivo();
        /*Verificar si un número es positivo, negativo*/
        int num4=8;
        System.out.println(ob.verificarNumero(num4));
    }
}
