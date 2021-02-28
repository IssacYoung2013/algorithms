package com.issac.algorithms.offer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author: ywy
 * @date: 2021-02-24
 * @desc:
 */
public class Q347 {
    public static List<Integer> solution(int[] nums, int k) {
        assert k> 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                Integer count = map.get(nums[i]);
                map.put(nums[i],count++);
            }else {
                map.put(nums[i],1);
            }
        }

        assert k <= map.size();
        // 频率、元素
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(queue.size() == k) {
//                entry.getValue() > queue.poll()[1];
            }
        }
        return null;
    }
}
