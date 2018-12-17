package com.ipiecoles.javaexo.mesi.repository;

import com.ipiecoles.javaexo.mesi.model.contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<contact, Integer> {

}
