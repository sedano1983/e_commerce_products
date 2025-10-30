package com.ecommerce.products.infrastructure.rest.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DTO para respuesta de error estandarizada
 *
 * @author csedano
 * @version 1.0
 */
public record ErrorResponse(
		@Schema(name = "timestamp", example = "2025-10-23T10:00:00Z", description = "Fecha y hora en la que se produce el error", requiredMode = Schema.RequiredMode.REQUIRED) 
			@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime timestamp,
		@Schema(name = "status", example = "404", description = "Estado del error", requiredMode = Schema.RequiredMode.REQUIRED) 
			int status,
		@Schema(name = "error", example = "Not found", description = "Error", requiredMode = Schema.RequiredMode.REQUIRED) 
			String error,
		@Schema(name = "message", example = "Producto no encontrado o sin tarifa aplicable en esa fecha", description = "Mensaje del error", requiredMode = Schema.RequiredMode.REQUIRED) 
			String message) {
}
