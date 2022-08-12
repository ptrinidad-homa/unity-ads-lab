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

package com.homagames.unityads.client;

import com.homagames.unityads.client.auth.ApiKeyAuth;
import com.homagames.unityads.client.auth.Authentication;
import com.homagames.unityads.client.auth.HttpBasicAuth;
import com.homagames.unityads.client.auth.OAuth;
import com.squareup.okhttp.*;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;
import com.squareup.okhttp.logging.HttpLoggingInterceptor.Level;

import okio.BufferedSink;
import okio.Okio;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import javax.net.ssl.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.DateFormat;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiClient {

    private String basePath;
    private boolean debugging = false;
    private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
    private String tempFolderPath = null;

    private Map<String, Authentication> authentications;

    private DateFormat dateFormat;
    private DateFormat datetimeFormat;
    private boolean lenientDatetimeFormat;
    private int dateLength;

    private InputStream sslCaCert;
    private boolean verifyingSsl;
    private KeyManager[] keyManagers;

    private OkHttpClient httpClient;
    private JSON json;

    private HttpLoggingInterceptor loggingInterceptor;

    /*
     * Constructor for ApiClient
     */
    public ApiClient(String basePath, String authPrefix, String authTok) {
        this.basePath = basePath;

        httpClient = new OkHttpClient();


        verifyingSsl = true;

        json = new JSON();

        // Set default User-Agent.
        setUserAgent("Swagger-Codegen/1.0.0/java");
        // addDefaultHeader("Authorization", "Basic OTgyZWIzYTMtYTIwNC00MzlkLTk1MWYtODgxOGI3NTAwZjEyOnFJR0RRcldldll1aldyemtHbS1fX0pKU2xNX2ZXZ1lMCg");

        // Setup authentications (key: authentication name, value: authentication).
        authentications = new HashMap<String, Authentication>();
        ApiKeyAuth apiKey = new ApiKeyAuth("header","Authorization");
        apiKey.setApiKey(authTok);
        apiKey.setApiKeyPrefix(authPrefix);
        authentications.put("Authentication", apiKey);
        // Prevent the authentications from being modified.
        authentications = Collections.unmodifiableMap(authentications);
    }

    /**
     * Get base path
     *
     * @return Baes path
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Set base path
     *
     * @param basePath Base path of the URL (e.g https://services.api.unity.com
     * @return An instance of OkHttpClient
     */
    public ApiClient setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * Get HTTP client
     *
     * @return An instance of OkHttpClient
     */
    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Set HTTP client
     *
     * @param httpClient An instance of OkHttpClient
     * @return Api Client
     */
    public ApiClient setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Get JSON
     *
     * @return JSON object
     */
    public JSON getJSON() {
        return json;
    }

    /**
     * Set JSON
     *
     * @param json JSON object
     * @return Api client
     */
    public ApiClient setJSON(JSON json) {
        this.json = json;
        return this;
    }

    /**
     * True if isVerifyingSsl flag is on
     *
     * @return True if isVerifySsl flag is on
     */
    public boolean isVerifyingSsl() {
        return verifyingSsl;
    }

    /**
     * Configure whether to verify certificate and hostname when making https requests.
     * Default to true.
     * NOTE: Do NOT set to false in production code, otherwise you would face multiple types of cryptographic attacks.
     *
     * @param verifyingSsl True to verify TLS/SSL connection
     * @return ApiClient
     */
    public ApiClient setVerifyingSsl(boolean verifyingSsl) {
        this.verifyingSsl = verifyingSsl;
        applySslSettings();
        return this;
    }

    /**
     * Get SSL CA cert.
     *
     * @return Input stream to the SSL CA cert
     */
    public InputStream getSslCaCert() {
        return sslCaCert;
    }

    /**
     * Configure the CA certificate to be trusted when making https requests.
     * Use null to reset to default.
     *
     * @param sslCaCert input stream for SSL CA cert
     * @return ApiClient
     */
    public ApiClient setSslCaCert(InputStream sslCaCert) {
        this.sslCaCert = sslCaCert;
        applySslSettings();
        return this;
    }

    public KeyManager[] getKeyManagers() {
        return keyManagers;
    }

    /**
     * Configure client keys to use for authorization in an SSL session.
     * Use null to reset to default.
     *
     * @param managers The KeyManagers to use
     * @return ApiClient
     */
    public ApiClient setKeyManagers(KeyManager[] managers) {
        this.keyManagers = managers;
        applySslSettings();
        return this;
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public ApiClient setDateFormat(DateFormat dateFormat) {
        this.json.setDateFormat(dateFormat);
        return this;
    }

    public ApiClient setSqlDateFormat(DateFormat dateFormat) {
        this.json.setSqlDateFormat(dateFormat);
        return this;
    }

    public ApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        this.json.setOffsetDateTimeFormat(dateFormat);
        return this;
    }

    public ApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
        this.json.setLocalDateFormat(dateFormat);
        return this;
    }

    public ApiClient setLenientOnJson(boolean lenientOnJson) {
        this.json.setLenientOnJson(lenientOnJson);
        return this;
    }

    /**
     * Get authentications (key: authentication name, value: authentication).
     *
     * @return Map of authentication objects
     */
    public Map<String, Authentication> getAuthentications() {
        return authentications;
    }

    /**
     * Get authentication for the given name.
     *
     * @param authName The authentication name
     * @return The authentication, null if not found
     */
    public Authentication getAuthentication(String authName) {
        return authentications.get(authName);
    }

    /**
     * Helper method to set username for the first HTTP basic authentication.
     *
     * @param username Username
     */
    public void setUsername(String username) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBasicAuth) {
                ((HttpBasicAuth) auth).setUsername(username);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }

    /**
     * Helper method to set password for the first HTTP basic authentication.
     *
     * @param password Password
     */
    public void setPassword(String password) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof HttpBasicAuth) {
                ((HttpBasicAuth) auth).setPassword(password);
                return;
            }
        }
        throw new RuntimeException("No HTTP basic authentication configured!");
    }

    /**
     * Helper method to set API key value for the first API key authentication.
     *
     * @param apiKey API key
     */
    public void setApiKey(String apiKey) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof ApiKeyAuth) {
                ((ApiKeyAuth) auth).setApiKey(apiKey);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }

    /**
     * Helper method to set API key prefix for the first API key authentication.
     *
     * @param apiKeyPrefix API key prefix
     */
    public void setApiKeyPrefix(String apiKeyPrefix) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof ApiKeyAuth) {
                ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
                return;
            }
        }
        throw new RuntimeException("No API key authentication configured!");
    }

    /**
     * Helper method to set access token for the first OAuth2 authentication.
     *
     * @param accessToken Access token
     */
    public void setAccessToken(String accessToken) {
        for (Authentication auth : authentications.values()) {
            if (auth instanceof OAuth) {
                ((OAuth) auth).setAccessToken(accessToken);
                return;
            }
        }
        throw new RuntimeException("No OAuth2 authentication configured!");
    }

    /**
     * Set the User-Agent header's value (by adding to the default header map).
     *
     * @param userAgent HTTP request's user agent
     * @return ApiClient
     */
    public ApiClient setUserAgent(String userAgent) {
        addDefaultHeader("User-Agent", userAgent);
        return this;
    }

    /**
     * Add a default header.
     *
     * @param key The header's key
     * @param value The header's value
     * @return ApiClient
     */
    public ApiClient addDefaultHeader(String key, String value) {
        defaultHeaderMap.put(key, value);
        return this;
    }

    /**
     * Check that whether debugging is enabled for this API client.
     *
     * @return True if debugging is enabled, false otherwise.
     */
    public boolean isDebugging() {
        return debugging;
    }

    /**
     * Enable/disable debugging for this API client.
     *
     * @param debugging To enable (true) or disable (false) debugging
     * @return ApiClient
     */
    public ApiClient setDebugging(boolean debugging) {
        if (debugging != this.debugging) {
            if (debugging) {
                loggingInterceptor = new HttpLoggingInterceptor();
                loggingInterceptor.setLevel(Level.BODY);
                httpClient.interceptors().add(loggingInterceptor);
            } else {
                httpClient.interceptors().remove(loggingInterceptor);
                loggingInterceptor = null;
            }
        }
        this.debugging = debugging;
        return this;
    }

    /**
     * The path of temporary folder used to store downloaded files from endpoints
     * with file response. The default value is <code>null</code>, i.e. using
     * the system's default tempopary folder.
     *
     * @see <a href="https://docs.oracle.com/javase/7/docs/api/java/io/File.html#createTempFile">createTempFile</a>
     * @return Temporary folder path
     */
    public String getTempFolderPath() {
        return tempFolderPath;
    }

    /**
     * Set the temporary folder path (for downloading files)
     *
     * @param tempFolderPath Temporary folder path
     * @return ApiClient
     */
    public ApiClient setTempFolderPath(String tempFolderPath) {
        this.tempFolderPath = tempFolderPath;
        return this;
    }

    /**
     * Get connection timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getConnectTimeout() {
        return httpClient.getConnectTimeout();
    }

    /**
     * Sets the connect timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     *
     * @param connectionTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setConnectTimeout(int connectionTimeout) {
        httpClient.setConnectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get read timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getReadTimeout() {
        return httpClient.getReadTimeout();
    }

    /**
     * Sets the read timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     * {@link Integer#MAX_VALUE}.
     *
     * @param readTimeout read timeout in milliseconds
     * @return Api client
     */
    public ApiClient setReadTimeout(int readTimeout) {
        httpClient.setReadTimeout(readTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get write timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getWriteTimeout() {
        return httpClient.getWriteTimeout();
    }

    /**
     * Sets the write timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     * {@link Integer#MAX_VALUE}.
     *
     * @param writeTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setWriteTimeout(int writeTimeout) {
        httpClient.setWriteTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Format the given parameter object into string.
     *
     * @param param Parameter
     * @return String representation of the parameter
     */
    public String parameterToString(Object param) {
        if (param == null) {
            return "";
        } else if (param instanceof Date || param instanceof OffsetDateTime || param instanceof LocalDate) {
            //Serialize to json string and remove the " enclosing characters
            String jsonStr = json.serialize(param);
            return jsonStr.substring(1, jsonStr.length() - 1);
        } else if (param instanceof Collection ) {
            StringBuilder b = new StringBuilder();
            for (Object o : (Collection)param) {
                if (b.length() > 0) {
                    b.append(",");
                }
                b.append(String.valueOf(o));
            }
            return b.toString();
        } else if (param.getClass().isArray() ) {
            StringBuilder b = new StringBuilder();
            for (Object o : (Object[])param) {
                if (b.length() > 0) {
                    b.append(",");
                }
                b.append(String.valueOf(o));
            }
            return b.toString();
        } else {
            return String.valueOf(param);
        }
    }

    /**
     * Formats the specified query parameter to a list containing a single {@code Pair} object.
     *
     * Note that {@code value} must not be a collection.
     *
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list containing a single {@code Pair} object.
     */
    public List<Pair> parameterToPair(String name, Object value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null || value instanceof Collection) return params;

        params.add(new Pair(name, parameterToString(value)));
        return params;
    }

    /**
     * Formats the specified collection query parameters to a list of {@code Pair} objects.
     *
     * Note that the values of each of the returned Pair objects are percent-encoded.
     *
     * @param collectionFormat The collection format of the parameter.
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list of {@code Pair} objects.
     */
    public List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
        List<Pair> params = new ArrayList<Pair>();

        // preconditions
        if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
            return params;
        }

        // create the params based on the collection format
        if ("multi".equals(collectionFormat)) {
            for (Object item : value) {
                params.add(new Pair(name, escapeString(parameterToString(item))));
            }
            return params;
        }

        // collectionFormat is assumed to be "csv" by default
        String delimiter = ",";

        // escape all delimiters except commas, which are URI reserved
        // characters
        if ("ssv".equals(collectionFormat)) {
            delimiter = escapeString(" ");
        } else if ("tsv".equals(collectionFormat)) {
            delimiter = escapeString("\t");
        } else if ("pipes".equals(collectionFormat)) {
            delimiter = escapeString("|");
        }

        StringBuilder sb = new StringBuilder() ;
        for (Object item : value) {
            sb.append(delimiter);
            sb.append(escapeString(parameterToString(item)));
        }

        params.add(new Pair(name, sb.substring(delimiter.length())));

        return params;
    }

    /**
     * Sanitize filename by removing path.
     * e.g. ../../sun.gif becomes sun.gif
     *
     * @param filename The filename to be sanitized
     * @return The sanitized filename
     */
    public String sanitizeFilename(String filename) {
        return filename.replaceAll(".*[/\\\\]", "");
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     *   application/json
     *   application/json; charset=UTF8
     *   APPLICATION/JSON
     *   application/vnd.company+json
     * "* / *" is also default to JSON
     * @param mime MIME (Multipurpose Internet Mail Extensions)
     * @return True if the given MIME is JSON, false otherwise.
     */
    public boolean isJsonMime(String mime) {
      String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
      return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
    }

    /**
     * Select the Accept header's value from the given accepts array:
     *   if JSON exists in the given array, use it;
     *   otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return The Accept header to use. If the given array is empty,
     *   null will be returned (not to set the Accept header explicitly).
     */
    public String selectHeaderAccept(String[] accepts) {
        if (accepts.length == 0) {
            return null;
        }
        for (String accept : accepts) {
            if (isJsonMime(accept)) {
                return accept;
            }
        }
        return StringUtil.join(accepts, ",");
    }

    /**
     * Select the Content-Type header's value from the given array:
     *   if JSON exists in the given array, use it;
     *   otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return The Content-Type header to use. If the given array is empty,
     *   or matches "any", JSON will be used.
     */
    public String selectHeaderContentType(String[] contentTypes) {
        if (contentTypes.length == 0 || contentTypes[0].equals("*/*")) {
             return "application/json";
        }
        for (String contentType : contentTypes) {
            if (isJsonMime(contentType)) {
                return contentType;
            }
        }
        return contentTypes[0];
    }

    /**
     * Escape the given string to be used as URL query value.
     *
     * @param str String to be escaped
     * @return Escaped string
     */
    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /**
     * Deserialize response body to Java object, according to the return type and
     * the Content-Type response header.
     *
     * @param <T> Type
     * @param response HTTP response
     * @param returnType The type of the Java object
     * @return The deserialized Java object
     * @throws ApiException If fail to deserialize response body, i.e. cannot read response body
     *   or the Content-Type of the response is not supported.
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(Response response, Type returnType) throws ApiException {
        if (response == null || returnType == null) {
            return null;
        }

        if ("byte[]".equals(returnType.toString())) {
            // Handle binary response (byte array).
            try {
                return (T) response.body().bytes();
            } catch (IOException e) {
                throw new ApiException(e);
            }
        } else if (returnType.equals(File.class)) {
            // Handle file downloading.
            return (T) downloadFileFromResponse(response);
        }

        String respBody;
        try {
            if (response.body() != null)
                respBody = response.body().string();
            else
                respBody = null;
        } catch (IOException e) {
            throw new ApiException(e);
        }

        if (respBody == null || "".equals(respBody)) {
            return null;
        }

        String contentType = response.headers().get("Content-Type");
        if (contentType == null) {
            // ensuring a default content type
            contentType = "application/json";
        }
        if (isJsonMime(contentType)) {
            return json.deserialize(respBody, returnType);
        } else if (returnType.equals(String.class)) {
            // Expecting string, return the raw response body.
            return (T) respBody;
        } else {
            throw new ApiException(
                    "Content type \"" + contentType + "\" is not supported for type: " + returnType,
                    response.code(),
                    response.headers().toMultimap(),
                    respBody);
        }
    }

    /**
     * Serialize the given Java object into request body according to the object's
     * class and the request Content-Type.
     *
     * @param obj The Java object
     * @param contentType The request Content-Type
     * @return The serialized request body
     * @throws ApiException If fail to serialize the given object
     */
    public RequestBody serialize(Object obj, String contentType) throws ApiException {
        if (obj instanceof byte[]) {
            // Binary (byte array) body parameter support.
            return RequestBody.create(MediaType.parse(contentType), (byte[]) obj);
        } else if (obj instanceof File) {
            // File body parameter support.
            return RequestBody.create(MediaType.parse(contentType), (File) obj);
        } else if (isJsonMime(contentType)) {
            String content;
            if (obj != null) {
                content = json.serialize(obj);
            } else {
                content = null;
            }
            return RequestBody.create(MediaType.parse(contentType), content);
        } else {
            throw new ApiException("Content type \"" + contentType + "\" is not supported");
        }
    }

    /**
     * Download file from the given response.
     *
     * @param response An instance of the Response object
     * @throws ApiException If fail to read file content from response and write to disk
     * @return Downloaded file
     */
    public File downloadFileFromResponse(Response response) throws ApiException {
        try {
            File file = prepareDownloadFile(response);
            BufferedSink sink = Okio.buffer(Okio.sink(file));
            sink.writeAll(response.body().source());
            sink.close();
            return file;
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * Prepare file for download
     *
     * @param response An instance of the Response object
     * @throws IOException If fail to prepare file for download
     * @return Prepared file for the download
     */
    public File prepareDownloadFile(Response response) throws IOException {
        String filename = null;
        String contentDisposition = response.header("Content-Disposition");
        if (contentDisposition != null && !"".equals(contentDisposition)) {
            // Get filename from the Content-Disposition header.
            Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
            Matcher matcher = pattern.matcher(contentDisposition);
            if (matcher.find()) {
                filename = sanitizeFilename(matcher.group(1));
            }
        }

        String prefix = null;
        String suffix = null;
        if (filename == null) {
            prefix = "download-";
            suffix = "";
        } else {
            int pos = filename.lastIndexOf(".");
            if (pos == -1) {
                prefix = filename + "-";
            } else {
                prefix = filename.substring(0, pos) + "-";
                suffix = filename.substring(pos);
            }
            // File.createTempFile requires the prefix to be at least three characters long
            if (prefix.length() < 3)
                prefix = "download-";
        }

        if (tempFolderPath == null)
            return Files.createTempFile(prefix, suffix).toFile();
        else
            return Files.createTempFile(Paths.get(tempFolderPath), prefix, suffix).toFile();
    }

    /**
     * {@link #execute(Call, Type)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @throws ApiException If fail to execute the call
     * @return ApiResponse&lt;T&gt;
     */
    public <T> ApiResponse<T> execute(Call call) throws ApiException {
        return execute(call, null);
    }

    /**
     * Execute HTTP call and deserialize the HTTP response body into the given return type.
     *
     * @param returnType The return type used to deserialize HTTP response body
     * @param <T> The return type corresponding to (same with) returnType
     * @param call Call
     * @return ApiResponse object containing response status, headers and
     *   data, which is a Java object deserialized from response body and would be null
     *   when returnType is null.
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        try {
            Response response = call.execute();
            T data = handleResponse(response, returnType);
            return new ApiResponse<T>(response.code(), response.headers().toMultimap(), data);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * {@link #executeAsync(Call, Type, ApiCallback)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @param callback ApiCallback&lt;T&gt;
     */
    public <T> void executeAsync(Call call, ApiCallback<T> callback) {
        executeAsync(call, null, callback);
    }

    /**
     * Execute HTTP call asynchronously.
     *
     * @see #execute(Call, Type)
     * @param <T> Type
     * @param call The callback to be executed when the API call finishes
     * @param returnType Return type
     * @param callback ApiCallback
     */
    @SuppressWarnings("unchecked")
    public <T> void executeAsync(Call call, final Type returnType, final ApiCallback<T> callback) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                callback.onFailure(new ApiException(e), 0, null);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                T result;
                try {
                    result = (T) handleResponse(response, returnType);
                } catch (ApiException e) {
                    callback.onFailure(e, response.code(), response.headers().toMultimap());
                    return;
                }
                callback.onSuccess(result, response.code(), response.headers().toMultimap());
            }
        });
    }

    /**
     * Handle the given response, return the deserialized object when the response is successful.
     *
     * @param <T> Type
     * @param response Response
     * @param returnType Return type
     * @throws ApiException If the response has a unsuccessful status code or
     *   fail to deserialize the response body
     * @return Type
     */
    public <T> T handleResponse(Response response, Type returnType) throws ApiException {
        if (response.isSuccessful()) {
            if (returnType == null || response.code() == 204) {
                // returning null if the returnType is not defined,
                // or the status code is 204 (No Content)
                if (response.body() != null) {
                    try {
                        response.body().close();
                    } catch (IOException e) {
                        throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                    }
                }
                return null;
            } else {
                return deserialize(response, returnType);
            }
        } else {
            String respBody = null;
            if (response.body() != null) {
                try {
                    respBody = response.body().string();
                } catch (IOException e) {
                    throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                }
            }
            throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), respBody);
        }
    }

    /**
     * Build HTTP call with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param authNames The authentications to apply
     * @param progressRequestListener Progress request listener
     * @return The HTTP call
     * @throws ApiException If fail to serialize the request body object
     */
    public Call buildCall(String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String[] authNames, ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Request request = buildRequest(path, method, queryParams, collectionQueryParams, body, headerParams, formParams, authNames, progressRequestListener);

        return httpClient.newCall(request);
    }

    /**
     * Build an HTTP request with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @param body The request body object
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @param authNames The authentications to apply
     * @param progressRequestListener Progress request listener
     * @return The HTTP request
     * @throws ApiException If fail to serialize the request body object
     */
    public Request buildRequest(String path, String method, List<Pair> queryParams, List<Pair> collectionQueryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String[] authNames, ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        updateParamsForAuth(authNames, queryParams, headerParams);

        final String url = buildUrl(path, queryParams, collectionQueryParams);
        final Request.Builder reqBuilder = new Request.Builder().url(url);
        processHeaderParams(headerParams, reqBuilder);

        String contentType = (String) headerParams.get("Content-Type");
        // ensuring a default content type
        if (contentType == null) {
            contentType = "application/json";
        }

        RequestBody reqBody;
        if (!HttpMethod.permitsRequestBody(method)) {
            reqBody = null;
        } else if ("application/x-www-form-urlencoded".equals(contentType)) {
            reqBody = buildRequestBodyFormEncoding(formParams);
        } else if ("multipart/form-data".equals(contentType)) {
            reqBody = buildRequestBodyMultipart(formParams);
        } else if (body == null) {
            if ("DELETE".equals(method)) {
                // allow calling DELETE without sending a request body
                reqBody = null;
            } else {
                // use an empty request body (for POST, PUT and PATCH)
                reqBody = RequestBody.create(MediaType.parse(contentType), "");
            }
        } else {
            reqBody = serialize(body, contentType);
        }

        Request request = null;

        if(progressRequestListener != null && reqBody != null) {
            ProgressRequestBody progressRequestBody = new ProgressRequestBody(reqBody, progressRequestListener);
            request = reqBuilder.method(method, progressRequestBody).build();
        } else {
            request = reqBuilder.method(method, reqBody).build();
        }

        return request;
    }

    /**
     * Build full URL by concatenating base path, the given sub path and query parameters.
     *
     * @param path The sub path
     * @param queryParams The query parameters
     * @param collectionQueryParams The collection query parameters
     * @return The full URL
     */
    public String buildUrl(String path, List<Pair> queryParams, List<Pair> collectionQueryParams) {
        final StringBuilder url = new StringBuilder();
        url.append(basePath).append(path);

        if (queryParams != null && !queryParams.isEmpty()) {
            // support (constant) query string in `path`, e.g. "/posts?draft=1"
            String prefix = path.contains("?") ? "&" : "?";
            for (Pair param : queryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    url.append(escapeString(param.getName())).append("=").append(escapeString(value));
                }
            }
        }

        if (collectionQueryParams != null && !collectionQueryParams.isEmpty()) {
            String prefix = url.toString().contains("?") ? "&" : "?";
            for (Pair param : collectionQueryParams) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    // collection query parameter value already escaped as part of parameterToPairs
                    url.append(escapeString(param.getName())).append("=").append(value);
                }
            }
        }

        return url.toString();
    }

    /**
     * Set header parameters to the request builder, including default headers.
     *
     * @param headerParams Header parameters in the ofrm of Map
     * @param reqBuilder Reqeust.Builder
     */
    public void processHeaderParams(Map<String, String> headerParams, Request.Builder reqBuilder) {
        for (Entry<String, String> param : headerParams.entrySet()) {
            reqBuilder.header(param.getKey(), parameterToString(param.getValue()));
        }
        for (Entry<String, String> header : defaultHeaderMap.entrySet()) {
            if (!headerParams.containsKey(header.getKey())) {
                reqBuilder.header(header.getKey(), parameterToString(header.getValue()));
            }
        }
    }

    /**
     * Update query and header parameters based on authentication settings.
     *
     * @param authNames The authentications to apply
     * @param queryParams  List of query parameters
     * @param headerParams  Map of header parameters
     */
    public void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) {
        for (String authName : authNames) {
            Authentication auth = authentications.get(authName);
            if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
            auth.applyToParams(queryParams, headerParams);
        }
    }

    /**
     * Build a form-encoding request body with the given form parameters.
     *
     * @param formParams Form parameters in the form of Map
     * @return RequestBody
     */
    public RequestBody buildRequestBodyFormEncoding(Map<String, Object> formParams) {
        FormEncodingBuilder formBuilder  = new FormEncodingBuilder();
        for (Entry<String, Object> param : formParams.entrySet()) {
            formBuilder.add(param.getKey(), parameterToString(param.getValue()));
        }
        return formBuilder.build();
    }

    /**
     * Build a multipart (file uploading) request body with the given form parameters,
     * which could contain text fields and file fields.
     *
     * @param formParams Form parameters in the form of Map
     * @return RequestBody
     */
    public RequestBody buildRequestBodyMultipart(Map<String, Object> formParams) {
        MultipartBuilder mpBuilder = new MultipartBuilder().type(MultipartBuilder.FORM);
        for (Entry<String, Object> param : formParams.entrySet()) {
            if (param.getValue() instanceof File) {
                File file = (File) param.getValue();
                Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"; filename=\"" + file.getName() + "\"");
                MediaType mediaType = MediaType.parse(guessContentTypeFromFile(file));
                mpBuilder.addPart(partHeaders, RequestBody.create(mediaType, file));
            } else {
                Headers partHeaders = Headers.of("Content-Disposition", "form-data; name=\"" + param.getKey() + "\"");
                mpBuilder.addPart(partHeaders, RequestBody.create(null, parameterToString(param.getValue())));
            }
        }
        return mpBuilder.build();
    }

    /**
     * Guess Content-Type header from the given file (defaults to "application/octet-stream").
     *
     * @param file The given file
     * @return The guessed Content-Type
     */
    public String guessContentTypeFromFile(File file) {
        String contentType = URLConnection.guessContentTypeFromName(file.getName());
        if (contentType == null) {
            return "application/octet-stream";
        } else {
            return contentType;
        }
    }

    /**
     * Apply SSL related settings to httpClient according to the current values of
     * verifyingSsl and sslCaCert.
     */
    private void applySslSettings() {
        try {
            TrustManager[] trustManagers = null;
            HostnameVerifier hostnameVerifier = null;
            if (!verifyingSsl) {
                TrustManager trustAll = new X509TrustManager() {
                    @Override
                    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
                    @Override
                    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
                    @Override
                    public X509Certificate[] getAcceptedIssuers() { return null; }
                };
                SSLContext sslContext = SSLContext.getInstance("TLS");
                trustManagers = new TrustManager[]{ trustAll };
                hostnameVerifier = new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) { return true; }
                };
            } else if (sslCaCert != null) {
                char[] password = null; // Any password will work.
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                Collection<? extends Certificate> certificates = certificateFactory.generateCertificates(sslCaCert);
                if (certificates.isEmpty()) {
                    throw new IllegalArgumentException("expected non-empty set of trusted certificates");
                }
                KeyStore caKeyStore = newEmptyKeyStore(password);
                int index = 0;
                for (Certificate certificate : certificates) {
                    String certificateAlias = "ca" + Integer.toString(index++);
                    caKeyStore.setCertificateEntry(certificateAlias, certificate);
                }
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(caKeyStore);
                trustManagers = trustManagerFactory.getTrustManagers();
            }

            if (keyManagers != null || trustManagers != null) {
                SSLContext sslContext = SSLContext.getInstance("TLS");
                sslContext.init(keyManagers, trustManagers, new SecureRandom());
                httpClient.setSslSocketFactory(sslContext.getSocketFactory());
            } else {
                httpClient.setSslSocketFactory(null);
            }
            httpClient.setHostnameVerifier(hostnameVerifier);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    private KeyStore newEmptyKeyStore(char[] password) throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, password);
            return keyStore;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
