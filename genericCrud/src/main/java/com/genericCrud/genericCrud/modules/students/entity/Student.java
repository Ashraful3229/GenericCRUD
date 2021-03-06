package com.genericCrud.genericCrud.modules.students.entity;

import com.genericCrud.genericCrud.modules.courseRegistration.entity.CourseRegistration;
import com.genericCrud.genericCrud.modules.courses.entity.Course;
import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class Student extends BaseEntity {

    private String firstName;
    private String lastName;
    private LocalDate dob;

    @OneToMany(mappedBy = "student")
    Set<CourseRegistration> registrations;

}
