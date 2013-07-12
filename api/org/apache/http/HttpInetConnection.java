package org.apache.http;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.net.InetAddress;

public interface HttpInetConnection extends HttpConnection {

    InetAddress getLocalAddress();

    int getLocalPort();
    
    InetAddress getRemoteAddress();

    int getRemotePort();
    
}
