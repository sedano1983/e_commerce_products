package com.ecommerce.products.infrastructure.data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.ecommerce.products.infrastructure.entity.PricesEntity;
import com.ecommerce.products.infrastructure.repository.SpringDataPricesRepository;

/**
 * Inicializador para la base de datos de comercio electrónico.
 * 
 * @author csedano
 * @version 1.0
 */
@Component
public class DataInitializer {

	/**
	 * Crea datos en la tabla PRICES
	 * 
	 * @param springDataPricesRepository
	 * @return
	 */
	@Bean
	public CommandLineRunner initPriceData(SpringDataPricesRepository springDataPricesRepository) {

		return args -> {
			// BRAND_ID, START_DATE, END_DATE, PRICE_LIST, PRODUCT_ID, PRIORITY, PRICE, CURR
			// 1, 2020-06-14-00.00.00, 2020-12-31-23.59.59, 1, 35455, 0, 35.50, EUR
			springDataPricesRepository.save(new PricesEntity(1L, LocalDateTime.of(2020, 6, 14, 0, 0, 0),
					LocalDateTime.of(2020, 12, 31, 23, 59, 59), 1L, 35455L, 0, BigDecimal.valueOf(35.50), "EUR"));
			// 1, 2020-06-14-15.00.00, 2020-06-14-18.30.00, 2, 35455, 1, 25.45, EUR
			springDataPricesRepository.save(new PricesEntity(1L, LocalDateTime.of(2020, 6, 14, 15, 0, 0),
					LocalDateTime.of(2020, 06, 14, 18, 30, 00), 2L, 35455L, 1, BigDecimal.valueOf(25.45), "EUR"));
			// 1, 2020-06-15-00.00.00, 2020-06-15-11.00.00, 3, 35455, 1, 30.50, EUR
			springDataPricesRepository.save(new PricesEntity(1L, LocalDateTime.of(2020, 6, 15, 0, 0, 0),
					LocalDateTime.of(2020, 06, 15, 11, 00, 00), 3L, 35455L, 1, BigDecimal.valueOf(30.50), "EUR"));
			// 1, 2020-06-15-16.00.00, 2020-12-31-23.59.59, 4, 35455, 1, 38.95, EUR
			springDataPricesRepository.save(new PricesEntity(1L, LocalDateTime.of(2020, 6, 15, 16, 0, 0),
					LocalDateTime.of(2020, 12, 31, 23, 59, 59), 4L, 35455L, 1, BigDecimal.valueOf(38.95), "EUR"));
		};

	}

}
