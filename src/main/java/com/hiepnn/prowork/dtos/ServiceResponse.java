package com.hiepnn.prowork.dtos;

import com.hiepnn.prowork.constants.AppCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class ServiceResponse<T> {
    Integer code;
    T data;
    String message;
}
