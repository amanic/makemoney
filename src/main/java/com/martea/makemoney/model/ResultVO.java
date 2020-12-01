package com.martea.makemoney.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author haitao.chen
 * @date 2020/12/1
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> implements Serializable {
    private Boolean success;

    private T data;

    private String msg;
}
