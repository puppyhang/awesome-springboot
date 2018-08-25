package com.ternence.springboot.docker.api.dto;

import com.ternence.springboot.docker.api.BusinessApiStatusEnums;
import lombok.*;

import java.util.Objects;

/**
 * 格式化的响应对象,固定包含三个属性,code,message,data
 *
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 15:04
 */
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FormativeResponseObject<T> {
    private String code;
    private String message;
    private T data;

    public static <T> FormativeResponseObjectBuilder<T> builder(Class<T> typeDetermineParam) {

        return new FormativeResponseObjectBuilder<T>();
    }

    public final static class FormativeResponseObjectBuilder<T> {

        public FormativeResponseObjectBuilder<T> from(BusinessApiStatusEnums status) {
            Objects.requireNonNull(status, "状态枚举对象不能为null");
            this.code = status.getCode();
            this.message = status.getMessage();
            return this;
        }
    }
}
