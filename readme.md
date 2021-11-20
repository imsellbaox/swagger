#Swagger

## 1.依赖导入
```
Swagger功能
<dependency>
<groupId>io.springfox</groupId>
<artifactId>springfox-swagger2</artifactId>
<version>2.9.2</version>
</dependency>

SwaggerUI页面
<dependency>
<groupId>io.springfox</groupId>
<artifactId>springfox-swagger-ui</artifactId>
<version>2.9.2</version>
</dependency>
```


## 2.编写config

写一个swaggerConfig类
@Configuration
@EnableSwagger2

### 2.1@EnableSwagger2 启动swagger

### 2.2 Docket
构建器，构建一个用户的UI页面

### 2.3 构建
文件中例如 .enable(flag)、  .select() 方法都是构建方法

有些方法是配套使用的如 .select()/.build()

##3.enable()实现多环境切换
先配置yml 两个环境

config类 中已经写好了 （多判启动）的三步方法（自己看）

## 4.ApiInfo
构建器 Api模块构建.apiInfo(info())；

## 5.多Docket用户配置
查看swConfig 配置多个Docket
在UI页面上 右上角就可以切换每个用户

## 6.@Api
所有带Api注解 都是在测试时候给页面上加注解
pojo、controller都有，具体自己查看

## 7.测试
http://localhost:8081/swagger-ui.html
后面是固定的

进入后，可以对每个接口try it测试
这个和Postman一样

## 8.个人开发
 个人测试时候，只用@EnableSwagger2
 就可以简单测试。
 以上Api注解、配置config 都是为了多人开发时候的交流（别人也要看得懂你的接口）


    
    