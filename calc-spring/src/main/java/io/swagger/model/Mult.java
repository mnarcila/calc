package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Mult
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-05-25T23:44:22.900-05:00")

public class Mult   {
  private Integer num1 = null;

  private Integer num2 = null;

  public Mult num1(Integer num1) {
    this.num1 = num1;
    return this;
  }

   /**
   * Get num1
   * @return num1
  **/
  @ApiModelProperty(value = "")
  public Integer getNum1() {
    return num1;
  }

  public void setNum1(Integer num1) {
    this.num1 = num1;
  }

  public Mult num2(Integer num2) {
    this.num2 = num2;
    return this;
  }

   /**
   * Get num2
   * @return num2
  **/
  @ApiModelProperty(value = "")
  public Integer getNum2() {
    return num2;
  }

  public void setNum2(Integer num2) {
    this.num2 = num2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mult mult = (Mult) o;
    return Objects.equals(this.num1, mult.num1) &&
        Objects.equals(this.num2, mult.num2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(num1, num2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mult {\n");
    
    sb.append("    num1: ").append(toIndentedString(num1)).append("\n");
    sb.append("    num2: ").append(toIndentedString(num2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

