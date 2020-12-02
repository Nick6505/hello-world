import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Principal {


    //divisão euclidiana
    public static int calcularMDC(int x, int y){
        //garante que x >=y
        if (x<y){
            int aux = y;
            y = x;
            x = aux;
        }

        int resto = x % y;
        while (resto != 0){
            x = y;
            y = resto;
            resto = x%y;
        }

        return y;
    }

    //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("OI!");

        int minhaVariavelDeTeste = 6;
        System.out.println(minhaVariavelDeTeste);
        int x;
        x = 400;
        int y = 10;
        System.out.println("x = "+ x);

        Scanner scanner = new Scanner(System.in);
        String frase; //ler do teclado
        System.out.println("Digite algo por favor: ");
        frase = scanner.nextLine();
        System.out.printf("Acabei de ler a frase: %s (%d caracteres)\n", frase, frase.length());

        System.out.println("Digite dois inteiros positivos: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();



        int mdc = calcularMDC(x,y);

        int mdc2 = calcularMDC(numero1,numero2);
        System.out.println(String.format("mdc(%d,%d) = %d", numero1, numero2, mdc2));

        //System.out.println("mdc(10,8) = "+mdc);
        System.out.printf("mdc(%d,%d) = %d\n", x, y, mdc);
        //equivalente a
        System.out.println(String.format("mdc(%d,%d) = %d", x, y, mdc));
        //equivalente novamente, mas em 2 linhas
        String mensagem = String.format("mdc(%d,%d) = %d", x, y, mdc);
        System.out.println(mensagem);



        //boolean v = (9>8) && x<mdc || minhaVariavelDeTeste ==1000;
        //System.out.println(v);


    }

}
