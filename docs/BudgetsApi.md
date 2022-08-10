# BudgetsApi

All URIs are relative to *https://services.api.unity.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiseCreateBudget**](BudgetsApi.md#advertiseCreateBudget) | **POST** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/budgets | Create Budget
[**advertiseGetAssignedBudget**](BudgetsApi.md#advertiseGetAssignedBudget) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-budget | Get Assigned Budget
[**advertiseGetBudget**](BudgetsApi.md#advertiseGetBudget) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/budgets/{budgetId} | Get Budget
[**advertiseListBudgets**](BudgetsApi.md#advertiseListBudgets) | **GET** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/budgets | List Budgets
[**advertiseReplaceAssignedBudget**](BudgetsApi.md#advertiseReplaceAssignedBudget) | **PUT** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-budget | Assign Budget
[**advertiseUnassignBudget**](BudgetsApi.md#advertiseUnassignBudget) | **DELETE** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-budget | Unassign Budget
[**advertiseUpdateBudget**](BudgetsApi.md#advertiseUpdateBudget) | **PATCH** /advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/budgets/{budgetId} | Update Budget

<a name="advertiseCreateBudget"></a>
# **advertiseCreateBudget**
> AdvertiseBudget advertiseCreateBudget(body)

Create Budget

This endpoint is used to create campaign budget.  &lt;div style&#x3D;\&quot;background-color: #b38629; color: white; padding: 1em; padding-top: 1em; font-size: 1em;\&quot;&gt;   Support for shared budgets will be removed in Fall 2022. If you are sharing budgets between any campaigns, please consider moving to using a single budget per campaign. You can do so by creating a new budget for the campaign. Note that some features may not be available for campaigns using shared budgets. &lt;/div&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BudgetsApi apiInstance = new BudgetsApi();
AdvertiseCreateBudgetRequestBody body = new AdvertiseCreateBudgetRequestBody(); // AdvertiseCreateBudgetRequestBody | 
try {
    AdvertiseBudget result = apiInstance.advertiseCreateBudget(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#advertiseCreateBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseCreateBudgetRequestBody**](AdvertiseCreateBudgetRequestBody.md)|  |

### Return type

[**AdvertiseBudget**](AdvertiseBudget.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseGetAssignedBudget"></a>
# **advertiseGetAssignedBudget**
> AdvertiseAssignedBudgetResponseBody advertiseGetAssignedBudget()

Get Assigned Budget

This endpoint returns the budget assigned to a given campaign.  **Note**: you can also use the &lt;a href&#x3D;\&quot;#operation/advertise-listBudgets\&quot;&gt;list Budgets&lt;/a&gt; endpoint to check which budgets are currently assigned to which campaigns. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BudgetsApi apiInstance = new BudgetsApi();
try {
    AdvertiseAssignedBudgetResponseBody result = apiInstance.advertiseGetAssignedBudget();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#advertiseGetAssignedBudget");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseAssignedBudgetResponseBody**](AdvertiseAssignedBudgetResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseGetBudget"></a>
# **advertiseGetBudget**
> AdvertiseBudget advertiseGetBudget()

Get Budget

This endpoint returns the campaign budget information for a given budget id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BudgetsApi apiInstance = new BudgetsApi();
try {
    AdvertiseBudget result = apiInstance.advertiseGetBudget();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#advertiseGetBudget");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseBudget**](AdvertiseBudget.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseListBudgets"></a>
# **advertiseListBudgets**
> AdvertiseBudgetsResponseBody advertiseListBudgets()

List Budgets

This endpoint lists campaign budgets for a single app

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BudgetsApi apiInstance = new BudgetsApi();
try {
    AdvertiseBudgetsResponseBody result = apiInstance.advertiseListBudgets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#advertiseListBudgets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AdvertiseBudgetsResponseBody**](AdvertiseBudgetsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="advertiseReplaceAssignedBudget"></a>
# **advertiseReplaceAssignedBudget**
> AdvertiseAssignedBudgetResponseBody advertiseReplaceAssignedBudget(body)

Assign Budget

This endpoint is used for assigning a budget to a campaign. This endpoint can also be used for changing a previously assigned budget to another budget.  To unassign a budget from a campaign, use the &lt;a href&#x3D;\&quot;#operation/advertise-unassignBudget\&quot;&gt;unassign budget endpoint&lt;/a&gt;.  &lt;div style&#x3D;\&quot;background-color: #b38629; color: white; padding: 1em; padding-top: 1em; font-size: 1em;\&quot;&gt;   Support for shared budgets will be removed in Fall 2022. If you are sharing budgets between any campaigns, please consider moving to using a single budget per campaign. You can do so by creating a new budget for the campaign. Note that some features may not be available for campaigns using shared budgets. &lt;/div&gt; 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BudgetsApi apiInstance = new BudgetsApi();
AdvertiseAssignedBudgetRequestBody body = new AdvertiseAssignedBudgetRequestBody(); // AdvertiseAssignedBudgetRequestBody | 
try {
    AdvertiseAssignedBudgetResponseBody result = apiInstance.advertiseReplaceAssignedBudget(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#advertiseReplaceAssignedBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseAssignedBudgetRequestBody**](AdvertiseAssignedBudgetRequestBody.md)|  |

### Return type

[**AdvertiseAssignedBudgetResponseBody**](AdvertiseAssignedBudgetResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="advertiseUnassignBudget"></a>
# **advertiseUnassignBudget**
> advertiseUnassignBudget()

Unassign Budget

This endpoint is used to unassign the current budget of a campaign. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BudgetsApi apiInstance = new BudgetsApi();
try {
    apiInstance.advertiseUnassignBudget();
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#advertiseUnassignBudget");
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

<a name="advertiseUpdateBudget"></a>
# **advertiseUpdateBudget**
> AdvertiseUpdateBudgetsResponseBody advertiseUpdateBudget(body)

Update Budget

This endpoint is used to update campaign budget.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;total&#x60; limit. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BudgetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: Authentication
HttpBasicAuth Authentication = (HttpBasicAuth) defaultClient.getAuthentication("Authentication");
Authentication.setUsername("YOUR USERNAME");
Authentication.setPassword("YOUR PASSWORD");

BudgetsApi apiInstance = new BudgetsApi();
AdvertiseUpdateBudgetRequestBody body = new AdvertiseUpdateBudgetRequestBody(); // AdvertiseUpdateBudgetRequestBody | 
try {
    AdvertiseUpdateBudgetsResponseBody result = apiInstance.advertiseUpdateBudget(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BudgetsApi#advertiseUpdateBudget");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AdvertiseUpdateBudgetRequestBody**](AdvertiseUpdateBudgetRequestBody.md)|  |

### Return type

[**AdvertiseUpdateBudgetsResponseBody**](AdvertiseUpdateBudgetsResponseBody.md)

### Authorization

[Authentication](../README.md#Authentication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

