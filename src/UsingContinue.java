public class UsingContinue {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

       for (int num : nums) {
           if (num % 2 == 0) continue;
           sum += num;
       }
       System.out.println("Soma dos números ímpares: " + sum);
    }
}

