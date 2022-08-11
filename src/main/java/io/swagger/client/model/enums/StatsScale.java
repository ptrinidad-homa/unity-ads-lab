/*
 * Scale enum for statistics API
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
