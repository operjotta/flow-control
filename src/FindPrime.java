import java.util.Scanner;

// Test for primes.
class FindPrime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isPrime;

        System.out.print("Digite um número: ");
        num = scanner.nextInt();
        if(num < 2) isPrime = false;
        else isPrime = true;
        for(int i=2; i <= num/i; i++) {
            if((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Primo");
        else System.out.println("Não é primeo");
    }
}
