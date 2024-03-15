# MetricApi

All URIs are relative to *https://api.baremetrics.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listCustomers**](MetricApi.md#listCustomers) | **GET** /v1/metrics/{metric}/customers | Show Customers |
| [**showCohorts**](MetricApi.md#showCohorts) | **GET** /v1/metrics/cohorts | Show Cohorts |
| [**showDetails**](MetricApi.md#showDetails) | **GET** /v1/metrics/{metric} | Show Metric |
| [**showPlanBreakout**](MetricApi.md#showPlanBreakout) | **GET** /v1/metrics/{metric}/plans | Show Plan Breakout |
| [**showSummary**](MetricApi.md#showSummary) | **GET** /v1/metrics | Show Summary |


<a name="listCustomers"></a>
# **listCustomers**
> String listCustomers(startDate, endDate, metric).execute();

Show Customers

Returns a list of customers that make up this metric. For example, the upgrades metric will return all customers who have upgraded within the selected range. You can also see their MRR contribution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    String metric = "metric_example"; // You can see a list of available metrics [here](https://developers.baremetrics.com/reference/introduction)
    try {
      String result = client
              .metric
              .listCustomers(startDate, endDate, metric)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#listCustomers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .metric
              .listCustomers(startDate, endDate, metric)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#listCustomers");
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
| **startDate** | **LocalDate**|  | |
| **endDate** | **LocalDate**|  | |
| **metric** | **String**| You can see a list of available metrics [here](https://developers.baremetrics.com/reference/introduction) | |

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

<a name="showCohorts"></a>
# **showCohorts**
> List&lt;MetricShowCohortsResponseInner&gt; showCohorts().execute();

Show Cohorts



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetricApi;
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
      List<MetricShowCohortsResponseInner> result = client
              .metric
              .showCohorts()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showCohorts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<MetricShowCohortsResponseInner>> response = client
              .metric
              .showCohorts()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showCohorts");
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

[**List&lt;MetricShowCohortsResponseInner&gt;**](MetricShowCohortsResponseInner.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="showDetails"></a>
# **showDetails**
> MetricShowDetailsResponse showDetails(metric, startDate, endDate).compareTo(compareTo).execute();

Show Metric



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String metric = "metric_example"; // You can see a list of available metrics [here](https://developers.baremetrics.com/reference/introduction)
    LocalDate startDate = LocalDate.parse("2016-11-01");
    LocalDate endDate = LocalDate.parse("2016-11-26");
    Integer compareTo = 30; // The number of days ago to compare results to
    try {
      MetricShowDetailsResponse result = client
              .metric
              .showDetails(metric, startDate, endDate)
              .compareTo(compareTo)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetrics());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetricShowDetailsResponse> response = client
              .metric
              .showDetails(metric, startDate, endDate)
              .compareTo(compareTo)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showDetails");
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
| **metric** | **String**| You can see a list of available metrics [here](https://developers.baremetrics.com/reference/introduction) | |
| **startDate** | **LocalDate**|  | [default to 2016-11-01] |
| **endDate** | **LocalDate**|  | [default to 2016-11-26] |
| **compareTo** | **Integer**| The number of days ago to compare results to | [optional] [default to 30] |

### Return type

[**MetricShowDetailsResponse**](MetricShowDetailsResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="showPlanBreakout"></a>
# **showPlanBreakout**
> MetricShowPlanBreakoutResponse showPlanBreakout(startDate, endDate, metric).execute();

Show Plan Breakout

This allows you to break down a metric by plan, across a date range

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    LocalDate startDate = LocalDate.now();
    LocalDate endDate = LocalDate.now();
    String metric = "metric_example"; // You can see a list of available metrics [here](https://developers.baremetrics.com/reference/introduction)
    try {
      MetricShowPlanBreakoutResponse result = client
              .metric
              .showPlanBreakout(startDate, endDate, metric)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetrics());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showPlanBreakout");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetricShowPlanBreakoutResponse> response = client
              .metric
              .showPlanBreakout(startDate, endDate, metric)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showPlanBreakout");
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
| **startDate** | **LocalDate**|  | |
| **endDate** | **LocalDate**|  | |
| **metric** | **String**| You can see a list of available metrics [here](https://developers.baremetrics.com/reference/introduction) | |

### Return type

[**MetricShowPlanBreakoutResponse**](MetricShowPlanBreakoutResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

<a name="showSummary"></a>
# **showSummary**
> MetricShowSummaryResponse showSummary(startDate, endDate).execute();

Show Summary



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Baremetrics;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.MetricApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.baremetrics.com";
    
    configuration.sec0  = "YOUR API KEY";
    Baremetrics client = new Baremetrics(configuration);
    String startDate = "2016-11-01";
    String endDate = "2016-11-26";
    try {
      MetricShowSummaryResponse result = client
              .metric
              .showSummary(startDate, endDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getMetrics());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showSummary");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<MetricShowSummaryResponse> response = client
              .metric
              .showSummary(startDate, endDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricApi#showSummary");
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
| **startDate** | **String**|  | [default to 2016-11-01] |
| **endDate** | **String**|  | [default to 2016-11-26] |

### Return type

[**MetricShowSummaryResponse**](MetricShowSummaryResponse.md)

### Authorization

[sec0](../README.md#sec0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 |  -  |

