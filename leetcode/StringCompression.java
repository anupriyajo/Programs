package leetcode;

public class StringCompression {
    public static void main(String args[]) {
        //char ch[] = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char ch[] = {'z', 'z', 'j'};
        int a = compress(ch);
        System.out.println(a);
    }

    public static int compress(char[] chars) {

        if (chars.length < 1) return 0;
        // check length after compression
        int newLength = checkLength(chars);
        if (newLength > chars.length) return chars.length;
        char c = chars[0];
        int count = 1;
        int index = 0;
        for (int i = 1; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            } else {
                index = setArray(c, count, index, chars);
                count = 1;
                c = chars[i];
            }
        }
        index = setArray(c, count, index, chars);
        return index;
    }

    private static int setArray(char c, int count, int index, char[] ch) {
        ch[index] = c;
        index++;
        if (count > 1) {
            char[] co = String.valueOf(count).toCharArray();
            for (char t : co) {
                ch[index] = t;
                index++;
            }
        }
        return index;
    }

    private static int checkLength(char[] ch) {
        int count = 1;
        char last = ch[0];
        int newLength = 0;
        for (int i = 1; i < ch.length; i++) {
            if (last == ch[i]) {
                count++;
            } else {
                if (count > 1) {
                    newLength += 1 + String.valueOf(count).length();
                } else {
                    newLength++;
                }
                count = 1;
                last = ch[i];
            }
        }
        if (count > 1) {
            newLength += 1 + String.valueOf(count).length();
        } else {
            newLength++;
        }
        return newLength;
    }
}
