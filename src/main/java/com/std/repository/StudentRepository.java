package com.std.repository;

import com.std.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by A.A.MAMUN on 7/19/2020.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
