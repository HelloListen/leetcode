package com.listenzhangbin.ransomnote;

/**
 * Created by zhangbin on 16/12/4.
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals(magazine)) {
            return true;
        }
        char[] note = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        if (mag.length < note.length) {
            return false;
        }
        for (int i = 0; i < mag.length; i++) {
            char t = mag[i];
            for (int j = 0; j < note.length; j++) {
                if (t == note[j]) {
                    note[j] = '0';
                    break;
                }
            }
        }
        for (char c : note) {
            if (c != '0') {
                return false;
            }
        }
        return true;
    }

}
