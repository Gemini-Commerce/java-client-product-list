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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ProductlistProductListAssociation;
import org.openapitools.client.model.ProductlistProductListAssociationError;

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
 * ProductlistSetProductListAssociationsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-04T11:01:20.576599373Z[Etc/UTC]")
public class ProductlistSetProductListAssociationsResponse {
  public static final String SERIALIZED_NAME_ASSOCIATIONS = "associations";
  @SerializedName(SERIALIZED_NAME_ASSOCIATIONS)
  private List<ProductlistProductListAssociation> associations;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<ProductlistProductListAssociationError> errors;

  public ProductlistSetProductListAssociationsResponse() {
  }

  public ProductlistSetProductListAssociationsResponse associations(List<ProductlistProductListAssociation> associations) {
    this.associations = associations;
    return this;
  }

  public ProductlistSetProductListAssociationsResponse addAssociationsItem(ProductlistProductListAssociation associationsItem) {
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


  public ProductlistSetProductListAssociationsResponse errors(List<ProductlistProductListAssociationError> errors) {
    this.errors = errors;
    return this;
  }

  public ProductlistSetProductListAssociationsResponse addErrorsItem(ProductlistProductListAssociationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<ProductlistProductListAssociationError> getErrors() {
    return errors;
  }

  public void setErrors(List<ProductlistProductListAssociationError> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductlistSetProductListAssociationsResponse productlistSetProductListAssociationsResponse = (ProductlistSetProductListAssociationsResponse) o;
    return Objects.equals(this.associations, productlistSetProductListAssociationsResponse.associations) &&
        Objects.equals(this.errors, productlistSetProductListAssociationsResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associations, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductlistSetProductListAssociationsResponse {\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ProductlistSetProductListAssociationsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductlistSetProductListAssociationsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductlistSetProductListAssociationsResponse is not found in the empty JSON string", ProductlistSetProductListAssociationsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ProductlistSetProductListAssociationsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProductlistSetProductListAssociationsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
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
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            ProductlistProductListAssociationError.validateJsonElement(jsonArrayerrors.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductlistSetProductListAssociationsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductlistSetProductListAssociationsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductlistSetProductListAssociationsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductlistSetProductListAssociationsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductlistSetProductListAssociationsResponse>() {
           @Override
           public void write(JsonWriter out, ProductlistSetProductListAssociationsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductlistSetProductListAssociationsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProductlistSetProductListAssociationsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProductlistSetProductListAssociationsResponse
  * @throws IOException if the JSON string is invalid with respect to ProductlistSetProductListAssociationsResponse
  */
  public static ProductlistSetProductListAssociationsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductlistSetProductListAssociationsResponse.class);
  }

 /**
  * Convert an instance of ProductlistSetProductListAssociationsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

