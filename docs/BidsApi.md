# BidsApi

All URIs are relative to *https://services.api.unity.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiseListCpiBids**](BidsApi.md#advertiseListCpiBids) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/cpi-bids | List CPI Bids
[**advertiseListRetentionBids**](BidsApi.md#advertiseListRetentionBids) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/retention-bids | List Retention Bids
[**advertiseListRetentionInfo**](BidsApi.md#advertiseListRetentionInfo) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/audience-pinpointer/retention-info | List Retention Eligibility
[**advertiseListRoasBids**](BidsApi.md#advertiseListRoasBids) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/roas-bids | List ROAS Bids
[**advertiseListRoasInfo**](BidsApi.md#advertiseListRoasInfo) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/audience-pinpointer/roas-info | List ROAS Eligibility
[**advertiseListSourceBids**](BidsApi.md#advertiseListSourceBids) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/source-bids | List Source Bids
[**advertiseReplaceCpiBids**](BidsApi.md#advertiseReplaceCpiBids) | **PUT** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/cpi-bids | Update CPI Bids
[**advertiseReplaceRetentionBids**](BidsApi.md#advertiseReplaceRetentionBids) | **PUT** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/retention-bids | Update Retention Bids
[**advertiseReplaceRoasBids**](BidsApi.md#advertiseReplaceRoasBids) | **PUT** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/roas-bids | Update ROAS Bids
[**advertiseReplaceSourceBids**](BidsApi.md#advertiseReplaceSourceBids) | **PUT** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/source-bids | Update Source Bids

<a name="advertiseListCpiBids"></a>
# **advertiseListCpiBids**
> AdvertiseCpiBidsResponseBody advertiseListCpiBids()

List CPI Bids

This endpoint returns campaign&#x27;s CPI bids. &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    CPI campaigns are now target CPI campaigns while your campaign optimization goals,   such as Installs, ROAS or Retention, do not change.    Bids are now Target CPI (tCPI) bids, the average amount you wish to pay per install. Target CPI is a   bidding strategy that sets bids to help you get as many conversions as possible within a tight range of the   target cost-per-install you set. This strategy automatically optimizes bidding for your ad each time it is   eligible to appear. Target CPI (tCPI) bids are set the same way as CPI bids via APIs. &lt;/div&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
try {
    AdvertiseCpiBidsResponseBody result = apiInstance.advertiseListCpiBids();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseListCpiBids");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseCpiBidsResponseBody**](AdvertiseCpiBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListRetentionBids"></a>
# **advertiseListRetentionBids**
> AdvertiseRetentionBidsResponseBody advertiseListRetentionBids()

List Retention Bids

This endpoint returns campaign&#x27;s retention bids.  For further information about retention bidding, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/audience-pinpointer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Unity Ads knowledge base&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
try {
    AdvertiseRetentionBidsResponseBody result = apiInstance.advertiseListRetentionBids();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseListRetentionBids");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseRetentionBidsResponseBody**](AdvertiseRetentionBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListRetentionInfo"></a>
# **advertiseListRetentionInfo**
> AdvertiseRetentionInfoResponseBody advertiseListRetentionInfo()

List Retention Eligibility

This endpoint returns information about which countries are currently available to be used in the Retention campaigns.  For further information about retention bidding, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/audience-pinpointer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Unity Ads knowledge base&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
try {
    AdvertiseRetentionInfoResponseBody result = apiInstance.advertiseListRetentionInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseListRetentionInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseRetentionInfoResponseBody**](AdvertiseRetentionInfoResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListRoasBids"></a>
# **advertiseListRoasBids**
> AdvertiseRoasBidsResponseBody advertiseListRoasBids()

List ROAS Bids

This endpoint returns campaign&#x27;s ROAS (Return On Ad Spend) bids.  For further information about ROAS bidding, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/audience-pinpointer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Unity Ads knowledge base&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
try {
    AdvertiseRoasBidsResponseBody result = apiInstance.advertiseListRoasBids();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseListRoasBids");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseRoasBidsResponseBody**](AdvertiseRoasBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListRoasInfo"></a>
# **advertiseListRoasInfo**
> AdvertiseRoasInfoResponseBody advertiseListRoasInfo()

List ROAS Eligibility

This endpoint returns information about which countries are currently eligible to be used in the Return On Ad Spend (ROAS) campaigns and additional ROAS-related information.  For further information about ROAS bidding, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/audience-pinpointer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Unity Ads knowledge base&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
try {
    AdvertiseRoasInfoResponseBody result = apiInstance.advertiseListRoasInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseListRoasInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseRoasInfoResponseBody**](AdvertiseRoasInfoResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListSourceBids"></a>
# **advertiseListSourceBids**
> AdvertiseSourceBidsResponseBody advertiseListSourceBids()

List Source Bids

This endpoint returns a campaign&#x27;s source bids.  &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    CPI campaigns are now target CPI campaigns while your campaign optimization goals,   such as Installs, ROAS or Retention, do not change.    Bids are now Target CPI (tCPI) bids, the average amount you wish to pay per install. Target CPI is a bidding   strategy that sets bids to help you get as many conversions as possible within a tight range of the target   cost-per-install you set. This strategy automatically optimizes bidding for your ad each time it is eligible to   appear. Target CPI (tCPI) bids are set the same way as CPI bids via APIs. &lt;/div&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
try {
    AdvertiseSourceBidsResponseBody result = apiInstance.advertiseListSourceBids();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseListSourceBids");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseSourceBidsResponseBody**](AdvertiseSourceBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseReplaceCpiBids"></a>
# **advertiseReplaceCpiBids**
> AdvertiseCpiBidsResponseBody advertiseReplaceCpiBids(body)

Update CPI Bids

This endpoint is used to replace a campaign&#x27;s CPI bids with a new set of bids.  To remove all the CPI bids of a campaign, send an empty array in the request body.  &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    CPI campaigns are now target CPI campaigns while your campaign optimization goals,   such as Installs, ROAS or Retention, do not change.    Bids are now Target CPI (tCPI) bids, the average amount you wish to pay per install. Target CPI is a   bidding strategy that sets bids to help you get as many conversions as possible within a tight range of the   target cost-per-install you set. This strategy automatically optimizes bidding for your ad each time it is   eligible to appear. Target CPI (tCPI) bids are set the same way as CPI bids via APIs. &lt;/div&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
List<Object> body = null; // List<Object> | 
try {
    AdvertiseCpiBidsResponseBody result = apiInstance.advertiseReplaceCpiBids(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseReplaceCpiBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Object&gt;**](Object.md)|  |

### Return type

[**AdvertiseCpiBidsResponseBody**](AdvertiseCpiBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseReplaceRetentionBids"></a>
# **advertiseReplaceRetentionBids**
> AdvertiseRetentionBidsResponseBody advertiseReplaceRetentionBids(body)

Update Retention Bids

This endpoint is used to replace campaign&#x27;s retention bids with a new set of retention bids.  For further information about retention bidding, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/audience-pinpointer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Unity Ads knowledge base&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
List<Object> body = null; // List<Object> | 
try {
    AdvertiseRetentionBidsResponseBody result = apiInstance.advertiseReplaceRetentionBids(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseReplaceRetentionBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Object&gt;**](Object.md)|  |

### Return type

[**AdvertiseRetentionBidsResponseBody**](AdvertiseRetentionBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseReplaceRoasBids"></a>
# **advertiseReplaceRoasBids**
> AdvertiseRoasBidsResponseBody advertiseReplaceRoasBids(body)

Update ROAS Bids

This endpoint is used to replace campaign&#x27;s ROAS (Return on Ad Spend) bids with a new set of ROAS bids.  ROAS bids can be set only for eligible countries. Use the &lt;a href&#x3D;\&quot;#operation/advertise-listRoasInfo\&quot;&gt;list ROAS information&lt;/a&gt; endpoint to check for which countries your app is currently eligible and what are the recommended ROAS goals for those countries. Further details about ROAS bidding and the eligibility criteria can be found from the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/audience-pinpointer\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Unity Ads knowledge base&lt;/a&gt;. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
List<Object> body = null; // List<Object> | 
try {
    AdvertiseRoasBidsResponseBody result = apiInstance.advertiseReplaceRoasBids(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseReplaceRoasBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Object&gt;**](Object.md)|  |

### Return type

[**AdvertiseRoasBidsResponseBody**](AdvertiseRoasBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseReplaceSourceBids"></a>
# **advertiseReplaceSourceBids**
> AdvertiseSourceBidsResponseBody advertiseReplaceSourceBids(body)

Update Source Bids

This endpoint is used to replace a campaign&#x27;s source bids with a new set of source bids.  To remove all source bids of a campaign, send an empty array in the request body.  &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    CPI campaigns are now target CPI campaigns while your campaign optimization goals,   such as Installs, ROAS or Retention, do not change.    Bids are now Target CPI (tCPI) bids, the average amount you wish to pay per install. Target CPI is a bidding   strategy that sets bids to help you get as many conversions as possible within a tight range of the target   cost-per-install you set. This strategy automatically optimizes bidding for your ad each time it is eligible to   appear. Target CPI (tCPI) bids are set the same way as CPI bids via APIs. &lt;/div&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BidsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BidsApi apiInstance = new BidsApi();
List<Object> body = null; // List<Object> | 
try {
    AdvertiseSourceBidsResponseBody result = apiInstance.advertiseReplaceSourceBids(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BidsApi#advertiseReplaceSourceBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;Object&gt;**](Object.md)|  |

### Return type

[**AdvertiseSourceBidsResponseBody**](AdvertiseSourceBidsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

