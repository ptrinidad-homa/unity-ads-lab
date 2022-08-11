/*
 * Ad Types enum for statistics API
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
@JsonAdapter(StatsAdTypes.Adapter.class)
public enum StatsAdTypes {
  VIDEO("video"),
  PLAYABLE("playable"),
  VIDEO_AND_PLAYABLE("video+playable");
  
  private String value;

  StatsAdTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StatsAdTypes fromValue(String input) {
    for (StatsAdTypes b : StatsAdTypes.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<StatsAdTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final StatsAdTypes enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public StatsAdTypes read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return StatsAdTypes.fromValue((String)(value));
    }
  }
}
