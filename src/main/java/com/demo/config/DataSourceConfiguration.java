package com.demo.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.metadata.CommonsDbcp2DataSourcePoolMetadata;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author Yu
 * @create 2018-08-07 20:54
 **/
@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfiguration {
    @Value("${db.driverClassName}")
    private String driver;
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.maxActive}")
    private int maxActive;
    @Value("${db.maxIdle}")
    private int maxIdel;
    @Value("${db.minIdle}")
    private int minIdel;
    @Value("${db.maxWait}")
    private long maxWait;
    @Value("${db.initialSize}")
    private int initialSize;
    @Value("${db.defaultAutoCommit}")
    private boolean defaultAutoCommit;
    @Value("${db.minEvictableIdleTimeMillis}")
    private long minEvictableIdleTimeMillis;

    @Bean(value = "dataSource")
    public BasicDataSource dataSource(){

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxIdle(maxIdel);
        dataSource.setMinIdle(minIdel);
        dataSource.setMaxWait(maxWait);
        //dataSource.setValidationQuery("SELECT 1");
        //dataSource.setTestOnBorrow(true);
        dataSource.setInitialSize(initialSize);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setDefaultAutoCommit(defaultAutoCommit);
        return dataSource;
    }
}
