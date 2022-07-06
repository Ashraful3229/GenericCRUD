package com.genericCrud.genericCrud.modules.courses.entity;

import com.genericCrud.genericCrud.modules.courseRegistration.entity.CourseRegistration;
import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Course extends BaseEntity {

    private String name;
    private String code;

    @OneToMany(mappedBy = "course")
    Set<CourseRegistration> registrations;
}
