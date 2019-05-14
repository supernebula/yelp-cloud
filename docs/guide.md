
#

## STEP

### STEP1:  Eureka Server

https://mrbird.cc/Spring-Cloud-Eureka.html

https://www.docs4dev.com/docs/zh/spring-cloud/Edgware.SR5/reference/multi_spring-cloud-eureka-server.html

### STEP2: Service Discovery (eureka clients)

https://www.docs4dev.com/docs/zh/spring-cloud/Edgware.SR5/reference/multi__service_discovery_eureka_clients.html

#### ISSUE

1.eureka server 配置security.base.enabled=true 引起的eureka-client异常：
```
com.netflix.discovery.shared.transport.TransportException: Cannot execute request on any known server
```
原因：
在server端的application.yml中配置了登陆Eureka服务端的用户名和密码：

```
security:
  basic:
    enabled: true
  user:
      name: admin # login username
      password: admin
```


解决方式：
（1）、删除用户名和密码配置，重启即可；

（2）、在客户端的application.yml中，serviceUrl配置时，加入用户名和密码：
```
serviceUrl:
      defaultZone: http://username:password@localhost:8761/eureka/
```


Spring Cloud 中文索引

## 参考项目


https://github.com/sqshq/PiggyMetrics

### 2. paascloud

        http://blog.paascloud.net/categories/

        http://paascloud.net/

        https://github.com/paascloud/paascloud-master

2. https://github.com/Ryan-Miao/spring-cloud-Edgware-demo/


http://springcloud.fun/



Spring Cloud (十四)：Spring Cloud 开源软件都有哪些？
https://www.cnblogs.com/ityouknow/p/9434914.html

1.awesome-spring-cloud

https://github.com/ityouknow/awesome-spring-cloud

http://springcloud.fun/


2. PiggyMetrics


https://github.com/sqshq/PiggyMetrics

3. spaascloud-master

https://github.com/paascloud/paascloud-master

http://mall.paascloud.net/index


4. Cloud-Admin

https://gitee.com/minull/ace-security

5. spring-cloud-rest-tcc

https://github.com/prontera/spring-cloud-rest-tcc


6. pig

https://www.pig4cloud.com/

https://gitee.com/log4j/pig

7.  xxpay-master

http://www.xxpay.org/

https://gitee.com/jmdhappy/xxpay-master




8.spring-boot-cloud

https://github.com/zhangxd1989/spring-boot-cloud




