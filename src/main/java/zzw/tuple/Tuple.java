package zzw.tuple;

/**
 * @author zhangzhewei
 * Created on 2019-08-13
 */
public final class Tuple {

    private Tuple() {
        throw new UnsupportedOperationException();
    }

    public static <A, B> TwoTuple<A, B> tuple(final A a, final B b) {
        return new TwoTuple<>(a, b);
    }

}
