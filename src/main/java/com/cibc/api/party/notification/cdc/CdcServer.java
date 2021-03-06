package com.cibc.api.party.notification.cdc;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;

/**
 * CdcServer handle
 */
public class CdcServer implements HandlerProvider {
    @Override
    public HttpHandler getHandler() {
        return Handlers.path()
                .addPrefixPath("/", exchange -> exchange.getResponseSender().send("OK!")
                );
    }
}
