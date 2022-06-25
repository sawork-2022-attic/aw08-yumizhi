/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.micropos.api;

import com.micropos.dto.CartDto;
import com.micropos.dto.ErrorDto;
import com.micropos.dto.OrderDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
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
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-06-25T20:24:21.056701800+08:00[Asia/Shanghai]")
@Validated
@Tag(name = "orders", description = "the orders API")
public interface OrdersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /orders : Create a new order from a cart
     *
     * @param cartDto A cart (required)
     * @return The order was successfully created. (status code 201)
     *         or Bad request. (status code 400)
     *         or Order not found. (status code 404)
     *         or Server error. (status code 500)
     */
    @Operation(
        operationId = "createOrder",
        summary = "Create a new order from a cart",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "201", description = "The order was successfully created.", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  OrderDto.class))),
            @ApiResponse(responseCode = "400", description = "Bad request.", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorDto.class))),
            @ApiResponse(responseCode = "404", description = "Order not found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorDto.class))),
            @ApiResponse(responseCode = "500", description = "Server error.", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/orders",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<OrderDto> createOrder(
        @Parameter(name = "CartDto", description = "A cart", required = true, schema = @Schema(description = "")) @Valid @RequestBody CartDto cartDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"time\" : \"time\", \"items\" : [ { \"amount\" : 1, \"product\" : { \"image\" : \"image\", \"price\" : 5.962133916683182, \"name\" : \"name\", \"id\" : \"id\" }, \"id\" : 6 }, { \"amount\" : 1, \"product\" : { \"image\" : \"image\", \"price\" : 5.962133916683182, \"name\" : \"name\", \"id\" : \"id\" }, \"id\" : 6 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /orders : List all orderss
     *
     * @return An array of orders (status code 200)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "listOrders",
        summary = "List all orderss",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "An array of orders", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  OrderDto.class))),
            @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  ErrorDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders",
        produces = { "application/json" }
    )
    default ResponseEntity<List<OrderDto>> listOrders(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"time\" : \"time\", \"items\" : [ { \"amount\" : 1, \"product\" : { \"image\" : \"image\", \"price\" : 5.962133916683182, \"name\" : \"name\", \"id\" : \"id\" }, \"id\" : 6 }, { \"amount\" : 1, \"product\" : { \"image\" : \"image\", \"price\" : 5.962133916683182, \"name\" : \"name\", \"id\" : \"id\" }, \"id\" : 6 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /orders/{orderId} : Info for a specific order
     *
     * @param orderId The id of the order to retrieve (required)
     * @return Expected response to a valid request (status code 200)
     */
    @Operation(
        operationId = "showOrderById",
        summary = "Info for a specific order",
        tags = { "order" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Expected response to a valid request", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  OrderDto.class)))
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders/{orderId}",
        produces = { "application/json" }
    )
    default ResponseEntity<OrderDto> showOrderById(
        @Parameter(name = "orderId", description = "The id of the order to retrieve", required = true, schema = @Schema(description = "")) @PathVariable("orderId") Integer orderId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : 0, \"time\" : \"time\", \"items\" : [ { \"amount\" : 1, \"product\" : { \"image\" : \"image\", \"price\" : 5.962133916683182, \"name\" : \"name\", \"id\" : \"id\" }, \"id\" : 6 }, { \"amount\" : 1, \"product\" : { \"image\" : \"image\", \"price\" : 5.962133916683182, \"name\" : \"name\", \"id\" : \"id\" }, \"id\" : 6 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}