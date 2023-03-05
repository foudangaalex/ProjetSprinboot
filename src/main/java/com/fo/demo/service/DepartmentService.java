package com.fo.demo.service;


import com.fo.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
   public Department saveDepartment(Department department);


  public List<Department> fetchDepartmentlist();

   public Department fetchDepartmentById(Long departmentId);


   public void deleteDepartmentById(Long departmentId);

   public Department updateDapartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
