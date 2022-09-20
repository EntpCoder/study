package com.songyang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok注解
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVo<T> { // 泛型约束
    private String msg; // 前后端交互操作返回信息
    private int code; // 状态码
    private T data; // 泛型约束，返回值数据类型不确定
}
