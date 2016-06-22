/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.DAO.impl;

import com.kunwarprabin.fileio.DAO.CourseDAO;
import com.kunwarprabin.fileio.entity.Course;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class CourseDAOImpl implements CourseDAO {
    ArrayList<Course> courselist = new ArrayList<>();
    @Override
    public boolean add(Course c) {
        return courselist.add(c);
    }

    @Override
    public ArrayList<Course> showCourse() {
        return courselist;
    }

    
}
