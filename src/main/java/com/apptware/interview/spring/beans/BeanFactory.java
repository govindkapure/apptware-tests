package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BeanFactory {

  @Autowired private ApplicationContext context;

  public OnDemand getOnDemandBean(SomeEnum someEnum, String someString) {
    if(someEnum == someEnum.SOME_ENUM_A){
      return new OnDemandA(someString);
    }else if(someEnum == SomeEnum.SOME_ENUM_B){
      return new OnDemandB(someString);
    }
    return null;
  }
}
