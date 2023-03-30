import java.util.Scanner;

class Main {
  public static void main(String[] args) {

   int n1,n2,resultado;

   Scanner teclado = new Scanner(System.in);

   System.out.print("Coloque o primeiro numero: ");
   n1 = teclado.nextInt();
   System.out.print("Coloque o segundo numero: ");
   n2 = teclado.nextInt();

   resultado = n1 + n2;
   System.out.print("O resultado foi: " + resultado );

   teclado.close();
  }
}