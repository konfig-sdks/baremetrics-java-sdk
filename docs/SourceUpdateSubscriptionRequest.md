

# SourceUpdateSubscriptionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**planOid** | **String** | Your unique ID for the plan |  |
|**occurredAt** | **OffsetDateTime** | A unix timestamp of when this change occurred. Defaults to now |  [optional] |
|**addons** | [**List&lt;SourceCreateSubscriptionRequestAddonsInner&gt;**](SourceCreateSubscriptionRequestAddonsInner.md) | In cents. The OID can be anything you want. |  [optional] |
|**quantity** | **Integer** |  |  [optional] |
|**discount** | **Integer** | Integer value (in the same currency as the plan) |  [optional] |



