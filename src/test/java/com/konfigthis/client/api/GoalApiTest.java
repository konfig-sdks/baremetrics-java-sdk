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
import com.konfigthis.client.model.GoalCreateNewGoalRequest;
import com.konfigthis.client.model.GoalCreateNewGoalResponse;
import com.konfigthis.client.model.GoalGetByIdResponse;
import com.konfigthis.client.model.GoalGetListResponse;
import java.time.LocalDate;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GoalApi
 */
@Disabled
public class GoalApiTest {

    private static GoalApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new GoalApi(apiClient);
    }

    /**
     * Create Goal
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewGoalTest() throws ApiException {
        String metric = null;
        Integer startAmount = null;
        Integer endAmount = null;
        LocalDate startDate = null;
        LocalDate endDate = null;
        String name = null;
        GoalCreateNewGoalResponse response = api.createNewGoal(metric, startAmount, endAmount, startDate, endDate, name)
                .execute();
        // TODO: test validations
    }

    /**
     * Show Goal
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        GoalGetByIdResponse response = api.getById(id)
                .execute();
        // TODO: test validations
    }

    /**
     * List Goals
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        GoalGetListResponse response = api.getList()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Goal
     *
     * 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTest() throws ApiException {
        String id = null;
        Object response = api.remove(id)
                .execute();
        // TODO: test validations
    }

}