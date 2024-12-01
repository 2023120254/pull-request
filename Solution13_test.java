public class SortColorsTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}