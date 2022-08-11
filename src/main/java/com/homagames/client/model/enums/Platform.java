/*
 * Platform enum for statistics API
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
@JsonAdapter(Platform.Adapter.class)
public enum Platform {
  IOS("ios"),
  ANDROID("android");

  private String value;

  Platform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Platform fromValue(String input) {
    for (Platform b : Platform.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Platform> {
    @Override
    public void write(final JsonWriter jsonWriter, final Platform enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public Platform read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return Platform.fromValue((String)(value));
    }
  }
}
