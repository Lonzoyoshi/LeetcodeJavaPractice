package Leetcode.Simple100;

import java.net.Inet4Address;
import java.util.*;


/**
 * 每日一题推荐到了
 * 掉落的方块
 * 在二维平面上的 x 轴上，放置着一些方块。
 * <p>
 * 给你一个二维整数数组 positions ，其中 positions[i] = [lefti, sideLengthi] 表示：第 i 个方块边长为 sideLengthi ，其左侧边与 x 轴上坐标点 lefti 对齐。
 * <p>
 * 每个方块都从一个比目前所有的落地方块更高的高度掉落而下。方块沿 y 轴负方向下落，直到着陆到 另一个正方形的顶边 或者是 x 轴上 。一个方块仅仅是擦过另一个方块的左侧边或右侧边不算着陆。一旦着陆，它就会固定在原地，无法移动。
 * <p>
 * 在每个方块掉落后，你必须记录目前所有已经落稳的 方块堆叠的最高高度 。
 * <p>
 * 返回一个整数数组 ans ，其中 ans[i] 表示在第 i 块方块掉落后堆叠的最高高度。
 */
public class Leetcode699 {
    private int[][] positions = {{1, 2}, {2, 3}, {6, 1}};

    public List<Integer> fallingSquares(int[][] positions) {
        List<Integer> res = new ArrayList<>();
        TreeMap<Integer, int[]> map = new TreeMap<>();
        int max = 0;
        for (int i = 0; i < positions.length; i++) {
            int h = 0, l = positions[i][0], r = positions[i][0] + positions[i][1];
            Map.Entry<Integer, int[]> floorEntry = map.floorEntry(l);
            if (floorEntry != null && floorEntry.getValue()[1] > 0) {
                h = floorEntry.getValue()[1];
            }
            Integer t = map.ceilingKey(l + 1);
            while (t != null && t < r) {
                int[] ints = map.get(t);
                h = Math.max(h, Math.max(ints[0], ints[1]));
                map.remove(t);
                t = map.ceilingKey(t + 1);
            }
            Map.Entry<Integer, int[]> ceilingEntry = map.ceilingEntry(r);
            if (ceilingEntry != null && ceilingEntry.getValue()[0] > 0) {
                h = Math.max(h, ceilingEntry.getValue()[0]);
            }
            h += positions[i][1];
            int[] orDefault = map.getOrDefault(l, new int[]{-1, -1});
            orDefault[1] = h;
            map.put(l, orDefault);
            orDefault = map.getOrDefault(r, new int[]{-1, -1});
            orDefault[0] = h;
            map.put(r, orDefault);
            max = Math.max(max, h);
            res.add(max);
        }
        return res;
    }
    public void test(){
        System.out.println(fallingSquares(this.positions));
    }
    public static void main(String[] args){
        Leetcode699 lt = new Leetcode699();
        lt.test();
    }
}
