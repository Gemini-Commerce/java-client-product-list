/*
 * Collection Service
 * API for managing collection
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ProductlistProductListAssociation;

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
 * ProductlistGetProductListAssociationsByProductGrnResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-29T15:57:10.226946370Z[Etc/UTC]")
public class ProductlistGetProductListAssociationsByProductGrnResponse {
  public static final String SERIALIZED_NAME_ASSOCIATIONS = "associations";
  @SerializedName(SERIALIZED_NAME_ASSOCIATIONS)
  private List<ProductlistProductListAssociation> associations;

  public ProductlistGetProductListAssociationsByProductGrnResponse() {
  }

  public ProductlistGetProductListAssociationsByProductGrnResponse associations(List<ProductlistProductListAssociation> associations) {
    this.associations = associations;
    return this;
  }

  public ProductlistGetProductListAssociationsByProductGrnResponse addAssociationsItem(ProductlistProductListAssociation associationsItem) {
    if (this.associations == null) {
      this.associations = new ArrayList<>();
    }
    this.associations.add(associationsItem);
    return this;
  }

   /**
   * Get associations
   * @return associations
  **/
  @javax.annotation.Nullable
  public List<ProductlistProductListAssociation> getAssociations() {
    return associations;
  }

  public void setAssociations(List<ProductlistProductListAssociation> associations) {
    this.associations = associations;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductlistGetProductListAssociationsByProductGrnResponse productlistGetProductListAssociationsByProductGrnResponse = (ProductlistGetProductListAssociationsByProductGrnResponse) o;
    return Objects.equals(this.associations, productlistGetProductListAssociationsByProductGrnResponse.associations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductlistGetProductListAssociationsByProductGrnResponse {\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
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
    openapiFields.add("associations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductlistGetProductListAssociationsByProductGrnResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductlistGetProductListAssociationsByProductGrnResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductlistGetProductListAssociationsByProductGrnResponse is not found in the empty JSON string", ProductlistGetProductListAssociationsByProductGrnResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductlistGetProductListAssociationsByProductGrnResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductlistGetProductListAssociationsByProductGrnResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("associations") != null && !jsonObj.get("associations").isJsonNull()) {
        JsonArray jsonArrayassociations = jsonObj.getAsJsonArray("associations");
        if (jsonArrayassociations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associations` to be an array in the JSON string but got `%s`", jsonObj.get("associations").toString()));
          }

          // validate the optional field `associations` (array)
          for (int i = 0; i < jsonArrayassociations.size(); i++) {
            ProductlistProductListAssociation.validateJsonElement(jsonArrayassociations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductlistGetProductListAssociationsByProductGrnResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductlistGetProductListAssociationsByProductGrnResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductlistGetProductListAssociationsByProductGrnResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductlistGetProductListAssociationsByProductGrnResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductlistGetProductListAssociationsByProductGrnResponse>() {
           @Override
           public void write(JsonWriter out, ProductlistGetProductListAssociationsByProductGrnResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductlistGetProductListAssociationsByProductGrnResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductlistGetProductListAssociationsByProductGrnResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductlistGetProductListAssociationsByProductGrnResponse
  * @throws IOException if the JSON string is invalid with respect to ProductlistGetProductListAssociationsByProductGrnResponse
  */
  public static ProductlistGetProductListAssociationsByProductGrnResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductlistGetProductListAssociationsByProductGrnResponse.class);
  }

 /**
  * Convert an instance of ProductlistGetProductListAssociationsByProductGrnResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

