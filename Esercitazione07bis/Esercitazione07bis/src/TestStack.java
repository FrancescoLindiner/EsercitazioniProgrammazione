import java.util.Scanner;

public class TestStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        
        while (true) {
            System.out.println("1)Push\n2)Pop\n3)Stampa");
            int opzione = input.nextInt();
            switch (opzione) {
                case 1:
                    System.out.print("Inserisci la stringa: ");
                    String s = input.next();
                    stack.push(s);
                    break;
                case 2:
                    stack.pop();
                    System.out.println("Pop effettuato");
                    break;
                case 3:
                    stack.stampa();
                default:
                    break;
            }
        }
    }
}
