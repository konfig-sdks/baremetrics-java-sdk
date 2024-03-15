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
import com.konfigthis.client.model.AnnotationGetDetailsResponseAnnotationUser;
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
 * AnnotationGetDetailsResponseAnnotation
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnnotationGetDetailsResponseAnnotation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private String metric;

  public static final String SERIALIZED_NAME_ANNOTATION = "annotation";
  @SerializedName(SERIALIZED_NAME_ANNOTATION)
  private String annotation;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_GLOBAL = "global";
  @SerializedName(SERIALIZED_NAME_GLOBAL)
  private Boolean global = true;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private AnnotationGetDetailsResponseAnnotationUser user;

  public AnnotationGetDetailsResponseAnnotation() {
  }

  public AnnotationGetDetailsResponseAnnotation id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "our_unique_id", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public AnnotationGetDetailsResponseAnnotation metric(String metric) {
    
    
    
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mrr", value = "")

  public String getMetric() {
    return metric;
  }


  public void setMetric(String metric) {
    
    
    
    this.metric = metric;
  }


  public AnnotationGetDetailsResponseAnnotation annotation(String annotation) {
    
    
    
    
    this.annotation = annotation;
    return this;
  }

   /**
   * Get annotation
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "New Feature 1", value = "")

  public String getAnnotation() {
    return annotation;
  }


  public void setAnnotation(String annotation) {
    
    
    
    this.annotation = annotation;
  }


  public AnnotationGetDetailsResponseAnnotation date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-03-31", value = "")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public AnnotationGetDetailsResponseAnnotation global(Boolean global) {
    
    
    
    
    this.global = global;
    return this;
  }

   /**
   * Get global
   * @return global
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getGlobal() {
    return global;
  }


  public void setGlobal(Boolean global) {
    
    
    
    this.global = global;
  }


  public AnnotationGetDetailsResponseAnnotation user(AnnotationGetDetailsResponseAnnotationUser user) {
    
    
    
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AnnotationGetDetailsResponseAnnotationUser getUser() {
    return user;
  }


  public void setUser(AnnotationGetDetailsResponseAnnotationUser user) {
    
    
    
    this.user = user;
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
   * @return the AnnotationGetDetailsResponseAnnotation instance itself
   */
  public AnnotationGetDetailsResponseAnnotation putAdditionalProperty(String key, Object value) {
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
    AnnotationGetDetailsResponseAnnotation annotationGetDetailsResponseAnnotation = (AnnotationGetDetailsResponseAnnotation) o;
    return Objects.equals(this.id, annotationGetDetailsResponseAnnotation.id) &&
        Objects.equals(this.metric, annotationGetDetailsResponseAnnotation.metric) &&
        Objects.equals(this.annotation, annotationGetDetailsResponseAnnotation.annotation) &&
        Objects.equals(this.date, annotationGetDetailsResponseAnnotation.date) &&
        Objects.equals(this.global, annotationGetDetailsResponseAnnotation.global) &&
        Objects.equals(this.user, annotationGetDetailsResponseAnnotation.user)&&
        Objects.equals(this.additionalProperties, annotationGetDetailsResponseAnnotation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, metric, annotation, date, global, user, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationGetDetailsResponseAnnotation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("metric");
    openapiFields.add("annotation");
    openapiFields.add("date");
    openapiFields.add("global");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnnotationGetDetailsResponseAnnotation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnnotationGetDetailsResponseAnnotation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnnotationGetDetailsResponseAnnotation is not found in the empty JSON string", AnnotationGetDetailsResponseAnnotation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("metric") != null && !jsonObj.get("metric").isJsonNull()) && !jsonObj.get("metric").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `metric` to be a primitive type in the JSON string but got `%s`", jsonObj.get("metric").toString()));
      }
      if ((jsonObj.get("annotation") != null && !jsonObj.get("annotation").isJsonNull()) && !jsonObj.get("annotation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `annotation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("annotation").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        AnnotationGetDetailsResponseAnnotationUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnnotationGetDetailsResponseAnnotation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnnotationGetDetailsResponseAnnotation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnnotationGetDetailsResponseAnnotation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnnotationGetDetailsResponseAnnotation.class));

       return (TypeAdapter<T>) new TypeAdapter<AnnotationGetDetailsResponseAnnotation>() {
           @Override
           public void write(JsonWriter out, AnnotationGetDetailsResponseAnnotation value) throws IOException {
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
           public AnnotationGetDetailsResponseAnnotation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnnotationGetDetailsResponseAnnotation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnnotationGetDetailsResponseAnnotation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnnotationGetDetailsResponseAnnotation
  * @throws IOException if the JSON string is invalid with respect to AnnotationGetDetailsResponseAnnotation
  */
  public static AnnotationGetDetailsResponseAnnotation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnnotationGetDetailsResponseAnnotation.class);
  }

 /**
  * Convert an instance of AnnotationGetDetailsResponseAnnotation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

