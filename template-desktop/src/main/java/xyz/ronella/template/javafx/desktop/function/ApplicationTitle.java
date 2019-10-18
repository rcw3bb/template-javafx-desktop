package xyz.ronella.template.javafx.desktop.function;

import xyz.ronella.template.business.common.Funxion;

import java.util.StringJoiner;
import java.util.function.Supplier;

public class ApplicationTitle implements Supplier<String> {
    @Override
    public String get() {
        return new StringJoiner("")
                .add("Desktop Template v")
                .add(Funxion.buildGenerator(new FullVersion()).generate())
                .toString();
    }
}