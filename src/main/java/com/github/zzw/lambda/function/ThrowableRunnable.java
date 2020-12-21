package com.github.zzw.lambda.function;

/**
 * @author zhangzhewei
 * Created on 2020-12-21
 */
@FunctionalInterface
public interface ThrowableRunnable<E extends Throwable> {

    void run() throws E;

}
