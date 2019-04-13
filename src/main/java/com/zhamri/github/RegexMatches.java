package com.zhamri.github;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public boolean isMatch(String pattern, String link) {

        Pattern p = Pattern.compile(pattern);   // the pattern to search for
        Matcher m = p.matcher(link);

        if (m.find())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String myString = "STIW3054-A182-A2";
        String myLink = "https://github.com/zhamri/255392-STIW3054-A182-A2";
        Boolean result = new RegexMatches().isMatch(myString, myLink);
        System.out.println(result);
    }
}
