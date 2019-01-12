package com.sms.app;

import com.sms.model.Student;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "/student", description = "Student Service", produces = "application/json")
@RequestMapping("/student")
public class StudentResource  {


    @RequestMapping(method = RequestMethod.GET, value = "/getAllStudents", produces = "application/json")
    @ResponseBody
    public List<Student> getStudentList() {
        return null;
    }
}
