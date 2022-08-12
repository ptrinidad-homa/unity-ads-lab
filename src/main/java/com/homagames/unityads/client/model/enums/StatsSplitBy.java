/*
 * Split by enum for statistics API
 */

package com.homagames.unityads.client.model.enums;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The app store that is linked to this app.
 */
@JsonAdapter(StatsSplitBy.Adapter.class)
public enum StatsSplitBy {
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
  REACHEXTENSION("reachExtension"),
  SKADCONVERSIONVALUE("skadConversionValue");
  
  private String value;

  StatsSplitBy(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatsSplitBy fromValue(String input) {
    for (StatsSplitBy b : StatsSplitBy.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StatsSplitBy> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatsSplitBy enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public StatsSplitBy read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return StatsSplitBy.fromValue((String)(value));
    }
  }
}
