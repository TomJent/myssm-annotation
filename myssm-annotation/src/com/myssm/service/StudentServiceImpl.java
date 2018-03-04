package com.myssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myssm.dao.IStudentDao;
import com.myssm.entity.Student;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Resource(name="IStudentDao")
	private IStudentDao dao;

	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}

	@Transactional
	public void addStudent(Student student) {
		dao.insertSudent(student);
	}

}
