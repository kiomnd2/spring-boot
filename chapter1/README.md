## 1. 스프링 부트 시작하기

### 1.1 스프링 부트 핵심요소
> 1. 자동 구성
> 2. 스타터 의존성
> 3. 명령줄 인터페이스
> 4. 액추에이터

#### 1.1.1 자동구성
```java
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource) {
        reutrn new JdbcTemplate(dataSource);
    }
    
    
    @Bean
    public DataSource dataSource() {
        return new EmbededDatabaseBulider()
        .setType(EmbededDatabaseType.H2)
        .addScripts('schema.sql', 'data.sql')
    }
```
> 매우 간단한 빈 선언으로 JDbc인스턴스를 생성하여 Datasource 의존성을 주입한다.


#### 1.1.2 스타터 의존성
> 스프링 부트 의존성을 사용하면 스프링 부트 웹스타터를 빌드 의존성으로 간단히 추가 ㅈ가능
. 웹 스타터 의존설만 가져온다면 다른 의존성을 전이적으로 모드 끌고옴


#### 1.1.3 액추에이터
> 액추에이터는 작동중인 애플리케이션의 내부를 살펴볼수있는 기능

기능으론
1. 스프링 애플리케이션 컨텍스트에 구성된 빈 
2. 스프링부트의 자동 구성으로 구성된 것
3. 애플리케이션에서 사용할수 있는 환경변수, 시스템 프로퍼티, 구성프로퍼티, 명령줄 인자
4. 애플리케이션에서 구동중인 스레드의 현재상태'
5. 최근에 처리된 html 요청정보
6. 메모리 사용량, 가비지 컬렉션, 웹 요청, 데이터 소스 사용량 등 