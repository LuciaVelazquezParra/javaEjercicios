public class Circulo {
    public double areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static void main(String[] args) {
        Circulo ob=new Circulo();
        /*calcular el area de un circulo*/
        double radio=3;
        System.out.println("Radio: "+radio+" Area circulo: "+ ob.areaCirculo(radio));
    }
}
