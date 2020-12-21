package com.github.zzw.lambda.function;

/**
 * @author zhangzhewei
 */
public interface ThrowableSupplier<R, E extends Throwable> {

    R get() throws E;

}
