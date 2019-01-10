/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basketasia.database.service;

import static com.basketasia.model.Tables.CONFIGURATION;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless(name = "databaseService")
public class DatabaseService implements DatabaseServiceLocal {

    private String user;
    private String password;
    private String driver;
    private String url;

    @EJB
    private Application application;

    @PostConstruct
    public void init() {
        user = application.getConfigurationValue("jdbc.user");
        password = application.getConfigurationValue("jdbc.password");
        url = application.getConfigurationValue("jdbc.url");
        driver = application.getConfigurationValue("jdbc.driver");
    }

    @Override
    public String getConfigurationValue(String key) throws Exception {
        if (key == null || key.isEmpty()) {
            return null;
        }

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            DSLContext context = DSL.using(connection, SQLDialect.MYSQL);
            Result<Record> result = context.select().from(CONFIGURATION).where(CONFIGURATION.CONFIGURATION_KEY.eq(key)).fetch();
            if (result.isNotEmpty()) {
                return result.get(0).getValue(CONFIGURATION.CONFIGURATION_VALUE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new Exception("Unable to create DSL context to connect to database");
    }

}
