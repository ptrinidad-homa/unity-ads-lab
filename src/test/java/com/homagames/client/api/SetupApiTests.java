package com.homagames.client.api;

import com.homagames.client.PropertiesStorage;

public class SetupApiTests {
    Long organizationId = 1374449567283L;
    String campaignSetId = "62ea8d8b676f22632ad2f799";
    String authKey = PropertiesStorage.getInstance().getProperty("unity.key");
    String statisticsAuthKey = PropertiesStorage.getInstance().getProperty("unity.statistics.key");
    String statisticsOrganizationId = PropertiesStorage.getInstance().getProperty("unity.statistics.organization");  
}
