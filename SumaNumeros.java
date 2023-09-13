public class SumaNumeros {

    public int sumaDigitos(int n) {
        String cadena = Integer.toString(n);
        int suma = 0;
        for (int i = 0; i < cadena.length(); i++) {
            suma += Character.getNumericValue(cadena.charAt(i));
        }
        return suma;
    }

    public static void main(String[] args) {
        SumaNumeros ob=new SumaNumeros();
        int num2=123;
        System.out.println("Número:"+num2+" la suma de los digitos es:"+ob.sumaDigitos(num2));
    }
}
