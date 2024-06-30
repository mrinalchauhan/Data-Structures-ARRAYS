
    import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generatePermutations(nums, 0);
    }

    public static void generatePermutations(int[] nums, int index) {
        if (index == nums.length - 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            generatePermutations(nums, index + 1);
            swap(nums, index, i); // Backtrack to restore the original array
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


