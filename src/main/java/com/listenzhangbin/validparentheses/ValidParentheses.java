package com.listenzhangbin.validparentheses;

/**
 * Created by zhangbin on 16/12/4.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        Stack stack = new Stack();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                char prev = stack.pop();
                if (c == ')' && prev != '(') {
                    return false;
                }
                if (c == ']' && prev != '[') {
                    return false;
                }
                if (c == '}' && prev != '{') {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    private static class Stack {
        private char[] elements;
        private int size;

        public Stack() {
            elements = new char[10];
        }

        public void push(char element) {
            elements[size++] = element;
            int len = elements.length;
            if (size > (len >> 1 + len)) {
                char[] newElements = new char[(len >> 1) + len];
                System.arraycopy(elements, 0, newElements, 0, len);
                elements = newElements;
            }
        }

        public char pop() {
            if (size == 0) {
                return 0;
            }
            char ele = elements[size - 1];
            size--;
            return ele;
        }

        public int size() {
            return size;
        }
    }

}
