package com.songyang.entity;

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
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer empno;

    private String ename;

    private String job;

    private Integer mgr;

    private LocalDate hiredate;

    private Double salary;

    private Double comm;

    private Integer deptno;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
            "empno = " + empno +
            ", ename = " + ename +
            ", job = " + job +
            ", mgr = " + mgr +
            ", hiredate = " + hiredate +
            ", salary = " + salary +
            ", comm = " + comm +
            ", deptno = " + deptno +
        "}";
    }
}
