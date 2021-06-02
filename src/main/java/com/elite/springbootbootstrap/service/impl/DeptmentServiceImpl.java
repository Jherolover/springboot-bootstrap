package com.elite.springbootbootstrap.service.impl;

import com.elite.springbootbootstrap.mapper.DeptmentMapper;
import com.elite.springbootbootstrap.model.Deptment;
import com.elite.springbootbootstrap.service.DeptmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptmentServiceImpl implements DeptmentService {

    @Autowired
    DeptmentMapper deptmentMapper;

    @Override
    public List<Deptment> getDeptList() {
        return deptmentMapper.getDeptList();
    }

    @Override
    public Deptment getDeptment(String deptid) {
        return deptmentMapper.getDeptmentByDeptID(deptid);
    }
}
