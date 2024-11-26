package com.example.demo.config;

import lombok.Getter;

/**
 * 에러 코드 관리
 */
@Getter
public enum BaseResponseStatus {
    /**
     * 1000 : 요청 성공
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다."),


    /**
     * 2000 : Request 오류
     */
    // Common
    REQUEST_ERROR(false, 2000, "입력값을 확인해주세요."),
    EMPTY_JWT(false, 2001, "JWT를 입력해주세요."),
    INVALID_JWT(false, 2002, "유효하지 않은 JWT입니다."),
    INVALID_USER_JWT(false,2003,"권한이 없는 유저의 접근입니다."),

    // users
    USERS_EMPTY_USER_ID(false, 2010, "유저 아이디 값을 확인해주세요."),

    // [POST] /users
    POST_USERS_EMPTY_EMAIL(false, 2015, "이메일을 입력해주세요."),
    POST_USERS_INVALID_EMAIL(false, 2016, "이메일 형식을 확인해주세요."),
    POST_USERS_EXISTS_EMAIL(false,2017,"중복된 이메일입니다."),
    POST_USERS_EMPTY_PASSWORD(false, 2018, "비밀번호를 입력해주세요."),
    POST_POSTS_EMPTY_CONTENTS(false, 4018, "포스트 내용이 비어있습니다."),
    POST_POSTS_EMPTY_IMGRUL(false, 4019, "포스트 이미지 URL이 비어있습니다."),





    /**
     * 3000 : Response 오류
     */
    // Common
    RESPONSE_ERROR(false, 3000, "값을 불러오는데 실패하였습니다."),

    // [POST] /users
    DUPLICATED_EMAIL(false, 3013, "중복된 이메일입니다."),
    FAILED_TO_LOGIN(false,3014,"없는 아이디거나 비밀번호가 틀렸습니다."),



    /**
     * 4000 : Database, Server 오류
     */
    DATABASE_ERROR(false, 4000, "데이터베이스 연결에 실패하였습니다."),
    SERVER_ERROR(false, 4001, "서버와의 연결에 실패하였습니다."),

    //[PATCH] /users/{userIdx}
    MODIFY_FAIL_USERNAME(false,4014,"유저네임 수정 실패"),

    PASSWORD_ENCRYPTION_ERROR(false, 4011, "비밀번호 암호화에 실패하였습니다."),
    PASSWORD_DECRYPTION_ERROR(false, 4012, "비밀번호 복호화에 실패하였습니다."),
    INACTIVE_ACCOUNT(false, 4013, "비활성화된 계정입니다."),
    POSTS_EMPTY_POST_ID(false, 4014, "포스트 ID가 비어있습니다."),
    POSTS_EMPTY_USER_POST(false, 4015, "해당 유저의 포스트가 존재하지 않습니다."),
    MODIFY_FAIL_POST(false, 4017, "포스트 수정에 실패하였습니다."),
    DELETE_FAIL_POST(false, 4016, "포스트 삭제에 실패하였습니다."),
    POST_USERS_EMPTY_NAME(false, 2019, "이름을 입력해주세요."),
    POST_USERS_EMPTY_BIRTHDAY(false, 2020, "생년월일을 입력해주세요."),
    POST_USERS_EMPTY_NICKNAME(false, 2021, "닉네임을 입력해주세요."),
    POST_USERS_INVALID_PASSWORD(false, 2022, "비밀번호 형식을 확인해주세요."),
    POST_USERS_INVALID_NAME(false, 2023, "이름 형식을 확인해주세요."),
    POST_USERS_INVALID_NICKNAME(false, 2024, "닉네임 형식을 확인해주세요."),
    PATCH_USERS_EMPTY_PROFILEIMG(false, 2025, "프로필 이미지를 입력해주세요."),
    PATCH_USERS_EMPTY_WEBSITE(false, 2026, "웹사이트 주소를 입력해주세요."),
    PATCH_USERS_EMPTY_INTRODUCE(false, 2027, "소개글을 입력해주세요."),
    PATCH_USERS_INVALID_PROFILEIMG(false, 2028, "프로필 이미지 형식을 확인해주세요."),
    PATCH_USERS_INVALID_WEBSITE(false, 2029, "웹사이트 주소 형식을 확인해주세요."),
    DUPLICATED_NICKNAME(false, 3015, "중복된 닉네임입니다."),
    DELETE_FAIL_USER(false, 4015, "회원 삭제에 실패하였습니다.");









    // 5000 : 필요시 만들어서 쓰세요
    // 6000 : 필요시 만들어서 쓰세요


    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
