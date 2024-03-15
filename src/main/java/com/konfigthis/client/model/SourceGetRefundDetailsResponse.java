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
import com.konfigthis.client.model.SourceGetRefundDetailsResponseCustomer;
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
 * SourceGetRefundDetailsResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SourceGetRefundDetailsResponse {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_CHARGE_OID = "charge_oid";
  @SerializedName(SERIALIZED_NAME_CHARGE_OID)
  private String chargeOid;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created = 0;

  public static final String SERIALIZED_NAME_CUSTOMER = "customer";
  @SerializedName(SERIALIZED_NAME_CUSTOMER)
  private SourceGetRefundDetailsResponseCustomer customer;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount = 0;

  public SourceGetRefundDetailsResponse() {
  }

  public SourceGetRefundDetailsResponse oid(String oid) {
    
    
    
    
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your_unique_id", value = "")

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    
    
    
    this.oid = oid;
  }


  public SourceGetRefundDetailsResponse sourceId(String sourceId) {
    
    
    
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "source_id", value = "")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    
    
    
    this.sourceId = sourceId;
  }


  public SourceGetRefundDetailsResponse source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "stripe", value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public SourceGetRefundDetailsResponse chargeOid(String chargeOid) {
    
    
    
    
    this.chargeOid = chargeOid;
    return this;
  }

   /**
   * Get chargeOid
   * @return chargeOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "charge_oid", value = "")

  public String getChargeOid() {
    return chargeOid;
  }


  public void setChargeOid(String chargeOid) {
    
    
    
    this.chargeOid = chargeOid;
  }


  public SourceGetRefundDetailsResponse created(Integer created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1510789071", value = "")

  public Integer getCreated() {
    return created;
  }


  public void setCreated(Integer created) {
    
    
    
    this.created = created;
  }


  public SourceGetRefundDetailsResponse customer(SourceGetRefundDetailsResponseCustomer customer) {
    
    
    
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceGetRefundDetailsResponseCustomer getCustomer() {
    return customer;
  }


  public void setCustomer(SourceGetRefundDetailsResponseCustomer customer) {
    
    
    
    this.customer = customer;
  }


  public SourceGetRefundDetailsResponse amount(Integer amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8700", value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    
    
    
    this.amount = amount;
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
   * @return the SourceGetRefundDetailsResponse instance itself
   */
  public SourceGetRefundDetailsResponse putAdditionalProperty(String key, Object value) {
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
    SourceGetRefundDetailsResponse sourceGetRefundDetailsResponse = (SourceGetRefundDetailsResponse) o;
    return Objects.equals(this.oid, sourceGetRefundDetailsResponse.oid) &&
        Objects.equals(this.sourceId, sourceGetRefundDetailsResponse.sourceId) &&
        Objects.equals(this.source, sourceGetRefundDetailsResponse.source) &&
        Objects.equals(this.chargeOid, sourceGetRefundDetailsResponse.chargeOid) &&
        Objects.equals(this.created, sourceGetRefundDetailsResponse.created) &&
        Objects.equals(this.customer, sourceGetRefundDetailsResponse.customer) &&
        Objects.equals(this.amount, sourceGetRefundDetailsResponse.amount)&&
        Objects.equals(this.additionalProperties, sourceGetRefundDetailsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, sourceId, source, chargeOid, created, customer, amount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceGetRefundDetailsResponse {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    chargeOid: ").append(toIndentedString(chargeOid)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("source_id");
    openapiFields.add("source");
    openapiFields.add("charge_oid");
    openapiFields.add("created");
    openapiFields.add("customer");
    openapiFields.add("amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceGetRefundDetailsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SourceGetRefundDetailsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceGetRefundDetailsResponse is not found in the empty JSON string", SourceGetRefundDetailsResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("oid") != null && !jsonObj.get("oid").isJsonNull()) && !jsonObj.get("oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oid").toString()));
      }
      if ((jsonObj.get("source_id") != null && !jsonObj.get("source_id").isJsonNull()) && !jsonObj.get("source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_id").toString()));
      }
      if ((jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) && !jsonObj.get("source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source").toString()));
      }
      if ((jsonObj.get("charge_oid") != null && !jsonObj.get("charge_oid").isJsonNull()) && !jsonObj.get("charge_oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_oid").toString()));
      }
      // validate the optional field `customer`
      if (jsonObj.get("customer") != null && !jsonObj.get("customer").isJsonNull()) {
        SourceGetRefundDetailsResponseCustomer.validateJsonObject(jsonObj.getAsJsonObject("customer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceGetRefundDetailsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceGetRefundDetailsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceGetRefundDetailsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceGetRefundDetailsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceGetRefundDetailsResponse>() {
           @Override
           public void write(JsonWriter out, SourceGetRefundDetailsResponse value) throws IOException {
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
           public SourceGetRefundDetailsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SourceGetRefundDetailsResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SourceGetRefundDetailsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceGetRefundDetailsResponse
  * @throws IOException if the JSON string is invalid with respect to SourceGetRefundDetailsResponse
  */
  public static SourceGetRefundDetailsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceGetRefundDetailsResponse.class);
  }

 /**
  * Convert an instance of SourceGetRefundDetailsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

