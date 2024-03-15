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
import java.time.OffsetDateTime;

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
 * SourceCreateChargeOneOffRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SourceCreateChargeOneOffRequest {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_CUSTOMER_OID = "customer_oid";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_OID)
  private String customerOid;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = "paid";

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private Integer fee = 0;

  public static final String SERIALIZED_NAME_SUBSCRIPTION_OID = "subscription_oid";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_OID)
  private String subscriptionOid;

  public SourceCreateChargeOneOffRequest() {
  }

  public SourceCreateChargeOneOffRequest oid(String oid) {
    
    
    
    
    this.oid = oid;
    return this;
  }

   /**
   * Your unique reference for this charge
   * @return oid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your unique reference for this charge")

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    
    
    
    this.oid = oid;
  }


  public SourceCreateChargeOneOffRequest amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * The charge amount (in cents)
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The charge amount (in cents)")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
  }


  public SourceCreateChargeOneOffRequest currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * The ISO code of the currency of this plan. E.G: usd
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ISO code of the currency of this plan. E.G: usd")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public SourceCreateChargeOneOffRequest customerOid(String customerOid) {
    
    
    
    
    this.customerOid = customerOid;
    return this;
  }

   /**
   * Your unique ID for the customer
   * @return customerOid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your unique ID for the customer")

  public String getCustomerOid() {
    return customerOid;
  }


  public void setCustomerOid(String customerOid) {
    
    
    
    this.customerOid = customerOid;
  }


  public SourceCreateChargeOneOffRequest created(OffsetDateTime created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Unix timestamp of when this was created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unix timestamp of when this was created")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    
    
    
    this.created = created;
  }


  public SourceCreateChargeOneOffRequest status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of this charge. Can be paid or failed. Defaults to paid.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "paid", value = "The status of this charge. Can be paid or failed. Defaults to paid.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public SourceCreateChargeOneOffRequest fee(Integer fee) {
    
    
    
    
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getFee() {
    return fee;
  }


  public void setFee(Integer fee) {
    
    
    
    this.fee = fee;
  }


  public SourceCreateChargeOneOffRequest subscriptionOid(String subscriptionOid) {
    
    
    
    
    this.subscriptionOid = subscriptionOid;
    return this;
  }

   /**
   * This can only be supplied when Subscription Auto Charging is disabled. Please contact support if you want to handle your subscription charges manually.
   * @return subscriptionOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This can only be supplied when Subscription Auto Charging is disabled. Please contact support if you want to handle your subscription charges manually.")

  public String getSubscriptionOid() {
    return subscriptionOid;
  }


  public void setSubscriptionOid(String subscriptionOid) {
    
    
    
    this.subscriptionOid = subscriptionOid;
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
   * @return the SourceCreateChargeOneOffRequest instance itself
   */
  public SourceCreateChargeOneOffRequest putAdditionalProperty(String key, Object value) {
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
    SourceCreateChargeOneOffRequest sourceCreateChargeOneOffRequest = (SourceCreateChargeOneOffRequest) o;
    return Objects.equals(this.oid, sourceCreateChargeOneOffRequest.oid) &&
        Objects.equals(this.amount, sourceCreateChargeOneOffRequest.amount) &&
        Objects.equals(this.currency, sourceCreateChargeOneOffRequest.currency) &&
        Objects.equals(this.customerOid, sourceCreateChargeOneOffRequest.customerOid) &&
        Objects.equals(this.created, sourceCreateChargeOneOffRequest.created) &&
        Objects.equals(this.status, sourceCreateChargeOneOffRequest.status) &&
        Objects.equals(this.fee, sourceCreateChargeOneOffRequest.fee) &&
        Objects.equals(this.subscriptionOid, sourceCreateChargeOneOffRequest.subscriptionOid)&&
        Objects.equals(this.additionalProperties, sourceCreateChargeOneOffRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, amount, currency, customerOid, created, status, fee, subscriptionOid, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCreateChargeOneOffRequest {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerOid: ").append(toIndentedString(customerOid)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    subscriptionOid: ").append(toIndentedString(subscriptionOid)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("currency");
    openapiFields.add("customer_oid");
    openapiFields.add("created");
    openapiFields.add("status");
    openapiFields.add("fee");
    openapiFields.add("subscription_oid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("oid");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("customer_oid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceCreateChargeOneOffRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SourceCreateChargeOneOffRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceCreateChargeOneOffRequest is not found in the empty JSON string", SourceCreateChargeOneOffRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SourceCreateChargeOneOffRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("customer_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_oid").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("subscription_oid") != null && !jsonObj.get("subscription_oid").isJsonNull()) && !jsonObj.get("subscription_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subscription_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subscription_oid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceCreateChargeOneOffRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceCreateChargeOneOffRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceCreateChargeOneOffRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceCreateChargeOneOffRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceCreateChargeOneOffRequest>() {
           @Override
           public void write(JsonWriter out, SourceCreateChargeOneOffRequest value) throws IOException {
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
           public SourceCreateChargeOneOffRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SourceCreateChargeOneOffRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SourceCreateChargeOneOffRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceCreateChargeOneOffRequest
  * @throws IOException if the JSON string is invalid with respect to SourceCreateChargeOneOffRequest
  */
  public static SourceCreateChargeOneOffRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceCreateChargeOneOffRequest.class);
  }

 /**
  * Convert an instance of SourceCreateChargeOneOffRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

