package xyz.ronella.template.javafx.desktop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.slf4j.LoggerFactory;
import xyz.ronella.logging.LoggerPlus;
import xyz.ronella.template.business.PrintText;
import xyz.ronella.template.javafx.desktop.common.Images;
import xyz.ronella.template.javafx.desktop.util.AppInfo;
import xyz.ronella.trivial.handy.PathFinder;

public class Main extends Application {

    static {
        final var userDir = "user.dir";
        final var confDir = System.getProperty(userDir) + "/conf";
        final var logPath = PathFinder.getBuilder("logback.xml")
                .addSysProps(userDir)
                .addPaths(confDir, "..", "../conf")
                .build();
        final var optLogFile = logPath.getFile();

        if (optLogFile.isPresent()) {
            final var logSysProp = "logback.configurationFile";
            final var logFile = optLogFile.get().getAbsolutePath();
            System.out.printf("%s: %s%n", logSysProp, logFile);
            System.setProperty(logSysProp, logFile);
        }
    }

    private final static String MAIN_UI_FILE = "sample.fxml";
    private final static LoggerPlus LOGGER_PLUS = new LoggerPlus(LoggerFactory.getLogger(Main.class));

    @Override
    public void start(final Stage primaryStage) throws Exception {
        final var appInfo = AppInfo.INSTANCE;
        final var appTitle = String.format("%s v%s", appInfo.getAppName(), appInfo.getAppVersion());
        final ClassLoader classLoader = getClass().getClassLoader();
        final FXMLLoader loader = new FXMLLoader(classLoader.getResource(MAIN_UI_FILE));
        final Parent root = loader.load();
        primaryStage.getIcons().add(Images.ICON);
        primaryStage.setTitle(appTitle);
        PrintText.print("Processing Hello world");
        final Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(final String[] args) {
        try (var mLOG = LOGGER_PLUS.groupLog("main")) {
            final var appInfo = AppInfo.INSTANCE;
            final var header = String.format("%s v%s (%s)"
                    , appInfo.getAppName()
                    , appInfo.getAppVersion()
                    , appInfo.getBuildDate()
            );
            mLOG.info(header);
            mLOG.info("Working Directory: %s", System.getProperty("user.dir"));

            launch(args);
        }
    }
}