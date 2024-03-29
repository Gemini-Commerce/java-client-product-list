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


package org.openapitools.client.api;

import GeminiCommerce_ProductList.ApiException;
import org.openapitools.client.model.ProductlistBulkUpdateProductListAssociationsRequest;
import org.openapitools.client.model.ProductlistCreateProductListAssociationRequest;
import org.openapitools.client.model.ProductlistCreateProductListAssociationResponse;
import org.openapitools.client.model.ProductlistCreateProductListRequest;
import org.openapitools.client.model.ProductlistCreateProductListResponse;
import org.openapitools.client.model.ProductlistDeleteProductListAssociationRequest;
import org.openapitools.client.model.ProductlistDeleteProductListAssociationResponse;
import org.openapitools.client.model.ProductlistDeleteProductListRequest;
import org.openapitools.client.model.ProductlistDeleteProductListResponse;
import org.openapitools.client.model.ProductlistGetProductListAssociationsByProductGrnRequest;
import org.openapitools.client.model.ProductlistGetProductListAssociationsByProductGrnResponse;
import org.openapitools.client.model.ProductlistGetProductListByCodeRequest;
import org.openapitools.client.model.ProductlistGetProductListByCodeResponse;
import org.openapitools.client.model.ProductlistGetProductListByIdRequest;
import org.openapitools.client.model.ProductlistGetProductListByIdResponse;
import org.openapitools.client.model.ProductlistGetProductListByUrlKeyRequest;
import org.openapitools.client.model.ProductlistGetProductListByUrlKeyResponse;
import org.openapitools.client.model.ProductlistGetProductListsCountRequest;
import org.openapitools.client.model.ProductlistGetProductListsCountResponse;
import org.openapitools.client.model.ProductlistListProductListAssociationsRequest;
import org.openapitools.client.model.ProductlistListProductListAssociationsResponse;
import org.openapitools.client.model.ProductlistListProductListsRequest;
import org.openapitools.client.model.ProductlistListProductListsResponse;
import org.openapitools.client.model.ProductlistSearchProductListsByIdsRequest;
import org.openapitools.client.model.ProductlistSearchProductListsByIdsResponse;
import org.openapitools.client.model.ProductlistSearchProductListsRequest;
import org.openapitools.client.model.ProductlistSearchProductListsResponse;
import org.openapitools.client.model.ProductlistSetProductListAssociationsRequest;
import org.openapitools.client.model.ProductlistSetProductListAssociationsResponse;
import org.openapitools.client.model.ProductlistUpdateProductListRequest;
import org.openapitools.client.model.ProductlistUpdateProductListResponse;
import org.openapitools.client.model.RpcStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProductListApi
 */
@Disabled
public class ProductListApiTest {

    private final ProductListApi api = new ProductListApi();

    /**
     * Create Collection
     *
     * The CreateProductList endpoint is used to create a new collection of products within the system. This endpoint allows users to define the details and attributes of the collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProductListTest() throws ApiException {
        ProductlistCreateProductListRequest body = null;
        ProductlistCreateProductListResponse response = api.createProductList(body);
        // TODO: test validations
    }

    /**
     * Create Collection/Product Association
     *
     * The CreateProductListAssociation endpoint is used to create an association between a collection and a product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProductListAssociationTest() throws ApiException {
        ProductlistCreateProductListAssociationRequest body = null;
        ProductlistCreateProductListAssociationResponse response = api.createProductListAssociation(body);
        // TODO: test validations
    }

    /**
     * Delete Collection
     *
     * The DeleteProductList endpoint is used to delete an existing collection of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProductListTest() throws ApiException {
        ProductlistDeleteProductListRequest body = null;
        ProductlistDeleteProductListResponse response = api.deleteProductList(body);
        // TODO: test validations
    }

    /**
     * Delete Collection/Product Association
     *
     * The DeleteProductListAssociation endpoint is used to delete an association between a collection and a product.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProductListAssociationTest() throws ApiException {
        ProductlistDeleteProductListAssociationRequest body = null;
        ProductlistDeleteProductListAssociationResponse response = api.deleteProductListAssociation(body);
        // TODO: test validations
    }

    /**
     * Get Collection/Product Associations by Product GRN
     *
     * The GetProductListAssociationsByProductGrn endpoint is used to get the associations between a collection and a list of products by product GRN.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductListAssociationsByProductGrnTest() throws ApiException {
        ProductlistGetProductListAssociationsByProductGrnRequest body = null;
        ProductlistGetProductListAssociationsByProductGrnResponse response = api.getProductListAssociationsByProductGrn(body);
        // TODO: test validations
    }

    /**
     * Get Collection by Code
     *
     * The GetProductListByCode endpoint is used to retrieve an existing collection of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductListByCodeTest() throws ApiException {
        ProductlistGetProductListByCodeRequest body = null;
        ProductlistGetProductListByCodeResponse response = api.getProductListByCode(body);
        // TODO: test validations
    }

    /**
     * Get Collection by Id
     *
     * The GetProductListById endpoint is used to retrieve an existing collection of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductListByIdTest() throws ApiException {
        ProductlistGetProductListByIdRequest body = null;
        ProductlistGetProductListByIdResponse response = api.getProductListById(body);
        // TODO: test validations
    }

    /**
     * Get Collection by Url Key
     *
     * The GetProductListByUrlKey endpoint is used to retrieve an existing collection of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductListByUrlKeyTest() throws ApiException {
        ProductlistGetProductListByUrlKeyRequest body = null;
        ProductlistGetProductListByUrlKeyResponse response = api.getProductListByUrlKey(body);
        // TODO: test validations
    }

    /**
     * Get Collection Product Count
     *
     * The GetProductListsCount endpoint is used to get the number of products associated with a collection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProductListsCountTest() throws ApiException {
        ProductlistGetProductListsCountRequest body = null;
        ProductlistGetProductListsCountResponse response = api.getProductListsCount(body);
        // TODO: test validations
    }

    /**
     * List Collection/Product Associations
     *
     * The ListProductListAssociations endpoint is used to list the associations between a collection and a list of products.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProductListAssociationsTest() throws ApiException {
        ProductlistListProductListAssociationsRequest body = null;
        ProductlistListProductListAssociationsResponse response = api.listProductListAssociations(body);
        // TODO: test validations
    }

    /**
     * List Collections
     *
     * The ListProductLists endpoint is used to retrieve a list of existing collections of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listProductListsTest() throws ApiException {
        ProductlistListProductListsRequest body = null;
        ProductlistListProductListsResponse response = api.listProductLists(body);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void productListBulkUpdateProductListAssociationsTest() throws ApiException {
        ProductlistBulkUpdateProductListAssociationsRequest body = null;
        Object response = api.productListBulkUpdateProductListAssociations(body);
        // TODO: test validations
    }

    /**
     * Search Collections
     *
     * The SearchProductLists endpoint is used to retrieve a list of existing collections of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchProductListsTest() throws ApiException {
        ProductlistSearchProductListsRequest body = null;
        ProductlistSearchProductListsResponse response = api.searchProductLists(body);
        // TODO: test validations
    }

    /**
     * Search Collections by Ids
     *
     * The SearchProductListsByIds endpoint is used to retrieve a list of existing collections of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchProductListsByIdsTest() throws ApiException {
        ProductlistSearchProductListsByIdsRequest body = null;
        ProductlistSearchProductListsByIdsResponse response = api.searchProductListsByIds(body);
        // TODO: test validations
    }

    /**
     * Set Collection/Product Associations
     *
     * The SetProductListAssociations endpoint is used to set the associations between a collection and a list of products.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setProductListAssociationsTest() throws ApiException {
        ProductlistSetProductListAssociationsRequest body = null;
        ProductlistSetProductListAssociationsResponse response = api.setProductListAssociations(body);
        // TODO: test validations
    }

    /**
     * Update Collection
     *
     * The UpdateProductList endpoint is used to update an existing collection of products within the system.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProductListTest() throws ApiException {
        ProductlistUpdateProductListRequest body = null;
        ProductlistUpdateProductListResponse response = api.updateProductList(body);
        // TODO: test validations
    }

}
