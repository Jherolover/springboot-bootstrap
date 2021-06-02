package com.elite.springbootbootstrap.model;

/**
 * 建立科室的名称
 */
public class Deptment {

    private String id;
    private String deptno;
    private String deptname;
    private String dept_descript;
    private String dept_address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDept_descript() {
        return dept_descript;
    }

    public void setDept_descript(String dept_descript) {
        this.dept_descript = dept_descript;
    }

    public String getDept_address() {
        return dept_address;
    }

    public void setDept_address(String dept_address) {
        this.dept_address = dept_address;
    }
}
