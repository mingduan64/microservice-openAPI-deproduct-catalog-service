/*
 * Product Catalog Management
 * ## TMF API Reference: TMF620 - Product Catalog Management  ### Release : 20.5 - March 2021  Product Catalog API is one of Catalog Management API Family. Product Catalog API goal is to provide a catalog of products.   ### Operations Product Catalog API performs the following operations on the resources : - Retrieve an entity or a collection of entities depending on filter criteria - Partial update of an entity (including updating rules) - Create an entity (including default values and creation rules) - Delete an entity - Manage notification of events
 *
 * The version of the OpenAPI document: 4.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExportJob;
import org.openapitools.client.model.ExportJobCreate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExportJobApi
 */
@Ignore
public class ExportJobApiTest {

    private final ExportJobApi api = new ExportJobApi();

    
    /**
     * Creates a ExportJob
     *
     * This operation creates a ExportJob entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExportJobTest() throws ApiException {
        ExportJobCreate exportJob = null;
        ExportJob response = api.createExportJob(exportJob);

        // TODO: test validations
    }
    
    /**
     * Deletes a ExportJob
     *
     * This operation deletes a ExportJob entity.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteExportJobTest() throws ApiException {
        String id = null;
        api.deleteExportJob(id);

        // TODO: test validations
    }
    
    /**
     * List or find ExportJob objects
     *
     * This operation list or find ExportJob entities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listExportJobTest() throws ApiException {
        String fields = null;
        Integer offset = null;
        Integer limit = null;
        List<ExportJob> response = api.listExportJob(fields, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Retrieves a ExportJob by ID
     *
     * This operation retrieves a ExportJob entity. Attribute selection is enabled for all first level attributes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveExportJobTest() throws ApiException {
        String id = null;
        String fields = null;
        ExportJob response = api.retrieveExportJob(id, fields);

        // TODO: test validations
    }
    
}