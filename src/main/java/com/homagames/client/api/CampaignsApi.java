/*
 * Unity Advertising Management API
 * # Introduction  This is the API documentation for the Unity Advertising Management API version 1 that allows you to programmatically manage your advertising campaigns through a RESTful API. The API currently offers endpoints that allow you to:  * Manage <a href=\"#tag/Apps\">Apps</a> * Manage <a href=\"#tag/Campaigns\">Campaigns</a> * Manage <a href=\"#tag/Bids\">Bids, Source Bids and Return On Ad Spend (ROAS) Bids</a> * Manage <a href=\"#tag/Budgets\">Budgets</a> * Manage <a href=\"#tag/Creatives\">Creatives</a> and <a href=\"#tag/Creative-Packs\">Creative Packs</a>  ## Getting Started  To get started, you will first need to create a service account and assign suitable roles for it. The <a href=\"#section/Authentication\">authentication section</a> has instructions for creating service accounts as well as for adding suitable authentication headers to your API requests. Note that you must be an Organization [Owner](https://docs.unity3d.com/Manual/OrgsManagingyourOrganization.html) to manage service accounts.  The <a href=\"#section/General-Information\">general information section</a> describes shortly the entities found in the API, their relationships as well as the resource IDs used in the API.  The <a href=\"#tag/Apps\">endpoint section</a> contains documentation for the actual API endpoints.  The API endpoints are hosted at the following base URL: `https://services.api.unity.com`.  **How to Gain Access?**  **Note**: To be able to access the API and to create service accounts, your organization needs to have access granted to the Advertising Management API. Please contact your Unity Client Partner or email us at unityads-support@unity3d.com.  ## Contact  If you have any questions or feedback regarding the API you can reach out to us at unityads-support@unity3d.com.  # Versions and API Lifecycle  This section describes the past and upcoming changes to the API.  ## Change Log  * July 27, 2022: Added `billingType`-field to the request body of <a href=\"#operation/advertise-createCampaign\">create campaign</a> endpoint. * May 12, 2022: Added support for <a href=\"#operation/advertiser-deleteApp\">deleting an app</a>. * May 6, 2022: Added support for <a href=\"#operation/advertise-updateApp\">updating an app</a>. * May 3, 2022: Added `adomain`-field to the request body of <a href=\"#operation/advertise-createApp\">create App</a> endpoint. * April 19, 2022: Added `adomain`-field to the responses of <a href=\"#operation/advertise-getApp\">get App</a> and <a href=\"#operation/advertise-listApps\">list Apps</a> endpoints. * January 28, 2022: Added support for <a href=\"#operation/advertise-getTargeting\">retrieving a campaign targeting options</a>. * January 26, 2022: Added support for <a href=\"#operation/advertise-updateTargeting\">updating targeting options</a>. * December 16, 2021: Increased the <a href=\"#section/General-Information/Rate-Limits\">default rate limit</a> to 6 requests per second. * December 10, 2021: Added support for <a href=\"#operation/advertise-getBudget\">retrieving a campaign Budget</a>. * December 2, 2021: Added support to filter Apps in the <a href=\"#operation/advertise-listApps\">list Apps</a> endpoint by `store` and `storeId`. * November 29, 2021: Added support for <a href=\"#operation/advertise-getApp\">retrieving an app</a>. * November 25, 2021: Added support for <a href=\"#operation/advertise-createApp\">creating apps</a>. * November 15, 2021: Make the `storeId` field nullable in the App listing endpoint. * October 14, 2021: Added support for creating playable creatives. * October 11, 2021: Fixed some error messages for enabled campaigns that were referring to them as \"live\" campaigns. * October 1, 2021: Added support for <a href=\"#operation/advertise-updateCampaign\">updating a campaign</a>. * September 28, 2021: Added support for <a href=\"#operation/advertise-deleteCampaign\">deleting a campaign</a>. * September 21, 2021: Added support for <a href=\"#operation/advertise-createCampaign\">campaign creation</a>. * September 10, 2021: Added support for <a href=\"#operation/advertise-getCampaign\">retrieving a Campaign</a>. * September 6, 2021: Fixed an issue that caused the <a href=\"#operation/advertise-updateBudget\">update Campaign Budget</a> endpoint to have too strict rate limit. * September 1, 2021: Changed the <a href=\"#operation/advertise-listCampaigns\">list Campaigns</a> endpoint to include `enabled, attributionClickUrl, attributionStartUrl, attributionViewUrl, scheduleStart, scheduleEnd` fields. * August 23, 2021: Added pagination support for <a href=\"#operation/advertise-listCreativePacks\">list Creative Packs</a> endpoint. * August 13, 2021: Added support for <a href=\"#operation/advertise-createBudget\">create Campaign Budget</a> endpoint. * July 27, 2021: Added support for **Video and Playable** creative pack type in the <a href=\"#operation/advertise-createCreativePack\">create creative pack endpoint</a>. * July 26, 2021: Added support for <a href=\"#operation/advertise-listRetentionInfo\">listing Retention information</a>. * July 22, 2021: Added support for <a href=\"#operation/advertise-replaceRetentionBids\">replace Retention bids</a>. * July 20, 2021: Added support for <a href=\"#operation/advertise-listRetentionBids\">listing Retention bids</a>. * July 19, 2021: Added `storeId`-field to the responses of <a href=\"#operation/advertise-listApps\">list Apps</a> endpoint. * July 14, 2021: Added support for <a href=\"#operation/advertise-listRoasInfo\">listing ROAS information</a>. * July 7, 2021: Changed the <a     href=\"#operation/advertise-listCampaigns\">list Campaigns</a> endpoint to include the ROAS types field for ROAS campaigns. * July 7, 2021: Added support to filter creative packs in the <a href=\"#operation/advertise-listCreativePacks\">list Creative Packs</a> endpoint by name. * July 2, 2021: Added `campaignIds`-field to the responses of <a href=\"#operation/advertise-getCreativePack\">get     Creative Pack</a> and <a href=\"#operation/advertise-listCreativePacks\">list Creative Packs</a> endpoints. * July 1, 2021: Added support for <a href=\"#operation/advertise-replaceRoasBids\">replace ROAS (Return On Ad Spend) bids</a>. * June 30, 2021: Changed the <a     href=\"#operation/advertise-listCpiBids\">list CPI bids</a> and <a     href=\"#operation/advertise-listSourceBids\">list source bids</a> endpoints to return a 404 error if the campaign type is not Installs. * June 23, 2021: Changed support contact address to unityads-support@unity3d.com. * June 17, 2021: Added support for <a href=\"#operation/advertise-listRoasBids\">listing ROAS (Return On Ad Spend) bids</a>. * May 20, 2021: Added support for <a href=\"#operation/advertise-updateBudget\">updating a Campaign Budget</a>. * May 14, 2021: Added support for <a href=\"#operation/advertise-replaceAssignedBudget\">assigning a Campaign Budget</a>. * May 7, 2021: Added support for <a href=\"#operation/advertise-unassignBudget\">unassigning a Campaign Budget</a>. * May 6, 2021: Added support for <a href=\"#operation/advertise-getAssignedBudget\">retrieving Assigned Budget</a>. * May 3, 2021: Added support for <a href=\"#operation/advertise-listBudgets\">listing Campaign Budgets</a>. * April 28, 2021: Added support for <a href=\"#operation/advertise-listApps\">listing Apps</a>. * April 19, 2021: Added billingType field to list campaigns endpoint. * April 8, 2021: Unity Advertising Management API version 1 (beta) released. * February 17, 2021: First draft of the version 1 of the Unity Advertising Management API.  ## API Versioning  The APIs are versioned by having a version number as a part of the endpoint URL. The API may receive non-breaking changes without its version number being changed. Breaking changes are introduced only to new API versions.  Non-breaking changes can include (but are not limited to) for example:  * Adding new optional request headers * Adding new fields to the response * Adding new status codes to the response status codes list * Changing a required field to be optional * Changes to rate limits * Under-the-hood fixes that don’t change the URL signature, the request format or the response format  Breaking changes can include (but are not limited to) for example:  * Changing the URL signature * Removing a field from the response * Adding a new required field to the request  ## Deprecation Policy  If a newer version of the API is released or if the service is discontinued, the API or one of its versions may be deprecated and eventually shutdown.  Deprecation of an API version will occur in 2 steps:  1. Unity's client partner or support team will email Organization owners, informing them of the new version's imminent    release and the current version's deprecation date. A deprecation notice will appear on the HTTP headers of any    deprecated API, and the documentation will be updated as such. 2. After 3 months of continued support for a deprecated version, Unity may cease support or shut down the version    entirely. A complete shutdown notice will be sent 1 month in advance.  # Authentication  To learn how to authenticate your requests, please visit the <a href=\"/docs#get-started\">Getting Started section</a>.  ## Roles and Permissions  The service account must have the relevant access to be able to call the APIs. Please see below for the available service account roles and their corresponding access rights:  | Role                                | Access Rights                                                                                                 | |-------------------------------------|---------------------------------------------------------------------------------------------------------------| | Advertise API Admin                 | Grants full read and write access.                                                                            | | Advertise API Viewer                | Grants access to all the read endpoints.                                                                      | | Advertise API Apps Editor           | Grants access to all the read and update endpoints for apps.                                                  | | Advertise API Campaigns Editor      | Grants access to all the read and update endpoints for campaigns.                                             | | Advertise API Bids Editor           | Grants access to all the read and update endpoints for all the bid types.                                     | | Advertise API Budgets Editor        | Grants access to all the read and update endpoints for budgets and budget assignments.                        |                       | Advertise API Creative Packs Editor | Grants access to all the read and update endpoints for creatives, creative packs and assigned creative packs. | | Advertise API Targeting Editor      | Grants access to all the read and update endpoints for targeting options.                                     |  # General Information  ## Entity Relationships  This section provides an overview on what the different resources in the API are and how they relate to each other.  At the top level, the API has a resource that is called `App`. The `App` resource corresponds to a single app/game that has been published in a single app store. If you have published your app/game in more than one app store then you will have a separate `App` resource for each of those stores. Note that it is also possible to have more than one `App` resources that correspond to the same app/game in a store. The following diagram visualizes this relationship for a game called `My Game`:  ```mermaid   graph TD    StoreApp1(My Game for Platform X) --- AdsApp1   StoreApp2(My Game for Platform Y) --- AdsApp2    subgraph App Store 1     StoreApp1   end    subgraph App Store 2     StoreApp2   end    subgraph Unity Ads     AdsApp1(App) --- Resources1-1(\"...\")     AdsApp1 --- Resources1-2(\"...\")     AdsApp1 --- Resources1-3(\"...\")      AdsApp2(App) --- Resources2-1(\"...\")     AdsApp2 --- Resources2-2(\"...\")     AdsApp2 --- Resources2-3(\"...\")   end    classDef grey fill:#eee,stroke:#333,stroke-width:1px;   classDef white fill:#fff,stroke:#333,stroke-width:1px;   classDef green fill:#9f9,stroke:#333,stroke-width:1px;   classDef blue fill:#1e60ab,color:#fff,stroke:#333,stroke-width:1px;   classDef red fill:#f33,color:#fff,stroke:#333,stroke-width:1px;    class StoreApp1,StoreApp2 grey   class AdsApp1,AdsApp2 white   class Resources1-1,Resources2-1 blue   class Resources1-2,Resources2-2 green   class Resources1-3,Resources2-3 red ```  Apps contain advertisement campaigns and resources related to those campaigns such as bids and creatives:  ```mermaid   graph TD    subgraph Unity Ads     App ---|has| Creative(\"Creative (Video, Playable or End Card)\")     App ---|has| CreativePack(Creative Pack)     App(App) ---|has| Campaign(Campaign)     CreativePack -.-|uses| Creative     Campaign -.-|uses| CreativePack     Campaign --- Bid(CPI bids and Source Bids)   end    classDef white fill:#fff,stroke:#333,stroke-width:1px;   classDef green fill:#9f9,stroke:#333,stroke-width:1px;   classDef blue fill:#1e60ab,color:#fff,stroke:#333,stroke-width:1px;    class App white   class Campaign,Bid blue   class Creative,CreativePack green ```  Apps hold also further configuration that is utilized by the campaigns, such as budgets:  ```mermaid   graph TD    subgraph Unity Ads     App(App) ---|has| Budget(Budget)     App(App) ---|has| Campaign(Campaign)     Campaign -.-|uses| Budget   end    classDef white fill:#fff,stroke:#333,stroke-width:1px;   classDef green fill:#9f9,stroke:#333,stroke-width:1px;   classDef blue fill:#1e60ab,color:#fff,stroke:#333,stroke-width:1px;   classDef red fill:#f33,color:#fff,stroke:#333,stroke-width:1px;    class App white   class Campaign blue   class Budget red ```  ## Glossary  This section provides a more detailed explanation of the vocabulary used in the API.  ### Apps and Campaigns  | Entity                     |  Description                                                                                                                    | |----------------------------|---------------------------------------------------------------------------------------------------------------------------------| | [App](#tag/Apps)           | App that is published in an app store and contains a set of campaigns. Apps are identified by campaignSetId.                    | | [Campaign](#tag/Campaigns) | Campaign holds the details of your advertisement campaign such as which bids to set and which ad assets to use.                 |  ### Bid Types  | Entity                                                  |  Description                                                                                                                                                                  | |---------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | [CPI Bid](#operation/advertise-listCpiBids)             | CPI (cost per install) bids are used for targeting and pricing on a per-country basis within your ad campaign.                                                                | | [Source Bid](#operation/advertise-listSourceBids)       | Source bids are used for granularly targeting and pricing apps (sources) on a per-country basis within your ad campaign.                                                      | | [ROAS Bid](#operation/advertise-listRoasBids)           | ROAS (Return On Ad Spend) bids are dynamically priced bids that are used for targeting users that are predicted to generate revenue through in-app purchases or watching ads. | | [Retention Bid](#operation/advertise-listRetentionBids) | Retention bids are dynamically priced bids that are used for targeting users that are likely to remain in your game 7 days after install.                                     |  ### Creative Packs and Creatives  | Entity                               |  Description                                                                                                                      | |--------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------| | [Creative](#tag/Creatives)           | Creative holds either one or two ad assets (files).                                                                               | | [Creative Pack](#tag/Creative-Packs) | A creative pack combines 1-3 creatives into one entity that can be assigned to one or more campaigns.                             | | End Card Creative                    | End cards are creative assets displayed at the end of a video with a call to action for users to download the advertised product. | | Playble Creative                     | Playable ads allow users to play a quick interactive demo of your game.                                                           | | Video Creative                       | Video creative is a video that is used for marketing your app.                                                                    |  ## Resource IDs Used in the API Calls  To identify your organization as well as its apps and campaigns we use the following identifiers:  * **organizationId**: identifies your organization * **campaignSetId**: identifies your app (collection of campaigns) within your organization * **campaignId**: identifies a single advertising campaign within your app  ### How to Look Up organizationId  To look up the `organizationId`, please use the following steps: 1. Open the [Acquire Dashboard](https://dashboard.unity3d.com/acquire) 2. Select **Settings** from the navigation. 3. On the settings page, you will see two separate Organization ID fields. For the Advertising Management API, pick the value from the `Organization Core ID` field.  **Note**: The organizations are identified with two separate identifiers due to legacy reasons. The full name of the organization identifier used in the Advertising Management API is `Organization Core ID` but due to practical reasons it has been shortened to be `organizationId` in this API documentation.  ### How to Look Up campaignSetId and campaignId  To look up the `campaignSetId` and `campaignId`, the following options are available:  Apps and their respective campaignSetIds can be retrieved using the [List Apps](#operation/advertise-listApps) endpoint. In the API response, the `id`-field holds the campaignSetId. Likewise, campaigns and their respective campaignIds can be retrieved using the [List Campaigns](#operation/advertise-listCampaigns) endpoint.  The campaignSetId and campaignId identifiers are also available via the [Advertising Statistics API](https://unityads.unity3d.com/help/advertising/stats-api) where you can find them under the columns `campaign set id` and `campaign id`, respectively.  It is also possible to find all the identifiers from the URLs of the Unity Acquire dashboard. First, open the [dashboard](https://dashboard.unity3d.com/acquire/) and then click **Apps** and choose an app and a campaign to view. After that the IDs are visible in the URL in following spots: `https://dashboard.unity3d.com/organizations/<ORGANIZATION_ID>/acquire/campaign-sets/<CAMPAIGN_SET_ID>/campaigns/<CAMPAIGN_ID>`  ## Rate Limits  The API has rate limiting in place. The maximum number of requests per IP address is limited to 6 requests per second and to 4000 requests per 30 minutes.  Additionally all operations that modify resources (`PUT`, `PATCH`, `DELETE`) are limited so that it is possible to modify a single resource per endpoint at most 30 times per 30 minutes or at most once per a second. This means that for example the CPI bids of a single campaign can be updated at most 30 times inside a 30 minute time interval. The endpoints don't share the quota, so it is possible to do also other updates (e.g. source bids) to that same campaign during that same time interval.  Similarly operations that create resources (`POST`) are limited so that it is possible to create at most 30 new resources per endpoint under a single app or campaign per 30 minutes or at most once per a second. This means that it is possible to for example upload at most 30 creatives into a single app within a 30 minute interval. During that same time window it is possible to also create other resources or apply updates to the campaigns that are under the app. Each endpoint has its own quota.  If you need to update multiple campaigns fast, you can do that. It is for example possible to update CPI bids of hundreds of campaigns within a short time interval, as long as the number of requests stays in the overall bounds of max 6 requests per second and max 4000 requests per 30 minutes.  The API responds with `429` HTTP status code if the rate limit is exceeded.  **Quick Reference**  | What is limited          |  How many requests are allowed per second  | How many requests are allowed per 30 minutes | Notes                                                                                                                                                                                                                                                              | |--------------------------|--------------------------------------------|----------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | All requests             | 6                                          | 4000                                         | Takes all requests into account.                                                                                                                                                                                                                                   | | `PUT`, `PATCH`, `DELETE` | 1                                          | 30                                           | Applied per `Budget`, `Campaign`, `Creative` or `Creative Pack` for each endpoint separately.                                                                                                                                                                      | | `POST`                   | 1                                          | 30                                           | Applied per `App` per endpoint for those resources that are directly under the `App` such as `Budgets` and `Campaigns`. If the resource in question is under `Campaign`, such as `Creative Pack Assignment` then the limit is applied per `Campaign` per endpoint. |  ## Response Compression  The API supports response compression. The responses are compressed if either `Accept-Encoding: gzip` or `Accept-Encoding: deflate` header is provided in the request.  Example: ``` curl -H \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" -H \"Accept-Encoding: gzip\" https://services.api.unity.com/advertise/v1/organizations/5772680389521/apps/5ee23a52c10f9455722a5ead/campaigns/5ee23a557de7e87ee0958dfc/source-bids ```  # Guides  This section contains guides on how to use the API.  ## Uploading and Assigning Creatives  Creatives and creative packs are the content of your ad campaigns. This article covers the following steps:  * [Overview](#section/Guides/Creatives/Overview) * [Step 1: Upload Your Creatives](#section/Guides/Creatives/Step1) * [Step 2: Create a Creative Pack](#section/Guides/Creatives/Step2) * [Step 3: Assign a Creative Pack to a Campaign](#section/Guides/Creatives/Step3)  ### <a name=\"section/Guides/Creatives/Overview\"></a>Overview  The ad assets (files) such as videos, playables and end cards are managed using two concepts called `Creatives` and `Creative Packs`. Creatives directly hold your creative files while creative packs combine 1-3 creatives into a pack that can be assigned to one or more campaigns.  The process for creating and assigning creative packs to campaigns is as follows:  ```mermaid   graph LR   Upload[Upload creatives] --> Pack[Create a creative pack] --> Assign[Assign the creative pack<br>to a campaign]   classDef black fill:#000,color:#fff,stroke:#ddd,stroke-width:1px,line-height:21px;   class Upload,Pack,Assign black   click Upload \"./advertise.html#operation/advertise-createCreative\"   click Pack \"./advertise.html#operation/advertise-createCreativePack\" ```  ### <a name=\"section/Guides/Creatives/Step1\"></a>Step 1: Upload Your Creatives  You can upload your creatives by using the [Create Creative](#operation/advertise-createCreative) endpoint.  The following creative assets can be uploaded currently through the API:  * **Square end card**: this creative type contains a single square shaped 800 × 800 image. * **End card pair**: this creative type contains a 600 × 800 portrait image and a 800 × 600 landscape image. * **Portrait video**: this creative type contains a 9:16 portrait video. * **Landscape video**: this creative type contains a 16:9 landscape video. * **Playable**: this creative type contains an MRAID 2.0 compliant HTML document in a landscape, portrait or responsive orientation. [See full playable guidelines](https://unityads.unity3d.com/help/advertising/campaign-design-guide#playables).  Usually you call the `Create Creative` endpoint once for each file you wish to upload. The only exception to this is the end card pair creative which includes both portrait and landscape images in one creative.  #### Upload a Video  Below is an example how the upload endpoint can be called using the command line command `curl`. To try it out, replace the `/path/to/your/file/myPortraitVideo.mp4` with your local video file path and replace `<ORGANIZATION_ID>`, `<SERVICE_ACCOUNT_CREDENTIALS>` and `<CAMPAIGN_SET_ID>` with values matching your organization and app.  ``` curl --verbose \\      --form 'creativeInfo={\"name\": \"My Portrait Video\", \"language\": \"en\", \"video\": {\"fileName\":\"myPortraitVideo.mp4\"}}' \\      --form \"videoFile=@/path/to/your/file/myPortraitVideo.mp4\" \\      --header \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" \\      https://services.api.unity.com/advertise/v1/organizations/<ORGANIZATION_ID>/apps/<CAMPAIGN_SET_ID>/creatives ```  Once the upload has completed successfully, you will receive a HTTP `201` response with a response payload such as below:  ```JSON   {     \"id\": \"5fd363cf5d84aa0ed76956b1\",     \"name\": \"My Portrait Video\",     \"language\": \"en\",     \"type\": \"portraitVideo\",     \"createdAt\": \"2020-12-11T12:19:29.004Z\",     \"status\": \"uploaded\"   } ```  #### Upload a Square End Card  Uploading a square end card works in similar fashion as uploading videos but you'll need to adjust the request in the following way:  1. Adjust the `creativeInfo` to contain a `squareEndCard` field instead of a `video` field. 2. Instead of passing the file in a `videoFile` field, pass the file in a field called `squareEndCardFile`.  Example: ``` curl --verbose \\      --form 'creativeInfo={\"name\":\"My End Card\", \"language\":\"en\", \"squareEndCard\": {\"fileName\":\"mySquareEndCard.jpeg\"}}' \\      --form \"squareEndCardFile=@/path/to/your/file/mySquareEndCard.jpeg\" \\      --header \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" \\      https://services.api.unity.com/advertise/v1/organizations/<ORGANIZATION_ID>/apps/<CAMPAIGN_SET_ID>/creatives ```  #### Upload an End Card Pair  Uploading an end card pair works in similar fashion as uploading videos and square end card but you'll need to include both end card files in the request:  ``` curl --verbose \\    --form 'creativeInfo={\"name\":\"My End Card Pair\", \"language\":\"en\", \"portraitEndCard\": {\"fileName\":\"myPortraitEndCard.jpeg\" }, \"landscapeEndCard\": {\"fileName\":\"myLandscapeEndCard.jpeg\"}}' \\    --form \"portraitEndCardFile=@/path/to/your/file/600x800.jpeg\" \\    --form \"landscapeEndCardFile=@/path/to/your/file/800x600.jpeg\" \\    --header \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" \\    https://services.api.unity.com/advertise/v1/organizations/<ORGANIZATION_ID>/apps/<CAMPAIGN_SET_ID>/creatives ```  #### Creative Status  After having been uploaded, all new creatives undergo a [content moderation process](https://unityads.unity3d.com/help/advertising/campaign-design-guide#moderating-creatives) to ensure that they adhere to Unity's advertising [content policies](https://unity3d.com/legal/advertising-content-policy). Before entering the moderation queue the video creatives go through a processing state that can take few minutes.  You can check the latest status of the uploaded creative with [Get Creative](#operation/advertise-getCreative) endpoint.  Creatives can be added into a creative pack immediately after they have been uploaded. It isn't necessary to wait for the moderation to complete. However, a creative pack can go live only after all its creatives have passed the moderation.  ### <a name=\"section/Guides/Creatives/Step2\"></a>Step 2: Create a Creative Pack  Once you've uploaded your creatives, you can use [Create Creative Pack](#operation/advertise-createCreativePack) endpoint to create a creative pack out of them. A creative pack combines 1-3 creatives into one entity that can be assigned to one or more campaigns.  The following creative combinations are allowed when creating a creative pack through the API:  * Portrait video  + end card * Landscape video + end card * Portrait video  + landscape video + end card * Responsive playable * Portrait playable * Landscape playable * Portrait playable + landscape playable  While only one video or playable is required, uploading one for each orientation yields better optimization. When a creative pack contains both, Unity’s valuation algorithm selects the best orientation to display.  Below is an example that creates a creative pack that contains one portrait video (with ID `5fd363cf5d84aa0ed76956b1`) and one square end card (with ID `5feb40a6ff3d91a3af53c678`):  ``` curl --verbose \\      --request POST \\      --data '{\"name\": \"Portrait video with square end card\", \"creativeIds\": [\"5fd363cf5d84aa0ed76956b1\", \"5feb40a6ff3d91a3af53c678\"], \"type\": \"video\"}' \\      --header \"Content-Type: application/json\" \\      --header \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" \\      https://services.api.unity.com/advertise/v1/organizations/<ORGANIZATION_ID>/apps/<CAMPAIGN_SET_ID>/creative-packs ```  Replace the `creativeIds`, `<ORGANIZATION_ID>`, `<CAMPAIGN_SET_ID>` and `<SERVICE_ACCOUNT_CREDENTIALS>` with values that match your app and organization.  For a successful request, the response HTTP status code is `201` and the response body follows following format:  ```JSON {   \"id\": \"5feb4574ff3d91a3af53c67e\",   \"name\": \"Video with end card\",   \"type\": \"video\",   \"creativeIds\": [       \"5fd363cf5d84aa0ed76956b1\",       \"5feb40a6ff3d91a3af53c678\"   ] } ```  ### <a name=\"section/Guides/Creatives/Step3\"></a>Step 3: Assign a Creative Pack to a Campaign  To assign a creative pack to your campaign, use the <a href=\"#operation/advertise-assignCreativePack\">assign Creative Pack endpoint</a>.  If your creative pack's ID is for example `5f15703772f10b00138f6d8d`, you can assign it to your campaign with a POST request:  ``` curl --verbose \\      --request POST \\      --data '{\"id\": \"5f15703772f10b00138f6d8d\"}' \\      --header \"Content-Type: application/json\" \\      --header \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" \\      https://services.api.unity.com/advertise/v1/organizations/<ORGANIZATION_ID>/apps/<CAMPAIGN_SET_ID>/campaigns/<CAMPAIGN_ID>/assigned-creative-packs ```  The currently assigned creative packs can be listed with a GET query:  ``` curl --header \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" \\      https://services.api.unity.com/advertise/v1/organizations/<ORGANIZATION_ID>/apps/<CAMPAIGN_SET_ID>/campaigns/<CAMPAIGN_ID>/assigned-creative-packs ```  The response contains a list of creative pack IDs.  A campaign must contain at least one approved creative pack in order to go live. If your live campaign includes a mix of approved and pending creative packs, the pending ones will automatically run once approved.  To unassign a creative pack from a campaign, use the <a href=\"#operation/advertise-unassignCreativePack\">unassign Creative Pack endpoint</a>.  You can unassign a creative pack with a DELETE query that includes the creative pack's ID in the URL:  ``` curl --verbose \\      --request DELETE \\      --header \"Authorization: Basic <SERVICE_ACCOUNT_CREDENTIALS>\" \\      https://services.api.unity.com/advertise/v1/organizations/<ORGANIZATION_ID>/apps/<CAMPAIGN_SET_ID>/campaigns/<CAMPAIGN_ID>/assigned-creative-packs/<ASSIGNED_CREATIVE_PACK_ID> ``` 
 *
 * OpenAPI spec version: v1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.homagames.client.api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.homagames.client.ApiCallback;
import com.homagames.client.ApiClient;
import com.homagames.client.ApiException;
import com.homagames.client.ApiResponse;
import com.homagames.client.Configuration;
import com.homagames.client.Pair;
import com.homagames.client.ProgressRequestBody;
import com.homagames.client.ProgressResponseBody;
import com.homagames.client.model.AnAdvertiseCampaign;
import com.homagames.client.toRefactor.AdvertiseAssignCreativePackRequestBody;
import com.homagames.client.toRefactor.AdvertiseAssignedCreativePack;
import com.homagames.client.toRefactor.AdvertiseAssignedCreativePacksResponseBody;
import com.homagames.client.toRefactor.AdvertiseCampaignsResponseBody;
import com.homagames.client.toRefactor.AdvertiseCreateCampaignRequestBody;
import com.homagames.client.toRefactor.AdvertiseCreatedCampaignResponseBody;
import com.homagames.client.toRefactor.AdvertiseGetTargetingResponseBody;
import com.homagames.client.toRefactor.AdvertiseTargeting;
import com.homagames.client.toRefactor.AdvertiseUpdateCampaignRequestBody;
import com.homagames.client.toRefactor.AdvertiseUpdateTargetingResponseBody;
import com.homagames.client.toRefactor.AdvertiseUpdatedCampaignResponseBody;

public class CampaignsApi {
    private ApiClient apiClient;

    public CampaignsApi(String apiKey) {
        this.apiClient = new ApiClient("https://services.api.unity.com", "Basic", apiKey);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for advertiseAssignCreativePack
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseAssignCreativePackCall(AdvertiseAssignCreativePackRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-creative-packs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call advertiseAssignCreativePackValidateBeforeCall(AdvertiseAssignCreativePackRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling advertiseAssignCreativePack(Async)");
        }
        
        com.squareup.okhttp.Call call = advertiseAssignCreativePackCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Assign Creative Pack
     * Assign a creative pack to a campaign.  &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    Please note that there is a limit of 50 creative pack assignments in apps sharing the same store id that you   can use on your live campaigns for iOS apps. You can find more information about this limit   &lt;a href&#x3D;\&quot;https://resources.unity.com/ios-14-resources/campaign-management-best-practices#5-limit-campaigns\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. &lt;/div&gt; 
     * @param body  (required)
     * @return AdvertiseAssignedCreativePack
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertiseAssignedCreativePack advertiseAssignCreativePack(AdvertiseAssignCreativePackRequestBody body) throws ApiException {
        ApiResponse<AdvertiseAssignedCreativePack> resp = advertiseAssignCreativePackWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Assign Creative Pack
     * Assign a creative pack to a campaign.  &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    Please note that there is a limit of 50 creative pack assignments in apps sharing the same store id that you   can use on your live campaigns for iOS apps. You can find more information about this limit   &lt;a href&#x3D;\&quot;https://resources.unity.com/ios-14-resources/campaign-management-best-practices#5-limit-campaigns\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. &lt;/div&gt; 
     * @param body  (required)
     * @return ApiResponse&lt;AdvertiseAssignedCreativePack&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertiseAssignedCreativePack> advertiseAssignCreativePackWithHttpInfo(AdvertiseAssignCreativePackRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = advertiseAssignCreativePackValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AdvertiseAssignedCreativePack>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Assign Creative Pack (asynchronously)
     * Assign a creative pack to a campaign.  &lt;div style&#x3D;\&quot;background-color: #1a1a1a; color: white; padding: 1em; padding-top: 0.1em; font-size: 0.95em;\&quot;&gt;   &lt;h4&gt;Note about iOS Campaigns&lt;/h4&gt;    Please note that there is a limit of 50 creative pack assignments in apps sharing the same store id that you   can use on your live campaigns for iOS apps. You can find more information about this limit   &lt;a href&#x3D;\&quot;https://resources.unity.com/ios-14-resources/campaign-management-best-practices#5-limit-campaigns\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt;. &lt;/div&gt; 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseAssignCreativePackAsync(AdvertiseAssignCreativePackRequestBody body, final ApiCallback<AdvertiseAssignedCreativePack> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseAssignCreativePackValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertiseAssignedCreativePack>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for advertiseCreateCampaign
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseCreateCampaignCall(AdvertiseCreateCampaignRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call advertiseCreateCampaignValidateBeforeCall(AdvertiseCreateCampaignRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling advertiseCreateCampaign(Async)");
        }
        
        com.squareup.okhttp.Call call = advertiseCreateCampaignCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Campaign
     * This endpoint is used to create a campaign.  In order to complete the campaign setup, take the following steps:   1. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreative\&quot;&gt;Upload Creatives&lt;/a&gt; or use the old ones if you already have uploaded them.   2. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreativePack\&quot;&gt;Create Creative Pack&lt;/a&gt; or use any approved creative pack you already have.   3. You should &lt;a href&#x3D;\&quot;#operation/advertise-assignCreativePack\&quot;&gt;Assign Creative Pack&lt;/a&gt; to the campaign.   4. Depending on the &#x60;goal&#x60; of your campaign you need to update CPI/ROAS/Retention bids by calling the right &lt;a href&#x3D;\&quot;#tag/Bids\&quot;&gt;Bids endpoint&lt;/a&gt;.   5. Finally if you prepared all requirements you can change the &#x60;enabled&#x60; status by calling the &lt;a href&#x3D;\&quot;#operation/advertise-updateCampaign\&quot;&gt;Update Campaign&lt;/a&gt; endpoint.  **Note**: The campaign must have the below prerequisites to go live:   - At least one assigned and approved creative pack.   - Tracking attribution links.   - Specify countries you would like to advertise in.   - The organization is required to have a budget and also, you can optionally &lt;a href&#x3D;\&quot;#operation/advertise-createBudget\&quot;&gt;create&lt;/a&gt; and &lt;a href&#x3D;\&quot;#operation/advertise-replaceAssignedBudget\&quot;&gt;assign&lt;/a&gt; the campaign-level budget.  **Note**: Creating an iOS Campaign with CPI Billing type is not publicly available yet. If you want to try this feature, please reach out to your Unity partner or message us at unityads-support@unity3d.com. 
     * @param body  (required)
     * @return AdvertiseCreatedCampaignResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertiseCreatedCampaignResponseBody advertiseCreateCampaign(AdvertiseCreateCampaignRequestBody body) throws ApiException {
        ApiResponse<AdvertiseCreatedCampaignResponseBody> resp = advertiseCreateCampaignWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create Campaign
     * This endpoint is used to create a campaign.  In order to complete the campaign setup, take the following steps:   1. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreative\&quot;&gt;Upload Creatives&lt;/a&gt; or use the old ones if you already have uploaded them.   2. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreativePack\&quot;&gt;Create Creative Pack&lt;/a&gt; or use any approved creative pack you already have.   3. You should &lt;a href&#x3D;\&quot;#operation/advertise-assignCreativePack\&quot;&gt;Assign Creative Pack&lt;/a&gt; to the campaign.   4. Depending on the &#x60;goal&#x60; of your campaign you need to update CPI/ROAS/Retention bids by calling the right &lt;a href&#x3D;\&quot;#tag/Bids\&quot;&gt;Bids endpoint&lt;/a&gt;.   5. Finally if you prepared all requirements you can change the &#x60;enabled&#x60; status by calling the &lt;a href&#x3D;\&quot;#operation/advertise-updateCampaign\&quot;&gt;Update Campaign&lt;/a&gt; endpoint.  **Note**: The campaign must have the below prerequisites to go live:   - At least one assigned and approved creative pack.   - Tracking attribution links.   - Specify countries you would like to advertise in.   - The organization is required to have a budget and also, you can optionally &lt;a href&#x3D;\&quot;#operation/advertise-createBudget\&quot;&gt;create&lt;/a&gt; and &lt;a href&#x3D;\&quot;#operation/advertise-replaceAssignedBudget\&quot;&gt;assign&lt;/a&gt; the campaign-level budget.  **Note**: Creating an iOS Campaign with CPI Billing type is not publicly available yet. If you want to try this feature, please reach out to your Unity partner or message us at unityads-support@unity3d.com. 
     * @param body  (required)
     * @return ApiResponse&lt;AdvertiseCreatedCampaignResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertiseCreatedCampaignResponseBody> advertiseCreateCampaignWithHttpInfo(AdvertiseCreateCampaignRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = advertiseCreateCampaignValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AdvertiseCreatedCampaignResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create Campaign (asynchronously)
     * This endpoint is used to create a campaign.  In order to complete the campaign setup, take the following steps:   1. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreative\&quot;&gt;Upload Creatives&lt;/a&gt; or use the old ones if you already have uploaded them.   2. You can &lt;a href&#x3D;\&quot;#operation/advertise-createCreativePack\&quot;&gt;Create Creative Pack&lt;/a&gt; or use any approved creative pack you already have.   3. You should &lt;a href&#x3D;\&quot;#operation/advertise-assignCreativePack\&quot;&gt;Assign Creative Pack&lt;/a&gt; to the campaign.   4. Depending on the &#x60;goal&#x60; of your campaign you need to update CPI/ROAS/Retention bids by calling the right &lt;a href&#x3D;\&quot;#tag/Bids\&quot;&gt;Bids endpoint&lt;/a&gt;.   5. Finally if you prepared all requirements you can change the &#x60;enabled&#x60; status by calling the &lt;a href&#x3D;\&quot;#operation/advertise-updateCampaign\&quot;&gt;Update Campaign&lt;/a&gt; endpoint.  **Note**: The campaign must have the below prerequisites to go live:   - At least one assigned and approved creative pack.   - Tracking attribution links.   - Specify countries you would like to advertise in.   - The organization is required to have a budget and also, you can optionally &lt;a href&#x3D;\&quot;#operation/advertise-createBudget\&quot;&gt;create&lt;/a&gt; and &lt;a href&#x3D;\&quot;#operation/advertise-replaceAssignedBudget\&quot;&gt;assign&lt;/a&gt; the campaign-level budget.  **Note**: Creating an iOS Campaign with CPI Billing type is not publicly available yet. If you want to try this feature, please reach out to your Unity partner or message us at unityads-support@unity3d.com. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseCreateCampaignAsync(AdvertiseCreateCampaignRequestBody body, final ApiCallback<AdvertiseCreatedCampaignResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseCreateCampaignValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertiseCreatedCampaignResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for advertiseDeleteCampaign
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseDeleteCampaignCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call advertiseDeleteCampaignValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = advertiseDeleteCampaignCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete Campaign
     * This endpoint is used to delete a campaign. 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void advertiseDeleteCampaign() throws ApiException {
        advertiseDeleteCampaignWithHttpInfo();
    }

    /**
     * Delete Campaign
     * This endpoint is used to delete a campaign. 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> advertiseDeleteCampaignWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = advertiseDeleteCampaignValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete Campaign (asynchronously)
     * This endpoint is used to delete a campaign. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseDeleteCampaignAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseDeleteCampaignValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for advertiseGetCampaign
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseGetCampaignCall(Long organizationId, String campaignSetId, String campaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}"
            .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "campaignSetId" + "\\}", apiClient.escapeString(campaignSetId.toString()))
            .replaceAll("\\{" + "campaignId" + "\\}", apiClient.escapeString(campaignId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    
    private com.squareup.okhttp.Call advertiseGetCampaignValidateBeforeCall(Long organizationId, String campaignSetId, String campaignId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling advertiseListCampaigns(Async)");
        }
        if (campaignSetId == null) {
            throw new ApiException("Missing the required parameter 'campaignSetId' when calling advertiseListCampaigns(Async)");
        }
        if (campaignId == null) {
            throw new ApiException("Missing the required parameter 'campaignId' when calling advertiseListCampaigns(Async)");
        }

        com.squareup.okhttp.Call call = advertiseGetCampaignCall(organizationId, campaignSetId, campaignId, progressListener, progressRequestListener);
        return call;  
    }

    /**
     * Get Campaign
     * This endpoint returns the campaign information for a given campaign id.
     * @return AnAdvertiseCampaign
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnAdvertiseCampaign advertiseGetCampaign(Long organizationId, String campaignSetId, String campaignId) throws ApiException {
        ApiResponse<AnAdvertiseCampaign> resp = advertiseGetCampaignWithHttpInfo(organizationId, campaignSetId, campaignId);
        return resp.getData();  
    }

    /**
     * Get Campaign
     * This endpoint returns the campaign information for a given campaign id.
     * @return ApiResponse&lt;AnAdvertiseCampaign&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnAdvertiseCampaign> advertiseGetCampaignWithHttpInfo(Long organizationId, String campaignSetId, String campaignId) throws ApiException {
        com.squareup.okhttp.Call call = advertiseGetCampaignValidateBeforeCall(organizationId, campaignSetId, campaignId, null, null);
        Type localVarReturnType = new TypeToken<AnAdvertiseCampaign>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Campaign (asynchronously)
     * This endpoint returns the campaign information for a given campaign id.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseGetCampaignAsync(Long organizationId, String campaignSetId, String campaignId, final ApiCallback<AnAdvertiseCampaign> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseGetCampaignValidateBeforeCall(organizationId, campaignSetId, campaignId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnAdvertiseCampaign>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for advertiseGetTargeting
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseGetTargetingCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/targeting";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    

    private com.squareup.okhttp.Call advertiseGetTargetingValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = advertiseGetTargetingCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get targeting options
     * This endpoint returns the targeting options for a certain campaign. 
     * @return AdvertiseGetTargetingResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertiseGetTargetingResponseBody advertiseGetTargeting() throws ApiException {
        ApiResponse<AdvertiseGetTargetingResponseBody> resp = advertiseGetTargetingWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get targeting options
     * This endpoint returns the targeting options for a certain campaign. 
     * @return ApiResponse&lt;AdvertiseGetTargetingResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertiseGetTargetingResponseBody> advertiseGetTargetingWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = advertiseGetTargetingValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<AdvertiseGetTargetingResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get targeting options (asynchronously)
     * This endpoint returns the targeting options for a certain campaign. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseGetTargetingAsync(final ApiCallback<AdvertiseGetTargetingResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseGetTargetingValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertiseGetTargetingResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for advertiseListAssignedCreativePacks
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseListAssignedCreativePacksCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-creative-packs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private com.squareup.okhttp.Call advertiseListAssignedCreativePacksValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = advertiseListAssignedCreativePacksCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List Assigned Creative Packs
     * This endpoint returns creative packs that are assigned to a campaign.  **Note**: you can also use the &lt;a href&#x3D;\&quot;#operation/advertise-listCreativePacks\&quot;&gt;list Creative Packs&lt;/a&gt; endpoint to check which creative packs are currently assigned to which campaigns. 
     * @return AdvertiseAssignedCreativePacksResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertiseAssignedCreativePacksResponseBody advertiseListAssignedCreativePacks() throws ApiException {
        ApiResponse<AdvertiseAssignedCreativePacksResponseBody> resp = advertiseListAssignedCreativePacksWithHttpInfo();
        return resp.getData();
    }

    /**
     * List Assigned Creative Packs
     * This endpoint returns creative packs that are assigned to a campaign.  **Note**: you can also use the &lt;a href&#x3D;\&quot;#operation/advertise-listCreativePacks\&quot;&gt;list Creative Packs&lt;/a&gt; endpoint to check which creative packs are currently assigned to which campaigns. 
     * @return ApiResponse&lt;AdvertiseAssignedCreativePacksResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertiseAssignedCreativePacksResponseBody> advertiseListAssignedCreativePacksWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = advertiseListAssignedCreativePacksValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<AdvertiseAssignedCreativePacksResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Assigned Creative Packs (asynchronously)
     * This endpoint returns creative packs that are assigned to a campaign.  **Note**: you can also use the &lt;a href&#x3D;\&quot;#operation/advertise-listCreativePacks\&quot;&gt;list Creative Packs&lt;/a&gt; endpoint to check which creative packs are currently assigned to which campaigns. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseListAssignedCreativePacksAsync(final ApiCallback<AdvertiseAssignedCreativePacksResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseListAssignedCreativePacksValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertiseAssignedCreativePacksResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for advertiseListCampaigns
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseListCampaignsCall(Long organizationId, String campaignSetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns"
            .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
            .replaceAll("\\{" + "campaignSetId" + "\\}", apiClient.escapeString(campaignSetId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
  
    private com.squareup.okhttp.Call advertiseListCampaignsValidateBeforeCall(Long organizationId, String campaignSetId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (organizationId == null) {
            throw new ApiException("Missing the required parameter 'organizationId' when calling advertiseListCampaigns(Async)");
        }
        if (campaignSetId == null) {
            throw new ApiException("Missing the required parameter 'campaignSetId' when calling advertiseListCampaigns(Async)");
        }

        com.squareup.okhttp.Call call = advertiseListCampaignsCall(organizationId, campaignSetId, progressListener, progressRequestListener);
        return call; 
        
    }

    /**
     * List Campaigns
     * This endpoint returns campaigns for the given app.
     * @return AdvertiseCampaignsResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertiseCampaignsResponseBody advertiseListCampaigns(Long organizationId, String campaignSetId) throws ApiException {
        ApiResponse<AdvertiseCampaignsResponseBody> resp = advertiseListCampaignsWithHttpInfo(organizationId, campaignSetId);
        return resp.getData();
    }

    /**
     * List Campaigns
     * This endpoint returns campaigns for the given app.
     * @return ApiResponse&lt;AdvertiseCampaignsResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertiseCampaignsResponseBody> advertiseListCampaignsWithHttpInfo(Long organizationId, String campaignSetId) throws ApiException {
        com.squareup.okhttp.Call call = advertiseListCampaignsValidateBeforeCall(organizationId, campaignSetId, null, null);
        Type localVarReturnType = new TypeToken<AdvertiseCampaignsResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Campaigns (asynchronously)
     * This endpoint returns campaigns for the given app.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseListCampaignsAsync(Long organizationId, String campaignSetId, final ApiCallback<AdvertiseCampaignsResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseListCampaignsValidateBeforeCall(organizationId, campaignSetId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertiseCampaignsResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for advertiseUnassignCreativePack
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseUnassignCreativePackCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/assigned-creative-packs/{assignedCreativePackId}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call advertiseUnassignCreativePackValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = advertiseUnassignCreativePackCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Unassign Creative Pack
     * Unassign a creative pack from a campaign. 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void advertiseUnassignCreativePack() throws ApiException {
        advertiseUnassignCreativePackWithHttpInfo();
    }

    /**
     * Unassign Creative Pack
     * Unassign a creative pack from a campaign. 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> advertiseUnassignCreativePackWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = advertiseUnassignCreativePackValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Unassign Creative Pack (asynchronously)
     * Unassign a creative pack from a campaign. 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseUnassignCreativePackAsync(final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseUnassignCreativePackValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for advertiseUpdateCampaign
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseUpdateCampaignCall(AdvertiseUpdateCampaignRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call advertiseUpdateCampaignValidateBeforeCall(AdvertiseUpdateCampaignRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling advertiseUpdateCampaign(Async)");
        }
        
        com.squareup.okhttp.Call call = advertiseUpdateCampaignCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update Campaign
     * This endpoint is used to update a campaign.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;enabled&#x60; field. 
     * @param body  (required)
     * @return AdvertiseUpdatedCampaignResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertiseUpdatedCampaignResponseBody advertiseUpdateCampaign(AdvertiseUpdateCampaignRequestBody body) throws ApiException {
        ApiResponse<AdvertiseUpdatedCampaignResponseBody> resp = advertiseUpdateCampaignWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Update Campaign
     * This endpoint is used to update a campaign.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;enabled&#x60; field. 
     * @param body  (required)
     * @return ApiResponse&lt;AdvertiseUpdatedCampaignResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertiseUpdatedCampaignResponseBody> advertiseUpdateCampaignWithHttpInfo(AdvertiseUpdateCampaignRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = advertiseUpdateCampaignValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AdvertiseUpdatedCampaignResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Campaign (asynchronously)
     * This endpoint is used to update a campaign.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;enabled&#x60; field. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseUpdateCampaignAsync(AdvertiseUpdateCampaignRequestBody body, final ApiCallback<AdvertiseUpdatedCampaignResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseUpdateCampaignValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertiseUpdatedCampaignResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for advertiseUpdateTargeting
     * @param body  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call advertiseUpdateTargetingCall(AdvertiseTargeting body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/advertise/v1/organizations/{organizationId}/apps/{campaignSetId}/campaigns/{campaignId}/targeting";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call advertiseUpdateTargetingValidateBeforeCall(AdvertiseTargeting body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling advertiseUpdateTargeting(Async)");
        }
        
        com.squareup.okhttp.Call call = advertiseUpdateTargetingCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update targeting options
     * This endpoint is used to update targeting options.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;appTargeting&#x60; option. 
     * @param body  (required)
     * @return AdvertiseUpdateTargetingResponseBody
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AdvertiseUpdateTargetingResponseBody advertiseUpdateTargeting(AdvertiseTargeting body) throws ApiException {
        ApiResponse<AdvertiseUpdateTargetingResponseBody> resp = advertiseUpdateTargetingWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Update targeting options
     * This endpoint is used to update targeting options.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;appTargeting&#x60; option. 
     * @param body  (required)
     * @return ApiResponse&lt;AdvertiseUpdateTargetingResponseBody&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AdvertiseUpdateTargetingResponseBody> advertiseUpdateTargetingWithHttpInfo(AdvertiseTargeting body) throws ApiException {
        com.squareup.okhttp.Call call = advertiseUpdateTargetingValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<AdvertiseUpdateTargetingResponseBody>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update targeting options (asynchronously)
     * This endpoint is used to update targeting options.  **Note**: this endpoint supports partial updates. The payload can contain, for example, only a new value for the &#x60;appTargeting&#x60; option. 
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call advertiseUpdateTargetingAsync(AdvertiseTargeting body, final ApiCallback<AdvertiseUpdateTargetingResponseBody> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = advertiseUpdateTargetingValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AdvertiseUpdateTargetingResponseBody>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}