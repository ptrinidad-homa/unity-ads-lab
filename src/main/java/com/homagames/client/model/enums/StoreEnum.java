package com.homagames.client.model.enums;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(StoreEnum.Adapter.class)
public enum StoreEnum {
  APPLE("apple"),
  GOOGLE("google");

  private String value;

  StoreEnum(String value) {
    this.value = value;
  }
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
  public static StoreEnum fromValue(String input) {
    for (StoreEnum b : StoreEnum.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }
  public static class Adapter extends TypeAdapter<StoreEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final StoreEnum enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public StoreEnum read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return StoreEnum.fromValue((String)(value));
    }
  }
}
