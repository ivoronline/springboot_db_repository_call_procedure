package com.ivoronline.springboot_db_repository_call_procedure.repository;

import com.ivoronline.springboot_db_repository_call_procedure.entity.UtilEntity;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

public interface UtilEntityRepository extends CrudRepository<UtilEntity, Integer> {
   @Procedure(procedureName = "TEST.MY_PROCEDURE", outputParameterName = "message")
   String myProcedure(String name, Integer age);
}
