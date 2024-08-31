package com.apptware.interview.jpa.employee;

import jakarta.persistence.Entity;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
class Employee {

  @Id
  private UUID id;
  private String name;
}
