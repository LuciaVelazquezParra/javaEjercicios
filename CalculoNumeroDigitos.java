public class CalculoNumeroDigitos {
    public int cifrasNumero(int num){
        int numero=Math.abs(num);
        int contador = 0;
        int division = numero;

        if (numero > 0) {
            while (division > 0) {
                division = division / 10;
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        CalculoNumeroDigitos ob=new CalculoNumeroDigitos();
        /*Calcular el numero de digitos de un numero entero*/
        int num5=54588;
        System.out.println("Número:"+num5+" contiene un total de: "+ob.cifrasNumero(num5)+" cifras");
    }
}
