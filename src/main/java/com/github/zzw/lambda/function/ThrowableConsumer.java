package com.github.zzw.lambda.function;

/**
 * @author zhangzhewei
 * Created on 2020-12-19
 */
public interface ThrowableConsumer<T, E extends Throwable> {

    void accept(T t) throws E;

}
