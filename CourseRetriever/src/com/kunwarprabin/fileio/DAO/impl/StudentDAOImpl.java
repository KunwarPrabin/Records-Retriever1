/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.DAO.impl;

import com.kunwarprabin.fileio.DAO.StudentDAO;
import com.kunwarprabin.fileio.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class StudentDAOImpl implements StudentDAO {

    ArrayList<Student> studentlist = new ArrayList<>();

    @Override
    public boolean add(Student s) {
        return studentlist.add(s);
    }

    @Override
    public ArrayList<Student> showStudents() {
        return studentlist;
    }

}
