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
 * MetricShowCohortsResponseInnerCellsInnerRevenue
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetricShowCohortsResponseInnerCellsInnerRevenue {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total = 0;

  public static final String SERIALIZED_NAME_ABSOLUTE = "absolute";
  @SerializedName(SERIALIZED_NAME_ABSOLUTE)
  private Integer absolute = 0;

  public static final String SERIALIZED_NAME_PERCENTAGE = "percentage";
  @SerializedName(SERIALIZED_NAME_PERCENTAGE)
  private Double percentage = 0d;

  public static final String SERIALIZED_NAME_ABSOLUTE_FORMATTED = "absolute_formatted";
  @SerializedName(SERIALIZED_NAME_ABSOLUTE_FORMATTED)
  private String absoluteFormatted;

  public static final String SERIALIZED_NAME_TOTAL_FORMATTED = "total_formatted";
  @SerializedName(SERIALIZED_NAME_TOTAL_FORMATTED)
  private String totalFormatted;

  public MetricShowCohortsResponseInnerCellsInnerRevenue() {
  }

  public MetricShowCohortsResponseInnerCellsInnerRevenue total(Integer total) {
    
    
    
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "569521", value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    
    
    
    this.total = total;
  }


  public MetricShowCohortsResponseInnerCellsInnerRevenue absolute(Integer absolute) {
    
    
    
    
    this.absolute = absolute;
    return this;
  }

   /**
   * Get absolute
   * @return absolute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "554122", value = "")

  public Integer getAbsolute() {
    return absolute;
  }


  public void setAbsolute(Integer absolute) {
    
    
    
    this.absolute = absolute;
  }


  public MetricShowCohortsResponseInnerCellsInnerRevenue percentage(Double percentage) {
    
    
    
    
    this.percentage = percentage;
    return this;
  }

  public MetricShowCohortsResponseInnerCellsInnerRevenue percentage(Integer percentage) {
    
    
    
    
    this.percentage = percentage.doubleValue();
    return this;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.97", value = "")

  public Double getPercentage() {
    return percentage;
  }


  public void setPercentage(Double percentage) {
    
    
    
    this.percentage = percentage;
  }


  public MetricShowCohortsResponseInnerCellsInnerRevenue absoluteFormatted(String absoluteFormatted) {
    
    
    
    
    this.absoluteFormatted = absoluteFormatted;
    return this;
  }

   /**
   * Get absoluteFormatted
   * @return absoluteFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "$5,541", value = "")

  public String getAbsoluteFormatted() {
    return absoluteFormatted;
  }


  public void setAbsoluteFormatted(String absoluteFormatted) {
    
    
    
    this.absoluteFormatted = absoluteFormatted;
  }


  public MetricShowCohortsResponseInnerCellsInnerRevenue totalFormatted(String totalFormatted) {
    
    
    
    
    this.totalFormatted = totalFormatted;
    return this;
  }

   /**
   * Get totalFormatted
   * @return totalFormatted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "$569,521", value = "")

  public String getTotalFormatted() {
    return totalFormatted;
  }


  public void setTotalFormatted(String totalFormatted) {
    
    
    
    this.totalFormatted = totalFormatted;
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
   * @return the MetricShowCohortsResponseInnerCellsInnerRevenue instance itself
   */
  public MetricShowCohortsResponseInnerCellsInnerRevenue putAdditionalProperty(String key, Object value) {
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
    MetricShowCohortsResponseInnerCellsInnerRevenue metricShowCohortsResponseInnerCellsInnerRevenue = (MetricShowCohortsResponseInnerCellsInnerRevenue) o;
    return Objects.equals(this.total, metricShowCohortsResponseInnerCellsInnerRevenue.total) &&
        Objects.equals(this.absolute, metricShowCohortsResponseInnerCellsInnerRevenue.absolute) &&
        Objects.equals(this.percentage, metricShowCohortsResponseInnerCellsInnerRevenue.percentage) &&
        Objects.equals(this.absoluteFormatted, metricShowCohortsResponseInnerCellsInnerRevenue.absoluteFormatted) &&
        Objects.equals(this.totalFormatted, metricShowCohortsResponseInnerCellsInnerRevenue.totalFormatted)&&
        Objects.equals(this.additionalProperties, metricShowCohortsResponseInnerCellsInnerRevenue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, absolute, percentage, absoluteFormatted, totalFormatted, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricShowCohortsResponseInnerCellsInnerRevenue {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    absoluteFormatted: ").append(toIndentedString(absoluteFormatted)).append("\n");
    sb.append("    totalFormatted: ").append(toIndentedString(totalFormatted)).append("\n");
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
    openapiFields.add("total");
    openapiFields.add("absolute");
    openapiFields.add("percentage");
    openapiFields.add("absolute_formatted");
    openapiFields.add("total_formatted");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetricShowCohortsResponseInnerCellsInnerRevenue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetricShowCohortsResponseInnerCellsInnerRevenue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricShowCohortsResponseInnerCellsInnerRevenue is not found in the empty JSON string", MetricShowCohortsResponseInnerCellsInnerRevenue.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("absolute_formatted") != null && !jsonObj.get("absolute_formatted").isJsonNull()) && !jsonObj.get("absolute_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `absolute_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("absolute_formatted").toString()));
      }
      if ((jsonObj.get("total_formatted") != null && !jsonObj.get("total_formatted").isJsonNull()) && !jsonObj.get("total_formatted").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_formatted` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_formatted").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricShowCohortsResponseInnerCellsInnerRevenue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricShowCohortsResponseInnerCellsInnerRevenue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricShowCohortsResponseInnerCellsInnerRevenue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricShowCohortsResponseInnerCellsInnerRevenue.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricShowCohortsResponseInnerCellsInnerRevenue>() {
           @Override
           public void write(JsonWriter out, MetricShowCohortsResponseInnerCellsInnerRevenue value) throws IOException {
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
           public MetricShowCohortsResponseInnerCellsInnerRevenue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetricShowCohortsResponseInnerCellsInnerRevenue instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetricShowCohortsResponseInnerCellsInnerRevenue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetricShowCohortsResponseInnerCellsInnerRevenue
  * @throws IOException if the JSON string is invalid with respect to MetricShowCohortsResponseInnerCellsInnerRevenue
  */
  public static MetricShowCohortsResponseInnerCellsInnerRevenue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricShowCohortsResponseInnerCellsInnerRevenue.class);
  }

 /**
  * Convert an instance of MetricShowCohortsResponseInnerCellsInnerRevenue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

