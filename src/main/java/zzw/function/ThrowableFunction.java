package zzw.function;

/**
 * @author zhangzhewei
 * Created on 2020-12-19
 */
@FunctionalInterface
public interface ThrowableFunction<T, R, E extends Throwable> {

    R apply(T t) throws E;
    
}

