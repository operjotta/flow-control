class Sum2 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int n : nums) {
            sum += n; // sum = sum + n
            if (n == 5) break;
        }
        System.out.println("Somatório dos primeiros 5 elementos: " + sum);
    }
}
