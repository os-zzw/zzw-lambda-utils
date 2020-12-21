package com.github.zzw.lambda.function;

/**
 * @author zhangzhewei
 * Created on 2020-12-18
 */
public interface ThrowablePredicate<T, E extends Throwable> {

    boolean test(T t) throws E;

}
