package com.phunlh2001.fooddelivery.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.util.Locale;

public class Helper {
    public static String get_format_date(Timestamp s) {
        Locale locale = new Locale("us", "VI");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        return dateFormat.format(s);
    }

    public static String standard_string(String s) {
        s = s.replaceAll("\\s{2,}"," ").trim().toLowerCase();
        return String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
    }
}
