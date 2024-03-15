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
 * MetricShowSummaryResponseMetricsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetricShowSummaryResponseMetricsInner {
  public static final String SERIALIZED_NAME_HUMAN_DATE = "human_date";
  @SerializedName(SERIALIZED_NAME_HUMAN_DATE)
  private String humanDate;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private Integer date = 0;

  public static final String SERIALIZED_NAME_ACTIVE_CUSTOMERS = "active_customers";
  @SerializedName(SERIALIZED_NAME_ACTIVE_CUSTOMERS)
  private Integer activeCustomers = 0;

  public static final String SERIALIZED_NAME_ACTIVE_SUBSCRIPTIONS = "active_subscriptions";
  @SerializedName(SERIALIZED_NAME_ACTIVE_SUBSCRIPTIONS)
  private Integer activeSubscriptions = 0;

  public static final String SERIALIZED_NAME_ADD_ON_MRR = "add_on_mrr";
  @SerializedName(SERIALIZED_NAME_ADD_ON_MRR)
  private Integer addOnMrr = 0;

  public static final String SERIALIZED_NAME_ARPU = "arpu";
  @SerializedName(SERIALIZED_NAME_ARPU)
  private Integer arpu = 0;

  public static final String SERIALIZED_NAME_ARR = "arr";
  @SerializedName(SERIALIZED_NAME_ARR)
  private Integer arr = 0;

  public static final String SERIALIZED_NAME_CANCELLATIONS = "cancellations";
  @SerializedName(SERIALIZED_NAME_CANCELLATIONS)
  private Integer cancellations = 0;

  public static final String SERIALIZED_NAME_COUPONS = "coupons";
  @SerializedName(SERIALIZED_NAME_COUPONS)
  private Integer coupons = 0;

  public static final String SERIALIZED_NAME_DOWNGRADES = "downgrades";
  @SerializedName(SERIALIZED_NAME_DOWNGRADES)
  private Integer downgrades = 0;

  public static final String SERIALIZED_NAME_FAILED_CHARGES = "failed_charges";
  @SerializedName(SERIALIZED_NAME_FAILED_CHARGES)
  private Integer failedCharges = 0;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Integer fees = 0;

  public static final String SERIALIZED_NAME_LTV = "ltv";
  @SerializedName(SERIALIZED_NAME_LTV)
  private Integer ltv = 0;

  public static final String SERIALIZED_NAME_MRR = "mrr";
  @SerializedName(SERIALIZED_NAME_MRR)
  private Integer mrr = 0;

  public static final String SERIALIZED_NAME_NET_REVENUE = "net_revenue";
  @SerializedName(SERIALIZED_NAME_NET_REVENUE)
  private Integer netRevenue = 0;

  public static final String SERIALIZED_NAME_NEW_CUSTOMERS = "new_customers";
  @SerializedName(SERIALIZED_NAME_NEW_CUSTOMERS)
  private Integer newCustomers = 0;

  public static final String SERIALIZED_NAME_OTHER_REVENUE = "other_revenue";
  @SerializedName(SERIALIZED_NAME_OTHER_REVENUE)
  private Integer otherRevenue = 0;

  public static final String SERIALIZED_NAME_REACTIVATED_CUSTOMERS = "reactivated_customers";
  @SerializedName(SERIALIZED_NAME_REACTIVATED_CUSTOMERS)
  private Integer reactivatedCustomers = 0;

  public static final String SERIALIZED_NAME_REFUNDS = "refunds";
  @SerializedName(SERIALIZED_NAME_REFUNDS)
  private Integer refunds = 0;

  public static final String SERIALIZED_NAME_REVENUE_CHURN = "revenue_churn";
  @SerializedName(SERIALIZED_NAME_REVENUE_CHURN)
  private Integer revenueChurn = 0;

  public static final String SERIALIZED_NAME_TRIAL_CONVERSIONS = "trial_conversions";
  @SerializedName(SERIALIZED_NAME_TRIAL_CONVERSIONS)
  private Integer trialConversions = 0;

  public static final String SERIALIZED_NAME_UPGRADES = "upgrades";
  @SerializedName(SERIALIZED_NAME_UPGRADES)
  private Integer upgrades = 0;

  public static final String SERIALIZED_NAME_USER_CHURN = "user_churn";
  @SerializedName(SERIALIZED_NAME_USER_CHURN)
  private Integer userChurn = 0;

  public MetricShowSummaryResponseMetricsInner() {
  }

  public MetricShowSummaryResponseMetricsInner humanDate(String humanDate) {
    
    
    
    
    this.humanDate = humanDate;
    return this;
  }

   /**
   * Get humanDate
   * @return humanDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-11-26", value = "")

  public String getHumanDate() {
    return humanDate;
  }


  public void setHumanDate(String humanDate) {
    
    
    
    this.humanDate = humanDate;
  }


  public MetricShowSummaryResponseMetricsInner date(Integer date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1480118400", value = "")

  public Integer getDate() {
    return date;
  }


  public void setDate(Integer date) {
    
    
    
    this.date = date;
  }


  public MetricShowSummaryResponseMetricsInner activeCustomers(Integer activeCustomers) {
    
    
    
    
    this.activeCustomers = activeCustomers;
    return this;
  }

   /**
   * Get activeCustomers
   * @return activeCustomers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "642", value = "")

  public Integer getActiveCustomers() {
    return activeCustomers;
  }


  public void setActiveCustomers(Integer activeCustomers) {
    
    
    
    this.activeCustomers = activeCustomers;
  }


  public MetricShowSummaryResponseMetricsInner activeSubscriptions(Integer activeSubscriptions) {
    
    
    
    
    this.activeSubscriptions = activeSubscriptions;
    return this;
  }

   /**
   * Get activeSubscriptions
   * @return activeSubscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "642", value = "")

  public Integer getActiveSubscriptions() {
    return activeSubscriptions;
  }


  public void setActiveSubscriptions(Integer activeSubscriptions) {
    
    
    
    this.activeSubscriptions = activeSubscriptions;
  }


  public MetricShowSummaryResponseMetricsInner addOnMrr(Integer addOnMrr) {
    
    
    
    
    this.addOnMrr = addOnMrr;
    return this;
  }

   /**
   * Get addOnMrr
   * @return addOnMrr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getAddOnMrr() {
    return addOnMrr;
  }


  public void setAddOnMrr(Integer addOnMrr) {
    
    
    
    this.addOnMrr = addOnMrr;
  }


  public MetricShowSummaryResponseMetricsInner arpu(Integer arpu) {
    
    
    
    
    this.arpu = arpu;
    return this;
  }

   /**
   * Get arpu
   * @return arpu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9383", value = "")

  public Integer getArpu() {
    return arpu;
  }


  public void setArpu(Integer arpu) {
    
    
    
    this.arpu = arpu;
  }


  public MetricShowSummaryResponseMetricsInner arr(Integer arr) {
    
    
    
    
    this.arr = arr;
    return this;
  }

   /**
   * Get arr
   * @return arr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "72289044", value = "")

  public Integer getArr() {
    return arr;
  }


  public void setArr(Integer arr) {
    
    
    
    this.arr = arr;
  }


  public MetricShowSummaryResponseMetricsInner cancellations(Integer cancellations) {
    
    
    
    
    this.cancellations = cancellations;
    return this;
  }

   /**
   * Get cancellations
   * @return cancellations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getCancellations() {
    return cancellations;
  }


  public void setCancellations(Integer cancellations) {
    
    
    
    this.cancellations = cancellations;
  }


  public MetricShowSummaryResponseMetricsInner coupons(Integer coupons) {
    
    
    
    
    this.coupons = coupons;
    return this;
  }

   /**
   * Get coupons
   * @return coupons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "43300", value = "")

  public Integer getCoupons() {
    return coupons;
  }


  public void setCoupons(Integer coupons) {
    
    
    
    this.coupons = coupons;
  }


  public MetricShowSummaryResponseMetricsInner downgrades(Integer downgrades) {
    
    
    
    
    this.downgrades = downgrades;
    return this;
  }

   /**
   * Get downgrades
   * @return downgrades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getDowngrades() {
    return downgrades;
  }


  public void setDowngrades(Integer downgrades) {
    
    
    
    this.downgrades = downgrades;
  }


  public MetricShowSummaryResponseMetricsInner failedCharges(Integer failedCharges) {
    
    
    
    
    this.failedCharges = failedCharges;
    return this;
  }

   /**
   * Get failedCharges
   * @return failedCharges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getFailedCharges() {
    return failedCharges;
  }


  public void setFailedCharges(Integer failedCharges) {
    
    
    
    this.failedCharges = failedCharges;
  }


  public MetricShowSummaryResponseMetricsInner fees(Integer fees) {
    
    
    
    
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7373", value = "")

  public Integer getFees() {
    return fees;
  }


  public void setFees(Integer fees) {
    
    
    
    this.fees = fees;
  }


  public MetricShowSummaryResponseMetricsInner ltv(Integer ltv) {
    
    
    
    
    this.ltv = ltv;
    return this;
  }

   /**
   * Get ltv
   * @return ltv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "159039", value = "")

  public Integer getLtv() {
    return ltv;
  }


  public void setLtv(Integer ltv) {
    
    
    
    this.ltv = ltv;
  }


  public MetricShowSummaryResponseMetricsInner mrr(Integer mrr) {
    
    
    
    
    this.mrr = mrr;
    return this;
  }

   /**
   * Get mrr
   * @return mrr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6024087", value = "")

  public Integer getMrr() {
    return mrr;
  }


  public void setMrr(Integer mrr) {
    
    
    
    this.mrr = mrr;
  }


  public MetricShowSummaryResponseMetricsInner netRevenue(Integer netRevenue) {
    
    
    
    
    this.netRevenue = netRevenue;
    return this;
  }

   /**
   * Get netRevenue
   * @return netRevenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "233498", value = "")

  public Integer getNetRevenue() {
    return netRevenue;
  }


  public void setNetRevenue(Integer netRevenue) {
    
    
    
    this.netRevenue = netRevenue;
  }


  public MetricShowSummaryResponseMetricsInner newCustomers(Integer newCustomers) {
    
    
    
    
    this.newCustomers = newCustomers;
    return this;
  }

   /**
   * Get newCustomers
   * @return newCustomers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getNewCustomers() {
    return newCustomers;
  }


  public void setNewCustomers(Integer newCustomers) {
    
    
    
    this.newCustomers = newCustomers;
  }


  public MetricShowSummaryResponseMetricsInner otherRevenue(Integer otherRevenue) {
    
    
    
    
    this.otherRevenue = otherRevenue;
    return this;
  }

   /**
   * Get otherRevenue
   * @return otherRevenue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getOtherRevenue() {
    return otherRevenue;
  }


  public void setOtherRevenue(Integer otherRevenue) {
    
    
    
    this.otherRevenue = otherRevenue;
  }


  public MetricShowSummaryResponseMetricsInner reactivatedCustomers(Integer reactivatedCustomers) {
    
    
    
    
    this.reactivatedCustomers = reactivatedCustomers;
    return this;
  }

   /**
   * Get reactivatedCustomers
   * @return reactivatedCustomers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getReactivatedCustomers() {
    return reactivatedCustomers;
  }


  public void setReactivatedCustomers(Integer reactivatedCustomers) {
    
    
    
    this.reactivatedCustomers = reactivatedCustomers;
  }


  public MetricShowSummaryResponseMetricsInner refunds(Integer refunds) {
    
    
    
    
    this.refunds = refunds;
    return this;
  }

   /**
   * Get refunds
   * @return refunds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getRefunds() {
    return refunds;
  }


  public void setRefunds(Integer refunds) {
    
    
    
    this.refunds = refunds;
  }


  public MetricShowSummaryResponseMetricsInner revenueChurn(Integer revenueChurn) {
    
    
    
    
    this.revenueChurn = revenueChurn;
    return this;
  }

   /**
   * Get revenueChurn
   * @return revenueChurn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "543", value = "")

  public Integer getRevenueChurn() {
    return revenueChurn;
  }


  public void setRevenueChurn(Integer revenueChurn) {
    
    
    
    this.revenueChurn = revenueChurn;
  }


  public MetricShowSummaryResponseMetricsInner trialConversions(Integer trialConversions) {
    
    
    
    
    this.trialConversions = trialConversions;
    return this;
  }

   /**
   * Get trialConversions
   * @return trialConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Integer getTrialConversions() {
    return trialConversions;
  }


  public void setTrialConversions(Integer trialConversions) {
    
    
    
    this.trialConversions = trialConversions;
  }


  public MetricShowSummaryResponseMetricsInner upgrades(Integer upgrades) {
    
    
    
    
    this.upgrades = upgrades;
    return this;
  }

   /**
   * Get upgrades
   * @return upgrades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getUpgrades() {
    return upgrades;
  }


  public void setUpgrades(Integer upgrades) {
    
    
    
    this.upgrades = upgrades;
  }


  public MetricShowSummaryResponseMetricsInner userChurn(Integer userChurn) {
    
    
    
    
    this.userChurn = userChurn;
    return this;
  }

   /**
   * Get userChurn
   * @return userChurn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "590", value = "")

  public Integer getUserChurn() {
    return userChurn;
  }


  public void setUserChurn(Integer userChurn) {
    
    
    
    this.userChurn = userChurn;
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
   * @return the MetricShowSummaryResponseMetricsInner instance itself
   */
  public MetricShowSummaryResponseMetricsInner putAdditionalProperty(String key, Object value) {
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
    MetricShowSummaryResponseMetricsInner metricShowSummaryResponseMetricsInner = (MetricShowSummaryResponseMetricsInner) o;
    return Objects.equals(this.humanDate, metricShowSummaryResponseMetricsInner.humanDate) &&
        Objects.equals(this.date, metricShowSummaryResponseMetricsInner.date) &&
        Objects.equals(this.activeCustomers, metricShowSummaryResponseMetricsInner.activeCustomers) &&
        Objects.equals(this.activeSubscriptions, metricShowSummaryResponseMetricsInner.activeSubscriptions) &&
        Objects.equals(this.addOnMrr, metricShowSummaryResponseMetricsInner.addOnMrr) &&
        Objects.equals(this.arpu, metricShowSummaryResponseMetricsInner.arpu) &&
        Objects.equals(this.arr, metricShowSummaryResponseMetricsInner.arr) &&
        Objects.equals(this.cancellations, metricShowSummaryResponseMetricsInner.cancellations) &&
        Objects.equals(this.coupons, metricShowSummaryResponseMetricsInner.coupons) &&
        Objects.equals(this.downgrades, metricShowSummaryResponseMetricsInner.downgrades) &&
        Objects.equals(this.failedCharges, metricShowSummaryResponseMetricsInner.failedCharges) &&
        Objects.equals(this.fees, metricShowSummaryResponseMetricsInner.fees) &&
        Objects.equals(this.ltv, metricShowSummaryResponseMetricsInner.ltv) &&
        Objects.equals(this.mrr, metricShowSummaryResponseMetricsInner.mrr) &&
        Objects.equals(this.netRevenue, metricShowSummaryResponseMetricsInner.netRevenue) &&
        Objects.equals(this.newCustomers, metricShowSummaryResponseMetricsInner.newCustomers) &&
        Objects.equals(this.otherRevenue, metricShowSummaryResponseMetricsInner.otherRevenue) &&
        Objects.equals(this.reactivatedCustomers, metricShowSummaryResponseMetricsInner.reactivatedCustomers) &&
        Objects.equals(this.refunds, metricShowSummaryResponseMetricsInner.refunds) &&
        Objects.equals(this.revenueChurn, metricShowSummaryResponseMetricsInner.revenueChurn) &&
        Objects.equals(this.trialConversions, metricShowSummaryResponseMetricsInner.trialConversions) &&
        Objects.equals(this.upgrades, metricShowSummaryResponseMetricsInner.upgrades) &&
        Objects.equals(this.userChurn, metricShowSummaryResponseMetricsInner.userChurn)&&
        Objects.equals(this.additionalProperties, metricShowSummaryResponseMetricsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(humanDate, date, activeCustomers, activeSubscriptions, addOnMrr, arpu, arr, cancellations, coupons, downgrades, failedCharges, fees, ltv, mrr, netRevenue, newCustomers, otherRevenue, reactivatedCustomers, refunds, revenueChurn, trialConversions, upgrades, userChurn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricShowSummaryResponseMetricsInner {\n");
    sb.append("    humanDate: ").append(toIndentedString(humanDate)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    activeCustomers: ").append(toIndentedString(activeCustomers)).append("\n");
    sb.append("    activeSubscriptions: ").append(toIndentedString(activeSubscriptions)).append("\n");
    sb.append("    addOnMrr: ").append(toIndentedString(addOnMrr)).append("\n");
    sb.append("    arpu: ").append(toIndentedString(arpu)).append("\n");
    sb.append("    arr: ").append(toIndentedString(arr)).append("\n");
    sb.append("    cancellations: ").append(toIndentedString(cancellations)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    downgrades: ").append(toIndentedString(downgrades)).append("\n");
    sb.append("    failedCharges: ").append(toIndentedString(failedCharges)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    ltv: ").append(toIndentedString(ltv)).append("\n");
    sb.append("    mrr: ").append(toIndentedString(mrr)).append("\n");
    sb.append("    netRevenue: ").append(toIndentedString(netRevenue)).append("\n");
    sb.append("    newCustomers: ").append(toIndentedString(newCustomers)).append("\n");
    sb.append("    otherRevenue: ").append(toIndentedString(otherRevenue)).append("\n");
    sb.append("    reactivatedCustomers: ").append(toIndentedString(reactivatedCustomers)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    revenueChurn: ").append(toIndentedString(revenueChurn)).append("\n");
    sb.append("    trialConversions: ").append(toIndentedString(trialConversions)).append("\n");
    sb.append("    upgrades: ").append(toIndentedString(upgrades)).append("\n");
    sb.append("    userChurn: ").append(toIndentedString(userChurn)).append("\n");
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
    openapiFields.add("human_date");
    openapiFields.add("date");
    openapiFields.add("active_customers");
    openapiFields.add("active_subscriptions");
    openapiFields.add("add_on_mrr");
    openapiFields.add("arpu");
    openapiFields.add("arr");
    openapiFields.add("cancellations");
    openapiFields.add("coupons");
    openapiFields.add("downgrades");
    openapiFields.add("failed_charges");
    openapiFields.add("fees");
    openapiFields.add("ltv");
    openapiFields.add("mrr");
    openapiFields.add("net_revenue");
    openapiFields.add("new_customers");
    openapiFields.add("other_revenue");
    openapiFields.add("reactivated_customers");
    openapiFields.add("refunds");
    openapiFields.add("revenue_churn");
    openapiFields.add("trial_conversions");
    openapiFields.add("upgrades");
    openapiFields.add("user_churn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetricShowSummaryResponseMetricsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetricShowSummaryResponseMetricsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetricShowSummaryResponseMetricsInner is not found in the empty JSON string", MetricShowSummaryResponseMetricsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("human_date") != null && !jsonObj.get("human_date").isJsonNull()) && !jsonObj.get("human_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `human_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("human_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetricShowSummaryResponseMetricsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetricShowSummaryResponseMetricsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetricShowSummaryResponseMetricsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetricShowSummaryResponseMetricsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<MetricShowSummaryResponseMetricsInner>() {
           @Override
           public void write(JsonWriter out, MetricShowSummaryResponseMetricsInner value) throws IOException {
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
           public MetricShowSummaryResponseMetricsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetricShowSummaryResponseMetricsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetricShowSummaryResponseMetricsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetricShowSummaryResponseMetricsInner
  * @throws IOException if the JSON string is invalid with respect to MetricShowSummaryResponseMetricsInner
  */
  public static MetricShowSummaryResponseMetricsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetricShowSummaryResponseMetricsInner.class);
  }

 /**
  * Convert an instance of MetricShowSummaryResponseMetricsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
