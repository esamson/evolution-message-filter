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
 * Output filtered mail to logs.
 *
 * @author Edward Samson
 */
public class Trace {
    
    private static final Logger log
            = LoggerFactory.getLogger(Trace.class);
    private static final Logger msg
            = LoggerFactory.getLogger("msg");

    public static void main(String[] args) {
        log.info("Message START");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                msg.info(line);
            }
            log.info("Message END");
        } catch (IOException ex) {
            log.error("Fail", ex);
            System.exit(-1);
        }
        System.exit(1);
    }
}
