public class NumeroMenor {
    public String minimoNumero(int a, int b, int c) {
        String resultado = "";

        if (a != b && a != c && b != c) {
            if (a < b) {
                if (a < c) {
                    resultado = "Numero menor:" + a;
                } else {
                    resultado = "Numero menor:" + c;
                }
            } else if (b < c) {
                resultado = "Numero menor:" + b;
            } else {
                resultado = "Numero menor:" + c;
            }
        } else {
            resultado = "Los numeros deben ser diferentes";
        }
        return resultado;
    }

    public static void main(String[] args) {
        NumeroMenor ob=new NumeroMenor();
        int a=8, b=15,c=9;

        System.out.println("Números: "+a+","+b+","+c+" "+ob.minimoNumero(a,b,c));
    }
}
