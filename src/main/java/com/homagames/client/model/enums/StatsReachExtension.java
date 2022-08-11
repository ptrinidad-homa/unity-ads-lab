/*
 * StatsReachExtension enum for statistics API
 */

package com.homagames.client.model.enums;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The app store that is linked to this app.
 */
@JsonAdapter(StatsReachExtension.Adapter.class)
public enum StatsReachExtension {
  UNITY("unity"),
  EXCHANGES("exchanges");
  
  private String value;

  StatsReachExtension(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatsReachExtension fromValue(String input) {
    for (StatsReachExtension b : StatsReachExtension.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StatsReachExtension> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatsReachExtension enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public StatsReachExtension read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return StatsReachExtension.fromValue((String)(value));
    }
  }
}
