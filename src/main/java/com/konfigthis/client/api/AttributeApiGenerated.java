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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.AttributeCreateFieldRequest;
import com.konfigthis.client.model.AttributeCreateFieldResponse;
import com.konfigthis.client.model.AttributeGetFieldsResponse;
import com.konfigthis.client.model.AttributeSetPropertiesRequest;
import com.konfigthis.client.model.AttributeSetPropertiesRequestAttributesInner;
import com.konfigthis.client.model.AttributeUpdateFieldRequest;
import com.konfigthis.client.model.AttributeUpdateFieldResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AttributeApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AttributeApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AttributeApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getSec0() == null) {
            throw new IllegalArgumentException("\"Authorization\" is required but no API key was provided. Please set \"Authorization\" with ApiClient#setSec0(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call createFieldCall(AttributeCreateFieldRequest attributeCreateFieldRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = attributeCreateFieldRequest;

        // create path and map variables
        String localVarPath = "/v1/attributes/fields";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createFieldValidateBeforeCall(AttributeCreateFieldRequest attributeCreateFieldRequest, final ApiCallback _callback) throws ApiException {
        return createFieldCall(attributeCreateFieldRequest, _callback);

    }


    private ApiResponse<AttributeCreateFieldResponse> createFieldWithHttpInfo(AttributeCreateFieldRequest attributeCreateFieldRequest) throws ApiException {
        okhttp3.Call localVarCall = createFieldValidateBeforeCall(attributeCreateFieldRequest, null);
        Type localVarReturnType = new TypeToken<AttributeCreateFieldResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createFieldAsync(AttributeCreateFieldRequest attributeCreateFieldRequest, final ApiCallback<AttributeCreateFieldResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFieldValidateBeforeCall(attributeCreateFieldRequest, _callback);
        Type localVarReturnType = new TypeToken<AttributeCreateFieldResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class CreateFieldRequestBuilder {
        private final String title;
        private final String fieldType;

        private CreateFieldRequestBuilder(String title, String fieldType) {
            this.title = title;
            this.fieldType = fieldType;
        }

        /**
         * Build call for createField
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AttributeCreateFieldRequest attributeCreateFieldRequest = buildBodyParams();
            return createFieldCall(attributeCreateFieldRequest, _callback);
        }

        private AttributeCreateFieldRequest buildBodyParams() {
            AttributeCreateFieldRequest attributeCreateFieldRequest = new AttributeCreateFieldRequest();
            attributeCreateFieldRequest.title(this.title);
            attributeCreateFieldRequest.fieldType(this.fieldType);
            return attributeCreateFieldRequest;
        }

        /**
         * Execute createField request
         * @return AttributeCreateFieldResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public AttributeCreateFieldResponse execute() throws ApiException {
            AttributeCreateFieldRequest attributeCreateFieldRequest = buildBodyParams();
            ApiResponse<AttributeCreateFieldResponse> localVarResp = createFieldWithHttpInfo(attributeCreateFieldRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute createField request with HTTP info returned
         * @return ApiResponse&lt;AttributeCreateFieldResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AttributeCreateFieldResponse> executeWithHttpInfo() throws ApiException {
            AttributeCreateFieldRequest attributeCreateFieldRequest = buildBodyParams();
            return createFieldWithHttpInfo(attributeCreateFieldRequest);
        }

        /**
         * Execute createField request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AttributeCreateFieldResponse> _callback) throws ApiException {
            AttributeCreateFieldRequest attributeCreateFieldRequest = buildBodyParams();
            return createFieldAsync(attributeCreateFieldRequest, _callback);
        }
    }

    /**
     * Create Attribute Field
     * 
     * @return CreateFieldRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public CreateFieldRequestBuilder createField(String title, String fieldType) throws IllegalArgumentException {
        if (title == null) throw new IllegalArgumentException("\"title\" is required but got null");
            

        if (fieldType == null) throw new IllegalArgumentException("\"fieldType\" is required but got null");
            

        return new CreateFieldRequestBuilder(title, fieldType);
    }
    private okhttp3.Call getFieldsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/attributes/fields";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFieldsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getFieldsCall(_callback);

    }


    private ApiResponse<AttributeGetFieldsResponse> getFieldsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getFieldsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<AttributeGetFieldsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getFieldsAsync(final ApiCallback<AttributeGetFieldsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFieldsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<AttributeGetFieldsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetFieldsRequestBuilder {

        private GetFieldsRequestBuilder() {
        }

        /**
         * Build call for getFields
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getFieldsCall(_callback);
        }


        /**
         * Execute getFields request
         * @return AttributeGetFieldsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public AttributeGetFieldsResponse execute() throws ApiException {
            ApiResponse<AttributeGetFieldsResponse> localVarResp = getFieldsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getFields request with HTTP info returned
         * @return ApiResponse&lt;AttributeGetFieldsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AttributeGetFieldsResponse> executeWithHttpInfo() throws ApiException {
            return getFieldsWithHttpInfo();
        }

        /**
         * Execute getFields request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AttributeGetFieldsResponse> _callback) throws ApiException {
            return getFieldsAsync(_callback);
        }
    }

    /**
     * List Attribute Fields
     * 
     * @return GetFieldsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public GetFieldsRequestBuilder getFields() throws IllegalArgumentException {
        return new GetFieldsRequestBuilder();
    }
    private okhttp3.Call setPropertiesCall(AttributeSetPropertiesRequest attributeSetPropertiesRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = attributeSetPropertiesRequest;

        // create path and map variables
        String localVarPath = "/v1/attributes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "text/plain"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setPropertiesValidateBeforeCall(AttributeSetPropertiesRequest attributeSetPropertiesRequest, final ApiCallback _callback) throws ApiException {
        return setPropertiesCall(attributeSetPropertiesRequest, _callback);

    }


    private ApiResponse<Object> setPropertiesWithHttpInfo(AttributeSetPropertiesRequest attributeSetPropertiesRequest) throws ApiException {
        okhttp3.Call localVarCall = setPropertiesValidateBeforeCall(attributeSetPropertiesRequest, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call setPropertiesAsync(AttributeSetPropertiesRequest attributeSetPropertiesRequest, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = setPropertiesValidateBeforeCall(attributeSetPropertiesRequest, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SetPropertiesRequestBuilder {
        private List<AttributeSetPropertiesRequestAttributesInner> attributes;

        private SetPropertiesRequestBuilder() {
        }

        /**
         * Set attributes
         * @param attributes  (optional)
         * @return SetPropertiesRequestBuilder
         */
        public SetPropertiesRequestBuilder attributes(List<AttributeSetPropertiesRequestAttributesInner> attributes) {
            this.attributes = attributes;
            return this;
        }
        
        /**
         * Build call for setProperties
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AttributeSetPropertiesRequest attributeSetPropertiesRequest = buildBodyParams();
            return setPropertiesCall(attributeSetPropertiesRequest, _callback);
        }

        private AttributeSetPropertiesRequest buildBodyParams() {
            AttributeSetPropertiesRequest attributeSetPropertiesRequest = new AttributeSetPropertiesRequest();
            attributeSetPropertiesRequest.attributes(this.attributes);
            return attributeSetPropertiesRequest;
        }

        /**
         * Execute setProperties request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            AttributeSetPropertiesRequest attributeSetPropertiesRequest = buildBodyParams();
            ApiResponse<Object> localVarResp = setPropertiesWithHttpInfo(attributeSetPropertiesRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute setProperties request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            AttributeSetPropertiesRequest attributeSetPropertiesRequest = buildBodyParams();
            return setPropertiesWithHttpInfo(attributeSetPropertiesRequest);
        }

        /**
         * Execute setProperties request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            AttributeSetPropertiesRequest attributeSetPropertiesRequest = buildBodyParams();
            return setPropertiesAsync(attributeSetPropertiesRequest, _callback);
        }
    }

    /**
     * Set Attributes
     * Create or update properties on customers. This will work across all sources.
     * @return SetPropertiesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public SetPropertiesRequestBuilder setProperties() throws IllegalArgumentException {
        return new SetPropertiesRequestBuilder();
    }
    private okhttp3.Call updateFieldCall(String id, AttributeUpdateFieldRequest attributeUpdateFieldRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = attributeUpdateFieldRequest;

        // create path and map variables
        String localVarPath = "/v1/attributes/fields/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "sec0" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateFieldValidateBeforeCall(String id, AttributeUpdateFieldRequest attributeUpdateFieldRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateField(Async)");
        }

        return updateFieldCall(id, attributeUpdateFieldRequest, _callback);

    }


    private ApiResponse<AttributeUpdateFieldResponse> updateFieldWithHttpInfo(String id, AttributeUpdateFieldRequest attributeUpdateFieldRequest) throws ApiException {
        okhttp3.Call localVarCall = updateFieldValidateBeforeCall(id, attributeUpdateFieldRequest, null);
        Type localVarReturnType = new TypeToken<AttributeUpdateFieldResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateFieldAsync(String id, AttributeUpdateFieldRequest attributeUpdateFieldRequest, final ApiCallback<AttributeUpdateFieldResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFieldValidateBeforeCall(id, attributeUpdateFieldRequest, _callback);
        Type localVarReturnType = new TypeToken<AttributeUpdateFieldResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateFieldRequestBuilder {
        private final String title;
        private final String id;

        private UpdateFieldRequestBuilder(String title, String id) {
            this.title = title;
            this.id = id;
        }

        /**
         * Build call for updateField
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            AttributeUpdateFieldRequest attributeUpdateFieldRequest = buildBodyParams();
            return updateFieldCall(id, attributeUpdateFieldRequest, _callback);
        }

        private AttributeUpdateFieldRequest buildBodyParams() {
            AttributeUpdateFieldRequest attributeUpdateFieldRequest = new AttributeUpdateFieldRequest();
            attributeUpdateFieldRequest.title(this.title);
            return attributeUpdateFieldRequest;
        }

        /**
         * Execute updateField request
         * @return AttributeUpdateFieldResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public AttributeUpdateFieldResponse execute() throws ApiException {
            AttributeUpdateFieldRequest attributeUpdateFieldRequest = buildBodyParams();
            ApiResponse<AttributeUpdateFieldResponse> localVarResp = updateFieldWithHttpInfo(id, attributeUpdateFieldRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateField request with HTTP info returned
         * @return ApiResponse&lt;AttributeUpdateFieldResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AttributeUpdateFieldResponse> executeWithHttpInfo() throws ApiException {
            AttributeUpdateFieldRequest attributeUpdateFieldRequest = buildBodyParams();
            return updateFieldWithHttpInfo(id, attributeUpdateFieldRequest);
        }

        /**
         * Execute updateField request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AttributeUpdateFieldResponse> _callback) throws ApiException {
            AttributeUpdateFieldRequest attributeUpdateFieldRequest = buildBodyParams();
            return updateFieldAsync(id, attributeUpdateFieldRequest, _callback);
        }
    }

    /**
     * Update Attribute Field
     * 
     * @param id  (required)
     * @return UpdateFieldRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> 200 </td><td>  -  </td></tr>
     </table>
     */
    public UpdateFieldRequestBuilder updateField(String title, String id) throws IllegalArgumentException {
        if (title == null) throw new IllegalArgumentException("\"title\" is required but got null");
            

        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new UpdateFieldRequestBuilder(title, id);
    }
}