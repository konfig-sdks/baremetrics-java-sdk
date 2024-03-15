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
import com.konfigthis.client.model.SourceUpdatePlanResponsePlanAmountsInner;
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
 * SourceUpdatePlanResponsePlan
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SourceUpdatePlanResponsePlan {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INTERVAL = "interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private String interval;

  public static final String SERIALIZED_NAME_INTERVAL_COUNT = "interval_count";
  @SerializedName(SERIALIZED_NAME_INTERVAL_COUNT)
  private Integer intervalCount = 0;

  public static final String SERIALIZED_NAME_TRIAL_DURATION = "trial_duration";
  @SerializedName(SERIALIZED_NAME_TRIAL_DURATION)
  private Object trialDuration = null;

  public static final String SERIALIZED_NAME_TRIAL_DURATION_UNIT = "trial_duration_unit";
  @SerializedName(SERIALIZED_NAME_TRIAL_DURATION_UNIT)
  private Object trialDurationUnit = null;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Object created = null;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_SETUP_FEES = "setup_fees";
  @SerializedName(SERIALIZED_NAME_SETUP_FEES)
  private Integer setupFees = 0;

  public static final String SERIALIZED_NAME_AMOUNTS = "amounts";
  @SerializedName(SERIALIZED_NAME_AMOUNTS)
  private List<SourceUpdatePlanResponsePlanAmountsInner> amounts = null;

  public SourceUpdatePlanResponsePlan() {
  }

  public SourceUpdatePlanResponsePlan oid(String oid) {
    
    
    
    
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "plan_2", value = "")

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    
    
    
    this.oid = oid;
  }


  public SourceUpdatePlanResponsePlan sourceId(String sourceId) {
    
    
    
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    
    
    
    this.sourceId = sourceId;
  }


  public SourceUpdatePlanResponsePlan source(String source) {
    
    
    
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "baremetrics", value = "")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    
    
    
    this.source = source;
  }


  public SourceUpdatePlanResponsePlan name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Plan 2", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public SourceUpdatePlanResponsePlan interval(String interval) {
    
    
    
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "year", value = "")

  public String getInterval() {
    return interval;
  }


  public void setInterval(String interval) {
    
    
    
    this.interval = interval;
  }


  public SourceUpdatePlanResponsePlan intervalCount(Integer intervalCount) {
    
    
    
    
    this.intervalCount = intervalCount;
    return this;
  }

   /**
   * Get intervalCount
   * @return intervalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getIntervalCount() {
    return intervalCount;
  }


  public void setIntervalCount(Integer intervalCount) {
    
    
    
    this.intervalCount = intervalCount;
  }


  public SourceUpdatePlanResponsePlan trialDuration(Object trialDuration) {
    
    
    
    
    this.trialDuration = trialDuration;
    return this;
  }

   /**
   * Get trialDuration
   * @return trialDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTrialDuration() {
    return trialDuration;
  }


  public void setTrialDuration(Object trialDuration) {
    
    
    
    this.trialDuration = trialDuration;
  }


  public SourceUpdatePlanResponsePlan trialDurationUnit(Object trialDurationUnit) {
    
    
    
    
    this.trialDurationUnit = trialDurationUnit;
    return this;
  }

   /**
   * Get trialDurationUnit
   * @return trialDurationUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getTrialDurationUnit() {
    return trialDurationUnit;
  }


  public void setTrialDurationUnit(Object trialDurationUnit) {
    
    
    
    this.trialDurationUnit = trialDurationUnit;
  }


  public SourceUpdatePlanResponsePlan created(Object created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCreated() {
    return created;
  }


  public void setCreated(Object created) {
    
    
    
    this.created = created;
  }


  public SourceUpdatePlanResponsePlan active(Boolean active) {
    
    
    
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    
    
    
    this.active = active;
  }


  public SourceUpdatePlanResponsePlan setupFees(Integer setupFees) {
    
    
    
    
    this.setupFees = setupFees;
    return this;
  }

   /**
   * Get setupFees
   * @return setupFees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getSetupFees() {
    return setupFees;
  }


  public void setSetupFees(Integer setupFees) {
    
    
    
    this.setupFees = setupFees;
  }


  public SourceUpdatePlanResponsePlan amounts(List<SourceUpdatePlanResponsePlanAmountsInner> amounts) {
    
    
    
    
    this.amounts = amounts;
    return this;
  }

  public SourceUpdatePlanResponsePlan addAmountsItem(SourceUpdatePlanResponsePlanAmountsInner amountsItem) {
    if (this.amounts == null) {
      this.amounts = new ArrayList<>();
    }
    this.amounts.add(amountsItem);
    return this;
  }

   /**
   * Get amounts
   * @return amounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SourceUpdatePlanResponsePlanAmountsInner> getAmounts() {
    return amounts;
  }


  public void setAmounts(List<SourceUpdatePlanResponsePlanAmountsInner> amounts) {
    
    
    
    this.amounts = amounts;
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
   * @return the SourceUpdatePlanResponsePlan instance itself
   */
  public SourceUpdatePlanResponsePlan putAdditionalProperty(String key, Object value) {
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
    SourceUpdatePlanResponsePlan sourceUpdatePlanResponsePlan = (SourceUpdatePlanResponsePlan) o;
    return Objects.equals(this.oid, sourceUpdatePlanResponsePlan.oid) &&
        Objects.equals(this.sourceId, sourceUpdatePlanResponsePlan.sourceId) &&
        Objects.equals(this.source, sourceUpdatePlanResponsePlan.source) &&
        Objects.equals(this.name, sourceUpdatePlanResponsePlan.name) &&
        Objects.equals(this.interval, sourceUpdatePlanResponsePlan.interval) &&
        Objects.equals(this.intervalCount, sourceUpdatePlanResponsePlan.intervalCount) &&
        Objects.equals(this.trialDuration, sourceUpdatePlanResponsePlan.trialDuration) &&
        Objects.equals(this.trialDurationUnit, sourceUpdatePlanResponsePlan.trialDurationUnit) &&
        Objects.equals(this.created, sourceUpdatePlanResponsePlan.created) &&
        Objects.equals(this.active, sourceUpdatePlanResponsePlan.active) &&
        Objects.equals(this.setupFees, sourceUpdatePlanResponsePlan.setupFees) &&
        Objects.equals(this.amounts, sourceUpdatePlanResponsePlan.amounts)&&
        Objects.equals(this.additionalProperties, sourceUpdatePlanResponsePlan.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, sourceId, source, name, interval, intervalCount, trialDuration, trialDurationUnit, created, active, setupFees, amounts, additionalProperties);
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
    sb.append("class SourceUpdatePlanResponsePlan {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    intervalCount: ").append(toIndentedString(intervalCount)).append("\n");
    sb.append("    trialDuration: ").append(toIndentedString(trialDuration)).append("\n");
    sb.append("    trialDurationUnit: ").append(toIndentedString(trialDurationUnit)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    setupFees: ").append(toIndentedString(setupFees)).append("\n");
    sb.append("    amounts: ").append(toIndentedString(amounts)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("interval");
    openapiFields.add("interval_count");
    openapiFields.add("trial_duration");
    openapiFields.add("trial_duration_unit");
    openapiFields.add("created");
    openapiFields.add("active");
    openapiFields.add("setup_fees");
    openapiFields.add("amounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SourceUpdatePlanResponsePlan
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SourceUpdatePlanResponsePlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SourceUpdatePlanResponsePlan is not found in the empty JSON string", SourceUpdatePlanResponsePlan.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("interval") != null && !jsonObj.get("interval").isJsonNull()) && !jsonObj.get("interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("interval").toString()));
      }
      if (jsonObj.get("amounts") != null && !jsonObj.get("amounts").isJsonNull()) {
        JsonArray jsonArrayamounts = jsonObj.getAsJsonArray("amounts");
        if (jsonArrayamounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("amounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `amounts` to be an array in the JSON string but got `%s`", jsonObj.get("amounts").toString()));
          }

          // validate the optional field `amounts` (array)
          for (int i = 0; i < jsonArrayamounts.size(); i++) {
            SourceUpdatePlanResponsePlanAmountsInner.validateJsonObject(jsonArrayamounts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SourceUpdatePlanResponsePlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SourceUpdatePlanResponsePlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SourceUpdatePlanResponsePlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SourceUpdatePlanResponsePlan.class));

       return (TypeAdapter<T>) new TypeAdapter<SourceUpdatePlanResponsePlan>() {
           @Override
           public void write(JsonWriter out, SourceUpdatePlanResponsePlan value) throws IOException {
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
           public SourceUpdatePlanResponsePlan read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SourceUpdatePlanResponsePlan instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SourceUpdatePlanResponsePlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SourceUpdatePlanResponsePlan
  * @throws IOException if the JSON string is invalid with respect to SourceUpdatePlanResponsePlan
  */
  public static SourceUpdatePlanResponsePlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SourceUpdatePlanResponsePlan.class);
  }

 /**
  * Convert an instance of SourceUpdatePlanResponsePlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

