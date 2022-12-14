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

package com.homagames.unityads.client.model.statistics;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Time resolution of the data.
 */
@JsonAdapter(StatsScale.Adapter.class)
public enum StatsScale {
  ALL("all"),
  HOUR("hour"),
  DAY("day"),
  WEEK("week"),
  MONTH("month"),
  QUARTER("quarter"),
  YEAR("year");

  private String value;

  StatsScale(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatsScale fromValue(String input) {
    for (StatsScale b : StatsScale.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StatsScale> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatsScale enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public StatsScale read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return StatsScale.fromValue((String)(value));
    }
  }
}
