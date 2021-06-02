package com.elite.springbootbootstrap.service;

import com.elite.springbootbootstrap.model.Deptment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeptmentService {

    List<Deptment> getDeptList();

    Deptment getDeptment(String deptid);
}
