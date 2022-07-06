package com.genericCrud.genericCrud.modules.generic.controller;


import com.genericCrud.genericCrud.modules.exception.AlreadyExistsException;
import com.genericCrud.genericCrud.modules.exception.CustomException;
import com.genericCrud.genericCrud.modules.exception.NotFoundException;
import com.genericCrud.genericCrud.modules.generic.baseEntity.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ControllerGeneric<T extends BaseEntity>  {

    ResponseEntity<Object> save(@RequestBody T entity) throws CustomException, AlreadyExistsException;

    ResponseEntity<T> findAll() throws CustomException;

    ResponseEntity<T> findById(@PathVariable Long id) throws NotFoundException, CustomException;

    ResponseEntity<String> delete(@PathVariable Long id) throws CustomException;

    ResponseEntity<Object>update(@RequestBody T entity) throws CustomException;

}
