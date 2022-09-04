/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package icbt;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author tharik
 */
@WebService(serviceName = "StudentService")
public class StudentService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !!!!!!!!";
    }
    
    @WebMethod(operationName = "getStudent")
    public Student getStudent(@WebParam(name = "id") String id) {
        DBUtils utils = new DBUtils();
        return utils.getStudent(id);
    }
    
    @WebMethod(operationName = "getStudents")
    public List<Student> getStudents() {
        DBUtils utils = new DBUtils();
        return utils.getStudents();
    }
    
    @WebMethod(operationName = "addStudent")
    public boolean addStudent(@WebParam(name = "student") Student student) {
        DBUtils utils = new DBUtils();
        return utils.addStudent(student);
    }
        
    @WebMethod(operationName = "updateStudent")
    public boolean updateStudent(@WebParam(name = "student") Student student) {
        DBUtils utils = new DBUtils();
        return utils.updateStudent(student);
    }
    
    @WebMethod(operationName = "deleteStudent")
    public boolean deleteStudent(@WebParam(name = "id") String id) {
        DBUtils utils = new DBUtils();
        return utils.deleteStudent(id);
    }
    
    @WebMethod(operationName = "authenticate")
    public boolean authenticate(@WebParam(name = "username") String username, @WebParam(name = "password")  String password) {
        // Go to db and check
        String hash = DigestUtils.md5Hex(password);
        return username.equals("icbt") && hash.equals("202cb962ac59075b964b07152d234b70");   
        
        
    }
}
