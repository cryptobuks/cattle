/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.VolumeRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VolumeTable extends TableImpl<VolumeRecord> {

    private static final long serialVersionUID = 1597241697;

    /**
     * The reference instance of <code>cattle.volume</code>
     */
    public static final VolumeTable VOLUME = new VolumeTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VolumeRecord> getRecordType() {
        return VolumeRecord.class;
    }

    /**
     * The column <code>cattle.volume.id</code>.
     */
    public final TableField<VolumeRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.volume.name</code>.
     */
    public final TableField<VolumeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.volume.account_id</code>.
     */
    public final TableField<VolumeRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.kind</code>.
     */
    public final TableField<VolumeRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.volume.uuid</code>.
     */
    public final TableField<VolumeRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.volume.description</code>.
     */
    public final TableField<VolumeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.volume.state</code>.
     */
    public final TableField<VolumeRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.volume.created</code>.
     */
    public final TableField<VolumeRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.volume.removed</code>.
     */
    public final TableField<VolumeRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.volume.remove_time</code>.
     */
    public final TableField<VolumeRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.volume.data</code>.
     */
    public final TableField<VolumeRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.volume.physical_size_mb</code>.
     */
    public final TableField<VolumeRecord, Long> PHYSICAL_SIZE_MB = createField("physical_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.virtual_size_mb</code>.
     */
    public final TableField<VolumeRecord, Long> VIRTUAL_SIZE_MB = createField("virtual_size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.format</code>.
     */
    public final TableField<VolumeRecord, String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.volume.uri</code>.
     */
    public final TableField<VolumeRecord, String> URI = createField("uri", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.volume.external_id</code>.
     */
    public final TableField<VolumeRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.volume.access_mode</code>.
     */
    public final TableField<VolumeRecord, String> ACCESS_MODE = createField("access_mode", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.volume.host_id</code>.
     */
    public final TableField<VolumeRecord, Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.deployment_unit_id</code>.
     */
    public final TableField<VolumeRecord, Long> DEPLOYMENT_UNIT_ID = createField("deployment_unit_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.environment_id</code>.
     */
    public final TableField<VolumeRecord, Long> STACK_ID = createField("environment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.volume_template_id</code>.
     */
    public final TableField<VolumeRecord, Long> VOLUME_TEMPLATE_ID = createField("volume_template_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.storage_driver_id</code>.
     */
    public final TableField<VolumeRecord, Long> STORAGE_DRIVER_ID = createField("storage_driver_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.volume.size_mb</code>.
     */
    public final TableField<VolumeRecord, Long> SIZE_MB = createField("size_mb", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.volume</code> table reference
     */
    public VolumeTable() {
        this("volume", null);
    }

    /**
     * Create an aliased <code>cattle.volume</code> table reference
     */
    public VolumeTable(String alias) {
        this(alias, VOLUME);
    }

    private VolumeTable(String alias, Table<VolumeRecord> aliased) {
        this(alias, aliased, null);
    }

    private VolumeTable(String alias, Table<VolumeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<VolumeRecord, Long> getIdentity() {
        return Keys.IDENTITY_VOLUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<VolumeRecord> getPrimaryKey() {
        return Keys.KEY_VOLUME_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<VolumeRecord>> getKeys() {
        return Arrays.<UniqueKey<VolumeRecord>>asList(Keys.KEY_VOLUME_PRIMARY, Keys.KEY_VOLUME_IDX_VOLUME_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<VolumeRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<VolumeRecord, ?>>asList(Keys.FK_VOLUME__ACCOUNT_ID, Keys.FK_VOLUME__HOST_ID, Keys.FK_VOLUME__DEPLOYMENT_UNIT_ID, Keys.FK_VOLUME__ENVIRONMENT_ID, Keys.FK_VOLUME__VOLUME_TEMPLATE_ID, Keys.FK_VOLUME__STORAGE_DRIVER_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VolumeTable as(String alias) {
        return new VolumeTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VolumeTable rename(String name) {
        return new VolumeTable(name, null);
    }
}
