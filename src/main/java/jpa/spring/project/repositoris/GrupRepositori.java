package jpa.spring.project.repositoris;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.util.MultiValueMap;

import jpa.spring.project.entitats.Grup;

public interface GrupRepositori extends CrudRepository<Grup, Long>{

}

