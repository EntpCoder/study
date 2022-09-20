package com.songyang.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

/**
 * (CouponStock)表实体类
 *
 * @author makejava
 * @since 2022-09-19 09:02:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouponStock {
    private Integer stockId;
    //优惠券编号
    private String couponNo;
    //优惠券名字
    private String couponName;
    //满减价格
    private Double couponPrice;
    //满多少钱才能减
    private Double couponFullPrice;
    //折扣
    private Double couponDiscount;
    //活动开始日期
    private LocalDateTime couponStartDate;
    //活动结束日期
    private LocalDateTime couponEndDate;
    //发布方
    private Integer couponPublish;
    //注意事项
    private String couponAttention;
    //优惠券使用状态
    private Integer couponUseStatus;
    //抢购状态
    private Integer couponSnapupStatus;
    //库存
    private Integer stock;
    //已发布
    private Integer publishTotal;
    //行锁
    private Integer version;
}
