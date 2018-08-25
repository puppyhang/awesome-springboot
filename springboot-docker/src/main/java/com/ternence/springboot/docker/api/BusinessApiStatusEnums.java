package com.ternence.springboot.docker.api;

/**
 * 业务API状态的枚举类
 *
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 15:08
 */
public enum BusinessApiStatusEnums {
    GLOBAL_SUCCESS("+0000", "成功"),
    GLOBAL_FAILURE("-0001", "失败"),
    GLOBAL_EXCEPTION("-0002", "请求异常");

    private String code;
    private String message;

    BusinessApiStatusEnums(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
