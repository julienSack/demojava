package com.ipiecoles.javaexo.mesi.repository;

import com.ipiecoles.javaexo.mesi.model.enfants;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface EnfantsRepository extends CrudRepository<enfants, Integer> {

}
