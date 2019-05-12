

查看实际pom信息: mvn help:effective-pom
例如：
pom.xml 的内容如下
```xml
    <properties>
            <targetJavaProject>${basedir}/src/main/java</targetJavaProject>
            ...
    </properties>
```
运行命令
```jshelllanguage
# mvn help:effective-pom
```
输出

```xml
<properties>
    <targetJavaProject>/Users/evol/source/github/yelp-cloud/yelp-generator/yelp-generator-bmc/src/main/java</targetJavaProject>
    ...
</properties>
```
