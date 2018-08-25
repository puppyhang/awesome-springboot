package com.ternence.springboot.docker.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
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