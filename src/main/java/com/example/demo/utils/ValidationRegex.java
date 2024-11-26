package com.example.demo.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationRegex {
    public static boolean isRegexEmail(String target) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(target);
        return matcher.find();
    }
    // 비밀번호 검증 (예: 최소 8자 이상, 대문자, 소문자, 숫자, 특수문자 포함)
    public static boolean isRegexPassword(String password) {
        String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(regex, password);
    }

    // 이름 검증 (예: 한글 혹은 영어만 허용)
    public static boolean isRegexName(String name) {
        String regex = "^[a-zA-Z가-힣]{1,20}$";
        return Pattern.matches(regex, name);
    }

    // 닉네임 검증 (예: 한글, 영어, 숫자 포함 가능, 2~10자)
    public static boolean isRegexNickName(String nickName) {
        String regex = "^[a-zA-Z가-힣0-9]{2,10}$";
        return Pattern.matches(regex, nickName);
    }

    // URL 검증 (프로필 이미지나 웹사이트 URL용)
    public static boolean isRegexUrl(String url) {
        String regex = "^(https?|ftp)://[^\s/$.?#].[^\s]*$";
        return Pattern.matches(regex, url);
    }
}

