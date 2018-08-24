package com.ternence.springboot.docker.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "contacts")
@ApiModel("Contacts")
public class Contacts implements Serializable {
    @Id
    @ApiModelProperty(value = "", required = false)
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String uuid;

    @ApiModelProperty(value = "", required = false)
    @ColumnType(jdbcType = JdbcType.CHAR)
    private String gender;

    @ApiModelProperty(value = "", required = false)
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String name;

    @Column(name = "phone_no")
    @ApiModelProperty(value = "", required = false)
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String phoneNo;

    @ApiModelProperty(value = "", required = false)
    @ColumnType(jdbcType = JdbcType.VARCHAR)
    private String address;

    private static final long serialVersionUID = 1L;

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public Contacts setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public Contacts setGender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public Contacts setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return phone_no
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo
     */
    public Contacts setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public Contacts setAddress(String address) {
        this.address = address;
        return this;
    }

    public enum FieldEnum {
        UUID("uuid", "uuid"),
        GENDER("gender", "gender"),
        NAME("name", "name"),
        PHONE_NO("phoneNo", "phone_no"),
        ADDRESS("address", "address");

        private String javaFieldName;

        private String dbFieldName;

        FieldEnum(String javaFieldName, String dbFieldName) {
            this.javaFieldName = javaFieldName;
            this.dbFieldName = dbFieldName;
        }

        public String javaFieldName() {
            return javaFieldName;
        }

        public String dbFieldName() {
            return dbFieldName;
        }
    }
}