## 2. 스프링 부트 사용하기



### 스프링 구성
  
* Application.java : 애플리케이션의 부트스트랩 클래스. 주 스프링 구성 클래스
* application.properties 애플리케이션과 스프링 부트 프로퍼티를 구성하는데 사용되는 파일
* ApplicationTest : 테스트 클래스
   
#### 스프링 부트스트래핑

Application 클래스는 부트 애플리케이션에 서 구성과 부트스트래핑 두가지 역할을 함



애너테이션
* @SpringBootApplication
    * @Configuration : 스프링 자바 기반 구성으로 클래스를 지정 
    * @ConponentScan : 다른 컴포넌트 클래스를 자동으로 검색하여 스프링 애플리케이션 컨텍스트에 자동으로 등록
    * @EnableAutoConfiguration : 자동으로 모든 설정을 읽어들임

 
    
   
### 어플리케이션 프로퍼티 구성
  >여러 설정을 입력받음
  
  ```aidl
    server.port=8000
```
위 설정은 기본값 8080이며 스프링부트 기본 프로젝트를 빌드하고 실행했을 때 대기하는 포트

