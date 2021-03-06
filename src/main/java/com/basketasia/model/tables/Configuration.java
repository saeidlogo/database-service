/*
 * This file is generated by jOOQ.
 */
package com.basketasia.model.tables;


import com.basketasia.model.Indexes;
import com.basketasia.model.KalagardDbCom;
import com.basketasia.model.Keys;
import com.basketasia.model.tables.records.ConfigurationRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Configuration extends TableImpl<ConfigurationRecord> {

    private static final long serialVersionUID = 935309412;

    /**
     * The reference instance of <code>kalagard_db_com.configuration</code>
     */
    public static final Configuration CONFIGURATION = new Configuration();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConfigurationRecord> getRecordType() {
        return ConfigurationRecord.class;
    }

    /**
     * The column <code>kalagard_db_com.configuration.configuration_id</code>.
     */
    public final TableField<ConfigurationRecord, Integer> CONFIGURATION_ID = createField("configuration_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.configuration_title</code>.
     */
    public final TableField<ConfigurationRecord, String> CONFIGURATION_TITLE = createField("configuration_title", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.configuration_key</code>.
     */
    public final TableField<ConfigurationRecord, String> CONFIGURATION_KEY = createField("configuration_key", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.configuration_value</code>.
     */
    public final TableField<ConfigurationRecord, String> CONFIGURATION_VALUE = createField("configuration_value", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.configuration_description</code>.
     */
    public final TableField<ConfigurationRecord, String> CONFIGURATION_DESCRIPTION = createField("configuration_description", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.configuration_group_id</code>.
     */
    public final TableField<ConfigurationRecord, Integer> CONFIGURATION_GROUP_ID = createField("configuration_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.sort_order</code>.
     */
    public final TableField<ConfigurationRecord, Integer> SORT_ORDER = createField("sort_order", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>kalagard_db_com.configuration.last_modified</code>.
     */
    public final TableField<ConfigurationRecord, Timestamp> LAST_MODIFIED = createField("last_modified", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>kalagard_db_com.configuration.date_added</code>.
     */
    public final TableField<ConfigurationRecord, Timestamp> DATE_ADDED = createField("date_added", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.use_function</code>.
     */
    public final TableField<ConfigurationRecord, String> USE_FUNCTION = createField("use_function", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.set_function</code>.
     */
    public final TableField<ConfigurationRecord, String> SET_FUNCTION = createField("set_function", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.store_id</code>.
     */
    public final TableField<ConfigurationRecord, String> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>kalagard_db_com.configuration.return_by_api</code>.
     */
    public final TableField<ConfigurationRecord, Integer> RETURN_BY_API = createField("return_by_api", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * Create a <code>kalagard_db_com.configuration</code> table reference
     */
    public Configuration() {
        this(DSL.name("configuration"), null);
    }

    /**
     * Create an aliased <code>kalagard_db_com.configuration</code> table reference
     */
    public Configuration(String alias) {
        this(DSL.name(alias), CONFIGURATION);
    }

    /**
     * Create an aliased <code>kalagard_db_com.configuration</code> table reference
     */
    public Configuration(Name alias) {
        this(alias, CONFIGURATION);
    }

    private Configuration(Name alias, Table<ConfigurationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Configuration(Name alias, Table<ConfigurationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Configuration(Table<O> child, ForeignKey<O, ConfigurationRecord> key) {
        super(child, key, CONFIGURATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return KalagardDbCom.KALAGARD_DB_COM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CONFIGURATION_IDX_STORE_ID, Indexes.CONFIGURATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ConfigurationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONFIGURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConfigurationRecord> getPrimaryKey() {
        return Keys.KEY_CONFIGURATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConfigurationRecord>> getKeys() {
        return Arrays.<UniqueKey<ConfigurationRecord>>asList(Keys.KEY_CONFIGURATION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Configuration as(String alias) {
        return new Configuration(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Configuration as(Name alias) {
        return new Configuration(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Configuration rename(String name) {
        return new Configuration(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Configuration rename(Name name) {
        return new Configuration(name, null);
    }
}
