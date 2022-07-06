package com.genericCrud.genericCrud.modules.courses.controller.impl;

import com.genericCrud.genericCrud.modules.courses.controller.ICourseController;
import com.genericCrud.genericCrud.modules.courses.entity.Course;
import com.genericCrud.genericCrud.modules.exception.CustomException;
import com.genericCrud.genericCrud.modules.generic.controller.impl.ControllerGenericImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
@CrossOrigin("*")
public class CourseControllerImpl extends ControllerGenericImpl<Course> implements ICourseController {
    @Override
    public ResponseEntity<String> delete(Long id) throws CustomException {
        return super.delete(id);
    }
}
