/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bgu.spl.net.srv;

import bgu.spl.net.api.bidi.BidiMessagingProtocol;

import java.io.Closeable;

/**
 * The ConnectionHandler interface for Message of type T
 */
public interface ConnectionHandler<T> extends Closeable {
    void send(T msg);
    BidiMessagingProtocol<T> getProtocol();

}