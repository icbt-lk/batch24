/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icbt;

import lk.icbt.rest.service.DBUtils;
import lk.icbt.rest.service.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tharik
 */
public class DBUtilsTest {
    
    public DBUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudent method, of class DBUtils.
     */
    @Test
    public void testGetStudent() {
        System.out.println("getStudent");
        String id = "1";
        DBUtils instance = new DBUtils();
        Student expResult = new Student("1", "John", "1988");
        Student result = instance.getStudent(id);
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getDob(), result.getDob());
    }
    
    
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        DBUtils instance = new DBUtils();
        Student student = new Student("999", "TestStudent", "1999");
        boolean expectedResult = true;
        boolean result = instance.addStudent(student);
        
        assertEquals(expectedResult, result);
        
        //Check each field added properly
        Student resultStudent = instance.getStudent(student.getId());
        assertEquals(student.getId(), resultStudent.getId());
        assertEquals(student.getName(), resultStudent.getName());
        assertEquals(student.getDob(), resultStudent.getDob());
        
        System.out.println("updateStudent");
        student = new Student("999", "TestStudent2", "2023");
        result = instance.updateStudent(student);
        
        assertEquals(expectedResult, result);
        
        //Check each field added properly
        resultStudent = instance.getStudent(student.getId());
        assertEquals(student.getId(), resultStudent.getId());
        assertEquals(student.getName(), resultStudent.getName());
        assertEquals(student.getDob(), resultStudent.getDob());
        
        System.out.println("deleteStudent");
        result = instance.deleteStudent(student.getId());
        assertEquals(expectedResult, result);  
    }
}
