package com.shx.pojo;

/**
 * ClassName: Result
 * Description:
 * date: 2020/3/16 14:53
 *
 * @author sunshine
 * @version v1.0
 * @since JDK 1.8
 */
public class Result<T> {

    private boolean flag;//是否成功
    private String message;//返回消息

    private T data;//返回数据

    public Result(boolean flag, String message, Object data) {
        this.flag = flag;
        this.message = message;
        this.data = (T)data;
    }

    public Result(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
