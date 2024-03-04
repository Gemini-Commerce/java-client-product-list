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
 * ProductlistProductListAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T11:01:20.576599373Z[Etc/UTC]")
public class ProductlistProductListAssociation {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LIST_ID = "listId";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_PRODUCT_GRN = "productGrn";
  @SerializedName(SERIALIZED_NAME_PRODUCT_GRN)
  private String productGrn;

  public ProductlistProductListAssociation() {
  }

  public ProductlistProductListAssociation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ProductlistProductListAssociation listId(String listId) {
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


  public ProductlistProductListAssociation position(Integer position) {
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


  public ProductlistProductListAssociation productGrn(String productGrn) {
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
    ProductlistProductListAssociation productlistProductListAssociation = (ProductlistProductListAssociation) o;
    return Objects.equals(this.id, productlistProductListAssociation.id) &&
        Objects.equals(this.listId, productlistProductListAssociation.listId) &&
        Objects.equals(this.position, productlistProductListAssociation.position) &&
        Objects.equals(this.productGrn, productlistProductListAssociation.productGrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, listId, position, productGrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductlistProductListAssociation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("id");
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
  * @throws IOException if the JSON Element is invalid with respect to ProductlistProductListAssociation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductlistProductListAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductlistProductListAssociation is not found in the empty JSON string", ProductlistProductListAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductlistProductListAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductlistProductListAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
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
       if (!ProductlistProductListAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductlistProductListAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductlistProductListAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductlistProductListAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductlistProductListAssociation>() {
           @Override
           public void write(JsonWriter out, ProductlistProductListAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductlistProductListAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductlistProductListAssociation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductlistProductListAssociation
  * @throws IOException if the JSON string is invalid with respect to ProductlistProductListAssociation
  */
  public static ProductlistProductListAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductlistProductListAssociation.class);
  }

 /**
  * Convert an instance of ProductlistProductListAssociation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

