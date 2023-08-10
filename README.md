# Kotlin Spring Boot

## Spring Initialize
https://start.spring.io/ 에서 프로젝트 생성
![참조이미지](https://user-images.githubusercontent.com/99004408/154216948-23676101-1974-498b-a9f1-d3432c06d650.png)

## Setup Swagger
build.gradle.kts 에 swagger dependecy 추가
```kotlin
dependencies {
    implementation("org.springdoc:springdoc-openapi-data-rest:1.6.5")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.5")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.6.5")
}
```
참고자료
- https://recordsoflife.tistory.com/342
- https://blog.jiniworld.me/83

Swagger Document 실행
> http://localhost:8080/swagger-ui/index.html

![Swagger Document](https://user-images.githubusercontent.com/99004408/154217010-5052371a-b8da-458c-aad2-836173d9fae3.png)