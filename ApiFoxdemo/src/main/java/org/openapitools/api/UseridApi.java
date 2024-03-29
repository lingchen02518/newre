/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.InlineResponse2003;
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
@Api(value = "userid", description = "the userid API")
public interface UseridApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /userid/{id}/password/{userpswd} : 按id登录
     *
     * @param id  (required)
     * @param userpswd  (required)
     * @param body  (optional)
     * @return 成功 (status code 200)
     */
    @ApiOperation(value = "按id登录", nickname = "useridIdPasswordUserpswdGet", notes = "", response = InlineResponse2003.class, tags={ "示例项目", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "成功", response = InlineResponse2003.class) })
    @RequestMapping(value = "/userid/{id}/password/{userpswd}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<InlineResponse2003> useridIdPasswordUserpswdGet(@ApiParam(value = "",required=true) @PathVariable("id") String id,@ApiParam(value = "",required=true) @PathVariable("userpswd") String userpswd,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) Object body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"pswd\" : \"available\", \"name\" : \"name\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
