package com.ternence.springboot.docker.misc.exception;

import com.ternence.springboot.docker.api.BusinessApiStatusEnums;
import com.ternence.springboot.docker.api.dto.FormativeResponseObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.PersistenceException;

/**
 * 内部异常处理器
 *
 * @author Ternence
 * @version 1.0
 * @since 2018/8/25 15:00
 */
@ControllerAdvice
@Slf4j
public class InternalExceptionsHandler {
    /**
     * 这个异常处理器是针对JPA抛出的异常的处理器,为了不让SQL异常抛出到UI上
     */
    @ExceptionHandler(PersistenceException.class)
    @ResponseBody
    public FormativeResponseObject<String> persistenceExHandler(PersistenceException e) {
        log.info("持久化异常:", e);
        return FormativeResponseObject.builder(String.class).
                from(BusinessApiStatusEnums.GLOBAL_EXCEPTION)
                .data(e.getMessage())
                .build();
    }

    /**
     * 这个异常处理器是针对spring的异常封装机制增加的,为了不让SQL异常抛出到UI上
     */
    @ExceptionHandler(DataAccessException.class)
    @ResponseBody
    public FormativeResponseObject<String> dataAccessExHandler(DataAccessException e) {
        log.info("数据访问异常:", e);
        return FormativeResponseObject.builder(String.class).
                from(BusinessApiStatusEnums.GLOBAL_EXCEPTION)
                .data(e.getMessage())
                .build();
    }
}
