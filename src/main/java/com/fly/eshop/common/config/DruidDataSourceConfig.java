package com.fly.eshop.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * druid配置
 *
 * @author zhaohuayu
 * @since 2020-03-12 12:51:14
 */
@Configuration
public class DruidDataSourceConfig {  
   
	/**
	 * druid数据库连接池配置
	 */
    @Value("${spring.datasource.druid.url}")
    private String dbUrl;  
    @Value("${spring.datasource.druid.username}")
    private String username;  
    @Value("${spring.datasource.druid.password}")
    private String password;  
    @Value("${spring.datasource.druid.driverClassName}")
    private String driverClassName;  
    @Value("${spring.datasource.druid.initialSize}")
    private int initialSize;  
    @Value("${spring.datasource.druid.minIdle}")
    private int minIdle;  
    @Value("${spring.datasource.druid.maxActive}")
    private int maxActive;  
    @Value("${spring.datasource.druid.maxWait}")
    private int maxWait;  
    @Value("${spring.datasource.druid.timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;  
    @Value("${spring.datasource.druid.minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;  
    @Value("${spring.datasource.druid.validationQuery}")
    private String validationQuery;  
    @Value("${spring.datasource.druid.testWhileIdle}")
    private boolean testWhileIdle;  
    @Value("${spring.datasource.druid.testOnBorrow}")
    private boolean testOnBorrow;  
    @Value("${spring.datasource.druid.testOnReturn}")
    private boolean testOnReturn;  
    @Value("${spring.datasource.druid.poolPreparedStatements}")
    private boolean poolPreparedStatements;  
    @Value("${spring.datasource.druid.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;  
    @Value("${spring.datasource.druid.filters}")
    private String filters;
    @Value("${spring.datasource.druid.useGlobalDataSourceStat}")
    private boolean useGlobalDataSourceStat;
    @Value("{spring.datasource.druid.connectionProperties}")
    private String connectionProperties;  
    
    /**
     * 创建druid数据库连接池bean
     * @return
     */
    @Bean
    @Primary
    public DataSource dataSource(){  
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(this.dbUrl);  
        datasource.setUsername(username);  
        datasource.setPassword(password);  
        datasource.setDriverClassName(driverClassName);  
        datasource.setInitialSize(initialSize);  
        datasource.setMinIdle(minIdle);  
        datasource.setMaxActive(maxActive);  
        datasource.setMaxWait(maxWait);          
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);  
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);  
        datasource.setValidationQuery(validationQuery);  
        datasource.setTestWhileIdle(testWhileIdle);  
        datasource.setTestOnBorrow(testOnBorrow);  
        datasource.setTestOnReturn(testOnReturn);  
        datasource.setPoolPreparedStatements(poolPreparedStatements);
        datasource.setUseGlobalDataSourceStat(useGlobalDataSourceStat);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);  
        
        try {  
            datasource.setFilters(filters);  
        } catch (SQLException e) {  
            e.printStackTrace();
        }  
        
        datasource.setConnectionProperties(connectionProperties);  
          
        return datasource;  
    }
    
}