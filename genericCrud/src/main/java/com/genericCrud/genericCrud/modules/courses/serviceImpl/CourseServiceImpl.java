package com.genericCrud.genericCrud.modules.courses.serviceImpl;

import com.genericCrud.genericCrud.modules.courses.entity.Course;
import com.genericCrud.genericCrud.modules.courses.repository.ICourseRepository;
import com.genericCrud.genericCrud.modules.courses.service.ICourseService;
import com.genericCrud.genericCrud.modules.exception.CustomException;
import com.genericCrud.genericCrud.modules.generic.service.ServiceGeneric;
import com.genericCrud.genericCrud.modules.generic.service.impl.ServiceGenericImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl extends ServiceGenericImpl<Course> implements ICourseService {
    @Autowired
    private ICourseRepository courseRepository;
    @Override
    public void delete(Long id) throws CustomException {
        Course c=this.courseRepository.findById(id).get();
        if(c.getFlag()==true)
        {
            throw new CustomException("delete not possible");
        }
        super.delete(id);
    }
}
