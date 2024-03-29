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
 * EventListCancellationInsightEventsResponseEventsInnerCustomer
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EventListCancellationInsightEventsResponseEventsInnerCustomer {
  public static final String SERIALIZED_NAME_OID = "oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_SOURCE_ID = "source_id";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Integer created = 0;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_IMAGE = "display_image";
  @SerializedName(SERIALIZED_NAME_DISPLAY_IMAGE)
  private String displayImage;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "display_name";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_NOTES = "notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private Object notes = null;

  public static final String SERIALIZED_NAME_LTV = "ltv";
  @SerializedName(SERIALIZED_NAME_LTV)
  private Integer ltv = 0;

  public EventListCancellationInsightEventsResponseEventsInnerCustomer() {
  }

  public EventListCancellationInsightEventsResponseEventsInnerCustomer oid(String oid) {
    
    
    
    
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "customer_1", value = "")

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    
    
    
    this.oid = oid;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer sourceId(String sourceId) {
    
    
    
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    
    
    
    this.sourceId = sourceId;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer source(String source) {
    
    
    
    
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


  public EventListCancellationInsightEventsResponseEventsInnerCustomer created(Integer created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1538422031", value = "")

  public Integer getCreated() {
    return created;
  }


  public void setCreated(Integer created) {
    
    
    
    this.created = created;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "email@example.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Customer 1", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer displayImage(String displayImage) {
    
    
    
    
    this.displayImage = displayImage;
    return this;
  }

   /**
   * Get displayImage
   * @return displayImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://logo.clearbit.com/example.com", value = "")

  public String getDisplayImage() {
    return displayImage;
  }


  public void setDisplayImage(String displayImage) {
    
    
    
    this.displayImage = displayImage;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer displayName(String displayName) {
    
    
    
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Customer 1", value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    
    
    
    this.displayName = displayName;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer notes(Object notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getNotes() {
    return notes;
  }


  public void setNotes(Object notes) {
    
    
    
    this.notes = notes;
  }


  public EventListCancellationInsightEventsResponseEventsInnerCustomer ltv(Integer ltv) {
    
    
    
    
    this.ltv = ltv;
    return this;
  }

   /**
   * Get ltv
   * @return ltv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getLtv() {
    return ltv;
  }


  public void setLtv(Integer ltv) {
    
    
    
    this.ltv = ltv;
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
   * @return the EventListCancellationInsightEventsResponseEventsInnerCustomer instance itself
   */
  public EventListCancellationInsightEventsResponseEventsInnerCustomer putAdditionalProperty(String key, Object value) {
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
    EventListCancellationInsightEventsResponseEventsInnerCustomer eventListCancellationInsightEventsResponseEventsInnerCustomer = (EventListCancellationInsightEventsResponseEventsInnerCustomer) o;
    return Objects.equals(this.oid, eventListCancellationInsightEventsResponseEventsInnerCustomer.oid) &&
        Objects.equals(this.sourceId, eventListCancellationInsightEventsResponseEventsInnerCustomer.sourceId) &&
        Objects.equals(this.source, eventListCancellationInsightEventsResponseEventsInnerCustomer.source) &&
        Objects.equals(this.created, eventListCancellationInsightEventsResponseEventsInnerCustomer.created) &&
        Objects.equals(this.email, eventListCancellationInsightEventsResponseEventsInnerCustomer.email) &&
        Objects.equals(this.name, eventListCancellationInsightEventsResponseEventsInnerCustomer.name) &&
        Objects.equals(this.displayImage, eventListCancellationInsightEventsResponseEventsInnerCustomer.displayImage) &&
        Objects.equals(this.displayName, eventListCancellationInsightEventsResponseEventsInnerCustomer.displayName) &&
        Objects.equals(this.notes, eventListCancellationInsightEventsResponseEventsInnerCustomer.notes) &&
        Objects.equals(this.ltv, eventListCancellationInsightEventsResponseEventsInnerCustomer.ltv)&&
        Objects.equals(this.additionalProperties, eventListCancellationInsightEventsResponseEventsInnerCustomer.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(oid, sourceId, source, created, email, name, displayImage, displayName, notes, ltv, additionalProperties);
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
    sb.append("class EventListCancellationInsightEventsResponseEventsInnerCustomer {\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayImage: ").append(toIndentedString(displayImage)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    ltv: ").append(toIndentedString(ltv)).append("\n");
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
    openapiFields.add("created");
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("display_image");
    openapiFields.add("display_name");
    openapiFields.add("notes");
    openapiFields.add("ltv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventListCancellationInsightEventsResponseEventsInnerCustomer
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EventListCancellationInsightEventsResponseEventsInnerCustomer.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventListCancellationInsightEventsResponseEventsInnerCustomer is not found in the empty JSON string", EventListCancellationInsightEventsResponseEventsInnerCustomer.openapiRequiredFields.toString()));
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
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("display_image") != null && !jsonObj.get("display_image").isJsonNull()) && !jsonObj.get("display_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_image").toString()));
      }
      if ((jsonObj.get("display_name") != null && !jsonObj.get("display_name").isJsonNull()) && !jsonObj.get("display_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `display_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("display_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventListCancellationInsightEventsResponseEventsInnerCustomer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventListCancellationInsightEventsResponseEventsInnerCustomer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventListCancellationInsightEventsResponseEventsInnerCustomer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventListCancellationInsightEventsResponseEventsInnerCustomer.class));

       return (TypeAdapter<T>) new TypeAdapter<EventListCancellationInsightEventsResponseEventsInnerCustomer>() {
           @Override
           public void write(JsonWriter out, EventListCancellationInsightEventsResponseEventsInnerCustomer value) throws IOException {
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
           public EventListCancellationInsightEventsResponseEventsInnerCustomer read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EventListCancellationInsightEventsResponseEventsInnerCustomer instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EventListCancellationInsightEventsResponseEventsInnerCustomer given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventListCancellationInsightEventsResponseEventsInnerCustomer
  * @throws IOException if the JSON string is invalid with respect to EventListCancellationInsightEventsResponseEventsInnerCustomer
  */
  public static EventListCancellationInsightEventsResponseEventsInnerCustomer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventListCancellationInsightEventsResponseEventsInnerCustomer.class);
  }

 /**
  * Convert an instance of EventListCancellationInsightEventsResponseEventsInnerCustomer to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

