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
 * SourceCreateOneOffRefundRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SourceCreateOneOffRefundRequest {
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

  public static final String SERIALIZED_NAME_CHARGE_OID = "charge_oid";
  @SerializedName(SERIALIZED_NAME_CHARGE_OID)
  private String chargeOid;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public SourceCreateOneOffRefundRequest() {
  }

  public SourceCreateOneOffRefundRequest oid(String oid) {
    
    
    
    
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


  public SourceCreateOneOffRefundRequest amount(Integer amount) {
    
    
    
    
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


  public SourceCreateOneOffRefundRequest currency(String currency) {
    
    
    
    
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


  public SourceCreateOneOffRefundRequest customerOid(String customerOid) {
    
    
    
    
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


  public SourceCreateOneOffRefundRequest chargeOid(String chargeOid) {
    
    
    
    
    this.chargeOid = chargeOid;
    return this;
  }

   /**
   * Which charge do you want to refund? This must be an API charge.
   * @return chargeOid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Which charge do you want to refund? This must be an API charge.")

  public String getChargeOid() {
    return chargeOid;
  }


  public void setChargeOid(String chargeOid) {
    
    
    
    this.chargeOid = chargeOid;
  }


  public SourceCreateOneOffRefundRequest created(OffsetDateTime created) {
    
    
    
    
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
   * @return the SourceCreateOneOffRefundRequest instance itself
   */
  public SourceCreateOneOffRefundRequest putAdditionalProperty(String key, Object value) {
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
    SourceCreateOneOffRefundRequest sourceCreateOneOffRefundRequest = (SourceCreateOneOffRefundRequest) o;
    return Objects.equals(this.oid, sourceCreateOneOffRefundRequest.oid) &&
        Objects.equals(this.amount, sourceCreateOneOffRefundRequest.amount) &&
        Objects.equals(this.currency, sourceCreateOneOffRefundRequest.currency) &&
        Objects.equals(this.customerOid, sourceCreateOneOffRefundRequest.customerOid) &&
        Objects.equals(this.chargeOid, sourceCreateOneOffRefundRequest.chargeOid) &&
        Objects.equals(this.created, sourceCreateOneOffRefundRequest.created)&&
        Objects.equals(this.additionalProperties, sourceCreateOneOffRefundRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, amount, currency, customerOid, chargeOid, created, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCreateOneOffRefundRequest {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    customerOid: ").append(toIndentedString(customerOid)).append("\n");
    sb.append("    chargeOid: ").append(toIndentedString(chargeOid)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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
    openapiFields.add("charge_oid");
    openapiFields.add("created");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("oid");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("customer_oid");
    openapiRequiredFields.add("charge_oid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceCreateOneOffRefundRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SourceCreateOneOffRefundRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceCreateOneOffRefundRequest is not found in the empty JSON string", SourceCreateOneOffRefundRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SourceCreateOneOffRefundRequest.openapiRequiredFields) {
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
      if (!jsonObj.get("charge_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_oid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceCreateOneOffRefundRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceCreateOneOffRefundRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceCreateOneOffRefundRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceCreateOneOffRefundRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceCreateOneOffRefundRequest>() {
           @Override
           public void write(JsonWriter out, SourceCreateOneOffRefundRequest value) throws IOException {
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
           public SourceCreateOneOffRefundRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SourceCreateOneOffRefundRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SourceCreateOneOffRefundRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceCreateOneOffRefundRequest
  * @throws IOException if the JSON string is invalid with respect to SourceCreateOneOffRefundRequest
  */
  public static SourceCreateOneOffRefundRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceCreateOneOffRefundRequest.class);
  }

 /**
  * Convert an instance of SourceCreateOneOffRefundRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

