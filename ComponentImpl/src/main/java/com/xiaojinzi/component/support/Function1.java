package com.xiaojinzi.component.support;

import androidx.annotation.NonNull;

public interface Function1<T, R> {

    /**
     * 做一个转化,从一个对象变成另一个对象
     *
     * @param t
     * @return
     */
    @NonNull
    R apply(@NonNull T t);

}