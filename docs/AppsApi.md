# AppsApi

All URIs are relative to *https://services.api.unity.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiseCreateApp**](AppsApi.md#advertiseCreateApp) | **POST** /advertise/v1/organizations/{organizationId}/apps | Create App
[**advertiseDeleteApp**](AppsApi.md#advertiseDeleteApp) | **DELETE** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId} | Delete App
[**advertiseGetApp**](AppsApi.md#advertiseGetApp) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId} | Get App
[**advertiseListApps**](AppsApi.md#advertiseListApps) | **GET** /advertise/v1/organizations/{organizationId}/apps | List Apps
[**advertiseUpdateApp**](AppsApi.md#advertiseUpdateApp) | **PATCH** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId} | Update App

<a name="advertiseCreateApp"></a>
# **advertiseCreateApp**
> AdvertiseApp advertiseCreateApp(body, organizationId)

Create App

This endpoint creates a new app 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

AppsApi apiInstance = new AppsApi();
AdvertiseCreateAppRequestBody body = new AdvertiseCreateAppRequestBody(); // AdvertiseCreateAppRequestBody | 
Long organizationId = 56L; // Long | Core ID of the organization.  You can look up your Organization's ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser's address bar: `https://dashboard.unity3d.com/organizations/<ORGANIZATION_ID_IS_HERE>/acquire/about`  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls). 
try {
    AdvertiseApp result = apiInstance.advertiseCreateApp(body, organizationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#advertiseCreateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseCreateAppRequestBody**](AdvertiseCreateAppRequestBody.md)|  |
 **organizationId** | [**Long**](.md)| Core ID of the organization.  You can look up your Organization&#x27;s ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser&#x27;s address bar: &#x60;https://dashboard.unity3d.com/organizations/&lt;ORGANIZATION_ID_IS_HERE&gt;/acquire/about&#x60;  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls).  |

### Return type

[**AdvertiseApp**](AdvertiseApp.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseDeleteApp"></a>
# **advertiseDeleteApp**
> advertiseDeleteApp(organizationId, campaignSetId)

Delete App

This endpoint is used to delete an App.  **Note:** all campaigns, bids and creative packs belonging to the app will also be deleted. Deleted apps cannot be recovered. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

AppsApi apiInstance = new AppsApi();
Long organizationId = 56L; // Long | Core ID of the organization.  You can look up your Organization's ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser's address bar: `https://dashboard.unity3d.com/organizations/<ORGANIZATION_ID_IS_HERE>/acquire/about`  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls). 
String campaignSetId = "campaignSetId_example"; // String | Unique identifier for an App.
try {
    apiInstance.advertiseDeleteApp(organizationId, campaignSetId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#advertiseDeleteApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | [**Long**](.md)| Core ID of the organization.  You can look up your Organization&#x27;s ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser&#x27;s address bar: &#x60;https://dashboard.unity3d.com/organizations/&lt;ORGANIZATION_ID_IS_HERE&gt;/acquire/about&#x60;  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls).  |
 **campaignSetId** | [**String**](.md)| Unique identifier for an App. |

### Return type

null (empty response body)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="advertiseGetApp"></a>
# **advertiseGetApp**
> AdvertiseApp advertiseGetApp(organizationId, campaignSetId)

Get App

This endpoint returns the app information for a given app ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

AppsApi apiInstance = new AppsApi();
Long organizationId = 56L; // Long | Core ID of the organization.  You can look up your Organization's ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser's address bar: `https://dashboard.unity3d.com/organizations/<ORGANIZATION_ID_IS_HERE>/acquire/about`  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls). 
String campaignSetId = "campaignSetId_example"; // String | Unique identifier for an App.
try {
    AdvertiseApp result = apiInstance.advertiseGetApp(organizationId, campaignSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#advertiseGetApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | [**Long**](.md)| Core ID of the organization.  You can look up your Organization&#x27;s ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser&#x27;s address bar: &#x60;https://dashboard.unity3d.com/organizations/&lt;ORGANIZATION_ID_IS_HERE&gt;/acquire/about&#x60;  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls).  |
 **campaignSetId** | [**String**](.md)| Unique identifier for an App. |

### Return type

[**AdvertiseApp**](AdvertiseApp.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListApps"></a>
# **advertiseListApps**
> AdvertiseAppsResponseBody advertiseListApps(organizationId, offset, limit, filterStore, filterStoreId)

List Apps

This endpoint returns all available apps 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

AppsApi apiInstance = new AppsApi();
Long organizationId = 56L; // Long | Core ID of the organization.  You can look up your Organization's ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser's address bar: `https://dashboard.unity3d.com/organizations/<ORGANIZATION_ID_IS_HERE>/acquire/about`  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls). 
Integer offset = 56; // Integer | Offset tells to skip that many entities before start returning entities. `offset=0` is the same as omitting the offset clause. If both `offset` and `limit` are present, then `offset` entities are skipped before starting to count the `limit` entities that are returned. 
Integer limit = 56; // Integer | Amount of entities to return.
String filterStore = "filterStore_example"; // String | 
String filterStoreId = "filterStoreId_example"; // String | 
try {
    AdvertiseAppsResponseBody result = apiInstance.advertiseListApps(organizationId, offset, limit, filterStore, filterStoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#advertiseListApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **organizationId** | [**Long**](.md)| Core ID of the organization.  You can look up your Organization&#x27;s ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser&#x27;s address bar: &#x60;https://dashboard.unity3d.com/organizations/&lt;ORGANIZATION_ID_IS_HERE&gt;/acquire/about&#x60;  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls).  |
 **offset** | [**Integer**](.md)| Offset tells to skip that many entities before start returning entities. &#x60;offset&#x3D;0&#x60; is the same as omitting the offset clause. If both &#x60;offset&#x60; and &#x60;limit&#x60; are present, then &#x60;offset&#x60; entities are skipped before starting to count the &#x60;limit&#x60; entities that are returned.  | [optional]
 **limit** | [**Integer**](.md)| Amount of entities to return. | [optional]
 **filterStore** | **String**|  | [optional] [enum: apple, google, standalone_android]
 **filterStoreId** | **String**|  | [optional]

### Return type

[**AdvertiseAppsResponseBody**](AdvertiseAppsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseUpdateApp"></a>
# **advertiseUpdateApp**
> AdvertiseApp advertiseUpdateApp(body, organizationId, campaignSetId)

Update App

This endpoint is used to update an App.  **Note**: this endpoint supports partial updates. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

AppsApi apiInstance = new AppsApi();
AdvertiseUpdateAppRequestBody body = new AdvertiseUpdateAppRequestBody(); // AdvertiseUpdateAppRequestBody | 
Long organizationId = 56L; // Long | Core ID of the organization.  You can look up your Organization's ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser's address bar: `https://dashboard.unity3d.com/organizations/<ORGANIZATION_ID_IS_HERE>/acquire/about`  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls). 
String campaignSetId = "campaignSetId_example"; // String | Unique identifier for an App.
try {
    AdvertiseApp result = apiInstance.advertiseUpdateApp(body, organizationId, campaignSetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#advertiseUpdateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseUpdateAppRequestBody**](AdvertiseUpdateAppRequestBody.md)|  |
 **organizationId** | [**Long**](.md)| Core ID of the organization.  You can look up your Organization&#x27;s ID by opening up the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) and by looking up the ID from the browser&#x27;s address bar: &#x60;https://dashboard.unity3d.com/organizations/&lt;ORGANIZATION_ID_IS_HERE&gt;/acquire/about&#x60;  For further information about the IDs, please see following [documentation](#section/General-Information/Resource-IDs-Used-in-the-API-Calls).  |
 **campaignSetId** | [**String**](.md)| Unique identifier for an App. |

### Return type

[**AdvertiseApp**](AdvertiseApp.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

