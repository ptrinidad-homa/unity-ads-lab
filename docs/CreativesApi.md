# CreativesApi

All URIs are relative to *https://services.api.unity.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiseCreateCreative**](CreativesApi.md#advertiseCreateCreative) | **POST** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/creatives | Create Creative
[**advertiseGetCreative**](CreativesApi.md#advertiseGetCreative) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/creatives/{creativeId} | Get Creative
[**advertiseListCreatives**](CreativesApi.md#advertiseListCreatives) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/creatives | List Creatives

<a name="advertiseCreateCreative"></a>
# **advertiseCreateCreative**
> AdvertiseCreative advertiseCreateCreative()

Create Creative

Upload an end card or video creative using this endpoint.  Three different types of creatives can currently be created through this API:  * **Square end card**:  a single square shaped 800 × 800 image. * **End card pair**:  a 600 × 800 portrait image and a 800 × 600 landscape image. * **Video**:  contains either a 9:16 portrait video or a 16:9 landscape video. * **Playable**: contains an MRAID 2.0 compliant HTML document in a portrait, landscape or responsive orientation. [See full playable guidelines](https://unityads.unity3d.com/help/advertising/campaign-design-guide#playables).  Each creative type requires a slightly different JSON payload and a different set of binary files:  * one image file for a square end card, * two image files for an end card pair, * one video file for a video creative. * one HTML file for a playable creative.  To create a creative, you will need to send a HTTP request with content type of &#x60;multipart/form-data&#x60; to the API endpoint. The first part of the multipart form should contain a field named &#x60;creativeInfo&#x60; that contains JSON metadata about the creative, followed by one or more additional parts containing the binary data for each creative file.  **Example**  For a square end card the raw HTTP request could look for example following: &#x60;&#x60;&#x60; POST /advertise/v1/organizations/&lt;ORGANIZATION_ID&gt;/apps/&lt;CAMPAIGN_SET_ID&gt;/creatives HTTP/1.1 Host: services.api.unity.com:443 Authorization: Basic &lt;SERVICE_ACCOUNT_CREDENTIALS&gt; Content-Type: multipart/form-data; boundary&#x3D;--------------------------371131627955007232942795 Content-Length: 51165 ----------------------------371131627955007232942795 Content-Disposition: form-data; name&#x3D;\&quot;creativeInfo\&quot; Content-Type: application/json  {   \&quot;name\&quot;: \&quot;My Creative\&quot;,   \&quot;language\&quot;: \&quot;en\&quot;,   \&quot;squareEndCard\&quot;: {     \&quot;fileName\&quot;: \&quot;myCreative.jpeg\&quot;   } } ----------------------------371131627955007232942795 Content-Disposition: form-data; name&#x3D;\&quot;squareEndCardFile\&quot;; filename&#x3D;\&quot;myCreative.jpeg\&quot;  &lt;IMAGE_BINARY_DATA&gt; ----------------------------371131627955007232942795-- &#x60;&#x60;&#x60;  Notice that the place holders &#x60;&lt;ORGANIZATION_ID&gt;&#x60;, &#x60;&lt;CAMPAIGN_SET_ID&gt;&#x60;, &#x60;&lt;SERVICE_ACCOUNT_CREDENTIALS&gt;&#x60; and &#x60;&lt;IMAGE_BINARY_DATA&gt;&#x60; need to be replaced with valid values.  When uploading creative assets, please observe Unity’s advertising content policy. [Read more](https://unity3d.com/legal/advertising-content-policy)  A continuous data flow is expected when uploading the file. The creative upload is allowed to take at most 5 minutes. This means that if you are creating a creative that contains a video that has the maximum file size of 100 MB then your average upload speed must at least 2.7 Mbps. If the upload takes longer than 5 minutes then the request will fail.  If the upload halts (no bytes are transferred) for over 30 seconds then the request will fail.  If the same files have already been uploaded as part of a previous creative, the existing creative is returned and no new one is created. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreativesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CreativesApi apiInstance = new CreativesApi();
try {
    AdvertiseCreative result = apiInstance.advertiseCreateCreative();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativesApi#advertiseCreateCreative");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseCreative**](AdvertiseCreative.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="advertiseGetCreative"></a>
# **advertiseGetCreative**
> AdvertiseCreative advertiseGetCreative()

Get Creative

This endpoint returns a creative by the creative ID and campaign set ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreativesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CreativesApi apiInstance = new CreativesApi();
try {
    AdvertiseCreative result = apiInstance.advertiseGetCreative();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativesApi#advertiseGetCreative");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseCreative**](AdvertiseCreative.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListCreatives"></a>
# **advertiseListCreatives**
> AdvertiseCreativesResponseBody advertiseListCreatives()

List Creatives

This endpoint returns all available creatives that are under the given app. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CreativesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

CreativesApi apiInstance = new CreativesApi();
try {
    AdvertiseCreativesResponseBody result = apiInstance.advertiseListCreatives();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreativesApi#advertiseListCreatives");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseCreativesResponseBody**](AdvertiseCreativesResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

