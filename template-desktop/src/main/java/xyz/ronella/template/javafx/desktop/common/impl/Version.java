package xyz.ronella.template.javafx.desktop.common.impl;

import org.apache.logging.log4j.LogManager;
import xyz.ronella.template.business.common.LoggerPlus;
import xyz.ronella.template.javafx.desktop.common.IVersion;

import java.io.IOException;
import java.util.Optional;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Version implements IVersion {

    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LogManager.getLogger(Version.class));

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

}
