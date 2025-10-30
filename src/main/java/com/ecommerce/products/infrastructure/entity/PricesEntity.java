package com.ecommerce.products.infrastructure.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entidad JPA que representa la tarifa de un producto.
 * 
 * <pre>
 * BRAND_ID: Identificador de la cadena del grupo. 
 * START_DATE, END_DATE: Rango de fechas en el que aplica el precio tarifa indicado.
 * RATE_ID: Identificador de la tarifa de precios aplicable.
 * PRODUCT_ID: Identificador código de producto.
 * PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se
 * aplica la de mayor prioridad (mayor valor numérico).
 * PRICE: Precio final de venta.
 * CURRENCY: Iso de la moneda.
 * </pre>
 * 
 * @author csedano
 * @version 1.0
 */
@Entity
@Table(name = "PRICES")
public class PricesEntity {

	@Column(name = "BRAND_ID", nullable = false)
	private Long brandId;

	@Column(name = "START_DATE", nullable = false)
	private LocalDateTime startDate;

	@Column(name = "END_DATE", nullable = false)
	private LocalDateTime endDate;

	@Id
	@Column(name = "PRICE_LIST", nullable = false)
	private Long rateId;

	@Column(name = "PRODUCT_ID", nullable = false)
	private Long productId;

	@Column(name = "PRIORITY", nullable = false)
	private Integer priority = 0;

	@Column(name = "PRICE", nullable = false, precision = 10, scale = 2)
	private BigDecimal price;

	@Column(name = "CURR", nullable = false)
	private String currency;

	/* Constructors */

	public PricesEntity() {
		super();
	}

	public PricesEntity(Long brandId, LocalDateTime startDate, LocalDateTime endDate, Long rateId, Long productId,
			Integer priority, BigDecimal price, String currency) {
		super();
		this.brandId = brandId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rateId = rateId;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.currency = currency;
	}

	/* Getters and Setters */

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
