package xyz.ronella.template.javafx.desktop.common.impl;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;
import xyz.ronella.template.javafx.desktop.common.IVersion;
import xyz.ronella.trivial.decorator.StringBuilderAppender;
import xyz.ronella.trivial.functional.impl.StringBuilderDelim;

import java.io.IOException;
import java.util.Optional;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Version implements IVersion {

    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LoggerFactory.getLogger(Version.class));

    private ResourceBundle prop;

    public Version() {
        try {
            var versionProp = ClassLoader.getSystemResourceAsStream("version.properties");
            if (Optional.ofNullable(versionProp).isPresent()) {
                this.prop = new PropertyResourceBundle(versionProp);
            }
        } catch (IOException exp) {
            LOGGER_PLUS.getLogger().error(LOGGER_PLUS.getStackTraceAsString(exp));
        }
    }

    @Override
    public Integer getMajor() {
        return Integer.valueOf(prop.getString("MAJOR"));
    }

    @Override
    public Integer getMinor() {
        return Integer.valueOf(prop.getString("MINOR"));
    }

    @Override
    public String getMaintenance() {
        return prop.getString("MAINTENANCE");
    }

    @Override
    public String getBuild() {
        return prop.getString("BUILD");
    }

    public static String getFullVersion() {
        final var version = new Version();

        final var sbVersion = new StringBuilderAppender(new StringBuilderDelim<>("-"))
                .append(String.format("%s.%s.%s", version.getMajor(), version.getMinor(), version.getMaintenance()))
                .appendWhen(String.format("%s", version.getBuild())).when(___stringBuilder ->
                        !version.getBuild().isBlank());

        return sbVersion.toString();
    }

}
