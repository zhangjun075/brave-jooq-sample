//package com.brave.jooq.config;
//
//import lombok.Data;
//import org.apache.commons.dbcp.BasicDataSourceFactory;
//import org.jooq.DSLContext;
//import org.jooq.SQLDialect;
//import org.jooq.conf.Settings;
//import org.jooq.impl.DSL;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Properties;
//
///**
// * Created by junzhang on 2017/5/20.
// */
//@Configuration
//@ConfigurationProperties(prefix = "sample-database")
//@Data
//public class DbConfig {
//    private String url;
//    private String username;
//    private String password;
////
////    @Bean
////    Connection getConnection() throws SQLException {
////        return DriverManager.getConnection(url, username, password);
////    }
//
//    @Bean
//    DSLContext dslContext() throws SQLException {
//        Settings settings = new Settings()
//                .withExecuteLogging(true);
//        Connection connection = DriverManager.getConnection(url,username,password);
//        DSLContext dslContext = DSL.using(connection, SQLDialect.MYSQL,settings);
//        return dslContext;
//    }
//
//    @Bean(destroyMethod = "close",name = "dataSource")
//    @Primary
//    DataSource dataSource() throws Exception {
//        DataSource dataSource = BasicDataSourceFactory.createDataSource(new Properties());
//        return dataSource;
//    }
//
//    @Bean
//    DataSourceTransactionManager transactionManager(){
//        return new DataSourceTransactionManager();
//    }
//
//}
