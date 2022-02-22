package com.oracle.hcgbu.example;

import io.helidon.microprofile.server.Server;
import org.slf4j.bridge.SLF4JBridgeHandler;

/**
 * Entrypoint for Helidon microprofile server.
 */
public final class Main {

    static {
        // Configuring handler which delegates JUL logging to SLF4J
        SLF4JBridgeHandler.removeHandlersForRootLogger();
        SLF4JBridgeHandler.install();
    }

    private Main() {
    }

    public static void main(final String[] args) {
        Server.create().start();
    }
}
