# Usa una imagen base con Maven y Java 11
FROM maven:3.8.4-openjdk-11-slim

# Establece el directorio de trabajo en /usr/src/app
WORKDIR /usr/src/app

# Copia el archivo pom.xml para descargar las dependencias de Maven
COPY pom.xml .

# Descarga las dependencias de Maven (esto se realiza primero para aprovechar el caché de Docker)
RUN mvn dependency:go-offline -B

# Copia todos los archivos del proyecto al directorio de trabajo en el contenedor
COPY . .

# Ejecuta Maven para compilar el proyecto y ejecutar las pruebas
RUN mvn clean install -DskipTests

# Define el comando por defecto para ejecutar las pruebas cuando se inicie el contenedor
CMD ["mvn", "test"]