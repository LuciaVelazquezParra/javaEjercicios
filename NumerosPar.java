public class NumerosPar {
    public String esParImpar(int numero) {
        String resultado = "";
        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        return resultado;
    }

    public static void main(String[] args) {
        NumerosPar ob=new NumerosPar();
        int num=23;
        System.out.println("El número "+num+" es: "+ob.esParImpar(num));
    }
}
