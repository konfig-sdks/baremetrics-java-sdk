# CancellationInsightApi

All URIs are relative to *https://api.baremetrics.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewReason**](CancellationInsightApi.md#createNewReason) | **POST** /v1/cancellation_insights/reasons | Create Reason |


<a name="createNewReason"></a>
# **createNewReason**
> CancellationInsightCreateNewReasonResponse createNewReason().cancellationInsightCreateNewReasonRequest(cancellationInsightCreateNewReasonRequest).execute();

Create Reason



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CancellationInsightApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String text = "text_example";
    Integer sortKey = 56;
    try {
      CancellationInsightCreateNewReasonResponse result = client
              .cancellationInsight
              .createNewReason(text)
              .sortKey(sortKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getReason());
    } catch (ApiException e) {
      System.err.println("Exception when calling CancellationInsightApi#createNewReason");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CancellationInsightCreateNewReasonResponse> response = client
              .cancellationInsight
              .createNewReason(text)
              .sortKey(sortKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CancellationInsightApi#createNewReason");
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
| **cancellationInsightCreateNewReasonRequest** | [**CancellationInsightCreateNewReasonRequest**](CancellationInsightCreateNewReasonRequest.md)|  | [optional] |

### Return type

[**CancellationInsightCreateNewReasonResponse**](CancellationInsightCreateNewReasonResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

