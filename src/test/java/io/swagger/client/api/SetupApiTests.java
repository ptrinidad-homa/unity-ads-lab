package io.swagger.client.api;

import io.swagger.client.PropertiesStorage;

public class SetupApiTests {
    protected final AppsApi api = new AppsApi();
    Long organizationId = 1374449567283L;
    String campaignSetId = "62ea8d8b676f22632ad2f799";
    String authKey = PropertiesStorage.getInstance().getProperty("unity.key");
    String statisticsAuthKey = PropertiesStorage.getInstance().getProperty("unity.statistics.key");
    String statisticsOrganizationId = PropertiesStorage.getInstance().getProperty("unity.statistics.organization");  
}
