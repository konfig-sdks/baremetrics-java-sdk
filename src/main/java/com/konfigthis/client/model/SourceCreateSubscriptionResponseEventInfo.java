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
import com.konfigthis.client.model.SourceCreateSubscriptionResponseEventInfoAddonsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * SourceCreateSubscriptionResponseEventInfo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SourceCreateSubscriptionResponseEventInfo {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_STARTED_AT = "started_at";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private Integer startedAt = 0;

  public static final String SERIALIZED_NAME_PLAN_OID = "plan_oid";
  @SerializedName(SERIALIZED_NAME_PLAN_OID)
  private String planOid;

  public static final String SERIALIZED_NAME_CUSTOMER_OID = "customer_oid";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_OID)
  private String customerOid;

  public static final String SERIALIZED_NAME_CANCELED_AT = "canceled_at";
  @SerializedName(SERIALIZED_NAME_CANCELED_AT)
  private Object canceledAt = null;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity = 0;

  public static final String SERIALIZED_NAME_ADDONS = "addons";
  @SerializedName(SERIALIZED_NAME_ADDONS)
  private List<SourceCreateSubscriptionResponseEventInfoAddonsInner> addons = null;

  public SourceCreateSubscriptionResponseEventInfo() {
  }

  public SourceCreateSubscriptionResponseEventInfo oid(String oid) {
    
    
    
    
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "subscription_51", value = "")

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    
    
    
    this.oid = oid;
  }


  public SourceCreateSubscriptionResponseEventInfo startedAt(Integer startedAt) {
    
    
    
    
    this.startedAt = startedAt;
    return this;
  }

   /**
   * Get startedAt
   * @return startedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1474381618", value = "")

  public Integer getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(Integer startedAt) {
    
    
    
    this.startedAt = startedAt;
  }


  public SourceCreateSubscriptionResponseEventInfo planOid(String planOid) {
    
    
    
    
    this.planOid = planOid;
    return this;
  }

   /**
   * Get planOid
   * @return planOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1476719008009", value = "")

  public String getPlanOid() {
    return planOid;
  }


  public void setPlanOid(String planOid) {
    
    
    
    this.planOid = planOid;
  }


  public SourceCreateSubscriptionResponseEventInfo customerOid(String customerOid) {
    
    
    
    
    this.customerOid = customerOid;
    return this;
  }

   /**
   * Get customerOid
   * @return customerOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1476719006346", value = "")

  public String getCustomerOid() {
    return customerOid;
  }


  public void setCustomerOid(String customerOid) {
    
    
    
    this.customerOid = customerOid;
  }


  public SourceCreateSubscriptionResponseEventInfo canceledAt(Object canceledAt) {
    
    
    
    
    this.canceledAt = canceledAt;
    return this;
  }

   /**
   * Get canceledAt
   * @return canceledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCanceledAt() {
    return canceledAt;
  }


  public void setCanceledAt(Object canceledAt) {
    
    
    
    this.canceledAt = canceledAt;
  }


  public SourceCreateSubscriptionResponseEventInfo quantity(Integer quantity) {
    
    
    
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    
    
    
    this.quantity = quantity;
  }


  public SourceCreateSubscriptionResponseEventInfo addons(List<SourceCreateSubscriptionResponseEventInfoAddonsInner> addons) {
    
    
    
    
    this.addons = addons;
    return this;
  }

  public SourceCreateSubscriptionResponseEventInfo addAddonsItem(SourceCreateSubscriptionResponseEventInfoAddonsInner addonsItem) {
    if (this.addons == null) {
      this.addons = new ArrayList<>();
    }
    this.addons.add(addonsItem);
    return this;
  }

   /**
   * Get addons
   * @return addons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SourceCreateSubscriptionResponseEventInfoAddonsInner> getAddons() {
    return addons;
  }


  public void setAddons(List<SourceCreateSubscriptionResponseEventInfoAddonsInner> addons) {
    
    
    
    this.addons = addons;
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
   * @return the SourceCreateSubscriptionResponseEventInfo instance itself
   */
  public SourceCreateSubscriptionResponseEventInfo putAdditionalProperty(String key, Object value) {
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
    SourceCreateSubscriptionResponseEventInfo sourceCreateSubscriptionResponseEventInfo = (SourceCreateSubscriptionResponseEventInfo) o;
    return Objects.equals(this.oid, sourceCreateSubscriptionResponseEventInfo.oid) &&
        Objects.equals(this.startedAt, sourceCreateSubscriptionResponseEventInfo.startedAt) &&
        Objects.equals(this.planOid, sourceCreateSubscriptionResponseEventInfo.planOid) &&
        Objects.equals(this.customerOid, sourceCreateSubscriptionResponseEventInfo.customerOid) &&
        Objects.equals(this.canceledAt, sourceCreateSubscriptionResponseEventInfo.canceledAt) &&
        Objects.equals(this.quantity, sourceCreateSubscriptionResponseEventInfo.quantity) &&
        Objects.equals(this.addons, sourceCreateSubscriptionResponseEventInfo.addons)&&
        Objects.equals(this.additionalProperties, sourceCreateSubscriptionResponseEventInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, startedAt, planOid, customerOid, canceledAt, quantity, addons, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCreateSubscriptionResponseEventInfo {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    planOid: ").append(toIndentedString(planOid)).append("\n");
    sb.append("    customerOid: ").append(toIndentedString(customerOid)).append("\n");
    sb.append("    canceledAt: ").append(toIndentedString(canceledAt)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
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
    openapiFields.add("oid");
    openapiFields.add("started_at");
    openapiFields.add("plan_oid");
    openapiFields.add("customer_oid");
    openapiFields.add("canceled_at");
    openapiFields.add("quantity");
    openapiFields.add("addons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceCreateSubscriptionResponseEventInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SourceCreateSubscriptionResponseEventInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceCreateSubscriptionResponseEventInfo is not found in the empty JSON string", SourceCreateSubscriptionResponseEventInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("oid") != null && !jsonObj.get("oid").isJsonNull()) && !jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
      if ((jsonObj.get("plan_oid") != null && !jsonObj.get("plan_oid").isJsonNull()) && !jsonObj.get("plan_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan_oid").toString()));
      }
      if ((jsonObj.get("customer_oid") != null && !jsonObj.get("customer_oid").isJsonNull()) && !jsonObj.get("customer_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_oid").toString()));
      }
      if (jsonObj.get("addons") != null && !jsonObj.get("addons").isJsonNull()) {
        JsonArray jsonArrayaddons = jsonObj.getAsJsonArray("addons");
        if (jsonArrayaddons != null) {
          // ensure the json data is an array
          if (!jsonObj.get("addons").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `addons` to be an array in the JSON string but got `%s`", jsonObj.get("addons").toString()));
          }

          // validate the optional field `addons` (array)
          for (int i = 0; i < jsonArrayaddons.size(); i++) {
            SourceCreateSubscriptionResponseEventInfoAddonsInner.validateJsonObject(jsonArrayaddons.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceCreateSubscriptionResponseEventInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceCreateSubscriptionResponseEventInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceCreateSubscriptionResponseEventInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceCreateSubscriptionResponseEventInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceCreateSubscriptionResponseEventInfo>() {
           @Override
           public void write(JsonWriter out, SourceCreateSubscriptionResponseEventInfo value) throws IOException {
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
           public SourceCreateSubscriptionResponseEventInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SourceCreateSubscriptionResponseEventInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SourceCreateSubscriptionResponseEventInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceCreateSubscriptionResponseEventInfo
  * @throws IOException if the JSON string is invalid with respect to SourceCreateSubscriptionResponseEventInfo
  */
  public static SourceCreateSubscriptionResponseEventInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceCreateSubscriptionResponseEventInfo.class);
  }

 /**
  * Convert an instance of SourceCreateSubscriptionResponseEventInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

