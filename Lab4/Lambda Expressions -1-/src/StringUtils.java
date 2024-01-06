public class StringUtils {
    static String betterString(String s1, String s2, TwoStrings obj) {
        return obj.IsBetter(s1, s2) ? s1 : s2;
    }

    static String onlyLetters(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            if (!Character.isLetter(currentChar)) {
                return "Not contains alpha only";
            }
        }
        return "contains alpha only";
    }
}
