public class Promedios {

    public double calcularPromedio(int[] numeros) {
        int suma = 0;
        double promedio = 0.0d;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        promedio = (suma/numeros.length);
        return promedio;
    }

    public static void main(String[] args) {
        Promedios ob=new Promedios();
        /*Calcular el promedio de un arreglo de números.*/
        int numeros[]={10,90,20};
        double promedio= ob.calcularPromedio(numeros);
        System.out.println("El promedio de los numeros ingresados es:"+promedio);
    }
}
