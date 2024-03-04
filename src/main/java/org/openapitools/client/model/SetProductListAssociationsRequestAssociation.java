/*
 * Collection Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_ProductList.JSON;

/**
 * SetProductListAssociationsRequestAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T10:06:39.440684146Z[Etc/UTC]")
public class SetProductListAssociationsRequestAssociation {
  public static final String SERIALIZED_NAME_LIST_ID = "listId";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_PRODUCT_GRN = "productGrn";
  @SerializedName(SERIALIZED_NAME_PRODUCT_GRN)
  private String productGrn;

  public SetProductListAssociationsRequestAssociation() {
  }

  public SetProductListAssociationsRequestAssociation listId(String listId) {
    this.listId = listId;
    return this;
  }

   /**
   * Get listId
   * @return listId
  **/
  @javax.annotation.Nullable
  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }


  public SetProductListAssociationsRequestAssociation position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }


  public SetProductListAssociationsRequestAssociation productGrn(String productGrn) {
    this.productGrn = productGrn;
    return this;
  }

   /**
   * Get productGrn
   * @return productGrn
  **/
  @javax.annotation.Nullable
  public String getProductGrn() {
    return productGrn;
  }

  public void setProductGrn(String productGrn) {
    this.productGrn = productGrn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetProductListAssociationsRequestAssociation setProductListAssociationsRequestAssociation = (SetProductListAssociationsRequestAssociation) o;
    return Objects.equals(this.listId, setProductListAssociationsRequestAssociation.listId) &&
        Objects.equals(this.position, setProductListAssociationsRequestAssociation.position) &&
        Objects.equals(this.productGrn, setProductListAssociationsRequestAssociation.productGrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listId, position, productGrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetProductListAssociationsRequestAssociation {\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    productGrn: ").append(toIndentedString(productGrn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("listId");
    openapiFields.add("position");
    openapiFields.add("productGrn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SetProductListAssociationsRequestAssociation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SetProductListAssociationsRequestAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SetProductListAssociationsRequestAssociation is not found in the empty JSON string", SetProductListAssociationsRequestAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SetProductListAssociationsRequestAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SetProductListAssociationsRequestAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("listId") != null && !jsonObj.get("listId").isJsonNull()) && !jsonObj.get("listId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listId").toString()));
      }
      if ((jsonObj.get("productGrn") != null && !jsonObj.get("productGrn").isJsonNull()) && !jsonObj.get("productGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productGrn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SetProductListAssociationsRequestAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SetProductListAssociationsRequestAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SetProductListAssociationsRequestAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SetProductListAssociationsRequestAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<SetProductListAssociationsRequestAssociation>() {
           @Override
           public void write(JsonWriter out, SetProductListAssociationsRequestAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SetProductListAssociationsRequestAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SetProductListAssociationsRequestAssociation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SetProductListAssociationsRequestAssociation
  * @throws IOException if the JSON string is invalid with respect to SetProductListAssociationsRequestAssociation
  */
  public static SetProductListAssociationsRequestAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SetProductListAssociationsRequestAssociation.class);
  }

 /**
  * Convert an instance of SetProductListAssociationsRequestAssociation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

