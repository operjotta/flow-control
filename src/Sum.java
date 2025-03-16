class Sum {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int n : nums) {
            sum += n; // sum = sum + n
        }
        System.out.println("Somatório: " + sum);
    }
}
