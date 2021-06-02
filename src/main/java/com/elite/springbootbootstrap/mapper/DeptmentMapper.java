package com.elite.springbootbootstrap.mapper;

import com.elite.springbootbootstrap.model.Deptment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptmentMapper {

   List<Deptment> getDeptList();

   Deptment getDeptmentByDeptID(String deptid);

}
