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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AnnotationCreateNewRequest;
import com.konfigthis.client.model.AnnotationCreateNewResponse;
import com.konfigthis.client.model.AnnotationGetDetailsResponse;
import com.konfigthis.client.model.AnnotationListResponse;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AnnotationApi
 */
@Disabled
public class AnnotationApiTest {

    private static AnnotationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AnnotationApi(apiClient);
    }

    /**
     * Create Annotation
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewTest() throws ApiException {
        String metric = null;
        String annotation = null;
        LocalDate date = null;
        Boolean global = null;
        String userId = null;
        AnnotationCreateNewResponse response = api.createNew(metric, annotation, date, global, userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Show Annotation
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String id = null;
        AnnotationGetDetailsResponse response = api.getDetails(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List Annotations
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        AnnotationListResponse response = api.list()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Annotation
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String id = null;
        Object response = api.removeById(id)
                .execute();
        // TODO: test validations
    }

}