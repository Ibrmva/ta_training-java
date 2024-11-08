package com.epam.training.student_gulaiym_ibraimova.ta_trainingjava.util;

public class StringUtils {

    public static boolean containsSubstring(String a, String b) {
        return ( a.toLowerCase().contains(b.toLowerCase()) ||
                b.toLowerCase().contains(a.toLowerCase()));
    }
}
