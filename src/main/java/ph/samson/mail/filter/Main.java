/*
 * Copyright 2015 Edward Samson
 */
package ph.samson.mail.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Edward Samson
 */
public class Main {
    
    private static final int CALENDAR = 1;
    private static final Logger log
            = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Content-Type: text/calendar")) {
                    System.exit(CALENDAR);
                }
            }
        } catch (IOException ex) {
            log.error("Fail", ex);
        }
    }
}
