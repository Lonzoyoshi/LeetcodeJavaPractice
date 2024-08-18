package Leetcode.SimpleQus;

/**
 * 搜索插入位置
 */
public class Leetcode35 {
    private int[] nums = {1, 3, 5, 6, 9, 11};
    private int target = 7;

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }
        return nums.length;
    }

    public int binarySearcchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public void test() {
        System.out.println(searchInsert(this.nums, this.target));
        System.out.println(binarySearcchInsert(this.nums, this.target));
    }

    public static void main(String[] args) {
        Leetcode35 lt = new Leetcode35();
        lt.test();
    }
}

