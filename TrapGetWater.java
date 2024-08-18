package Leetcode.SimpleQus;

/**
 * 力扣42 接雨水
 */
public class TrapGetWater {
    private int[] height = {
            0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
    };

    // 双指针
    public int trap1(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                ans += leftMax - height[left];
                ++left;
            } else {
                ans += rightMax - height[right];
                --right;
            }
        }
        return ans;
    }

    // 动态规划
    public int trap2(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

    public void test() {
        System.out.println(trap1(this.height));
        System.out.println(trap2(this.height));
    }

    public static void main(String[] args) {
        TrapGetWater TGW = new TrapGetWater();
        TGW.test();
    }


}
