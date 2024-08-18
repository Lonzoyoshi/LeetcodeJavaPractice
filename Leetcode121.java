package Leetcode.Simple100;

import java.net.Inet4Address;

/**
 * 买卖股票的最佳时机
 * prices[]给定股票第i天的价格
 */
public class Leetcode121 {
    private int[] prices = {7,1,5,3,6,4};
    // 最低点买入，最低后的极高点卖出
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for (int price : prices){
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
    public void test(){
        System.out.println(maxProfit(this.prices));
    }
    public static void main(String[] args){
        Leetcode121 lt = new Leetcode121();
        lt.test();
    }

}
