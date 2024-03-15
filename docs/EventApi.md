# EventApi

All URIs are relative to *https://api.baremetrics.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createInsightEvent**](EventApi.md#createInsightEvent) | **POST** /v1/cancellation_insights/events | Create Event |
| [**getEventById**](EventApi.md#getEventById) | **GET** /v1/cancellation_insights/events/{id} | Show Event |
| [**listCancellationInsightEvents**](EventApi.md#listCancellationInsightEvents) | **GET** /v1/cancellation_insights/events | List Events |
| [**updateEventById**](EventApi.md#updateEventById) | **PUT** /v1/cancellation_insights/events/{id} | Update Event |


<a name="createInsightEvent"></a>
# **createInsightEvent**
> EventCreateInsightEventResponse createInsightEvent().eventCreateInsightEventRequest(eventCreateInsightEventRequest).execute();

Create Event



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String reasonId = "reasonId_example";
    String comment = "comment_example";
    String customerOid = "customerOid_example";
    List<String> subscriptionOids = Arrays.asList();
    try {
      EventCreateInsightEventResponse result = client
              .event
              .createInsightEvent(reasonId)
              .comment(comment)
              .customerOid(customerOid)
              .subscriptionOids(subscriptionOids)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvent());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createInsightEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventCreateInsightEventResponse> response = client
              .event
              .createInsightEvent(reasonId)
              .comment(comment)
              .customerOid(customerOid)
              .subscriptionOids(subscriptionOids)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createInsightEvent");
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
| **eventCreateInsightEventRequest** | [**EventCreateInsightEventRequest**](EventCreateInsightEventRequest.md)|  | [optional] |

### Return type

[**EventCreateInsightEventResponse**](EventCreateInsightEventResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="getEventById"></a>
# **getEventById**
> EventGetEventByIdResponse getEventById(id).execute();

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
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String id = "id_example";
    try {
      EventGetEventByIdResponse result = client
              .event
              .getEventById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvent());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventGetEventByIdResponse> response = client
              .event
              .getEventById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getEventById");
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
| **id** | **String**|  | |

### Return type

[**EventGetEventByIdResponse**](EventGetEventByIdResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="listCancellationInsightEvents"></a>
# **listCancellationInsightEvents**
> EventListCancellationInsightEventsResponse listCancellationInsightEvents().execute();

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
import com.konfigthis.client.api.EventApi;
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
      EventListCancellationInsightEventsResponse result = client
              .event
              .listCancellationInsightEvents()
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#listCancellationInsightEvents");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventListCancellationInsightEventsResponse> response = client
              .event
              .listCancellationInsightEvents()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#listCancellationInsightEvents");
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

[**EventListCancellationInsightEventsResponse**](EventListCancellationInsightEventsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="updateEventById"></a>
# **updateEventById**
> EventUpdateEventByIdResponse updateEventById(id).eventUpdateEventByIdRequest(eventUpdateEventByIdRequest).execute();

Update Event



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String id = "id_example";
    String reasonId = "reasonId_example";
    String comment = "comment_example";
    try {
      EventUpdateEventByIdResponse result = client
              .event
              .updateEventById(id)
              .reasonId(reasonId)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvent());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#updateEventById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EventUpdateEventByIdResponse> response = client
              .event
              .updateEventById(id)
              .reasonId(reasonId)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#updateEventById");
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
| **id** | **String**|  | |
| **eventUpdateEventByIdRequest** | [**EventUpdateEventByIdRequest**](EventUpdateEventByIdRequest.md)|  | [optional] |

### Return type

[**EventUpdateEventByIdResponse**](EventUpdateEventByIdResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

