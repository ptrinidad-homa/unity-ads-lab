/*
 * Fields enum for statistics API
 */

package io.swagger.client.model.enums;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The app store that is linked to this app.
 */
@JsonAdapter(StatsField.Adapter.class)
public enum StatsField {
  TIMESTAMP("timestamp"),
  CAMPAIGNSET("campaignSet"),
  CREATIVEPACK("creativePack"),
  ADTYPE("adType"),
  CAMPAIGN("campaign"),
  TARGET("target"),
  SOURCEAPPID("sourceAppId"),
  STORE("store"),
  COUNTRY("country"),
  PLATFORM("platform"),
  OSVERSION("osVersion"),
  STARTS("starts"),
  VIEWS("views"),
  CLICKS("clicks"),
  INSTALLS("installs"),
  SPEND("spend"),
  CVR("cvr"),
  CTR("ctr"),
  ECPM("ecpm"),
  CPI("cpi"),
  SKADINSTALLS("skadInstalls"),
  SKADCPI("skadCpi"),
  SKADCONVERSION("skadConversion"),
  ALL("all"); // all means "timestamp|starts|views|clicks|installs|spend|cvr|ctr|ecpm|cpi"
  
  private String value;

  StatsField(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatsField fromValue(String input) {
    for (StatsField b : StatsField.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StatsField> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatsField enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public StatsField read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return StatsField.fromValue((String)(value));
    }
  }
}
