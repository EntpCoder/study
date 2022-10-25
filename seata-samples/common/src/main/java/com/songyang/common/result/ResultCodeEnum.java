package com.songyang.common.result;

import lombok.Getter;

/**
 * 统一返回结果状态信息类
 * @author Yang Song
 */
@Getter
public enum ResultCodeEnum {

    /**
     * 成功
     */
    SUCCESS(200,"成功"),
    /**
     * 失败
     */
    FAIL(201, "失败"),
    /**
     * 数据为空
     */
    DATA_EMPTY(202,"数据为空"),
    /**
     * 热数据兜底数据
     */
    SO_HOT(203,"当前数据访问量过多,请稍后再试")
    ;

    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 状态信息
     */
    private final String message;

    ResultCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
