package com.github.zzw.tuple;

import java.util.Objects;

/**
 * @author zhangzhewei
 * Created on 2019-08-07
 */
public class TwoTuple<A, B> {

    private final A first;
    private final B two;

    public TwoTuple(final A first, final B two) {
        this.first = first;
        this.two = two;
    }

    public A getFirst() {
        return first;
    }

    public B getTwo() {
        return two;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TwoTuple<?, ?> other = (TwoTuple<?, ?>) o;
        return Objects.equals(first, other.first) && Objects.equals(two, other.two);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = result * prime + (first == null ? 0 : first.hashCode());
        result = result * prime + (two == null ? 0 : two.hashCode());
        return result;
    }
}
