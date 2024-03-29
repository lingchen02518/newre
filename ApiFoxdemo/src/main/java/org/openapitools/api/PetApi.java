/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.InlineResponse200;
import org.openapitools.model.InlineResponse2001;
import org.openapitools.model.InlineResponse2002;
import org.openapitools.model.InlineResponse201;
import org.openapitools.model.InlineResponse400;
import org.openapitools.model.InlineResponse4001;
import org.openapitools.model.Pet;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-06T16:02:30.602167700+08:00[GMT+08:00]")

@Validated
@Api(value = "pet", description = "the pet API")
public interface PetApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /pet/findByStatus : 根据状态查找宠物列表
     *
     * @param status Status values that need to be considered for filter (required)
     * @return 成功 (status code 200)
     *         or 错误的 status 值 (status code 400)
     */
    @ApiOperation(value = "根据状态查找宠物列表", nickname = "petFindByStatusGet", notes = "", response = Pet.class, responseContainer = "List", tags={ "示例项目", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "成功", response = Pet.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "错误的 status 值", response = InlineResponse4001.class) })
    @RequestMapping(value = "/pet/findByStatus",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Pet>> petFindByStatusGet(@NotNull @ApiParam(value = "Status values that need to be considered for filter", required = true) @Valid @RequestParam(value = "status", required = true) String status) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"name\", \"id\" : 1, \"category\" : { \"name\" : \"name\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /pet/{petId} : 删除宠物信息
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "删除宠物信息", nickname = "petPetIdDelete", notes = "", response = InlineResponse2001.class, tags={ "示例项目", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "成功", response = InlineResponse2001.class) })
    @RequestMapping(value = "/pet/{petId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<InlineResponse2001> petPetIdDelete(@ApiParam(value = "Pet id to delete",required=true) @PathVariable("petId") String petId,@ApiParam(value = "" ) @RequestHeader(value="api_key", required=false) String apiKey) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /pet/{petId} : 查询宠物详情
     *
     * @param petId 宠物 ID (required)
     * @return 成功 (status code 200)
     *         or 参数不正确 (status code 400)
     *         or 记录不存在 (status code 404)
     */
    @ApiOperation(value = "查询宠物详情", nickname = "petPetIdGet", notes = "", response = InlineResponse200.class, tags={ "示例项目", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "成功", response = InlineResponse200.class),
        @ApiResponse(code = 400, message = "参数不正确", response = InlineResponse400.class),
        @ApiResponse(code = 404, message = "记录不存在", response = InlineResponse400.class) })
    @RequestMapping(value = "/pet/{petId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse200> petPetIdGet(@ApiParam(value = "宠物 ID",required=true) @PathVariable("petId") String petId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"data\" : { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"name\", \"id\" : 1, \"category\" : { \"name\" : \"name\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /pet : 新建宠物信息
     *
     * @param name 宠物名 (required)
     * @param status 宠物销售状态 (required)
     * @return 成功 (status code 201)
     */
    @ApiOperation(value = "新建宠物信息", nickname = "petPost", notes = "", response = InlineResponse201.class, tags={ "示例项目", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "成功", response = InlineResponse201.class) })
    @RequestMapping(value = "/pet",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<InlineResponse201> petPost(@ApiParam(value = "宠物名", required=true) @RequestPart(value="name", required=true)  String name,@ApiParam(value = "宠物销售状态", required=true) @RequestPart(value="status", required=true)  String status) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"data\" : { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"name\", \"id\" : 1, \"category\" : { \"name\" : \"name\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /pet : 修改宠物信息
     *
     * @param body  (optional)
     * @return 成功 (status code 200)
     *         or 记录不存在 (status code 404)
     *         or 验证错误 (status code 405)
     */
    @ApiOperation(value = "修改宠物信息", nickname = "petPut", notes = "", response = InlineResponse2002.class, tags={ "示例项目", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "成功", response = InlineResponse2002.class),
        @ApiResponse(code = 404, message = "记录不存在", response = Object.class),
        @ApiResponse(code = 405, message = "验证错误", response = Object.class) })
    @RequestMapping(value = "/pet",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<InlineResponse2002> petPut(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"data\" : { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"name\", \"id\" : 1, \"category\" : { \"name\" : \"name\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 1 }, { \"name\" : \"name\", \"id\" : 1 } ], \"status\" : \"available\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
