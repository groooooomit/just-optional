package com.bfu.just.optional;


import org.junit.Test;

import just.optional.Optional;

public class OptionalTest {

    @Test
    public void test() {
        Integer integer = Optional.of(100).map(integer1 -> integer1 * 100).orElse(200);
        System.out.println(integer);
    }

}
