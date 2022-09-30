package com.songyang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-22
 */
@Data
@NoArgsConstructor
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_ID)
    private String empno;

    private String ename;

    private String job;

    private Integer mgr;

    private LocalDate hiredate;

    private Double salary;

    private Double comm;

    private Integer deptno;
}
