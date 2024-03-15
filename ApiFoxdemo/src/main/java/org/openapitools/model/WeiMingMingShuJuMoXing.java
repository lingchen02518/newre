package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TestEasyExcel
 */
@ApiModel(description = "TestEasyExcel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-06T16:02:30.602167700+08:00[GMT+08:00]")

public class WeiMingMingShuJuMoXing   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("age")
  private JsonNullable<Integer> age = JsonNullable.undefined();

  @JsonProperty("alias")
  private JsonNullable<String> alias = JsonNullable.undefined();

  public WeiMingMingShuJuMoXing id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * 主键
   * @return id
  */
  @ApiModelProperty(required = true, value = "主键")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WeiMingMingShuJuMoXing name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WeiMingMingShuJuMoXing age(Integer age) {
    this.age = JsonNullable.of(age);
    return this;
  }

  /**
   * Get age
   * @return age
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Integer> getAge() {
    return age;
  }

  public void setAge(JsonNullable<Integer> age) {
    this.age = age;
  }

  public WeiMingMingShuJuMoXing alias(String alias) {
    this.alias = JsonNullable.of(alias);
    return this;
  }

  /**
   * Get alias
   * @return alias
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getAlias() {
    return alias;
  }

  public void setAlias(JsonNullable<String> alias) {
    this.alias = alias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeiMingMingShuJuMoXing weiMingMingShuJuMoXing = (WeiMingMingShuJuMoXing) o;
    return Objects.equals(this.id, weiMingMingShuJuMoXing.id) &&
        Objects.equals(this.name, weiMingMingShuJuMoXing.name) &&
        Objects.equals(this.age, weiMingMingShuJuMoXing.age) &&
        Objects.equals(this.alias, weiMingMingShuJuMoXing.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age, alias);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeiMingMingShuJuMoXing {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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

