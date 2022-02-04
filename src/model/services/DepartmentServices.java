package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentServices {

	public List<Department> findAll() {
		List<Department> tempDepartments = new ArrayList<Department>();
		tempDepartments.add(new Department(1, "Livros"));
		tempDepartments.add(new Department(2, "Papelaria"));
		tempDepartments.add(new Department(3, "Games"));
		return tempDepartments;
	}
}
