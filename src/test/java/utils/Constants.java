package utils;

public class Constants {

    public static final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/config/config.properties";
    public static final int EXPLICIT_WAIT = 20;
    public static final int IMPLICIT_WAIT = 10;
    public static final String EXCEL_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/testdata/?";
    public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshots/";

    // Database constants - Using your provided credentials
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
    public static final String DB_USERNAME = "syntax_hrm";
    public static final String DB_PASSWORD = "syntaxhrm123";

}
