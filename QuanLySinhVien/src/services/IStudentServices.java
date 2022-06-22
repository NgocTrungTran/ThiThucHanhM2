package services;

import model.Student;

import java.util.List;

public interface IStudentServices {
    List<Student> findAll();
    void add(Student newStudent);
void edit(Student afterStudent);
void removeByCode(long code);
    boolean existsCode(long code);
    Student getByCode(long code);
    List<Student> sortAge(List<Student> studentList);
}
