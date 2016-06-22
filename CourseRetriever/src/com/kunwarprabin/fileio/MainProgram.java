/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.kunwarprabin.fileio.controller.Controller;
import java.io.IOException;

/**
 *
 * @author OWNER
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        Controller control = new Controller();
        control.addCourse();
        control.addStudent();
        control.showStudentRecords();
    }
    
}
