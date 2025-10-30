package com.ecommerce.products.infrastructure.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PricesControllerTest {

	@Autowired
	private MockMvc mockMvc;

	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss");

	/**
	 * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)
	 * 
	 * @throws Exception
	 */
	@Test
	void getApplicablePriceByDateTest1() throws Exception {

		// Parámetros de entrada
		LocalDateTime applicationDate = LocalDateTime.of(2020, 06, 14, 10, 00, 00);
		Long productId = 35455L;
		Long brandId = 1L;

		// Resultado esperado
		LocalDateTime startDate = LocalDateTime.of(2020, 06, 14, 00, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
		Long rateId = 1L;
		BigDecimal price = BigDecimal.valueOf(35.50);

		actAndAssert(applicationDate, productId, brandId, startDate, endDate, rateId, price);
	}

	/**
	 * Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)
	 * 
	 * @throws Exception
	 */
	@Test
	void getApplicablePriceByDateTest2() throws Exception {

		// Parámetros de entrada
		LocalDateTime applicationDate = LocalDateTime.of(2020, 06, 14, 16, 00, 00);
		Long productId = 35455L;
		Long brandId = 1L;

		// Resultado esperado
		LocalDateTime startDate = LocalDateTime.of(2020, 06, 14, 15, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, 06, 14, 18, 30, 00);
		Long rateId = 2L;
		BigDecimal price = BigDecimal.valueOf(25.45);

		actAndAssert(applicationDate, productId, brandId, startDate, endDate, rateId, price);
	}

	/**
	 * Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)
	 * 
	 * @throws Exception
	 */
	@Test
	void getApplicablePriceByDateTest3() throws Exception {

		// Parámetros de entrada
		LocalDateTime applicationDate = LocalDateTime.of(2020, 06, 14, 21, 00, 00);
		Long productId = 35455L;
		Long brandId = 1L;

		// Resultado esperado
		LocalDateTime startDate = LocalDateTime.of(2020, 06, 14, 00, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
		Long rateId = 1L;
		BigDecimal price = BigDecimal.valueOf(35.50);

		actAndAssert(applicationDate, productId, brandId, startDate, endDate, rateId, price);
	}

	/**
	 * Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)
	 * 
	 * @throws Exception
	 */
	@Test
	void getApplicablePriceByDateTest4() throws Exception {

		// Parámetros de entrada
		LocalDateTime applicationDate = LocalDateTime.of(2020, 06, 15, 10, 00, 00);
		Long productId = 35455L;
		Long brandId = 1L;

		// Resultado esperado
		LocalDateTime startDate = LocalDateTime.of(2020, 06, 15, 00, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, 06, 15, 11, 00, 00);
		Long rateId = 3L;
		BigDecimal price = BigDecimal.valueOf(30.50);

		actAndAssert(applicationDate, productId, brandId, startDate, endDate, rateId, price);
	}

	/**
	 * Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)
	 * 
	 * @throws Exception
	 */
	@Test
	void getApplicablePriceByDateTest5() throws Exception {

		// Parámetros de entrada
		LocalDateTime applicationDate = LocalDateTime.of(2020, 06, 16, 21, 00, 00);
		Long productId = 35455L;
		Long brandId = 1L;

		// Resultado esperado
		LocalDateTime startDate = LocalDateTime.of(2020, 06, 15, 16, 00, 00);
		LocalDateTime endDate = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
		Long rateId = 4L;
		BigDecimal price = BigDecimal.valueOf(38.95);

		actAndAssert(applicationDate, productId, brandId, startDate, endDate, rateId, price);
	}

	/**
	 * Método común para todos los test del api getApplicablePriceByDate, donde se realiza la invocación y la
	 * verificación del resultado
	 * 
	 * @param applicationDate
	 * @param productId
	 * @param brandId
	 * @param startDate
	 * @param endDate
	 * @param rateId
	 * @param price
	 * @throws Exception
	 */
	public void actAndAssert(LocalDateTime applicationDate, Long productId, Long brandId, LocalDateTime startDate,
			LocalDateTime endDate, Long rateId, BigDecimal price) throws Exception {

		mockMvc.perform(get("/api/v1/prices").param("applicationDate", String.valueOf(applicationDate))
				.param("productId", String.valueOf(productId)).param("brandId", String.valueOf(brandId))
				.contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.brandId").value(brandId))
				.andExpect(jsonPath("$.startDate").value(startDate.format(dateTimeFormatter)))
				.andExpect(jsonPath("$.endDate").value(endDate.format(dateTimeFormatter)))
				.andExpect(jsonPath("$.rateId").value(rateId)).andExpect(jsonPath("$.productId").value(productId))
				.andExpect(jsonPath("$.price").value(price));
	}

}
