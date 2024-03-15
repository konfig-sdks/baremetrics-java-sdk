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
import com.konfigthis.client.model.CancellationInsightCreateNewReasonRequest;
import com.konfigthis.client.model.CancellationInsightCreateNewReasonResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CancellationInsightApi
 */
@Disabled
public class CancellationInsightApiTest {

    private static CancellationInsightApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CancellationInsightApi(apiClient);
    }

    /**
     * Create Reason
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewReasonTest() throws ApiException {
        String text = null;
        Integer sortKey = null;
        CancellationInsightCreateNewReasonResponse response = api.createNewReason(text)
                .sortKey(sortKey)
                .execute();
        // TODO: test validations
    }

}
