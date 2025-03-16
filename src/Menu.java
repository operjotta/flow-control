import java.io.IOException;

class Menu {
    public static void main(String[] args) throws IOException {
        char choice;

        do {
            System.out.println("Ajuda em:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n");
            System.out.print("Escolha uma opção: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1' -> {
                System.out.println("O if:\n");
                System.out.println("if(condição) instrução;");
                System.out.println("else intrução;");
            }
            case '2' -> {
                System.out.println("O switch:\n");
                System.out.println("switch(expressão) {");
                System.out.println("    case constante:");
                System.out.println("        sequência de instruções");
                System.out.println("        break;");
                System.out.println("        //...");
                System.out.println("}");
                System.out.println("ou");
                System.out.println("switch (expressão) {");
                System.out.println("    case constante -> instrução;");
                System.out.println("    //...");
                System.out.println("}");
            }
            case '3' -> {
                System.out.println("O while:\n");
                System.out.println("while(condição) instrução;");
            }
            case '4' -> {
                System.out.println("O do-while:\n");
                System.out.println("do {");
                System.out.println("    instrução;");
                System.out.println("} while (condição)");
            }
            case '5' -> {
                System.out.println("O for:\n");
                System.out.println("for (init; condição; iteração)");
                System.out.println("    instrução;");
            }
        }
    }
}

