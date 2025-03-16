import java.util.Arrays;

public class UsingBreak {
    public static void main(String[] args) {
        int nums[] = new int[args.length];
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            int item = Integer.parseInt(args[i]);
            nums[i] = item;
        }

        for (int i = 0; i < 5; i++) {
            sum += nums[i];
        }

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("Somatório dos primeiros 5 elementos: " + sum);

    }
}

