package com.songyang.result;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局统一返回结果类
 * @author Yang Song
 */
@Data
public class R<T> {

    private Integer code;

    private String message;

    private Map<String,T> data = new HashMap<>();
    public static<T> R<T> ok(){
        return build(null,null);
    }
    public static<T> R<T> ok(String key,T  value){
        return build(key,value,ResultCodeEnum.SUCCESS);
    }

    public static<T> R<T> fail(){
        return R.fail(null,null,ResultCodeEnum.FAIL);
    }
    public static<T> R<T> fail(ResultCodeEnum resultCodeEnum){
        return R.fail(null,null,resultCodeEnum);
    }
    public static<T> R<T> fail(String key,T  value,ResultCodeEnum resultCodeEnum){
        return build(key,value, resultCodeEnum);
    }

    public static <T> R<T> build(String key,T  data, ResultCodeEnum resultCodeEnum) {
        R<T> result = build(key,data);
        result.setCode(resultCodeEnum.getCode());
        result.setMessage(resultCodeEnum.getMessage());
        return result;
    }
    protected static <T> R<T> build(String key,T  value) {
        R<T> result = new R<>();
        if (value != null){
            result.data.put(key, value);
        }
        return result;
    }
    public R<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public R<T> code(Integer code){
        this.setCode(code);
        return this;
    }
    public boolean isOk() {
        return this.getCode().intValue() == ResultCodeEnum.SUCCESS.getCode().intValue();
    }
}
