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
