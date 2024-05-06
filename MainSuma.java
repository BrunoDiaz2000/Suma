import java.util.Scanner;

class MainPersona {
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);
      System.out.print("\nDeme la primer variable: ");
      int X = op.nextInt();
      System.out.print("Deme la segunda variable: ");
      int Y = op.nextInt();

      Suma primera = new Suma();
      primera.setX(X);
      primera.setY(Y);

      System.out.println("\nEl resultado es: "+primera.mostrarSuma());

      System.out.println(primera);
   }
}