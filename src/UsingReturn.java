import java.util.Scanner;

public class UsingReturn {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Digite alguma coisa: ");
            String msg = new Scanner(System.in).next();
            if (msg.equals("sair")) return;

            System.out.println("Você digitou: " + msg);
            System.out.println("Continuando a execução...");
        }
    }

}

