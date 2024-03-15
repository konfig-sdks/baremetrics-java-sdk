/*
 * Production
 * Baremetrics provides real-time subscription metrics for teams built with Stripe, Shopify Partners, Braintree, Recurly, Chargebee, Google Play, and App Store Connect.   In addition to metrics, Baremetrics provides tools that help you reduce churn and grow your business faster:   Recover: Prevent failed charges and keep your hard-earned revenue with our 100% automated toolkit.   Cancellation insights: Learn exactly why your customers cancel, calculate lost revenue by cancellation reason, and send automated emails to win customers back.  Flightpath: Plan for the future with flexible financial modeling tools built for growing SaaS companies.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * AttributeCreateFieldResponseAttributeField
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AttributeCreateFieldResponseAttributeField {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id = 0;

  public static final String SERIALIZED_NAME_FIELD_TYPE = "field_type";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private String fieldType;

  public static final String SERIALIZED_NAME_TITLE_WITH_TYPE = "title_with_type";
  @SerializedName(SERIALIZED_NAME_TITLE_WITH_TYPE)
  private String titleWithType;

  public AttributeCreateFieldResponseAttributeField() {
  }

  public AttributeCreateFieldResponseAttributeField title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Intercom Last Opened", value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public AttributeCreateFieldResponseAttributeField id(Integer id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    
    
    
    this.id = id;
  }


  public AttributeCreateFieldResponseAttributeField fieldType(String fieldType) {
    
    
    
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "date", value = "")

  public String getFieldType() {
    return fieldType;
  }


  public void setFieldType(String fieldType) {
    
    
    
    this.fieldType = fieldType;
  }


  public AttributeCreateFieldResponseAttributeField titleWithType(String titleWithType) {
    
    
    
    
    this.titleWithType = titleWithType;
    return this;
  }

   /**
   * Get titleWithType
   * @return titleWithType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[date] Intercom Last Opened", value = "")

  public String getTitleWithType() {
    return titleWithType;
  }


  public void setTitleWithType(String titleWithType) {
    
    
    
    this.titleWithType = titleWithType;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the AttributeCreateFieldResponseAttributeField instance itself
   */
  public AttributeCreateFieldResponseAttributeField putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeCreateFieldResponseAttributeField attributeCreateFieldResponseAttributeField = (AttributeCreateFieldResponseAttributeField) o;
    return Objects.equals(this.title, attributeCreateFieldResponseAttributeField.title) &&
        Objects.equals(this.id, attributeCreateFieldResponseAttributeField.id) &&
        Objects.equals(this.fieldType, attributeCreateFieldResponseAttributeField.fieldType) &&
        Objects.equals(this.titleWithType, attributeCreateFieldResponseAttributeField.titleWithType)&&
        Objects.equals(this.additionalProperties, attributeCreateFieldResponseAttributeField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, id, fieldType, titleWithType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeCreateFieldResponseAttributeField {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    titleWithType: ").append(toIndentedString(titleWithType)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("id");
    openapiFields.add("field_type");
    openapiFields.add("title_with_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttributeCreateFieldResponseAttributeField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AttributeCreateFieldResponseAttributeField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttributeCreateFieldResponseAttributeField is not found in the empty JSON string", AttributeCreateFieldResponseAttributeField.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("field_type") != null && !jsonObj.get("field_type").isJsonNull()) && !jsonObj.get("field_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `field_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("field_type").toString()));
      }
      if ((jsonObj.get("title_with_type") != null && !jsonObj.get("title_with_type").isJsonNull()) && !jsonObj.get("title_with_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title_with_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title_with_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttributeCreateFieldResponseAttributeField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttributeCreateFieldResponseAttributeField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttributeCreateFieldResponseAttributeField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttributeCreateFieldResponseAttributeField.class));

       return (TypeAdapter<T>) new TypeAdapter<AttributeCreateFieldResponseAttributeField>() {
           @Override
           public void write(JsonWriter out, AttributeCreateFieldResponseAttributeField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public AttributeCreateFieldResponseAttributeField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AttributeCreateFieldResponseAttributeField instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttributeCreateFieldResponseAttributeField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttributeCreateFieldResponseAttributeField
  * @throws IOException if the JSON string is invalid with respect to AttributeCreateFieldResponseAttributeField
  */
  public static AttributeCreateFieldResponseAttributeField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttributeCreateFieldResponseAttributeField.class);
  }

 /**
  * Convert an instance of AttributeCreateFieldResponseAttributeField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

