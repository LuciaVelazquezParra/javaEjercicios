public class RevertirCadena {

    public String revertirCadena(String cadena) {
        String auxCadena = "";
        //char aux[]=new char[cadena.length()];
        for (int i = cadena.length() - 1; i >= 0; i--) {
            auxCadena += cadena.charAt(i);
        }
        return auxCadena;

    }

    public static void main(String[] args) {
        /*Revertir una cadena de texto.*/
        RevertirCadena ob=new RevertirCadena();
        String cadena="Manzana";
        System.out.println("Cadena original: "+cadena+" Cadena inversa:"+ob.revertirCadena(cadena));
    }


}
