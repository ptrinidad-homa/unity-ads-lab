package io.swagger.client.api;

import io.swagger.client.PropertiesStorage;

public class SetupApiTests {
    protected final AppsApi api = new AppsApi();
    String key = "982eb3a3-a204-439d-951f-8818b7500f12";
    Long organizationId = 1374449567283L;
    String secretKey = "qIGDQrWevYujWrzkGm-__JJSlM_fWgYL";
    String authKey = PropertiesStorage.getInstance().getProperty("unity.key");    
}
