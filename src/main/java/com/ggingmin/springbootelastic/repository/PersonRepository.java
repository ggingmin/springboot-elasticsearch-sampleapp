package com.ggingmin.springbootelastic.repository;

import com.ggingmin.springbootelastic.document.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface PersonRepository extends ElasticsearchRepository<Person, String> {

}
