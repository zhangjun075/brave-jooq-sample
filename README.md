# springboot、dbcp、jooq、mysql
结合Springboot，用dbcp进行连接池管理，有事务控制

# mysql本地安装参见docker官网镜像。

# pom文件注意，需要将生成的目录加入到classpath

We will configure the build-helper-maven-plugin plugin such that maven will add the JOOQ generated code resides in gensrc/main/java directory as source folder.

```
<plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>build-helper-maven-plugin</artifactId>
    <executions>
        <execution>
            <phase>generate-sources</phase>
            <goals>
                <goal>add-source</goal>
            </goals>
            <configuration>
                <sources>
                    <source>gensrc/main/java</source>
                </sources>
            </configuration>
        </execution>
    </executions>
</plugin>
```

# jooq介绍，可以参见[oschina](https://www.oschina.net/p/jooq)或者[官网](http://www.jooq.org/doc/3.6/manual-single-page/#jooq-in-7-steps)

