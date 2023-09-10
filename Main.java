public class Main {
    public static void main(String[] args) {
        Ejercicios ob=new Ejercicios();
        /*Revertir una cadena de texto.*/
        String cadena="Manzana";
        System.out.println("Cadena original: "+cadena+" Cadena inversa:"+ob.revertirCadena(cadena));

        /*Verificar si una palabra es un palíndromo*/
        String esPalindromo="anitalavalatina";
        System.out.println("Cadena Original: "+esPalindromo+" ¿Es palindromo?: "+ob.palindromo(esPalindromo));

        /*calcular el area de un circulo*/
        double radio=3;
        System.out.println("Radio: "+radio+" Area circulo: "+ ob.areaCirculo(radio));

        /*Verificar si un numero es par o impar*/
        int num=23;
        System.out.println("El número "+num+" es: "+ob.esParImpar(num));

        /*Encontrar el minimos de tres numeros*/
        int a=8, b=15,c=9;
        System.out.println("Números: "+a+","+b+","+c+" "+ob.minimoNumero(a,b,c));

        /*Calcular la suma de los dígitos de un número*/
        int num2=123;
        System.out.println("Número:"+num2+" la suma de los digitos es:"+ob.sumaDigitos(num2));

        /*Generar una secuencia de Fibonacci.*/
        int num3=7;
        System.out.println("Número: "+num3+" Fibonacci: "+ob.fibonacci(num3));

        /*Verificar si un número es positivo, negativo*/
        int num4=8;
        System.out.println(ob.verificarNumero(num4));

        /*Calcular el promedio de un arreglo de números.*/
        int numeros[]={10,90,20};
        double promedio= ob.calcularPromedio(numeros);
        System.out.println("El promedio de los numeros ingresados es:"+promedio);

        /*Calcular el numero de digitos de un numero entero*/
        int num5=5458;
        System.out.println("Número:"+num5+" contiene un total de: "+ob.cifrasNumero(num5)+" cifras");
    }

}
