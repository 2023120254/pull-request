/*
 * @Description:
 * 颜色分类
 * 给定一个包含红色、白色和蓝色、共 n 个元素的数组 nums ，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * 必须在不使用库内置的 sort 函数的情况下解决这个问题。
 * 
 * 示例 1：
 * 输入：nums = [2,0,2,1,1,0]
 * 输出：[0,0,1,1,2,2]
 * 
 * 示例 2：
 * 输入：nums = [2,0,1]
 * 输出：[0,1,2]
 */

 class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int ptr0 = 0; // 指向第一个1的前面
        int ptr1 = 0; // 指向当前扫描的位置
        for (int ptr2 = 0; ptr2 < n; ++ptr2) {
            if (nums[ptr2] == 0) {
                // 交换 ptr2 和 ptr0 指向的元素
                int temp = nums[ptr2];
                nums[ptr2] = nums[ptr0];
                nums[ptr0] = temp;
                ++ptr0; // 移动 ptr0
            } else if (nums[ptr2] == 1) {
                // 交换 ptr2 和 ptr1 指向的元素
                int temp = nums[ptr2];
                nums[ptr2] = nums[ptr1];
                nums[ptr1] = temp;
                ++ptr1; // 移动 ptr1
            }
        }
    }
}
