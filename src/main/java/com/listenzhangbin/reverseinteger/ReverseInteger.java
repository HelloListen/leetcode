package com.listenzhangbin.reverseinteger;

/**
 * Created by zhangbin on 16/12/4.
 */
public class ReverseInteger {

    public int solution(int x) {
        if (x == 0) {
            return 0;
        }
        boolean f = x < 0;
        x = f ? -x : x;
        if (x < 0) {
            return 0;
        }
        String s = "";
        while (x > 0) {
            s += x % 10;
            x = x / 10;
        }
        long result = Long.parseLong(s);
        if (result > Integer.MAX_VALUE) {
            return 0;
        }
        return f ? -(int) result : (int) result;
    }

}
