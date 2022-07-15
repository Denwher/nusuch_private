package com.hopefuls.controller;/**
 * @author Denwher
 * @version 1.0
 */

import lombok.Data;
import lombok.ToString;

/**
 * @projectName: nusuch
 * @package: com.hopefuls.controller
 * @className: Result
 * @author: Denwher
 * @description: TODO 封装了用户请求响应的结果
 * @date: 2022/7/13
 * @version: 1.0
 */
@Data
@ToString
public class Result {
    private Object data;
    private Integer code;
    private String msg;

    public Result() {
    }

    public Result(Integer code, Object data) {
        this.data = data;
        this.code = code;
    }

    public Result(Integer code, Object data, String msg) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
}
