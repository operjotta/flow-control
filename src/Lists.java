import java.util.ArrayList;
import java.util.List;

class Lists {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 15; i++)
            nums.add(i);

        for (int n : nums)
            System.out.println(n);
    }
}

