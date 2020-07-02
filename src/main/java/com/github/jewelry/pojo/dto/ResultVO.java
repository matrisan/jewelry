package com.github.jewelry.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 石少东
 * @date 2020-07-02 13:43
 * @since 1.0
 */

@Getter
@Setter
@Builder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@ToString
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 1987031723836834798L;

    private String status;

    private Integer code;

    private String message;

    private T data;

    /**
     * 默认成功
     *
     * @param <T> T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> success() {
        return ResultVO.<T>builder().status("SUCCESS").code(200).message("执行成功").build();
    }

    /**
     * 自定义成功消息
     *
     * @param message 信息
     * @param <T>     T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> success(String message) {
        return ResultVO.<T>builder().status("SUCCESS").code(200).message(message).build();
    }

    /**
     * 自定义成功消息
     *
     * @param data 数据
     * @param <T>  T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> success(T data) {
        return ResultVO.<T>builder().status("SUCCESS").code(200).message("执行成功").data(data).build();
    }

    /**
     * 自定义成功消息和数据
     *
     * @param message 信息
     * @param data    数据
     * @param <T>     T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> success(String message, T data) {
        return ResultVO.<T>builder().status("SUCCESS").code(200).message(message).data(data).build();
    }

    /**
     * 默认失败
     *
     * @param <T> T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> failure() {
        return ResultVO.<T>builder().message("执行失败").status("FAILURE").code(500).build();
    }

    /**
     * 自定义失败消息
     *
     * @param message message
     * @param <T>     T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> failure(String message) {
        return ResultVO.<T>builder().message(message).status("FAILURE").code(500).build();
    }

    /**
     * 返回失败信息
     *
     * @param code    状态码
     * @param message 消息
     * @param <T>     T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> failure(int code, String message) {
        return ResultVO.<T>builder().message(message).status("FAILURE").code(code).build();
    }

    public static <T> ResultVO<T> failure(int code, T t) {
        return ResultVO.<T>builder().message(t.toString()).status("FAILURE").code(code).build();
    }

    /**
     * 之定义失败消息和数据
     *
     * @param message message
     * @param data    data
     * @param <T>     T
     * @return ResultDTO
     */
    public static <T> ResultVO<T> failure(String message, T data) {
        return ResultVO.<T>builder().message(message).status("FAILURE").code(500).data(data).build();
    }

}
