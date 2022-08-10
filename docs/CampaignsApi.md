# CampaignsApi

All URIs are relative to *https://services.api.unity.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiseAssignCreativePack**](CampaignsApi.md#advertiseAssignCreativePack) | **POST** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-creative-packs | Assign Creative Pack
[**advertiseCreateCampaign**](CampaignsApi.md#advertiseCreateCampaign) | **POST** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns | Create Campaign
[**advertiseDeleteCampaign**](CampaignsApi.md#advertiseDeleteCampaign) | **DELETE** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId} | Delete Campaign
[**advertiseGetCampaign**](CampaignsApi.md#advertiseGetCampaign) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId} | Get Campaign
[**advertiseGetTargeting**](CampaignsApi.md#advertiseGetTargeting) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/targeting | Get targeting options
[**advertiseListAssignedCreativePacks**](CampaignsApi.md#advertiseListAssignedCreativePacks) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-creative-packs | List Assigned Creative Packs
[**advertiseListCampaigns**](CampaignsApi.md#advertiseListCampaigns) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns | List Campaigns
[**advertiseUnassignCreativePack**](CampaignsApi.md#advertiseUnassignCreativePack) | **DELETE** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-creative-packs/{assignedCreativePackId} | Unassign Creative Pack
[**advertiseUpdateCampaign**](CampaignsApi.md#advertiseUpdateCampaign) | **PATCH** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId} | Update Campaign
[**advertiseUpdateTargeting**](CampaignsApi.md#advertiseUpdateTargeting) | **PATCH** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/targeting | Update targeting options

<a name="advertiseAssignCreativePack"></a>
# **advertiseAssignCreativePack**
> AdvertiseAssignedCreativePack advertiseAssignCreativePack(body)

Assign Creative Pack

Assign a creative pack to a campaign.  &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    Please note that there is a limit of 50 creative pack assignments in apps sharing the same store id that you   can use on your live campaigns for iOS apps. You can find more information about this limit   &lt;a href&#x3D;\&quot;https://resources.unity.com/ios-14-resources/campaign-management-best-practices#5-limit-campaigns\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. &lt;/div&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
AdvertiseAssignCreativePackRequestBody body = new AdvertiseAssignCreativePackRequestBody(); // AdvertiseAssignCreativePackRequestBody | 
try {
    AdvertiseAssignedCreativePack result = apiInstance.advertiseAssignCreativePack(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseAssignCreativePack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseAssignCreativePackRequestBody**](AdvertiseAssignCreativePackRequestBody.md)|  |

### Return type

[**AdvertiseAssignedCreativePack**](AdvertiseAssignedCreativePack.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseCreateCampaign"></a>
# **advertiseCreateCampaign**
> AdvertiseCreatedCampaignResponseBody advertiseCreateCampaign(body)

Create Campaign

This endpoint is used to create a campaign.  In order to complete the campaign setup, take the following steps:   1. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreative\&quot;&gt;Upload Creatives&lt;/a&gt; or use the old ones if you already have uploaded them.   2. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreativePack\&quot;&gt;Create Creative Pack&lt;/a&gt; or use any approved creative pack you already have.   3. You should &lt;a href&#x3D;\&quot;#operation/advertise-assignCreativePack\&quot;&gt;Assign Creative Pack&lt;/a&gt; to the campaign.   4. Depending on the &#x60;goal&#x60; of your campaign you need to update CPI/ROAS/Retention bids by calling the right &lt;a href&#x3D;\&quot;#tag/Bids\&quot;&gt;Bids endpoint&lt;/a&gt;.   5. Finally if you prepared all requirements you can change the &#x60;enabled&#x60; status by calling the &lt;a href&#x3D;\&quot;#operation/advertise-updateCampaign\&quot;&gt;Update Campaign&lt;/a&gt; endpoint.  **Note**: The campaign must have the below prerequisites to go live:   - At least one assigned and approved creative pack.   - Tracking attribution links.   - Specify countries you would like to advertise in.   - The organization is required to have a budget and also, you can optionally &lt;a href&#x3D;\&quot;#operation/advertise-createBudget\&quot;&gt;create&lt;/a&gt; and &lt;a href&#x3D;\&quot;#operation/advertise-replaceAssignedBudget\&quot;&gt;assign&lt;/a&gt; the campaign-level budget.  **Note**: Creating an iOS Campaign with CPI Billing type is not publicly available yet. If you want to try this feature, please reach out to your Unity partner or message us at unityads-support@unity3d.com. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
AdvertiseCreateCampaignRequestBody body = new AdvertiseCreateCampaignRequestBody(); // AdvertiseCreateCampaignRequestBody | 
try {
    AdvertiseCreatedCampaignResponseBody result = apiInstance.advertiseCreateCampaign(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseCreateCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseCreateCampaignRequestBody**](AdvertiseCreateCampaignRequestBody.md)|  |

### Return type

[**AdvertiseCreatedCampaignResponseBody**](AdvertiseCreatedCampaignResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseDeleteCampaign"></a>
# **advertiseDeleteCampaign**
> advertiseDeleteCampaign()

Delete Campaign

This endpoint is used to delete a campaign. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
try {
    apiInstance.advertiseDeleteCampaign();
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseDeleteCampaign");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="advertiseGetCampaign"></a>
# **advertiseGetCampaign**
> AdvertiseCampaignResponseBody advertiseGetCampaign()

Get Campaign

This endpoint returns the campaign information for a given campaign id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
try {
    AdvertiseCampaignResponseBody result = apiInstance.advertiseGetCampaign();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseGetCampaign");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseCampaignResponseBody**](AdvertiseCampaignResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseGetTargeting"></a>
# **advertiseGetTargeting**
> AdvertiseGetTargetingResponseBody advertiseGetTargeting()

Get targeting options

This endpoint returns the targeting options for a certain campaign. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
try {
    AdvertiseGetTargetingResponseBody result = apiInstance.advertiseGetTargeting();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseGetTargeting");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseGetTargetingResponseBody**](AdvertiseGetTargetingResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListAssignedCreativePacks"></a>
# **advertiseListAssignedCreativePacks**
> AdvertiseAssignedCreativePacksResponseBody advertiseListAssignedCreativePacks()

List Assigned Creative Packs

This endpoint returns creative packs that are assigned to a campaign.  **Note**: you can also use the &lt;a href&#x3D;\&quot;#operation/advertise-listCreativePacks\&quot;&gt;list Creative Packs&lt;/a&gt; endpoint to check which creative packs are currently assigned to which campaigns. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
try {
    AdvertiseAssignedCreativePacksResponseBody result = apiInstance.advertiseListAssignedCreativePacks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseListAssignedCreativePacks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseAssignedCreativePacksResponseBody**](AdvertiseAssignedCreativePacksResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListCampaigns"></a>
# **advertiseListCampaigns**
> AdvertiseCampaignsResponseBody advertiseListCampaigns()

List Campaigns

This endpoint returns campaigns for the given app.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
try {
    AdvertiseCampaignsResponseBody result = apiInstance.advertiseListCampaigns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseListCampaigns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseCampaignsResponseBody**](AdvertiseCampaignsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseUnassignCreativePack"></a>
# **advertiseUnassignCreativePack**
> advertiseUnassignCreativePack()

Unassign Creative Pack

Unassign a creative pack from a campaign. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
try {
    apiInstance.advertiseUnassignCreativePack();
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseUnassignCreativePack");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="advertiseUpdateCampaign"></a>
# **advertiseUpdateCampaign**
> AdvertiseUpdatedCampaignResponseBody advertiseUpdateCampaign(body)

Update Campaign

This endpoint is used to update a campaign.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;enabled&#x60; field. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
AdvertiseUpdateCampaignRequestBody body = new AdvertiseUpdateCampaignRequestBody(); // AdvertiseUpdateCampaignRequestBody | 
try {
    AdvertiseUpdatedCampaignResponseBody result = apiInstance.advertiseUpdateCampaign(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseUpdateCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseUpdateCampaignRequestBody**](AdvertiseUpdateCampaignRequestBody.md)|  |

### Return type

[**AdvertiseUpdatedCampaignResponseBody**](AdvertiseUpdatedCampaignResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseUpdateTargeting"></a>
# **advertiseUpdateTargeting**
> AdvertiseUpdateTargetingResponseBody advertiseUpdateTargeting(body)

Update targeting options

This endpoint is used to update targeting options.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;appTargeting&#x60; option. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CampaignsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CampaignsApi apiInstance = new CampaignsApi();
AdvertiseTargeting body = new AdvertiseTargeting(); // AdvertiseTargeting | 
try {
    AdvertiseUpdateTargetingResponseBody result = apiInstance.advertiseUpdateTargeting(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignsApi#advertiseUpdateTargeting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseTargeting**](AdvertiseTargeting.md)|  |

### Return type

[**AdvertiseUpdateTargetingResponseBody**](AdvertiseUpdateTargetingResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

