# CreativePacksApi

All URIs are relative to *https://services.api.unity.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiseCreateCreativePack**](CreativePacksApi.md#advertiseCreateCreativePack) | **POST** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/creative-packs | Create Creative Pack
[**advertiseDeleteCreativePack**](CreativePacksApi.md#advertiseDeleteCreativePack) | **DELETE** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/creative-packs/{creativePackId} | Delete Creative Pack
[**advertiseGetCreativePack**](CreativePacksApi.md#advertiseGetCreativePack) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/creative-packs/{creativePackId} | Get Creative Pack
[**advertiseListCreativePacks**](CreativePacksApi.md#advertiseListCreativePacks) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/creative-packs | List Creative Packs

<a name="advertiseCreateCreativePack"></a>
# **advertiseCreateCreativePack**
> AdvertiseCreativePack advertiseCreateCreativePack(body)

Create Creative Pack

Create a creative pack using this endpoint.  Three different types of creative packs can be currently created through this API:  * **video**: this creative pack type contains a single end card creative (square end card or end card pair) and one or two video creatives (one end card + 1-2 videos). * **playable**: this creative pack type contains one or two playable creatives. * **video and playable**: this creative pack type contains one or two video creatives and a single responsive playable.  Each creative pack type requires different &#x60;creativeIds&#x60; which have to match with the given creative pack type. If the creatives referenced by the &#x60;creativeIds&#x60; do not match with the creative pack&#x27;s &#x60;type&#x60; then the API will respond with &#x60;400&#x60; bad request.  Available creatives for your app can be listed via &lt;a href&#x3D;\&quot;#operation/advertise-listCreatives\&quot;&gt;list Creatives&lt;/a&gt; endpoint. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreativePacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CreativePacksApi apiInstance = new CreativePacksApi();
AdvertiseCreateCreativePackRequestBody body = new AdvertiseCreateCreativePackRequestBody(); // AdvertiseCreateCreativePackRequestBody | 
try {
    AdvertiseCreativePack result = apiInstance.advertiseCreateCreativePack(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativePacksApi#advertiseCreateCreativePack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseCreateCreativePackRequestBody**](AdvertiseCreateCreativePackRequestBody.md)|  |

### Return type

[**AdvertiseCreativePack**](AdvertiseCreativePack.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseDeleteCreativePack"></a>
# **advertiseDeleteCreativePack**
> advertiseDeleteCreativePack()

Delete Creative Pack

This endpoint removes a creative pack by the creative pack ID and campaign set ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreativePacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CreativePacksApi apiInstance = new CreativePacksApi();
try {
    apiInstance.advertiseDeleteCreativePack();
} catch (ApiException e) {
    System.err.println("Exception when calling CreativePacksApi#advertiseDeleteCreativePack");
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

<a name="advertiseGetCreativePack"></a>
# **advertiseGetCreativePack**
> AdvertiseCreativePack advertiseGetCreativePack()

Get Creative Pack

This endpoint returns a creative pack by the creative pack ID and campaign set ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreativePacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CreativePacksApi apiInstance = new CreativePacksApi();
try {
    AdvertiseCreativePack result = apiInstance.advertiseGetCreativePack();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativePacksApi#advertiseGetCreativePack");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseCreativePack**](AdvertiseCreativePack.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListCreativePacks"></a>
# **advertiseListCreativePacks**
> AdvertiseCreativePacksResponseBody advertiseListCreativePacks(offset, limit, filterName)

List Creative Packs

This endpoint returns creative packs that are under the given app. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreativePacksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CreativePacksApi apiInstance = new CreativePacksApi();
Integer offset = 56; // Integer | Offset tells to skip that many entities before start returning entities. `offset=0` is the same as omitting the offset clause. If both `offset` and `limit` are present, then `offset` entities are skipped before starting to count the `limit` entities that are returned. 
Integer limit = 56; // Integer | Amount of entities to return.
String filterName = "filterName_example"; // String | 
try {
    AdvertiseCreativePacksResponseBody result = apiInstance.advertiseListCreativePacks(offset, limit, filterName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativePacksApi#advertiseListCreativePacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | [**Integer**](.md)| Offset tells to skip that many entities before start returning entities. &#x60;offset&#x3D;0&#x60; is the same as omitting the offset clause. If both &#x60;offset&#x60; and &#x60;limit&#x60; are present, then &#x60;offset&#x60; entities are skipped before starting to count the &#x60;limit&#x60; entities that are returned.  | [optional]
 **limit** | [**Integer**](.md)| Amount of entities to return. | [optional]
 **filterName** | **String**|  | [optional]

### Return type

[**AdvertiseCreativePacksResponseBody**](AdvertiseCreativePacksResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

