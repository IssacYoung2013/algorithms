package com.issac.algorithms.offer;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: ywy
 * @date: 2021-02-28
 * @desc:
 */
public class Q435 {

    static int solution(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return 0;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start < o2.start ? 1 : -1;
                }
                return o2.end < o2.end ? 1 : (o2.end == o1.end) ? 0 : -1;
            }
        });

        int[] memo = new int[intervals.size()];
        for (int i = 1; i < intervals.size(); i++) {
            // memo[i]
            for (int j = 0; j < i; j++) {
                if (intervals.get(i).start >= intervals.get(j).end) {
                    memo[i] = Math.max(memo[i], 1 + memo[j]);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < memo.length; i++) {
            res = Math.max(res, memo[i]);
        }
        return intervals.size() - res;
    }

    static int solution2(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return 0;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start < o2.start ? 1 : -1;
                }
                return o2.end < o2.end ? 1 : (o2.end == o1.end) ? 0 : -1;
            }
        });

        int pre = 0;
        int res = 1;

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start >= intervals.get(pre).end) {
                res++;
                pre = i;
            }
        }
        return intervals.size() - res;
    }
}

class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
