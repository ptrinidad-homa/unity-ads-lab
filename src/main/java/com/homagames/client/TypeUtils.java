package com.homagames.client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TypeUtils {

    public static String sanitizeStoreIdWithPattern(String storeId) {
        String pattern = "^[0-9a-fA-F]{24}$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(storeId);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            throw new IllegalArgumentException(
                    String.format("Campaign set ID %s doesn't match with pattern %s", storeId, pattern));
        }
    }

    public static String sanitizeMoneyWithPattern(String money) {
        String pattern = "^\\d{1,50}(\\.\\d{1,2})?$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(money);
        if (matcher.find()) {
            return matcher.group(1);
        } else {
            throw new IllegalArgumentException(
                    String.format("Total budget amount doesn't match the pattern", money, pattern));
        }
    }

}
