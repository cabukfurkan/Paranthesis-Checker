package com.furkancabuk;
public class Parenthesis {

    public static void checkParenthesisOrder(String s) {

        if (s != null && !s.isEmpty()) {
            while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
                s = s.replace("()", "");
                s = s.replace("[]", "");
                s = s.replace("{}", "");
            }
            if (s.isEmpty()) {
                System.out.println("Parenthesis order correct");
            } else {
                System.out.println("False order or missing pair");
            }
        }
    }

    public static void checkParenthesisOrderComplete(String s) {
        if (s != null && !s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '(' && s.charAt(i) != ')'  && s.charAt(i) != '['  && s.charAt(i) != ']'  && s.charAt(i) != '{'  && s.charAt(i) != '}') {
                    s = s.substring(0, i) + s.substring(i + 1);
                    i-=1;
                }
            }
            System.out.println(s);
//            while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
//                s = s.replace("()", "");
//                s = s.replace("[]", "");
//                s = s.replace("{}", "");
//            }
//            if (s.isEmpty()) {
//                System.out.println("Parenthesis order correct");
//            } else {
//                System.out.println("False order or missing pair");
//            }
            checkParenthesisOrder(s);
        }
    }
}
