/*
 * Advertising Statistics API
 * # Overview **Note**: The following documentation applies to the current API version; aspects of the domain and functionality are subject to change for general release.  The Statistics API is an HTTP interface that allows advertisers to retrieve acquisition statistics data in CSV format.  ## SKAdNetwork conversion The Stats API now allows advertisers to start to receive SKadNetwork conversion value data. This supports using SKAd conversion values:  * as a splitBy dimension as skadConversionValue. * as a filter via the skadConversionValues parameter.  This functionality is in addition to the recently launched SKAdNetwork install reporting. It's provided to assist advertisers who wish to test the new SKAdNetwork conversion values throughout March 2021, to prepare for Apple's anticipated roll-out of the Apple ATT for iOS14.  ## Contact If you have any questions or feedback regarding the API you can reach out to us at unityads-support@unity3d.com.  ## Change Log * August 2, 2021: First draft of the version 1 of the Unity Advertising Statistics API.   # Authentication Using the Unity Ads Statistics API requires an API key token. You can generate an API key token from <a href=\"https://acquire.dashboard.unity3d.com/\">dashboard</a> by selecting **Settings** from the left navigation bar.  **Note**: The API key is generated for an specific username. If that username is removed from the organization, that API key will be automatically revoked. Please be aware of this if you use the API key as part of an integration with a 3rd party or any other business intelligence solution.  You can use the key token in two ways: 1. Place the key token in the GET request URL `apikey` parameter. For example: ``` https://stats.unityads.unity3d.com/organizations/:organization_id/reports/acquisitions?apikey=<token> ```  2. Place the key token in the `Authorization` header of the GET request, prefixed with `Bearer`. For example: ``` curl -H \"Authorization: Bearer <token>\" https://stats.unityads.unity3d.com/organizations/:organization_id/reports/acquisitions ```  # Rate Limits The API has rate limiting in place. The rate limit is 1 request every 3 seconds per IP address. 
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.statistics.StatsScale;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AcquisitionsApi {
    private ApiClient apiClient;

    public AcquisitionsApi() {
        this(Configuration.getStatisticsApiClient());
    }

    public AcquisitionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for statsAcquisition
     * @param organizationId Unique identifier for an Organization. (required)
     * @param start Start time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param end End time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param scale Time resolution of the data. (optional)
     * @param splitBy you can specify a comma-separated list of dimensions by which to split data.  ##### Options   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - reachExtension   - skadConversionValue  (optional)
     * @param fields you to specify comma-separated fields to display in your report.  #### SKAD specific fields   - **skadInstalls**: Installs from Apple’s SKAdNetwork.   - **skadCpi**: CPI calculated based on installs from Apple’s SKAdNetwork.   - **skadConversion**: Conversion calculated based on installs from Apple’s SKAdNetwork.  **Notes**:   - SKAd specific fields are not available by default in the response and therefore should be explicitly specified in the fields parameter if required.   - In addition, fields above will not be available for the creativePack, adType and osVersion filters since we do not get this granularity of data within the SKAd postbacks.  ##### Options   - timestamp   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - starts   - views   - clicks   - installs   - spend   - skadInstalls   - skadCpi   - skadConversion  (optional, default to all)
     * @param campaignSets A comma-separated list of campaign set IDs to filter. (optional)
     * @param campaigns A comma-separated list of campaign IDs to filter. (optional)
     * @param targets A comma-separated list of target game IDs to filter. (optional)
     * @param adTypes A comma-separated list of ad types to filter.  ##### Options   - video   - playable   - video+playable  (optional)
     * @param countries A comma-separated list of country codes to filter.  Country code in &#x60;ISO 3166-1 alpha-2&#x60; format.  (optional)
     * @param stores A comma-separated list of app stores to filter. ##### Options   - apple   - google  (optional)
     * @param platforms A comma-separated list of platforms to filter. (optional)
     * @param osVersions A comma-separated list of operating system versions to filter. (optional)
     * @param creativePacks A comma-separated list of creative packs to filter. (optional)
     * @param sourceAppIds A comma-separated list of source app IDs to filter.  This ID is an identifier derived from the game&#x27;s app store page.  Prior to migration, this was called source_id or source_game_id.  This identifier is an alphanumeric, 12-character case-sensitive string.  **Note**: The identifiers source_id and source_game_id have been deprecated.  They have been replaced with SourceAppID (source_app_id).  While the deprecated source_game_id was an integer, the identifier SourceAppID (source_app_id) is a case-sensitive, 12-character, alphanumeric string. For more information, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/advertising-faq#migration-to-source-app-id-faqs\&quot;&gt;FAQs&lt;/a&gt;.  (optional)
     * @param reachExtension A comma-separated list indicating external supply sources to filter. Possible values are &#x60;unity&#x60; and &#x60;exchanges&#x60;. (optional)
     * @param skadConversionValues A comma-separated list of SKAdNetwork conversion values to filter. These values must be integers between 0 and 63. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call statsAcquisitionCall(String organizationId, OffsetDateTime start, OffsetDateTime end, StatsScale scale, String splitBy, String fields, String campaignSets, String campaigns, String targets, String adTypes, String countries, String stores, String platforms, String osVersions, String creativePacks, String sourceAppIds, String reachExtension, String skadConversionValues, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/organizations/{organizationId}/reports/acquisitions"
            .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (start != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (end != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("end", end));
        if (scale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("scale", scale));
        if (splitBy != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("splitBy", splitBy));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("fields", fields));
        if (campaignSets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaignSets", campaignSets));
        if (campaigns != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("campaigns", campaigns));
        if (targets != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("targets", targets));
        if (adTypes != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("adTypes", adTypes));
        if (countries != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("countries", countries));
        if (stores != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("stores", stores));
        if (platforms != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("platforms", platforms));
        if (osVersions != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("osVersions", osVersions));
        if (creativePacks != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("creativePacks", creativePacks));
        if (sourceAppIds != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sourceAppIds", sourceAppIds));
        if (reachExtension != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reachExtension", reachExtension));
        if (skadConversionValues != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("skadConversionValues", skadConversionValues));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/csv", "application/problem+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authentication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call statsAcquisitionValidateBeforeCall(String organizationId, OffsetDateTime start, OffsetDateTime end, StatsScale scale, String splitBy, String fields, String campaignSets, String campaigns, String targets, String adTypes, String countries, String stores, String platforms, String osVersions, String creativePacks, String sourceAppIds, String reachExtension, String skadConversionValues, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'organizationId' is set
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling statsAcquisition(Async)");
        }
        // verify the required parameter 'start' is set
        if (start == null) {
            throw new ApiException("Missing the required parameter 'start' when calling statsAcquisition(Async)");
        }
        // verify the required parameter 'end' is set
        if (end == null) {
            throw new ApiException("Missing the required parameter 'end' when calling statsAcquisition(Async)");
        }
        
        com.squareup.okhttp.Call call = statsAcquisitionCall(organizationId, start, end, scale, splitBy, fields, campaignSets, campaigns, targets, adTypes, countries, stores, platforms, osVersions, creativePacks, sourceAppIds, reachExtension, skadConversionValues, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Acquisitions Report
     * This endpoint returns Acquisitions reports in CSV format that are under the given organizaion. 
     * @param organizationId Unique identifier for an Organization. (required)
     * @param start Start time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param end End time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param scale Time resolution of the data. (optional)
     * @param splitBy you can specify a comma-separated list of dimensions by which to split data.  ##### Options   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - reachExtension   - skadConversionValue  (optional)
     * @param fields you to specify comma-separated fields to display in your report.  #### SKAD specific fields   - **skadInstalls**: Installs from Apple’s SKAdNetwork.   - **skadCpi**: CPI calculated based on installs from Apple’s SKAdNetwork.   - **skadConversion**: Conversion calculated based on installs from Apple’s SKAdNetwork.  **Notes**:   - SKAd specific fields are not available by default in the response and therefore should be explicitly specified in the fields parameter if required.   - In addition, fields above will not be available for the creativePack, adType and osVersion filters since we do not get this granularity of data within the SKAd postbacks.  ##### Options   - timestamp   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - starts   - views   - clicks   - installs   - spend   - skadInstalls   - skadCpi   - skadConversion  (optional, default to all)
     * @param campaignSets A comma-separated list of campaign set IDs to filter. (optional)
     * @param campaigns A comma-separated list of campaign IDs to filter. (optional)
     * @param targets A comma-separated list of target game IDs to filter. (optional)
     * @param adTypes A comma-separated list of ad types to filter.  ##### Options   - video   - playable   - video+playable  (optional)
     * @param countries A comma-separated list of country codes to filter.  Country code in &#x60;ISO 3166-1 alpha-2&#x60; format.  (optional)
     * @param stores A comma-separated list of app stores to filter. ##### Options   - apple   - google  (optional)
     * @param platforms A comma-separated list of platforms to filter. (optional)
     * @param osVersions A comma-separated list of operating system versions to filter. (optional)
     * @param creativePacks A comma-separated list of creative packs to filter. (optional)
     * @param sourceAppIds A comma-separated list of source app IDs to filter.  This ID is an identifier derived from the game&#x27;s app store page.  Prior to migration, this was called source_id or source_game_id.  This identifier is an alphanumeric, 12-character case-sensitive string.  **Note**: The identifiers source_id and source_game_id have been deprecated.  They have been replaced with SourceAppID (source_app_id).  While the deprecated source_game_id was an integer, the identifier SourceAppID (source_app_id) is a case-sensitive, 12-character, alphanumeric string. For more information, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/advertising-faq#migration-to-source-app-id-faqs\&quot;&gt;FAQs&lt;/a&gt;.  (optional)
     * @param reachExtension A comma-separated list indicating external supply sources to filter. Possible values are &#x60;unity&#x60; and &#x60;exchanges&#x60;. (optional)
     * @param skadConversionValues A comma-separated list of SKAdNetwork conversion values to filter. These values must be integers between 0 and 63. (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String statsAcquisition(String organizationId, OffsetDateTime start, OffsetDateTime end, StatsScale scale, String splitBy, String fields, String campaignSets, String campaigns, String targets, String adTypes, String countries, String stores, String platforms, String osVersions, String creativePacks, String sourceAppIds, String reachExtension, String skadConversionValues) throws ApiException {
        ApiResponse<String> resp = statsAcquisitionWithHttpInfo(organizationId, start, end, scale, splitBy, fields, campaignSets, campaigns, targets, adTypes, countries, stores, platforms, osVersions, creativePacks, sourceAppIds, reachExtension, skadConversionValues);
        return resp.getData();
    }

    /**
     * Acquisitions Report
     * This endpoint returns Acquisitions reports in CSV format that are under the given organizaion. 
     * @param organizationId Unique identifier for an Organization. (required)
     * @param start Start time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param end End time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param scale Time resolution of the data. (optional)
     * @param splitBy you can specify a comma-separated list of dimensions by which to split data.  ##### Options   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - reachExtension   - skadConversionValue  (optional)
     * @param fields you to specify comma-separated fields to display in your report.  #### SKAD specific fields   - **skadInstalls**: Installs from Apple’s SKAdNetwork.   - **skadCpi**: CPI calculated based on installs from Apple’s SKAdNetwork.   - **skadConversion**: Conversion calculated based on installs from Apple’s SKAdNetwork.  **Notes**:   - SKAd specific fields are not available by default in the response and therefore should be explicitly specified in the fields parameter if required.   - In addition, fields above will not be available for the creativePack, adType and osVersion filters since we do not get this granularity of data within the SKAd postbacks.  ##### Options   - timestamp   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - starts   - views   - clicks   - installs   - spend   - skadInstalls   - skadCpi   - skadConversion  (optional, default to all)
     * @param campaignSets A comma-separated list of campaign set IDs to filter. (optional)
     * @param campaigns A comma-separated list of campaign IDs to filter. (optional)
     * @param targets A comma-separated list of target game IDs to filter. (optional)
     * @param adTypes A comma-separated list of ad types to filter.  ##### Options   - video   - playable   - video+playable  (optional)
     * @param countries A comma-separated list of country codes to filter.  Country code in &#x60;ISO 3166-1 alpha-2&#x60; format.  (optional)
     * @param stores A comma-separated list of app stores to filter. ##### Options   - apple   - google  (optional)
     * @param platforms A comma-separated list of platforms to filter. (optional)
     * @param osVersions A comma-separated list of operating system versions to filter. (optional)
     * @param creativePacks A comma-separated list of creative packs to filter. (optional)
     * @param sourceAppIds A comma-separated list of source app IDs to filter.  This ID is an identifier derived from the game&#x27;s app store page.  Prior to migration, this was called source_id or source_game_id.  This identifier is an alphanumeric, 12-character case-sensitive string.  **Note**: The identifiers source_id and source_game_id have been deprecated.  They have been replaced with SourceAppID (source_app_id).  While the deprecated source_game_id was an integer, the identifier SourceAppID (source_app_id) is a case-sensitive, 12-character, alphanumeric string. For more information, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/advertising-faq#migration-to-source-app-id-faqs\&quot;&gt;FAQs&lt;/a&gt;.  (optional)
     * @param reachExtension A comma-separated list indicating external supply sources to filter. Possible values are &#x60;unity&#x60; and &#x60;exchanges&#x60;. (optional)
     * @param skadConversionValues A comma-separated list of SKAdNetwork conversion values to filter. These values must be integers between 0 and 63. (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> statsAcquisitionWithHttpInfo(String organizationId, OffsetDateTime start, OffsetDateTime end, StatsScale scale, String splitBy, String fields, String campaignSets, String campaigns, String targets, String adTypes, String countries, String stores, String platforms, String osVersions, String creativePacks, String sourceAppIds, String reachExtension, String skadConversionValues) throws ApiException {
        com.squareup.okhttp.Call call = statsAcquisitionValidateBeforeCall(organizationId, start, end, scale, splitBy, fields, campaignSets, campaigns, targets, adTypes, countries, stores, platforms, osVersions, creativePacks, sourceAppIds, reachExtension, skadConversionValues, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Acquisitions Report (asynchronously)
     * This endpoint returns Acquisitions reports in CSV format that are under the given organizaion. 
     * @param organizationId Unique identifier for an Organization. (required)
     * @param start Start time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param end End time of the data query in &#x60;ISO 8601&#x60; format. (required)
     * @param scale Time resolution of the data. (optional)
     * @param splitBy you can specify a comma-separated list of dimensions by which to split data.  ##### Options   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - reachExtension   - skadConversionValue  (optional)
     * @param fields you to specify comma-separated fields to display in your report.  #### SKAD specific fields   - **skadInstalls**: Installs from Apple’s SKAdNetwork.   - **skadCpi**: CPI calculated based on installs from Apple’s SKAdNetwork.   - **skadConversion**: Conversion calculated based on installs from Apple’s SKAdNetwork.  **Notes**:   - SKAd specific fields are not available by default in the response and therefore should be explicitly specified in the fields parameter if required.   - In addition, fields above will not be available for the creativePack, adType and osVersion filters since we do not get this granularity of data within the SKAd postbacks.  ##### Options   - timestamp   - campaignSet   - creativePack   - adType   - campaign   - target   - sourceAppId   - store   - country   - platform   - osVersion   - starts   - views   - clicks   - installs   - spend   - skadInstalls   - skadCpi   - skadConversion  (optional, default to all)
     * @param campaignSets A comma-separated list of campaign set IDs to filter. (optional)
     * @param campaigns A comma-separated list of campaign IDs to filter. (optional)
     * @param targets A comma-separated list of target game IDs to filter. (optional)
     * @param adTypes A comma-separated list of ad types to filter.  ##### Options   - video   - playable   - video+playable  (optional)
     * @param countries A comma-separated list of country codes to filter.  Country code in &#x60;ISO 3166-1 alpha-2&#x60; format.  (optional)
     * @param stores A comma-separated list of app stores to filter. ##### Options   - apple   - google  (optional)
     * @param platforms A comma-separated list of platforms to filter. (optional)
     * @param osVersions A comma-separated list of operating system versions to filter. (optional)
     * @param creativePacks A comma-separated list of creative packs to filter. (optional)
     * @param sourceAppIds A comma-separated list of source app IDs to filter.  This ID is an identifier derived from the game&#x27;s app store page.  Prior to migration, this was called source_id or source_game_id.  This identifier is an alphanumeric, 12-character case-sensitive string.  **Note**: The identifiers source_id and source_game_id have been deprecated.  They have been replaced with SourceAppID (source_app_id).  While the deprecated source_game_id was an integer, the identifier SourceAppID (source_app_id) is a case-sensitive, 12-character, alphanumeric string. For more information, please see the &lt;a href&#x3D;\&quot;https://unityads.unity3d.com/help/advertising/advertising-faq#migration-to-source-app-id-faqs\&quot;&gt;FAQs&lt;/a&gt;.  (optional)
     * @param reachExtension A comma-separated list indicating external supply sources to filter. Possible values are &#x60;unity&#x60; and &#x60;exchanges&#x60;. (optional)
     * @param skadConversionValues A comma-separated list of SKAdNetwork conversion values to filter. These values must be integers between 0 and 63. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call statsAcquisitionAsync(String organizationId, OffsetDateTime start, OffsetDateTime end, StatsScale scale, String splitBy, String fields, String campaignSets, String campaigns, String targets, String adTypes, String countries, String stores, String platforms, String osVersions, String creativePacks, String sourceAppIds, String reachExtension, String skadConversionValues, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = statsAcquisitionValidateBeforeCall(organizationId, start, end, scale, splitBy, fields, campaignSets, campaigns, targets, adTypes, countries, stores, platforms, osVersions, creativePacks, sourceAppIds, reachExtension, skadConversionValues, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}