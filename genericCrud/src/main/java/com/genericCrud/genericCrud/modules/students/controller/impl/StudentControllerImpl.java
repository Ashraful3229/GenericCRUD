package com.genericCrud.genericCrud.modules.students.controller.impl;


import com.genericCrud.genericCrud.modules.exception.CustomException;
import com.genericCrud.genericCrud.modules.exception.NotFoundException;
import com.genericCrud.genericCrud.modules.generic.controller.impl.ControllerGenericImpl;
import com.genericCrud.genericCrud.modules.students.controller.IStudentController;
import com.genericCrud.genericCrud.modules.students.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentControllerImpl extends ControllerGenericImpl<Student> implements IStudentController {


}
