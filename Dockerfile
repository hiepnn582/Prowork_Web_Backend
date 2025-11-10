# Giai đoạn 1: Build Java/Spring Boot
FROM eclipse-temurin:21-jdk-alpine AS BUILD
WORKDIR /app

# Sao chép các file cấu hình và mã nguồn Maven
COPY pom.xml .
COPY src ./src

# Sao chép Maven wrapper
COPY mvnw .
COPY .mvn .

# Build tạo file JAR trong /target bỏ qua run UNIT TEST
RUN ./mvnw package -DskipTests



# Giai đoạn 2: Tạo Image chạy runtime
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Sao chép file JAR đã build trước đó
COPY --from=BUILD /app/target/*.jar app.jar

# Khởi chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]