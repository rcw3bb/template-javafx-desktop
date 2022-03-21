package xyz.ronella.template.javafx.desktop.function;

import xyz.ronella.trivial.command.Invoker;

import java.util.StringJoiner;
import java.util.function.Supplier;

public class ApplicationTitle implements Supplier<String> {
    @Override
    public String get() {
        return new StringJoiner("")
                .add("Desktop Template v")
                .add(Invoker.generate(new FullVersion()))
                .toString();
    }
}