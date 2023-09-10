import java.util.Locale;
import java.lang.Math;
/*Lucia Velazquez Parra*/
public class Ejercicios {
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

    public double areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public String esParImpar(int numero) {
        String resultado = "";
        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Impar";
        }

        return resultado;
    }

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

    public int sumaDigitos(int n) {
        String cadena = Integer.toString(n);
        int suma = 0;
        for (int i = 0; i < cadena.length(); i++) {
            suma += Character.getNumericValue(cadena.charAt(i));
        }
        return suma;
    }

    public int fibonacci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
       return fibonacci(n-1)+fibonacci(n-2);
    }

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

    public double calcularPromedio(int[] numeros) {
        int suma = 0;
        double promedio = 0.0d;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        promedio = (suma/numeros.length);
        return promedio;
    }

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
}