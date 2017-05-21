package com.brave.jooq.config;

import com.brave.jooq.exception.ExceptionTranslator;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.jooq.*;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author zhangjun
 */
@Configuration
public class JooqSpringBootConfiguration {

    @Bean
    public DataSourceTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(this.dataSource());
    }


    //dbcp-datasource
    @Bean(destroyMethod = "close",name = "dataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() throws Exception {
        DataSource dataSource = BasicDataSourceFactory.createDataSource(new Properties());
        return dataSource;
    }

    @Bean
    public DSLContext dsl(org.jooq.Configuration config) {
        return new DefaultDSLContext(config);
    }

    @Bean
    public ConnectionProvider connectionProvider() throws Exception {
        return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(this.dataSource()));
    }

    @Bean
    public TransactionProvider transactionProvider() {
        return new SpringTransactionProvider();
    }

    @Bean
    public ExceptionTranslator exceptionTranslator() {
        return new ExceptionTranslator();
    }

    @Bean
    public ExecuteListenerProvider executeListenerProvider(ExceptionTranslator exceptionTranslator) {
        return new DefaultExecuteListenerProvider(exceptionTranslator);
    }

    @Bean
    public org.jooq.Configuration jooqConfig(ConnectionProvider connectionProvider,
                                             TransactionProvider transactionProvider, ExecuteListenerProvider executeListenerProvider) {

        return new DefaultConfiguration() //
                .derive(connectionProvider) //
                .derive(transactionProvider) //
                .derive(executeListenerProvider) //
                .derive(SQLDialect.MYSQL);
    }
}
