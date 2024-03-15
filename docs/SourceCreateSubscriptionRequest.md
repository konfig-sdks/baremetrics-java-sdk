

# SourceCreateSubscriptionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**oid** | **String** | Your unique ID for the subscription |  |
|**startedAt** | **OffsetDateTime** | A unix timestamp of when this subscription started |  |
|**canceledAt** | **OffsetDateTime** | A unix timestamp of when this subscription was, or should be canceled. This cannot be changed, so only set this if you are certain you know when the subscription will end. |  [optional] |
|**planOid** | **String** | Your unique ID for the plan |  |
|**customerOid** | **String** | Your unique ID for the customer |  |
|**addons** | [**List&lt;SourceCreateSubscriptionRequestAddonsInner&gt;**](SourceCreateSubscriptionRequestAddonsInner.md) |  |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**discount** | **Integer** | Integer value (in the same currency as the plan) |  [optional] |



