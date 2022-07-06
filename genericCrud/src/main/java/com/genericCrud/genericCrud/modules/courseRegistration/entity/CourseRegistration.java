package com.genericCrud.genericCrud.modules.courseRegistration.entity;

import com.genericCrud.genericCrud.modules.courses.entity.Course;
import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;
import com.genericCrud.genericCrud.modules.students.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class CourseRegistration extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    LocalDateTime registeredAt;

}
