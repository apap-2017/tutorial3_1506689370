package com.example.tutorial3.service;

import java.util.List;
import java.util.Optional;

import com.example.tutorial3.model.StudentModel;

public interface StudentService {
	void addStudent(StudentModel student);
	StudentModel selectStudent(String npm);
	StudentModel selectStudent(Optional<String> npm);
	List<StudentModel> selectAllStudents();
	boolean deleteStudent(Optional<String> npm);
}
