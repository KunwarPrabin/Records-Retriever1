/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.fileio.DAO;

import com.kunwarprabin.fileio.entity.Course;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public interface CourseDAO {
    boolean add(Course c);
    ArrayList<Course> showCourse();
}
