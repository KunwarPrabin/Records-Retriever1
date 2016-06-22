/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.controller;

import com.kunwarprabin.fileio.DAO.CourseDAO;
import com.kunwarprabin.fileio.DAO.StudentDAO;
import com.kunwarprabin.fileio.DAO.impl.CourseDAOImpl;
import com.kunwarprabin.fileio.DAO.impl.StudentDAOImpl;
import com.kunwarprabin.fileio.entity.Course;
import com.kunwarprabin.fileio.entity.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author OWNER
 */
public class Controller {

    CourseDAO courseDAO = new CourseDAOImpl();
    StudentDAO studentDAO = new StudentDAOImpl();

    public void addCourse() {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader("E:\\GITHUB\\CourseRetriever\\src\\DATA\\course.txt"));
            String cline = "";
            while ((cline = buffReader.readLine()) != null) {
              
                String[] cou = cline.split(",");
                Course course = new Course();
                course.setId(Integer.parseInt(cou[0]));
                course.setCourseName(cou[1]);
                courseDAO.add(course);
            } 
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void addStudent() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:\\GITHUB\\CourseRetriever\\src\\DATA\\student.txt"));
            String stline = "";
            while ((stline=reader.readLine()) != null) {
              
                String[] token2 = stline.split(",");
                Student student = new Student();
                student.setId(Integer.parseInt(token2[0]));
                student.setFirstName(token2[1]);
                student.setLastName(token2[2]);
                for (Course c : courseDAO.showCourse()) {
                    if (Integer.parseInt(token2[3]) == c.getId()) {
                        student.setCourse(c.getCourseName());
                    }
                }
                studentDAO.add(student);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
    
    public void showStudentRecords(){
        for(Student sdRecords:studentDAO.showStudents()){
            System.out.println("ID:"+sdRecords.getId());
            System.out.println("First Name:"+sdRecords.getFirstName());
            System.out.println("Last Name"+sdRecords.getLastName());
            System.out.println("Course:"+sdRecords.getCourse());
            System.out.println("*-----*-----*-----*-----*-----*-----*-----*-----*");
        }
        
    }
}
