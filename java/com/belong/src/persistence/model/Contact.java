package com.belong.src.persistence.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Contact {
  @Setter @Getter
  public String number;
  @Setter @Getter
  public boolean active;
}
