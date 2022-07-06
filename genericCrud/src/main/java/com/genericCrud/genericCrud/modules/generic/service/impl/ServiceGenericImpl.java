package com.genericCrud.genericCrud.modules.generic.service.impl;


import com.genericCrud.genericCrud.modules.exception.CustomException;
import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;
import com.genericCrud.genericCrud.modules.generic.repository.GenericRepository;
import com.genericCrud.genericCrud.modules.generic.service.ServiceGeneric;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

public class ServiceGenericImpl<T extends BaseEntity> implements ServiceGeneric<T> {

    @Autowired
    protected GenericRepository<T> genericRepository;

    @Autowired
    private EntityManagerFactory entityManagerFactory;


    @Override
    public List<T> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public T save(T entity) {
        return genericRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        genericRepository.deleteById(id);
    }

    @Override
    public Optional<T> findById(Long id)  {
        return genericRepository.findById(id);
    }


    @Override
    public T update(T entity) throws CustomException {
        return genericRepository.save(entity);
    }



}
