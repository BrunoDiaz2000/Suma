import java.util.Scanner;

class MainPersona {
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);
      System.out.print("Deme la primer variable: ");
      int X = op.nextInt();
      System.out.print("Deme la segunda variable: ");
      int Y = op.nextInt();

      Suma primera = new Suma();
      primera.x = X;
      primera.y = Y;
      
      primera.mostrarSuma();
   }
}