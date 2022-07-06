package com.genericCrud.genericCrud.modules.generic.service;


import com.genericCrud.genericCrud.modules.exception.CustomException;
import com.genericCrud.genericCrud.modules.exception.NotFoundException;
import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;

import java.util.List;
import java.util.Optional;

public interface ServiceGeneric<T extends BaseEntity>  {

    List<T> findAll() throws CustomException;
    T save(T entity) throws CustomException;
    void delete(Long id) throws CustomException;
    Optional<T> findById(Long id) throws NotFoundException;
    T update(T entity) throws CustomException;
}

