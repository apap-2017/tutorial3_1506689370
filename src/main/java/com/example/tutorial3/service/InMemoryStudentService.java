package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	

	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}

	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}

	@Override
	public StudentModel selectStudent(String npm) {
		for(StudentModel student : studentList){
			if(student.getNpm().equals(npm)){
				return student;
			}
		}
		return null;
	}

	@Override
	public StudentModel selectStudent(Optional<String> npm) {
		String value = npm.get();
		for(StudentModel student : studentList){
			if(student.getNpm().equals(value)){
				return student;
			}
		}
		return null;
	}

	@Override
	public boolean deleteStudent(Optional<String> npm) {
		String value = npm.get();
		for(int i = 0; i<studentList.size(); i++){
			if(studentList.get(i).getNpm().equals(value)){
				studentList.remove(i);
				return true;
			}
		}
		return false;
	}

}
