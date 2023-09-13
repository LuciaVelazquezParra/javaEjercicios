public class Palindromo {

    public String revertirCadena(String cadena) {
        String auxCadena = "";
        //char aux[]=new char[cadena.length()];
        for (int i = cadena.length() - 1; i >= 0; i--) {
            auxCadena += cadena.charAt(i);
        }
        return auxCadena;

    }
    public boolean palindromo(String cadena) {
        String cadenaOriginal = cadena.toUpperCase();
        //System.out.println(cadenaOriginal);
        boolean valor = false;
        String cadena2 = revertirCadena(cadenaOriginal);
        if (cadenaOriginal.equals(cadena2)) {
            valor = true;
        }
        return valor;

    }

    public static void main(String[] args) {
        Palindromo ob=new Palindromo();
        /*Verificar si una palabra es un palíndromo*/
        String esPalindromo="anitalavalatina";
        System.out.println("Cadena Original: "+esPalindromo+" ¿Es palindromo?: "+ob.palindromo(esPalindromo));
    }
}
