package com.ecommerce.products.infrastructure.rest;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.products.application.service.GetPricesService;
import com.ecommerce.products.infrastructure.rest.dto.ErrorResponse;
import com.ecommerce.products.infrastructure.rest.dto.PriceDTOv1;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Controlador REST para la gestión y consulta de tarifas de producto.
 * 
 * @author csedano
 * @version 1.0
 */
@RestController
@RequestMapping("/api")
@Validated
@Tag(name = "prices", description = "Gestión de tarifas de producto")
public class PricesController {

	private final GetPricesService getPricesService;

	public PricesController(GetPricesService getPricesService) {
		this.getPricesService = getPricesService;
	}

	/**
	 * GET /api/v1/prices : Obtiene la tarifa aplicada a un producto, en una fecha concreta. Si dos tarifas coinciden en
	 * un rango de fechas, se aplica la de mayor prioridad (mayor valor numérico)
	 *
	 * @param applicationDate Fecha de aplicación (required)
	 * @param productId       Identificador de producto (required)
	 * @param brandId         Identificador de la cadena del grupo (required)
	 * @return Tarifa obtenida con éxito (status code 200) or Parámetros inválidos (por ejemplo, fecha con formato
	 *         incorrecto) (status code 400) or Producto no encontrado o sin tarifa aplicable en esa fecha (status code
	 *         404)
	 */
    @Operation(
        operationId = "getApplicablePriceByDateV1",
        summary = "Obtiene la tarifa aplicada a un producto, en una fecha concreta. Si dos tarifas coinciden en un rango de fechas, se aplica la de mayor prioridad (mayor valor numérico)",
        tags = { "prices" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Tarifa obtenida con éxito", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PriceDTOv1.class))
            }),
            @ApiResponse(responseCode = "400", description = "Parámetros inválidos (por ejemplo, fecha con formato incorrecto)", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Producto no encontrado o sin tarifa aplicable en esa fecha", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        }
    )
	@GetMapping("/v1/prices")
	public ResponseEntity<PriceDTOv1> getApplicablePriceByDateV1(
			@NotNull @Parameter(name = "applicationDate", description = "Fecha de aplicación", example = "2025-10-23T10:00:00Z", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "applicationDate", required = true) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate,
			@NotNull @Parameter(name = "productId", description = "Identificador de producto", example = "1", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "productId", required = true) Long productId,
			@NotNull @Parameter(name = "brandId", description = "Identificador de la cadena del grupo", example = "1", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "brandId", required = true) Long brandId) {

		return getPricesService.getApplicablePriceByDate(applicationDate, productId, brandId)
				.map(price -> ResponseEntity.ok(new PriceDTOv1(price))).orElse(ResponseEntity.notFound().build());
	}

}
