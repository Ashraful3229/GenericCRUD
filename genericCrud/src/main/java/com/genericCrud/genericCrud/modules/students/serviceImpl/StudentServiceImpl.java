package com.genericCrud.genericCrud.modules.students.serviceImpl;

import com.genericCrud.genericCrud.modules.generic.service.impl.ServiceGenericImpl;
import com.genericCrud.genericCrud.modules.students.entity.Student;
import com.genericCrud.genericCrud.modules.students.service.IStudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceGenericImpl<Student> implements IStudentService {

}
