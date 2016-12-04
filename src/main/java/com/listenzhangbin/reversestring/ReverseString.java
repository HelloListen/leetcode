package com.listenzhangbin.reversestring;

/**
 * Created by zhangbin on 16/12/4.
 */
public class ReverseString {

    public String solution(String s) {
        char[] stringArr = s.toCharArray();
        int start = 0, end = stringArr.length - 1;
        int times = stringArr.length % 2;
        if (times != 0) {
            times = (stringArr.length - 1) / 2;
        } else {
            times = stringArr.length / 2;
        }
        for (int i = 0; i < times; i++) {
            swap(stringArr, start, end);
            start++;
            end--;
        }
        return String.valueOf(stringArr);
    }

    private void swap(char[] a, int x, int y) {
        char temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}
