package com.test;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.*;

public class StaticImports {
    public static void foo() {
        assertThat(42).isEqualTo(42);
        Assertions.assertThat(42).isEqualTo(42);
    }
}