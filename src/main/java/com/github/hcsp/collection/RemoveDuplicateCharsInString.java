package com.github.hcsp.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateCharsInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicateCharsInString("ccbbaa"));
    }
    // 修改这个方法使得它能够输出正确结果：
    // 例如，输入aabbcc返回abc
    // 输入ccbbaa返回cba
    // 输入apple返回aple
    public static String removeDuplicateCharsInString(String s) {
        HashSet<Character> charSet = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            charSet.add(s.charAt(i));
        }

        String result = "";
        for (Character ch : charSet) {
            result += ch;
        }

        return result;
    }
}
