package Leetcode.Simple100;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合总数
 */
public class Leetcode39 {
    private int[] candidates = {2,4,6,7,9};
    private int target = 11;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates,target,ans,combine,0);
        return ans;
    }
    public void dfs(int[] candidates, int target, List<List<Integer>> ans,
                    List<Integer> combine, int idx){
        if (idx == candidates.length){
            return;
        }
        if (target == 0){
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        // 直接跳过
        dfs (candidates,target,ans,combine,idx+1);
        // 选择当前数
        if (target - candidates[idx] >= 0){
            combine.add(candidates[idx]);
            dfs(candidates,target-candidates[idx],ans,combine,idx);
            combine.remove(combine.size()-1);
        }
    }
    public void test(){
        System.out.println(combinationSum(this.candidates,
                this.target).toString());
    }
    public static void main(String[] args){
        Leetcode39 lt = new Leetcode39();
        lt.test();
    }

}
