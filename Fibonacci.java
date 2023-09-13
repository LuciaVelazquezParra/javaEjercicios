public class Fibonacci {
    public int fibonacci(int n){
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Fibonacci ob=new Fibonacci();
        int num3=7;
        System.out.println("Número: "+num3+" Fibonacci: "+ob.fibonacci(num3));
    }

}
