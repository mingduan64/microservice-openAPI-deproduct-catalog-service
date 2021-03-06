/*
 * Product Catalog Management
 * ## TMF API Reference: TMF620 - Product Catalog Management  ### Release : 20.5 - March 2021  Product Catalog API is one of Catalog Management API Family. Product Catalog API goal is to provide a catalog of products.   ### Operations Product Catalog API performs the following operations on the resources : - Retrieve an entity or a collection of entities depending on filter criteria - Partial update of an entity (including updating rules) - Create an entity (including default values and creation rules) - Delete an entity - Manage notification of events
 *
 * The version of the OpenAPI document: 4.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * A set of numbers that specifies the lower and upper limits for a ProductOffering that can be procured as part of the related BundledProductOffering. Values can range from 0 to unbounded
 */
@ApiModel(description = "A set of numbers that specifies the lower and upper limits for a ProductOffering that can be procured as part of the related BundledProductOffering. Values can range from 0 to unbounded")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-04T02:31:04.425344+07:00[Asia/Ho_Chi_Minh]")
public class BundledProductOfferingOption {
  public static final String SERIALIZED_NAME_NUMBER_REL_OFFER_DEFAULT = "numberRelOfferDefault";
  @SerializedName(SERIALIZED_NAME_NUMBER_REL_OFFER_DEFAULT)
  private Integer numberRelOfferDefault;

  public static final String SERIALIZED_NAME_NUMBER_REL_OFFER_LOWER_LIMIT = "numberRelOfferLowerLimit";
  @SerializedName(SERIALIZED_NAME_NUMBER_REL_OFFER_LOWER_LIMIT)
  private Integer numberRelOfferLowerLimit;

  public static final String SERIALIZED_NAME_NUMBER_REL_OFFER_UPPER_LIMIT = "numberRelOfferUpperLimit";
  @SerializedName(SERIALIZED_NAME_NUMBER_REL_OFFER_UPPER_LIMIT)
  private Integer numberRelOfferUpperLimit;

  public static final String SERIALIZED_NAME_AT_BASE_TYPE = "@baseType";
  @SerializedName(SERIALIZED_NAME_AT_BASE_TYPE)
  private String atBaseType;

  public static final String SERIALIZED_NAME_AT_SCHEMA_LOCATION = "@schemaLocation";
  @SerializedName(SERIALIZED_NAME_AT_SCHEMA_LOCATION)
  private URI atSchemaLocation;

  public static final String SERIALIZED_NAME_AT_TYPE = "@type";
  @SerializedName(SERIALIZED_NAME_AT_TYPE)
  private String atType;


  public BundledProductOfferingOption numberRelOfferDefault(Integer numberRelOfferDefault) {
    
    this.numberRelOfferDefault = numberRelOfferDefault;
    return this;
  }

   /**
   * Default number of produc offereings that should be procured as part of the related BundledProductOffering
   * @return numberRelOfferDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Default number of produc offereings that should be procured as part of the related BundledProductOffering")

  public Integer getNumberRelOfferDefault() {
    return numberRelOfferDefault;
  }


  public void setNumberRelOfferDefault(Integer numberRelOfferDefault) {
    this.numberRelOfferDefault = numberRelOfferDefault;
  }


  public BundledProductOfferingOption numberRelOfferLowerLimit(Integer numberRelOfferLowerLimit) {
    
    this.numberRelOfferLowerLimit = numberRelOfferLowerLimit;
    return this;
  }

   /**
   * lower limit for a product offering that can be procured as part of the related BundledProductOffering
   * @return numberRelOfferLowerLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "lower limit for a product offering that can be procured as part of the related BundledProductOffering")

  public Integer getNumberRelOfferLowerLimit() {
    return numberRelOfferLowerLimit;
  }


  public void setNumberRelOfferLowerLimit(Integer numberRelOfferLowerLimit) {
    this.numberRelOfferLowerLimit = numberRelOfferLowerLimit;
  }


  public BundledProductOfferingOption numberRelOfferUpperLimit(Integer numberRelOfferUpperLimit) {
    
    this.numberRelOfferUpperLimit = numberRelOfferUpperLimit;
    return this;
  }

   /**
   * upper limit for a product offering that can be procured as part of the related BundledProductOffering
   * @return numberRelOfferUpperLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "upper limit for a product offering that can be procured as part of the related BundledProductOffering")

  public Integer getNumberRelOfferUpperLimit() {
    return numberRelOfferUpperLimit;
  }


  public void setNumberRelOfferUpperLimit(Integer numberRelOfferUpperLimit) {
    this.numberRelOfferUpperLimit = numberRelOfferUpperLimit;
  }


  public BundledProductOfferingOption atBaseType(String atBaseType) {
    
    this.atBaseType = atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return atBaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")

  public String getAtBaseType() {
    return atBaseType;
  }


  public void setAtBaseType(String atBaseType) {
    this.atBaseType = atBaseType;
  }


  public BundledProductOfferingOption atSchemaLocation(URI atSchemaLocation) {
    
    this.atSchemaLocation = atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return atSchemaLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")

  public URI getAtSchemaLocation() {
    return atSchemaLocation;
  }


  public void setAtSchemaLocation(URI atSchemaLocation) {
    this.atSchemaLocation = atSchemaLocation;
  }


  public BundledProductOfferingOption atType(String atType) {
    
    this.atType = atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")

  public String getAtType() {
    return atType;
  }


  public void setAtType(String atType) {
    this.atType = atType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledProductOfferingOption bundledProductOfferingOption = (BundledProductOfferingOption) o;
    return Objects.equals(this.numberRelOfferDefault, bundledProductOfferingOption.numberRelOfferDefault) &&
        Objects.equals(this.numberRelOfferLowerLimit, bundledProductOfferingOption.numberRelOfferLowerLimit) &&
        Objects.equals(this.numberRelOfferUpperLimit, bundledProductOfferingOption.numberRelOfferUpperLimit) &&
        Objects.equals(this.atBaseType, bundledProductOfferingOption.atBaseType) &&
        Objects.equals(this.atSchemaLocation, bundledProductOfferingOption.atSchemaLocation) &&
        Objects.equals(this.atType, bundledProductOfferingOption.atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberRelOfferDefault, numberRelOfferLowerLimit, numberRelOfferUpperLimit, atBaseType, atSchemaLocation, atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledProductOfferingOption {\n");
    sb.append("    numberRelOfferDefault: ").append(toIndentedString(numberRelOfferDefault)).append("\n");
    sb.append("    numberRelOfferLowerLimit: ").append(toIndentedString(numberRelOfferLowerLimit)).append("\n");
    sb.append("    numberRelOfferUpperLimit: ").append(toIndentedString(numberRelOfferUpperLimit)).append("\n");
    sb.append("    atBaseType: ").append(toIndentedString(atBaseType)).append("\n");
    sb.append("    atSchemaLocation: ").append(toIndentedString(atSchemaLocation)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

