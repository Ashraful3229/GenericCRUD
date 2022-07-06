package com.genericCrud.genericCrud.modules.generic.repository;

import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T,Long> {
}
