/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.DAO;

import com.kunwarprabin.fileio.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public interface StudentDAO {
    boolean add(Student s);
    ArrayList<Student> showStudents();
}
