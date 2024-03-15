package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-06T16:02:30.602167700+08:00[GMT+08:00]")

public class InlineResponse2003   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  /**
   * Gets or Sets pswd
   */
  public enum PswdEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

    private String value;

    PswdEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PswdEnum fromValue(String value) {
      for (PswdEnum b : PswdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("pswd")
  private PswdEnum pswd;

  public InlineResponse2003 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2003 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 名称
   * @return name
  */
  @ApiModelProperty(required = true, value = "名称")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2003 pswd(PswdEnum pswd) {
    this.pswd = pswd;
    return this;
  }

  /**
   * Get pswd
   * @return pswd
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public PswdEnum getPswd() {
    return pswd;
  }

  public void setPswd(PswdEnum pswd) {
    this.pswd = pswd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.id, inlineResponse2003.id) &&
        Objects.equals(this.name, inlineResponse2003.name) &&
        Objects.equals(this.pswd, inlineResponse2003.pswd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pswd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pswd: ").append(toIndentedString(pswd)).append("\n");
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

