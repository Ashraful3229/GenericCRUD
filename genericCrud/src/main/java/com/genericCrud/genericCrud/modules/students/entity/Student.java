package com.genericCrud.genericCrud.modules.students.entity;

import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends BaseEntity {

    private String firstName;
    private String lastName;
    private LocalDate dob;
}
