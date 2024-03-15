package com.konfigthis.client;

import com.konfigthis.client.api.AccountApi;
import com.konfigthis.client.api.AnnotationApi;
import com.konfigthis.client.api.AttributeApi;
import com.konfigthis.client.api.CancellationInsightApi;
import com.konfigthis.client.api.EventApi;
import com.konfigthis.client.api.GoalApi;
import com.konfigthis.client.api.MetricApi;
import com.konfigthis.client.api.ReasonApi;
import com.konfigthis.client.api.SegmentApi;
import com.konfigthis.client.api.SourceApi;
import com.konfigthis.client.api.UserApi;

public class Baremetrics {
    private ApiClient apiClient;
    public final AccountApi account;
    public final AnnotationApi annotation;
    public final AttributeApi attribute;
    public final CancellationInsightApi cancellationInsight;
    public final EventApi event;
    public final GoalApi goal;
    public final MetricApi metric;
    public final ReasonApi reason;
    public final SegmentApi segment;
    public final SourceApi source;
    public final UserApi user;

    public Baremetrics() {
        this(null);
    }

    public Baremetrics(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.account = new AccountApi(this.apiClient);
        this.annotation = new AnnotationApi(this.apiClient);
        this.attribute = new AttributeApi(this.apiClient);
        this.cancellationInsight = new CancellationInsightApi(this.apiClient);
        this.event = new EventApi(this.apiClient);
        this.goal = new GoalApi(this.apiClient);
        this.metric = new MetricApi(this.apiClient);
        this.reason = new ReasonApi(this.apiClient);
        this.segment = new SegmentApi(this.apiClient);
        this.source = new SourceApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
    }

}
