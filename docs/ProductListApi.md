# ProductListApi

All URIs are relative to *https://product-list.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkUpdateProductListAssociations**](ProductListApi.md#bulkUpdateProductListAssociations) | **POST** /productlist.ProductList/BulkUpdateProductListAssociations | Bulk update collection associations position |
| [**createProductList**](ProductListApi.md#createProductList) | **POST** /productlist.ProductList/CreateProductList | Create Collection |
| [**createProductListAssociation**](ProductListApi.md#createProductListAssociation) | **POST** /productlist.ProductList/CreateProductListAssociation | Create Collection/Product Association |
| [**deleteProductList**](ProductListApi.md#deleteProductList) | **POST** /productlist.ProductList/DeleteProductList | Delete Collection |
| [**deleteProductListAssociation**](ProductListApi.md#deleteProductListAssociation) | **POST** /productlist.ProductList/DeleteProductListAssociation | Delete Collection/Product Association |
| [**getProductListAssociationsByProductGrn**](ProductListApi.md#getProductListAssociationsByProductGrn) | **POST** /productlist.ProductList/GetProductListAssociationsByProductGrn | Get Collection/Product Associations by Product GRN |
| [**getProductListByCode**](ProductListApi.md#getProductListByCode) | **POST** /productlist.ProductList/GetProductListByCode | Get Collection by Code |
| [**getProductListById**](ProductListApi.md#getProductListById) | **POST** /productlist.ProductList/GetProductListById | Get Collection by Id |
| [**getProductListByUrlKey**](ProductListApi.md#getProductListByUrlKey) | **POST** /productlist.ProductList/GetProductListByUrlKey | Get Collection by Url Key |
| [**getProductListsCount**](ProductListApi.md#getProductListsCount) | **POST** /productlist.ProductList/GetProductListsCount | Get Collection Product Count |
| [**listProductListAssociations**](ProductListApi.md#listProductListAssociations) | **POST** /productlist.ProductList/ListProductListAssociations | List Collection/Product Associations |
| [**listProductLists**](ProductListApi.md#listProductLists) | **POST** /productlist.ProductList/ListProductLists | List Collections |
| [**searchProductLists**](ProductListApi.md#searchProductLists) | **POST** /productlist.ProductList/SearchProductLists | Search Collections |
| [**searchProductListsByIds**](ProductListApi.md#searchProductListsByIds) | **POST** /productlist.ProductList/SearchProductListsByIds | Search Collections by Ids |
| [**updateProductList**](ProductListApi.md#updateProductList) | **POST** /productlist.ProductList/UpdateProductList | Update Collection |


<a id="bulkUpdateProductListAssociations"></a>
# **bulkUpdateProductListAssociations**
> RpcStatus bulkUpdateProductListAssociations(body)

Bulk update collection associations position

The BulkUpdateProductListAssociations endpoint updates the positions of specified associations.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistBulkUpdateProductListAssociationsRequest body = new ProductlistBulkUpdateProductListAssociationsRequest(); // ProductlistBulkUpdateProductListAssociationsRequest | 
    try {
      RpcStatus result = apiInstance.bulkUpdateProductListAssociations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#bulkUpdateProductListAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistBulkUpdateProductListAssociationsRequest**](ProductlistBulkUpdateProductListAssociationsRequest.md)|  | |

### Return type

[**RpcStatus**](RpcStatus.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createProductList"></a>
# **createProductList**
> ProductlistCreateProductListResponse createProductList(body)

Create Collection

The CreateProductList endpoint is used to create a new collection of products within the system. This endpoint allows users to define the details and attributes of the collection.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistCreateProductListRequest body = new ProductlistCreateProductListRequest(); // ProductlistCreateProductListRequest | 
    try {
      ProductlistCreateProductListResponse result = apiInstance.createProductList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#createProductList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistCreateProductListRequest**](ProductlistCreateProductListRequest.md)|  | |

### Return type

[**ProductlistCreateProductListResponse**](ProductlistCreateProductListResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="createProductListAssociation"></a>
# **createProductListAssociation**
> ProductlistCreateProductListAssociationResponse createProductListAssociation(body)

Create Collection/Product Association

The CreateProductListAssociation endpoint is used to create an association between a collection and a product.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistCreateProductListAssociationRequest body = new ProductlistCreateProductListAssociationRequest(); // ProductlistCreateProductListAssociationRequest | 
    try {
      ProductlistCreateProductListAssociationResponse result = apiInstance.createProductListAssociation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#createProductListAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistCreateProductListAssociationRequest**](ProductlistCreateProductListAssociationRequest.md)|  | |

### Return type

[**ProductlistCreateProductListAssociationResponse**](ProductlistCreateProductListAssociationResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="deleteProductList"></a>
# **deleteProductList**
> ProductlistDeleteProductListResponse deleteProductList(body)

Delete Collection

The DeleteProductList endpoint is used to delete an existing collection of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistDeleteProductListRequest body = new ProductlistDeleteProductListRequest(); // ProductlistDeleteProductListRequest | 
    try {
      ProductlistDeleteProductListResponse result = apiInstance.deleteProductList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#deleteProductList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistDeleteProductListRequest**](ProductlistDeleteProductListRequest.md)|  | |

### Return type

[**ProductlistDeleteProductListResponse**](ProductlistDeleteProductListResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="deleteProductListAssociation"></a>
# **deleteProductListAssociation**
> ProductlistDeleteProductListAssociationResponse deleteProductListAssociation(body)

Delete Collection/Product Association

The DeleteProductListAssociation endpoint is used to delete an association between a collection and a product.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistDeleteProductListAssociationRequest body = new ProductlistDeleteProductListAssociationRequest(); // ProductlistDeleteProductListAssociationRequest | 
    try {
      ProductlistDeleteProductListAssociationResponse result = apiInstance.deleteProductListAssociation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#deleteProductListAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistDeleteProductListAssociationRequest**](ProductlistDeleteProductListAssociationRequest.md)|  | |

### Return type

[**ProductlistDeleteProductListAssociationResponse**](ProductlistDeleteProductListAssociationResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductListAssociationsByProductGrn"></a>
# **getProductListAssociationsByProductGrn**
> ProductlistGetProductListAssociationsByProductGrnResponse getProductListAssociationsByProductGrn(body)

Get Collection/Product Associations by Product GRN

The GetProductListAssociationsByProductGrn endpoint is used to get the associations between a collection and a list of products by product GRN.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistGetProductListAssociationsByProductGrnRequest body = new ProductlistGetProductListAssociationsByProductGrnRequest(); // ProductlistGetProductListAssociationsByProductGrnRequest | 
    try {
      ProductlistGetProductListAssociationsByProductGrnResponse result = apiInstance.getProductListAssociationsByProductGrn(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#getProductListAssociationsByProductGrn");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistGetProductListAssociationsByProductGrnRequest**](ProductlistGetProductListAssociationsByProductGrnRequest.md)|  | |

### Return type

[**ProductlistGetProductListAssociationsByProductGrnResponse**](ProductlistGetProductListAssociationsByProductGrnResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductListByCode"></a>
# **getProductListByCode**
> ProductlistGetProductListByCodeResponse getProductListByCode(body)

Get Collection by Code

The GetProductListByCode endpoint is used to retrieve an existing collection of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistGetProductListByCodeRequest body = new ProductlistGetProductListByCodeRequest(); // ProductlistGetProductListByCodeRequest | 
    try {
      ProductlistGetProductListByCodeResponse result = apiInstance.getProductListByCode(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#getProductListByCode");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistGetProductListByCodeRequest**](ProductlistGetProductListByCodeRequest.md)|  | |

### Return type

[**ProductlistGetProductListByCodeResponse**](ProductlistGetProductListByCodeResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductListById"></a>
# **getProductListById**
> ProductlistGetProductListByIdResponse getProductListById(body)

Get Collection by Id

The GetProductListById endpoint is used to retrieve an existing collection of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistGetProductListByIdRequest body = new ProductlistGetProductListByIdRequest(); // ProductlistGetProductListByIdRequest | 
    try {
      ProductlistGetProductListByIdResponse result = apiInstance.getProductListById(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#getProductListById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistGetProductListByIdRequest**](ProductlistGetProductListByIdRequest.md)|  | |

### Return type

[**ProductlistGetProductListByIdResponse**](ProductlistGetProductListByIdResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductListByUrlKey"></a>
# **getProductListByUrlKey**
> ProductlistGetProductListByUrlKeyResponse getProductListByUrlKey(body)

Get Collection by Url Key

The GetProductListByUrlKey endpoint is used to retrieve an existing collection of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistGetProductListByUrlKeyRequest body = new ProductlistGetProductListByUrlKeyRequest(); // ProductlistGetProductListByUrlKeyRequest | 
    try {
      ProductlistGetProductListByUrlKeyResponse result = apiInstance.getProductListByUrlKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#getProductListByUrlKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistGetProductListByUrlKeyRequest**](ProductlistGetProductListByUrlKeyRequest.md)|  | |

### Return type

[**ProductlistGetProductListByUrlKeyResponse**](ProductlistGetProductListByUrlKeyResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="getProductListsCount"></a>
# **getProductListsCount**
> ProductlistGetProductListsCountResponse getProductListsCount(body)

Get Collection Product Count

The GetProductListsCount endpoint is used to get the number of products associated with a collection.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistGetProductListsCountRequest body = new ProductlistGetProductListsCountRequest(); // ProductlistGetProductListsCountRequest | 
    try {
      ProductlistGetProductListsCountResponse result = apiInstance.getProductListsCount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#getProductListsCount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistGetProductListsCountRequest**](ProductlistGetProductListsCountRequest.md)|  | |

### Return type

[**ProductlistGetProductListsCountResponse**](ProductlistGetProductListsCountResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listProductListAssociations"></a>
# **listProductListAssociations**
> ProductlistListProductListAssociationsResponse listProductListAssociations(body)

List Collection/Product Associations

The ListProductListAssociations endpoint is used to list the associations between a collection and a list of products.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistListProductListAssociationsRequest body = new ProductlistListProductListAssociationsRequest(); // ProductlistListProductListAssociationsRequest | 
    try {
      ProductlistListProductListAssociationsResponse result = apiInstance.listProductListAssociations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#listProductListAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistListProductListAssociationsRequest**](ProductlistListProductListAssociationsRequest.md)|  | |

### Return type

[**ProductlistListProductListAssociationsResponse**](ProductlistListProductListAssociationsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="listProductLists"></a>
# **listProductLists**
> ProductlistListProductListsResponse listProductLists(body)

List Collections

The ListProductLists endpoint is used to retrieve a list of existing collections of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistListProductListsRequest body = new ProductlistListProductListsRequest(); // ProductlistListProductListsRequest | 
    try {
      ProductlistListProductListsResponse result = apiInstance.listProductLists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#listProductLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistListProductListsRequest**](ProductlistListProductListsRequest.md)|  | |

### Return type

[**ProductlistListProductListsResponse**](ProductlistListProductListsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="searchProductLists"></a>
# **searchProductLists**
> ProductlistSearchProductListsResponse searchProductLists(body)

Search Collections

The SearchProductLists endpoint is used to retrieve a list of existing collections of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistSearchProductListsRequest body = new ProductlistSearchProductListsRequest(); // ProductlistSearchProductListsRequest | 
    try {
      ProductlistSearchProductListsResponse result = apiInstance.searchProductLists(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#searchProductLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistSearchProductListsRequest**](ProductlistSearchProductListsRequest.md)|  | |

### Return type

[**ProductlistSearchProductListsResponse**](ProductlistSearchProductListsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="searchProductListsByIds"></a>
# **searchProductListsByIds**
> ProductlistSearchProductListsByIdsResponse searchProductListsByIds(body)

Search Collections by Ids

The SearchProductListsByIds endpoint is used to retrieve a list of existing collections of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistSearchProductListsByIdsRequest body = new ProductlistSearchProductListsByIdsRequest(); // ProductlistSearchProductListsByIdsRequest | 
    try {
      ProductlistSearchProductListsByIdsResponse result = apiInstance.searchProductListsByIds(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#searchProductListsByIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistSearchProductListsByIdsRequest**](ProductlistSearchProductListsByIdsRequest.md)|  | |

### Return type

[**ProductlistSearchProductListsByIdsResponse**](ProductlistSearchProductListsByIdsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

<a id="updateProductList"></a>
# **updateProductList**
> ProductlistUpdateProductListResponse updateProductList(body)

Update Collection

The UpdateProductList endpoint is used to update an existing collection of products within the system.

### Example
```java
// Import classes:
import GeminiCommerce_ProductList.ApiClient;
import GeminiCommerce_ProductList.ApiException;
import GeminiCommerce_ProductList.Configuration;
import GeminiCommerce_ProductList.auth.*;
import GeminiCommerce_ProductList.models.*;
import org.openapitools.client.api.ProductListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://product-list.api.gogemini.io");
    
    // Configure OAuth2 access token for authorization: standardAuthorization
    OAuth standardAuthorization = (OAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setAccessToken("YOUR ACCESS TOKEN");

    ProductListApi apiInstance = new ProductListApi(defaultClient);
    ProductlistUpdateProductListRequest body = new ProductlistUpdateProductListRequest(); // ProductlistUpdateProductListRequest | 
    try {
      ProductlistUpdateProductListResponse result = apiInstance.updateProductList(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductListApi#updateProductList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ProductlistUpdateProductListRequest**](ProductlistUpdateProductListRequest.md)|  | |

### Return type

[**ProductlistUpdateProductListResponse**](ProductlistUpdateProductListResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **500** | An internal error occurred is thrown when an incompatible payload is sent |  -  |
| **0** | An unexpected error response. |  -  |

