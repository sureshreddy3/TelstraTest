package com.belong.src.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author suresh
 *
 */
@Data
public class Contact {
  @Setter @Getter
  public String number;
  @Setter @Getter
  public boolean active;
}
