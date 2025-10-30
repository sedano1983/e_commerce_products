<p align="center">
    <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" align="center" width="30%">
</p>
<p align="center"><h1 align="center">E_COMMERCE_PRODUCTS.GIT</h1></p>
<p align="center">
	<img src="https://img.shields.io/github/license/sedano1983/e_commerce_products.git?style=default&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="licencia">
	<img src="https://img.shields.io/github/last-commit/sedano1983/e_commerce_products.git?style=default&logo=git&logoColor=white&color=0080ff" alt="último commit">
	<img src="https://img.shields.io/github/languages/top/sedano1983/e_commerce_products.git?style=default&color=0080ff" alt="lenguaje principal del repositorio">
	<img src="https://img.shields.io/github/languages/count/sedano1983/e_commerce_products.git?style=default&color=0080ff" alt="conteo de lenguajes del repositorio">
</p>
<p align="center"><!-- default option, no dependency badges. -->
</p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>
<br>

##  Tabla de Contenidos

- [ Descripción General](#-descripción-general)
- [ Tecnologías Utilizadas](#-tecnologías-utilizadas)
- [ Estructura del Proyecto](#-estructura-del-proyecto)
  - [ Índice del Proyecto](#-índice-del-proyecto)
- [ Empezando](#-empezando)
  - [ Prerrequisitos](#-prerrequisitos)
  - [ Instalación](#-instalación)
  - [ Uso](#-uso)
  - [ Pruebas](#-pruebas)
- [ Rutas de Acceso](#-rutas-acceso)
- [ Contribución](#-contribución)
- [ Consideraciones](#-consideraciones)

---

##  Descripción General

<code>❯ Microservicio para la gestión de productos de comercio electrónico </code>

---

##  Tecnologías Utilizadas

- Java 17  
- Spring Boot 3.x  
- Maven  
- Spring Data JPA  
- H2 Database (base de datos en memoria para desarrollo)  
- JUnit 5

---

##  Estructura del Proyecto

```sh
└── e_commerce_products.git/
    ├── README.md
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```


###  Índice del Proyecto
<details open>
	<summary><b><code>E_COMMERCE_PRODUCTS.GIT/</code></b></summary>
	<details> <!-- __root__ Submodule -->
		<summary><b>__root__</b></summary>
		<blockquote>
			<table>
			<tr>
				<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/mvnw'>mvnw</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			<tr>
				<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/mvnw.cmd'>mvnw.cmd</a></b></td>
				<td><code>❯ REPLACE-ME</code></td>
			</tr>
			</table>
		</blockquote>
	</details>
	<details> <!-- src Submodule -->
		<summary><b>src</b></summary>
		<blockquote>
			<details>
				<summary><b>main</b></summary>
				<blockquote>
					<details>
						<summary><b>resources</b></summary>
						<blockquote>
							<table>
							<tr>
								<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/resources/schema.sql'>schema.sql</a></b></td>
								<td><code>❯ REPLACE-ME</code></td>
							</tr>
							</table>
							<details>
								<summary><b>openapi</b></summary>
								<blockquote>
									<table>
									<tr>
										<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/resources/openapi/config.yaml'>config.yaml</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									<tr>
										<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/resources/openapi/get-price-1.0.yaml'>get-price-1.0.yaml</a></b></td>
										<td><code>❯ REPLACE-ME</code></td>
									</tr>
									</table>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>ecommerce</b></summary>
										<blockquote>
											<details>
												<summary><b>products</b></summary>
												<blockquote>
													<table>
													<tr>
														<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/ProductsApplication.java'>ProductsApplication.java</a></b></td>
														<td><code>❯ REPLACE-ME</code></td>
													</tr>
													</table>
													<details>
														<summary><b>infrastructure</b></summary>
														<blockquote>
															<details>
																<summary><b>config</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/config/LoggingFilter.java'>LoggingFilter.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/config/ProductExceptionHandler.java'>ProductExceptionHandler.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>rest</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/rest/PricesController.java'>PricesController.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																	<details>
																		<summary><b>dto</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/rest/dto/PriceDTOv1.java'>PriceDTOv1.java</a></b></td>
																				<td><code>❯ REPLACE-ME</code></td>
																			</tr>
																			<tr>
																				<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/rest/dto/ErrorResponse.java'>ErrorResponse.java</a></b></td>
																				<td><code>❯ REPLACE-ME</code></td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<details>
																<summary><b>entity</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/entity/PricesEntity.java'>PricesEntity.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>repository</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/repository/SpringDataPricesRepository.java'>SpringDataPricesRepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/infrastructure/repository/JpaPricesRepository.java'>JpaPricesRepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
													<details>
														<summary><b>application</b></summary>
														<blockquote>
															<details>
																<summary><b>service</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/application/service/GetPricesService.java'>GetPricesService.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																	<details>
																		<summary><b>impl</b></summary>
																		<blockquote>
																			<table>
																			<tr>
																				<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/application/service/impl/GetPricesServiceImpl.java'>GetPricesServiceImpl.java</a></b></td>
																				<td><code>❯ REPLACE-ME</code></td>
																			</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
													<details>
														<summary><b>domain</b></summary>
														<blockquote>
															<details>
																<summary><b>model</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/domain/model/Price.java'>Price.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>repository</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/domain/repository/PricesRepository.java'>PricesRepository.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
															<details>
																<summary><b>exception</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/main/java/com/ecommerce/products/domain/exception/ResourceNotFoundException.java'>ResourceNotFoundException.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
			<details>
				<summary><b>test</b></summary>
				<blockquote>
					<details>
						<summary><b>java</b></summary>
						<blockquote>
							<details>
								<summary><b>com</b></summary>
								<blockquote>
									<details>
										<summary><b>ecommerce</b></summary>
										<blockquote>
											<details>
												<summary><b>products</b></summary>
												<blockquote>
													<table>
													<tr>
														<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/test/java/com/ecommerce/products/ProductsApplicationTests.java'>ProductsApplicationTests.java</a></b></td>
														<td><code>❯ REPLACE-ME</code></td>
													</tr>
													</table>
													<details>
														<summary><b>infrastructure</b></summary>
														<blockquote>
															<details>
																<summary><b>rest</b></summary>
																<blockquote>
																	<table>
																	<tr>
																		<td><b><a href='https://github.com/sedano1983/e_commerce_products.git/blob/master/src/test/java/com/ecommerce/products/infrastructure/rest/PricesControllerTest.java'>PricesControllerTest.java</a></b></td>
																		<td><code>❯ REPLACE-ME</code></td>
																	</tr>
																	</table>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---
##  Empezando

###  Prerrequisitos

Antes de instalar y ejecutar el proyecto, asegúrate de tener instalado:

- [Java 17 o superior](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven 3.9+](https://maven.apache.org/download.cgi)
- (Opcional) [Git](https://git-scm.com/) para clonar el repositorio

Verifica las versiones instaladas con:
'sh > java -version'
'sh > mvn -version'


###  Instalación

Instala el proyecto usando uno de los siguientes métodos:

**Construir desde la fuente:**

1. Clona el repositorio e_commerce_products.git:
'sh ❯ git clone https://github.com/sedano1983/e_commerce_products.git'

2. Navega al directorio del proyecto:
'sh > cd e_commerce_products'

3. Compilar el proyecto y descargar dependencias:
'sh ❯ mvn clean install'


###  Uso
Ejecutar la aplicación usando el siguiente comando:
'sh ❯ mvn spring-boot:run'

Por defecto el puerto usado es el 8080. Si es necesario usar un puerto distinto, ejecutar el siguiente comando:
'sh > mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=[PUERTO]'

###  Pruebas
Ejecuta el conjunto de pruebas usando el siguiente comando:
'sh ❯ mvn test'

##  Rutas de Acceso

- Consola de H2: http://localhost:[PUERTO]/h2-console


- Definición de OpenAPI: http://localhost:[PUERTO]/swagger-ui/index.html

##  Contribución

- **💬 [Únete a las Discusiones](https://github.com/sedano1983/e_commerce_products.git/discussions)**: Comparte tus ideas, proporciona retroalimentación o haz preguntas.
- **🐛 [Reporta Problemas](https://github.com/sedano1983/e_commerce_products.git/issues)**: Envía errores encontrados o registra solicitudes de características para el proyecto `e_commerce_products.git`.
- **💡 [Envía Solicitudes de Incorporación (Pull Requests)](https://github.com/sedano1983/e_commerce_products.git/blob/main/CONTRIBUTING.md)**: Revisa los PR abiertos y envía tus propios PR.

<details closed>
<summary>Guías para Contribuir</summary>

1. **Haz un Fork del Repositorio**: Comienza haciendo un fork del repositorio del proyecto a tu cuenta de github.
2. **Clona Localmente**: Clona el repositorio fork a tu máquina local usando un cliente git.
   ```sh
   git clone https://github.com/sedano1983/e_commerce_products.git
   ```
3. **Crea una Nueva Rama (Branch)**: Siempre trabaja en una nueva rama, dándole un nombre descriptivo.
   ```sh
   git checkout -b nueva-caracteristica-x
   ```
4. **Realiza Tus Cambios**: Desarrolla y prueba tus cambios localmente.
5. **Haz Commit de Tus Cambios**: Haz commit con un mensaje claro que describa tus actualizaciones.
   ```sh
   git commit -m 'Implementada nueva característica x.'
   ```
6. **Sube a github**: Sube los cambios a tu repositorio fork.
   ```sh
   git push origin nueva-caracteristica-x
   ```
7. **Envía una Solicitud de Incorporación (Pull Request)**: Crea un PR contra el repositorio original del proyecto. Describe claramente los cambios y sus motivaciones.
8. **Revisión**: Una vez que tu PR sea revisado y aprobado, se fusionará en la rama principal. ¡Felicitaciones por tu contribución!
</details>

<details closed>
<summary>Gráfico de Contribuyentes</summary>
<br>
<p align="left">
   <a href="https://github.com{/sedano1983/e_commerce_products.git/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=sedano1983/e_commerce_products.git">
   </a>
</p>
</details>

---

##  Consideraciones

- El nombre de paquetes, clases, variables, etc, está en inglés, ya que el nombre de la tabla y campos de la base de datos están en dicho idioma. Se ha decidido usar el castellano para los comentarios y logs, debido a que las instrucciones en el documento de requisitos están en castellano.


- El código ha sido generado con la metodología API First, mediante la definición del fichero 'src/main/resources/openapi/get-price-1.0.yaml'. Para ello, se ha usado OpenAPI Generator desde consola con el comando: 'sh > openapi-generator-cli generate -i get-price-1.0.yaml -g spring -o ./api-java --library spring-boot -c config.yaml'. No obstante, el código final está más simplificado, puesto que bajo mi perspectiva, OpenAPI genera un código bastante complejo.


- En esta versión, los valores del fichero application.properties no están parametrizados. Además, las contraseñas están expuestas. Se ha hecho así por simplicidad, ya que se trata de una prueba. Sin embargo, deberían estar definidos según el entorno en el que se ejecute, lo cual se podría hacer de la siguiente forma:
	- Usar distintos perfiles de Spring Boot según el entorno.
		- Parametrizar los datos, y definir los valores en cada fichero referente al entorno (application.properties y/o docker-compose.yml).
		- Los ficheros que contengan contraseñas no deben subirse al repositorio.


- Actualmente, la API no implementa mecanismos de autenticación o autorización, debido a que no se ha definido si el acceso será público o restringido. La arquitectura permite añadir seguridad en el futuro (por ejemplo, tokens JWT o API keys) una vez se establezcan los requisitos de acceso.


- También sería conveniente usar otros mecanismos de securización, tales como protocolo HTTPS y/o limitar la cantidad de solicitudes en un periodo de tiempo.

---
