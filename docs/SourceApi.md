# SourceApi

All URIs are relative to *https://api.baremetrics.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSubscription**](SourceApi.md#cancelSubscription) | **PUT** /v1/{source_id}/subscriptions/{subscription_oid}/cancel | Cancel Subscription |
| [**createChargeOneOff**](SourceApi.md#createChargeOneOff) | **POST** /v1/{source_id}/charges | Create Charge |
| [**createCustomerRecord**](SourceApi.md#createCustomerRecord) | **POST** /v1/{source_id}/customers | Create Customer |
| [**createOneOffRefund**](SourceApi.md#createOneOffRefund) | **POST** /v1/{source_id}/refunds | Create Refund |
| [**createPlan**](SourceApi.md#createPlan) | **POST** /v1/{source_id}/plans | Create Plan |
| [**createSubscription**](SourceApi.md#createSubscription) | **POST** /v1/{source_id}/subscriptions | Create Subscription |
| [**deleteCustomer**](SourceApi.md#deleteCustomer) | **DELETE** /v1/{source_id}/customers/{oid} | Delete Customer |
| [**deletePlan**](SourceApi.md#deletePlan) | **DELETE** /v1/{source_id}/plans/{oid} | Delete Plan |
| [**getChargeDetails**](SourceApi.md#getChargeDetails) | **GET** /v1/{source_id}/charges/{oid} | Show Charge |
| [**getChargeList**](SourceApi.md#getChargeList) | **GET** /v1/{source_id}/charges | List Charges |
| [**getCustomerDetails**](SourceApi.md#getCustomerDetails) | **GET** /v1/{source_id}/customers/{oid} | Show Customer |
| [**getCustomerList**](SourceApi.md#getCustomerList) | **GET** /v1/{source_id}/customers | List Customers |
| [**getEventById**](SourceApi.md#getEventById) | **GET** /v1/{source_id}/events/{id} | Show Event |
| [**getEvents**](SourceApi.md#getEvents) | **GET** /v1/{source_id}/events | List Events |
| [**getPlan**](SourceApi.md#getPlan) | **GET** /v1/{source_id}/plans/{oid} | Show Plan |
| [**getPlansList**](SourceApi.md#getPlansList) | **GET** /v1/{source_id}/plans | List Plans |
| [**getRefundDetails**](SourceApi.md#getRefundDetails) | **GET** /v1/{source_id}/refunds/{oid} | Show Refund |
| [**getRefunds**](SourceApi.md#getRefunds) | **GET** /v1/{source_id}/refunds | List Refunds |
| [**getSubscription**](SourceApi.md#getSubscription) | **GET** /v1/{source_id}/subscriptions/{oid} | Show Subscription |
| [**getSubscriptions**](SourceApi.md#getSubscriptions) | **GET** /v1/{source_id}/subscriptions | List Subscriptions |
| [**listCustomerEvents**](SourceApi.md#listCustomerEvents) | **GET** /v1/{source_id}/customers/{oid}/events | List Customer Events |
| [**listSources**](SourceApi.md#listSources) | **GET** /v1/sources | List Sources |
| [**removeOneOffCharge**](SourceApi.md#removeOneOffCharge) | **DELETE** /v1/{source_id}/charges/{oid} | Delete Charge |
| [**removeOneOffRefund**](SourceApi.md#removeOneOffRefund) | **DELETE** /v1/{source_id}/refunds/{oid} | Delete Refund |
| [**removeSubscription**](SourceApi.md#removeSubscription) | **DELETE** /v1/{source_id}/subscriptions/{oid} | Delete Subscription |
| [**updateCustomerInformation**](SourceApi.md#updateCustomerInformation) | **PUT** /v1/{source_id}/customers/{customer_oid} | Update Customer |
| [**updatePlan**](SourceApi.md#updatePlan) | **PUT** /v1/{source_id}/plans/{plan_oid} | Update Plan |
| [**updateSubscription**](SourceApi.md#updateSubscription) | **PUT** /v1/{source_id}/subscriptions/{subscription_oid} | Update Subscription |


<a name="cancelSubscription"></a>
# **cancelSubscription**
> SourceCancelSubscriptionResponse cancelSubscription(subscriptionOid, sourceId).sourceCancelSubscriptionRequest(sourceCancelSubscriptionRequest).execute();

Cancel Subscription

This endpoint allows you to cancel a subscription.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    OffsetDateTime canceledAt = OffsetDateTime.now(); // A unix timestamp of when this subscription was, or should be canceled.
    String subscriptionOid = "subscriptionOid_example"; // Your unique ID for the subscription
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      SourceCancelSubscriptionResponse result = client
              .source
              .cancelSubscription(canceledAt, subscriptionOid, sourceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvent());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#cancelSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceCancelSubscriptionResponse> response = client
              .source
              .cancelSubscription(canceledAt, subscriptionOid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#cancelSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionOid** | **String**| Your unique ID for the subscription | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceCancelSubscriptionRequest** | [**SourceCancelSubscriptionRequest**](SourceCancelSubscriptionRequest.md)|  | [optional] |

### Return type

[**SourceCancelSubscriptionResponse**](SourceCancelSubscriptionResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createChargeOneOff"></a>
# **createChargeOneOff**
> String createChargeOneOff(sourceId).sourceCreateChargeOneOffRequest(sourceCreateChargeOneOffRequest).execute();

Create Charge

Create \&quot;One-Off\&quot; charges that are not linked to a subscription.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example"; // Your unique reference for this charge
    Integer amount = 56; // The charge amount (in cents)
    String currency = "currency_example"; // The ISO code of the currency of this plan. E.G: usd
    String customerOid = "customerOid_example"; // Your unique ID for the customer
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    OffsetDateTime created = OffsetDateTime.now(); // Unix timestamp of when this was created
    String status = "paid"; // The status of this charge. Can be paid or failed. Defaults to paid.
    Integer fee = 0;
    String subscriptionOid = "subscriptionOid_example"; // This can only be supplied when Subscription Auto Charging is disabled. Please contact support if you want to handle your subscription charges manually.
    try {
      String result = client
              .source
              .createChargeOneOff(oid, amount, currency, customerOid, sourceId)
              .created(created)
              .status(status)
              .fee(fee)
              .subscriptionOid(subscriptionOid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createChargeOneOff");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .createChargeOneOff(oid, amount, currency, customerOid, sourceId)
              .created(created)
              .status(status)
              .fee(fee)
              .subscriptionOid(subscriptionOid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createChargeOneOff");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceCreateChargeOneOffRequest** | [**SourceCreateChargeOneOffRequest**](SourceCreateChargeOneOffRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createCustomerRecord"></a>
# **createCustomerRecord**
> SourceCreateCustomerRecordResponse createCustomerRecord(sourceId).sourceCreateCustomerRecordRequest(sourceCreateCustomerRecordRequest).execute();

Create Customer

This endpoint allows you to create a customer record. After you create the record, you will be able to create a [Subscription](https://developers.baremetrics.com/reference/introduction)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example"; // Your unique ID for the customer
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String name = "name_example";
    String notes = "notes_example"; // Your own notes for this customer. These will be displayed in the profile
    String email = "email_example"; // An email address for this customer. This is used to lookup extra profile information
    OffsetDateTime created = OffsetDateTime.now(); // A unix timestamp of when this customer was created. Defaults to now.
    try {
      SourceCreateCustomerRecordResponse result = client
              .source
              .createCustomerRecord(oid, sourceId)
              .name(name)
              .notes(notes)
              .email(email)
              .created(created)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomer());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createCustomerRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceCreateCustomerRecordResponse> response = client
              .source
              .createCustomerRecord(oid, sourceId)
              .name(name)
              .notes(notes)
              .email(email)
              .created(created)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createCustomerRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceCreateCustomerRecordRequest** | [**SourceCreateCustomerRecordRequest**](SourceCreateCustomerRecordRequest.md)|  | [optional] |

### Return type

[**SourceCreateCustomerRecordResponse**](SourceCreateCustomerRecordResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createOneOffRefund"></a>
# **createOneOffRefund**
> String createOneOffRefund(sourceId).sourceCreateOneOffRefundRequest(sourceCreateOneOffRefundRequest).execute();

Create Refund

Create \&quot;One-Off\&quot; refunds that are not linked to a subscription.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example"; // Your unique reference for this charge
    Integer amount = 56; // The charge amount (in cents)
    String currency = "currency_example"; // The ISO code of the currency of this plan. E.G: usd
    String customerOid = "customerOid_example"; // Your unique ID for the customer
    String chargeOid = "chargeOid_example"; // Which charge do you want to refund? This must be an API charge.
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    OffsetDateTime created = OffsetDateTime.now(); // Unix timestamp of when this was created
    try {
      String result = client
              .source
              .createOneOffRefund(oid, amount, currency, customerOid, chargeOid, sourceId)
              .created(created)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createOneOffRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .createOneOffRefund(oid, amount, currency, customerOid, chargeOid, sourceId)
              .created(created)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createOneOffRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceCreateOneOffRefundRequest** | [**SourceCreateOneOffRefundRequest**](SourceCreateOneOffRefundRequest.md)|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createPlan"></a>
# **createPlan**
> SourceCreatePlanResponse createPlan(sourceId).sourceCreatePlanRequest(sourceCreatePlanRequest).execute();

Create Plan

Create a plan for use when [creating](https://developers.baremetrics.com/reference/introduction) or [updating](https://developers.baremetrics.com/reference/introduction) subscriptions.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example"; // Your unique ID for the plan
    String name = "name_example"; // Your internal name for this plan. This will be displayed in the Plan Breakout section
    String currency = "currency_example"; // The ISO code of the currency of this plan. E.G: usd
    Integer amount = 56; // How much is this plan? (In cents)
    String interval = "interval_example"; // day, month or year
    Integer intervalCount = 56;
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    Integer trialDuration = 0; // The duration of this trial. This is to be used in conjunction with trial_duration_unit
    String trialDurationUnit = "day"; // This is to be used in conjunction with trial_duration
    try {
      SourceCreatePlanResponse result = client
              .source
              .createPlan(oid, name, currency, amount, interval, intervalCount, sourceId)
              .trialDuration(trialDuration)
              .trialDurationUnit(trialDurationUnit)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlan());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceCreatePlanResponse> response = client
              .source
              .createPlan(oid, name, currency, amount, interval, intervalCount, sourceId)
              .trialDuration(trialDuration)
              .trialDurationUnit(trialDurationUnit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceCreatePlanRequest** | [**SourceCreatePlanRequest**](SourceCreatePlanRequest.md)|  | [optional] |

### Return type

[**SourceCreatePlanResponse**](SourceCreatePlanResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="createSubscription"></a>
# **createSubscription**
> SourceCreateSubscriptionResponse createSubscription(sourceId).sourceCreateSubscriptionRequest(sourceCreateSubscriptionRequest).execute();

Create Subscription

This endpoint allows you to create a Subscription.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example"; // Your unique ID for the subscription
    OffsetDateTime startedAt = OffsetDateTime.now(); // A unix timestamp of when this subscription started
    String planOid = "planOid_example"; // Your unique ID for the plan
    String customerOid = "customerOid_example"; // Your unique ID for the customer
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    OffsetDateTime canceledAt = OffsetDateTime.now(); // A unix timestamp of when this subscription was, or should be canceled. This cannot be changed, so only set this if you are certain you know when the subscription will end.
    List<SourceCreateSubscriptionRequestAddonsInner> addons = Arrays.asList();
    Integer quantity = 1;
    Integer discount = 56; // Integer value (in the same currency as the plan)
    try {
      SourceCreateSubscriptionResponse result = client
              .source
              .createSubscription(oid, startedAt, planOid, customerOid, sourceId)
              .canceledAt(canceledAt)
              .addons(addons)
              .quantity(quantity)
              .discount(discount)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvent());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceCreateSubscriptionResponse> response = client
              .source
              .createSubscription(oid, startedAt, planOid, customerOid, sourceId)
              .canceledAt(canceledAt)
              .addons(addons)
              .quantity(quantity)
              .discount(discount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#createSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceCreateSubscriptionRequest** | [**SourceCreateSubscriptionRequest**](SourceCreateSubscriptionRequest.md)|  | [optional] |

### Return type

[**SourceCreateSubscriptionResponse**](SourceCreateSubscriptionResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="deleteCustomer"></a>
# **deleteCustomer**
> Object deleteCustomer(oid, sourceId).execute();

Delete Customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example";
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      Object result = client
              .source
              .deleteCustomer(oid, sourceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#deleteCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .source
              .deleteCustomer(oid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#deleteCustomer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oid** | **String**|  | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 |  -  |

<a name="deletePlan"></a>
# **deletePlan**
> Object deletePlan(oid, sourceId).execute();

Delete Plan



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example";
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      Object result = client
              .source
              .deletePlan(oid, sourceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#deletePlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .source
              .deletePlan(oid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#deletePlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oid** | **String**|  | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 |  -  |

<a name="getChargeDetails"></a>
# **getChargeDetails**
> String getChargeDetails(sourceId, oid).execute();

Show Charge



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String oid = "oid_example";
    try {
      String result = client
              .source
              .getChargeDetails(sourceId, oid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getChargeDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .getChargeDetails(sourceId, oid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getChargeDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **oid** | **String**|  | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getChargeList"></a>
# **getChargeList**
> String getChargeList(sourceId).start(start).end(end).subscriptionOid(subscriptionOid).customerOid(customerOid).execute();

List Charges



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    OffsetDateTime start = OffsetDateTime.now();
    OffsetDateTime end = OffsetDateTime.now();
    String subscriptionOid = "subscriptionOid_example";
    String customerOid = "customerOid_example";
    try {
      String result = client
              .source
              .getChargeList(sourceId)
              .start(start)
              .end(end)
              .subscriptionOid(subscriptionOid)
              .customerOid(customerOid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getChargeList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .getChargeList(sourceId)
              .start(start)
              .end(end)
              .subscriptionOid(subscriptionOid)
              .customerOid(customerOid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getChargeList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **start** | **OffsetDateTime**|  | [optional] |
| **end** | **OffsetDateTime**|  | [optional] |
| **subscriptionOid** | **String**|  | [optional] |
| **customerOid** | **String**|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getCustomerDetails"></a>
# **getCustomerDetails**
> SourceGetCustomerDetailsResponse getCustomerDetails(oid, sourceId).execute();

Show Customer



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example";
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      SourceGetCustomerDetailsResponse result = client
              .source
              .getCustomerDetails(oid, sourceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomer());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getCustomerDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceGetCustomerDetailsResponse> response = client
              .source
              .getCustomerDetails(oid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getCustomerDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oid** | **String**|  | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |

### Return type

[**SourceGetCustomerDetailsResponse**](SourceGetCustomerDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getCustomerList"></a>
# **getCustomerList**
> SourceGetCustomerListResponse getCustomerList(sourceId).search(search).sort(sort).order(order).execute();

List Customers

Fetch a list of all customers on your account

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String search = "search_example"; // Allows you to search for a customer based on: oid, email, notes and name
    String sort = "created"; // Allows you to sort the results. You can use ltv or created
    String order = "asc";
    try {
      SourceGetCustomerListResponse result = client
              .source
              .getCustomerList(sourceId)
              .search(search)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomers());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getCustomerList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceGetCustomerListResponse> response = client
              .source
              .getCustomerList(sourceId)
              .search(search)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getCustomerList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **search** | **String**| Allows you to search for a customer based on: oid, email, notes and name | [optional] |
| **sort** | **String**| Allows you to sort the results. You can use ltv or created | [optional] [default to created] |
| **order** | **String**|  | [optional] [default to asc] |

### Return type

[**SourceGetCustomerListResponse**](SourceGetCustomerListResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getEventById"></a>
# **getEventById**
> String getEventById(sourceId, id).execute();

Show Event



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String id = "id_example";
    try {
      String result = client
              .source
              .getEventById(sourceId, id)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .getEventById(sourceId, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **id** | **String**|  | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getEvents"></a>
# **getEvents**
> String getEvents(sourceId).liveStream(liveStream).start(start).end(end).execute();

List Events



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String liveStream = "false"; // Set this to true to only return events that show up in the live stream
    OffsetDateTime start = OffsetDateTime.now();
    OffsetDateTime end = OffsetDateTime.now();
    try {
      String result = client
              .source
              .getEvents(sourceId)
              .liveStream(liveStream)
              .start(start)
              .end(end)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .getEvents(sourceId)
              .liveStream(liveStream)
              .start(start)
              .end(end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **liveStream** | **String**| Set this to true to only return events that show up in the live stream | [optional] [default to false] |
| **start** | **OffsetDateTime**|  | [optional] |
| **end** | **OffsetDateTime**|  | [optional] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getPlan"></a>
# **getPlan**
> SourceGetPlanResponse getPlan(oid, sourceId).execute();

Show Plan



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example";
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      SourceGetPlanResponse result = client
              .source
              .getPlan(oid, sourceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlan());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceGetPlanResponse> response = client
              .source
              .getPlan(oid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getPlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oid** | **String**|  | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |

### Return type

[**SourceGetPlanResponse**](SourceGetPlanResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getPlansList"></a>
# **getPlansList**
> SourceGetPlansListResponse getPlansList(sourceId).search(search).execute();

List Plans



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String search = "search_example"; // Allows you to search based on the name or oid fields
    try {
      SourceGetPlansListResponse result = client
              .source
              .getPlansList(sourceId)
              .search(search)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlans());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getPlansList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceGetPlansListResponse> response = client
              .source
              .getPlansList(sourceId)
              .search(search)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getPlansList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **search** | **String**| Allows you to search based on the name or oid fields | [optional] |

### Return type

[**SourceGetPlansListResponse**](SourceGetPlansListResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getRefundDetails"></a>
# **getRefundDetails**
> SourceGetRefundDetailsResponse getRefundDetails(sourceId, oid).execute();

Show Refund



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String oid = "oid_example";
    try {
      SourceGetRefundDetailsResponse result = client
              .source
              .getRefundDetails(sourceId, oid)
              .execute();
      System.out.println(result);
      System.out.println(result.getOid());
      System.out.println(result.getSourceId());
      System.out.println(result.getSource());
      System.out.println(result.getChargeOid());
      System.out.println(result.getCreated());
      System.out.println(result.getCustomer());
      System.out.println(result.getAmount());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getRefundDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceGetRefundDetailsResponse> response = client
              .source
              .getRefundDetails(sourceId, oid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getRefundDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **oid** | **String**|  | |

### Return type

[**SourceGetRefundDetailsResponse**](SourceGetRefundDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getRefunds"></a>
# **getRefunds**
> SourceGetRefundsResponse getRefunds(sourceId).start(start).end(end).execute();

List Refunds



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    OffsetDateTime start = OffsetDateTime.now();
    OffsetDateTime end = OffsetDateTime.now();
    try {
      SourceGetRefundsResponse result = client
              .source
              .getRefunds(sourceId)
              .start(start)
              .end(end)
              .execute();
      System.out.println(result);
      System.out.println(result.getRefunds());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getRefunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceGetRefundsResponse> response = client
              .source
              .getRefunds(sourceId)
              .start(start)
              .end(end)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getRefunds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **start** | **OffsetDateTime**|  | [optional] |
| **end** | **OffsetDateTime**|  | [optional] |

### Return type

[**SourceGetRefundsResponse**](SourceGetRefundsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getSubscription"></a>
# **getSubscription**
> String getSubscription(oid, sourceId).execute();

Show Subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example";
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      String result = client
              .source
              .getSubscription(oid, sourceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .getSubscription(oid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oid** | **String**|  | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getSubscriptions"></a>
# **getSubscriptions**
> String getSubscriptions(sourceId).customerOid(customerOid).order(order).execute();

List Subscriptions

Get all subscriptions linked to this API Key.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String customerOid = "customerOid_example"; // This allows you to return subscriptions for a given customer
    String order = "desc"; // Allows you to order subscriptions from newest to oldest `desc` or oldest to newest `asc`
    try {
      String result = client
              .source
              .getSubscriptions(sourceId)
              .customerOid(customerOid)
              .order(order)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .source
              .getSubscriptions(sourceId)
              .customerOid(customerOid)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#getSubscriptions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **customerOid** | **String**| This allows you to return subscriptions for a given customer | [optional] |
| **order** | **String**| Allows you to order subscriptions from newest to oldest &#x60;desc&#x60; or oldest to newest &#x60;asc&#x60; | [optional] [default to desc] |

### Return type

**String**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listCustomerEvents"></a>
# **listCustomerEvents**
> SourceListCustomerEventsResponse listCustomerEvents(sourceId, oid).execute();

List Customer Events



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String oid = "oid_example";
    try {
      SourceListCustomerEventsResponse result = client
              .source
              .listCustomerEvents(sourceId, oid)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#listCustomerEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceListCustomerEventsResponse> response = client
              .source
              .listCustomerEvents(sourceId, oid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#listCustomerEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **oid** | **String**|  | |

### Return type

[**SourceListCustomerEventsResponse**](SourceListCustomerEventsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listSources"></a>
# **listSources**
> SourceListSourcesResponse listSources().execute();

List Sources



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    try {
      SourceListSourcesResponse result = client
              .source
              .listSources()
              .execute();
      System.out.println(result);
      System.out.println(result.getSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#listSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceListSourcesResponse> response = client
              .source
              .listSources()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#listSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SourceListSourcesResponse**](SourceListSourcesResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="removeOneOffCharge"></a>
# **removeOneOffCharge**
> Object removeOneOffCharge(sourceId, oid).execute();

Delete Charge

Delete \&quot;One-Off\&quot; charges that are not linked to a subscription.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String oid = "oid_example";
    try {
      Object result = client
              .source
              .removeOneOffCharge(sourceId, oid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#removeOneOffCharge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .source
              .removeOneOffCharge(sourceId, oid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#removeOneOffCharge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **oid** | **String**|  | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 |  -  |

<a name="removeOneOffRefund"></a>
# **removeOneOffRefund**
> Object removeOneOffRefund(sourceId, oid).execute();

Delete Refund

Delete \&quot;One-Off\&quot; refunds that are not linked to a subscription.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String oid = "oid_example";
    try {
      Object result = client
              .source
              .removeOneOffRefund(sourceId, oid)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#removeOneOffRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .source
              .removeOneOffRefund(sourceId, oid)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#removeOneOffRefund");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **oid** | **String**|  | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 |  -  |

<a name="removeSubscription"></a>
# **removeSubscription**
> Object removeSubscription(oid, sourceId).execute();

Delete Subscription



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String oid = "oid_example";
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      Object result = client
              .source
              .removeSubscription(oid, sourceId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#removeSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .source
              .removeSubscription(oid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#removeSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **oid** | **String**|  | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |

### Return type

**Object**

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | 202 |  -  |

<a name="updateCustomerInformation"></a>
# **updateCustomerInformation**
> SourceUpdateCustomerInformationResponse updateCustomerInformation(customerOid, sourceId).sourceUpdateCustomerInformationRequest(sourceUpdateCustomerInformationRequest).execute();

Update Customer

This endpoint allows you to update the basic information stored on a Customer, such as first name, last name and notes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String customerOid = "customerOid_example"; // Your unique ID for the customer
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    String name = "name_example";
    String notes = "notes_example";
    OffsetDateTime created = OffsetDateTime.now(); // Unix timestamp of when this customer was created
    String email = "email_example"; // Email for this customer
    try {
      SourceUpdateCustomerInformationResponse result = client
              .source
              .updateCustomerInformation(customerOid, sourceId)
              .name(name)
              .notes(notes)
              .created(created)
              .email(email)
              .execute();
      System.out.println(result);
      System.out.println(result.getCustomer());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#updateCustomerInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceUpdateCustomerInformationResponse> response = client
              .source
              .updateCustomerInformation(customerOid, sourceId)
              .name(name)
              .notes(notes)
              .created(created)
              .email(email)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#updateCustomerInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerOid** | **String**| Your unique ID for the customer | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceUpdateCustomerInformationRequest** | [**SourceUpdateCustomerInformationRequest**](SourceUpdateCustomerInformationRequest.md)|  | [optional] |

### Return type

[**SourceUpdateCustomerInformationResponse**](SourceUpdateCustomerInformationResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updatePlan"></a>
# **updatePlan**
> SourceUpdatePlanResponse updatePlan(planOid, sourceId).sourceUpdatePlanRequest(sourceUpdatePlanRequest).execute();

Update Plan



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String name = "name_example"; // The new name of this plan
    String planOid = "planOid_example"; // Your interval plan id
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    try {
      SourceUpdatePlanResponse result = client
              .source
              .updatePlan(name, planOid, sourceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getPlan());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#updatePlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceUpdatePlanResponse> response = client
              .source
              .updatePlan(name, planOid, sourceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#updatePlan");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **planOid** | **String**| Your interval plan id | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceUpdatePlanRequest** | [**SourceUpdatePlanRequest**](SourceUpdatePlanRequest.md)|  | [optional] |

### Return type

[**SourceUpdatePlanResponse**](SourceUpdatePlanResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateSubscription"></a>
# **updateSubscription**
> SourceUpdateSubscriptionResponse updateSubscription(subscriptionOid, sourceId).sourceUpdateSubscriptionRequest(sourceUpdateSubscriptionRequest).execute();

Update Subscription

This allows you to update a Subscription, such as changing plans and addons.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SourceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String planOid = "planOid_example"; // Your unique ID for the plan
    String subscriptionOid = "subscriptionOid_example"; // Your unique ID for the subscription
    String sourceId = "sourceId_example"; // Please see [Sources](ref:sources)
    OffsetDateTime occurredAt = OffsetDateTime.now(); // A unix timestamp of when this change occurred. Defaults to now
    List<SourceCreateSubscriptionRequestAddonsInner> addons = Arrays.asList(); // In cents. The OID can be anything you want.
    Integer quantity = 1;
    Integer discount = 56; // Integer value (in the same currency as the plan)
    try {
      SourceUpdateSubscriptionResponse result = client
              .source
              .updateSubscription(planOid, subscriptionOid, sourceId)
              .occurredAt(occurredAt)
              .addons(addons)
              .quantity(quantity)
              .discount(discount)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvent());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#updateSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SourceUpdateSubscriptionResponse> response = client
              .source
              .updateSubscription(planOid, subscriptionOid, sourceId)
              .occurredAt(occurredAt)
              .addons(addons)
              .quantity(quantity)
              .discount(discount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceApi#updateSubscription");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **subscriptionOid** | **String**| Your unique ID for the subscription | |
| **sourceId** | **String**| Please see [Sources](ref:sources) | |
| **sourceUpdateSubscriptionRequest** | [**SourceUpdateSubscriptionRequest**](SourceUpdateSubscriptionRequest.md)|  | [optional] |

### Return type

[**SourceUpdateSubscriptionResponse**](SourceUpdateSubscriptionResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

