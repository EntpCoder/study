package com.songyang.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户付款返回信息实体类
 * @author Yang Song
 * @date 2022/9/24 11:29
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PayResultVo {
    private String flowNum;
    private String orderNum;
    private String paidAmount;
}
