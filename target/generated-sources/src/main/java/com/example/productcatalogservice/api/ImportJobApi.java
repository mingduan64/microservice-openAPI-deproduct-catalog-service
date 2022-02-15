/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.productcatalogservice.api;

import com.example.productcatalogservice.models.Error;
import com.example.productcatalogservice.models.ImportJob;
import com.example.productcatalogservice.models.ImportJobCreate;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-02-16T02:51:54.355766+07:00[Asia/Ho_Chi_Minh]")
@Validated
@Api(value = "importJob", description = "the importJob API")
public interface ImportJobApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /importJob : Creates a ImportJob
     * This operation creates a ImportJob entity.
     *
     * @param importJob The ImportJob to be created (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Creates a ImportJob", nickname = "createImportJob", notes = "This operation creates a ImportJob entity.", response = ImportJob.class, tags={ "importJob", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ImportJob.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/importJob",
        produces = { "application/json;charset=utf-8" },
        consumes = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<ImportJob> createImportJob(@ApiParam(value = "The ImportJob to be created", required = true) @Valid @RequestBody ImportJobCreate importJob) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"path\" : \"path\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"errorLog\" : \"errorLog\", \"id\" : \"id\", \"href\" : \"https://openapi-generator.tech\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"contentType\" : \"contentType\", \"url\" : \"https://openapi-generator.tech\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /importJob/{id} : Deletes a ImportJob
     * This operation deletes a ImportJob entity.
     *
     * @param id Identifier of the ImportJob (required)
     * @return Deleted (status code 204)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Deletes a ImportJob", nickname = "deleteImportJob", notes = "This operation deletes a ImportJob entity.", tags={ "importJob", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/importJob/{id}",
        produces = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<Void> deleteImportJob(@ApiParam(value = "Identifier of the ImportJob", required = true) @PathVariable("id") String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /importJob : List or find ImportJob objects
     * This operation list or find ImportJob entities
     *
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "List or find ImportJob objects", nickname = "listImportJob", notes = "This operation list or find ImportJob entities", response = ImportJob.class, responseContainer = "List", tags={ "importJob", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ImportJob.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/importJob",
        produces = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<List<ImportJob>> listImportJob(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"path\" : \"path\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"errorLog\" : \"errorLog\", \"id\" : \"id\", \"href\" : \"https://openapi-generator.tech\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"contentType\" : \"contentType\", \"url\" : \"https://openapi-generator.tech\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /importJob/{id} : Retrieves a ImportJob by ID
     * This operation retrieves a ImportJob entity. Attribute selection is enabled for all first level attributes.
     *
     * @param id Identifier of the ImportJob (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     */
    @ApiOperation(value = "Retrieves a ImportJob by ID", nickname = "retrieveImportJob", notes = "This operation retrieves a ImportJob entity. Attribute selection is enabled for all first level attributes.", response = ImportJob.class, tags={ "importJob", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ImportJob.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/importJob/{id}",
        produces = { "application/json;charset=utf-8" }
    )
    default ResponseEntity<ImportJob> retrieveImportJob(@ApiParam(value = "Identifier of the ImportJob", required = true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"path\" : \"path\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\", \"errorLog\" : \"errorLog\", \"id\" : \"id\", \"href\" : \"https://openapi-generator.tech\", \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"contentType\" : \"contentType\", \"url\" : \"https://openapi-generator.tech\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}