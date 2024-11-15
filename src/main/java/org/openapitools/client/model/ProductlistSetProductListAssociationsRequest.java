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
import org.openapitools.client.model.SetProductListAssociationsRequestAssociation;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce.ProductList.JSON;

/**
 * ProductlistSetProductListAssociationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-15T15:31:13.102952282Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductlistSetProductListAssociationsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_LIST_ID = "listId";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private String listId;

  public static final String SERIALIZED_NAME_PRODUCT_GRN = "productGrn";
  @SerializedName(SERIALIZED_NAME_PRODUCT_GRN)
  private String productGrn;

  public static final String SERIALIZED_NAME_ASSOCIATIONS = "associations";
  @SerializedName(SERIALIZED_NAME_ASSOCIATIONS)
  private List<SetProductListAssociationsRequestAssociation> associations = new ArrayList<>();

  public ProductlistSetProductListAssociationsRequest() {
  }

  public ProductlistSetProductListAssociationsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   */
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ProductlistSetProductListAssociationsRequest listId(String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * Get listId
   * @return listId
   */
  @javax.annotation.Nullable
  public String getListId() {
    return listId;
  }

  public void setListId(String listId) {
    this.listId = listId;
  }


  public ProductlistSetProductListAssociationsRequest productGrn(String productGrn) {
    this.productGrn = productGrn;
    return this;
  }

  /**
   * Get productGrn
   * @return productGrn
   */
  @javax.annotation.Nullable
  public String getProductGrn() {
    return productGrn;
  }

  public void setProductGrn(String productGrn) {
    this.productGrn = productGrn;
  }


  public ProductlistSetProductListAssociationsRequest associations(List<SetProductListAssociationsRequestAssociation> associations) {
    this.associations = associations;
    return this;
  }

  public ProductlistSetProductListAssociationsRequest addAssociationsItem(SetProductListAssociationsRequestAssociation associationsItem) {
    if (this.associations == null) {
      this.associations = new ArrayList<>();
    }
    this.associations.add(associationsItem);
    return this;
  }

  /**
   * Get associations
   * @return associations
   */
  @javax.annotation.Nullable
  public List<SetProductListAssociationsRequestAssociation> getAssociations() {
    return associations;
  }

  public void setAssociations(List<SetProductListAssociationsRequestAssociation> associations) {
    this.associations = associations;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ProductlistSetProductListAssociationsRequest instance itself
   */
  public ProductlistSetProductListAssociationsRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductlistSetProductListAssociationsRequest productlistSetProductListAssociationsRequest = (ProductlistSetProductListAssociationsRequest) o;
    return Objects.equals(this.tenantId, productlistSetProductListAssociationsRequest.tenantId) &&
        Objects.equals(this.listId, productlistSetProductListAssociationsRequest.listId) &&
        Objects.equals(this.productGrn, productlistSetProductListAssociationsRequest.productGrn) &&
        Objects.equals(this.associations, productlistSetProductListAssociationsRequest.associations)&&
        Objects.equals(this.additionalProperties, productlistSetProductListAssociationsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, listId, productGrn, associations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductlistSetProductListAssociationsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    productGrn: ").append(toIndentedString(productGrn)).append("\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("tenantId");
    openapiFields.add("listId");
    openapiFields.add("productGrn");
    openapiFields.add("associations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ProductlistSetProductListAssociationsRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ProductlistSetProductListAssociationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProductlistSetProductListAssociationsRequest is not found in the empty JSON string", ProductlistSetProductListAssociationsRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("listId") != null && !jsonObj.get("listId").isJsonNull()) && !jsonObj.get("listId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `listId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("listId").toString()));
      }
      if ((jsonObj.get("productGrn") != null && !jsonObj.get("productGrn").isJsonNull()) && !jsonObj.get("productGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productGrn").toString()));
      }
      if (jsonObj.get("associations") != null && !jsonObj.get("associations").isJsonNull()) {
        JsonArray jsonArrayassociations = jsonObj.getAsJsonArray("associations");
        if (jsonArrayassociations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("associations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `associations` to be an array in the JSON string but got `%s`", jsonObj.get("associations").toString()));
          }

          // validate the optional field `associations` (array)
          for (int i = 0; i < jsonArrayassociations.size(); i++) {
            SetProductListAssociationsRequestAssociation.validateJsonElement(jsonArrayassociations.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProductlistSetProductListAssociationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProductlistSetProductListAssociationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProductlistSetProductListAssociationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProductlistSetProductListAssociationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProductlistSetProductListAssociationsRequest>() {
           @Override
           public void write(JsonWriter out, ProductlistSetProductListAssociationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ProductlistSetProductListAssociationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ProductlistSetProductListAssociationsRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ProductlistSetProductListAssociationsRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ProductlistSetProductListAssociationsRequest
   * @throws IOException if the JSON string is invalid with respect to ProductlistSetProductListAssociationsRequest
   */
  public static ProductlistSetProductListAssociationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProductlistSetProductListAssociationsRequest.class);
  }

  /**
   * Convert an instance of ProductlistSetProductListAssociationsRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

