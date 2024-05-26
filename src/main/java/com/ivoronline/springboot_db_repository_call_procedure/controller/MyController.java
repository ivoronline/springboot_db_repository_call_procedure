package com.ivoronline.springboot_db_repository_call_procedure.controller;

import com.ivoronline.springboot_db_repository_call_procedure.repository.UtilEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired private UtilEntityRepository utilEntityRepository;

  //=========================================================================================================
  // CALL PROCEDURE
  //=========================================================================================================
  // http://localhost:8080/callProcedure?name=John&age=50
  @ResponseBody
  @GetMapping("/callProcedure")
  public String callProcedure(@RequestParam String name, @RequestParam Integer age) {
    return utilEntityRepository.myProcedure(name, age);
  }

}
