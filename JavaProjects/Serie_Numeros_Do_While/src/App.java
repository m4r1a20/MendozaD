import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese primer valor");
        int a=scanner.nextInt();
        System.out.println("Ingrese segundo valor");
        int b=scanner.nextInt();
        System.out.println("Ingresar numero de recorridos");
        int r=scanner.nextInt();
        int i=0;
        
        System.out.println("La serie de numeros es: ");
        do {
            int suma=a+b;
            System.out.println(suma);

            a=b;
            b=suma;

            i++;

        } while (i<=r);
        */
        
        int i=0;
        int a=1;
        int b=2;
        int r=6;
        int s=0;

        System.out.println(a);
        System.out.println(b);

        do {
            s=a+b;
            System.out.println(s);

            a=b;
            b=s;
            i++;
        } while (i<=r);
        
    }
}
