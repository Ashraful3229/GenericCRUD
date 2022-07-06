package com.genericCrud.genericCrud.modules.courses.serviceImpl;

import com.genericCrud.genericCrud.modules.courses.entity.Course;
import com.genericCrud.genericCrud.modules.courses.service.ICourseService;
import com.genericCrud.genericCrud.modules.generic.service.ServiceGeneric;
import com.genericCrud.genericCrud.modules.generic.service.impl.ServiceGenericImpl;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceGenericImpl<Course> implements ICourseService {
}
