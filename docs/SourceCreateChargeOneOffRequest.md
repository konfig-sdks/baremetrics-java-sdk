

# SourceCreateChargeOneOffRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**oid** | **String** | Your unique reference for this charge |  |
|**amount** | **Integer** | The charge amount (in cents) |  |
|**currency** | **String** | The ISO code of the currency of this plan. E.G: usd |  |
|**customerOid** | **String** | Your unique ID for the customer |  |
|**created** | **OffsetDateTime** | Unix timestamp of when this was created |  [optional] |
|**status** | **String** | The status of this charge. Can be paid or failed. Defaults to paid. |  [optional] |
|**fee** | **Integer** |  |  [optional] |
|**subscriptionOid** | **String** | This can only be supplied when Subscription Auto Charging is disabled. Please contact support if you want to handle your subscription charges manually. |  [optional] |



