

# SourceCreateOneOffRefundRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**oid** | **String** | Your unique reference for this charge |  |
|**amount** | **Integer** | The charge amount (in cents) |  |
|**currency** | **String** | The ISO code of the currency of this plan. E.G: usd |  |
|**customerOid** | **String** | Your unique ID for the customer |  |
|**chargeOid** | **String** | Which charge do you want to refund? This must be an API charge. |  |
|**created** | **OffsetDateTime** | Unix timestamp of when this was created |  [optional] |



