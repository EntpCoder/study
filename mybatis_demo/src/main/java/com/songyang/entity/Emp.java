package com.songyang.entity;

import java.time.LocalDate;

/**
 * @author Yang Song
 * @date 2022/9/5 11:04
 */
public class Emp {

  private Long empno;
  private String ename;
  private String job;
  private Long mgr;
  private LocalDate hiredate;
  private Double salary;
  private Double comm;
  private Long deptno;

  public Emp() {
  }

  public Emp(Long empno, String ename, String job, Long mgr, LocalDate hiredate, Double salary, Double comm, Long deptno) {
    this.empno = empno;
    this.ename = ename;
    this.job = job;
    this.mgr = mgr;
    this.hiredate = hiredate;
    this.salary = salary;
    this.comm = comm;
    this.deptno = deptno;
  }

  public Long getEmpno() {
    return empno;
  }

  public void setEmpno(Long empno) {
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


  public Long getMgr() {
    return mgr;
  }

  public void setMgr(Long mgr) {
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


  public Long getDeptno() {
    return deptno;
  }

  public void setDeptno(Long deptno) {
    this.deptno = deptno;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "empno=" + empno +
            ", ename='" + ename + '\'' +
            ", job='" + job + '\'' +
            ", mgr=" + mgr +
            ", hiredate=" + hiredate +
            ", salary=" + salary +
            ", comm=" + comm +
            ", deptno=" + deptno +
            '}';
  }
}
