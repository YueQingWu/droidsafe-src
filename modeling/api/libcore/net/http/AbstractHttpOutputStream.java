package libcore.net.http;

// Droidsafe Imports
import droidsafe.runtime.*;
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import java.io.IOException;
import java.io.OutputStream;

abstract class AbstractHttpOutputStream extends OutputStream {
@DSGeneratedField(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:02:32.492 -0500", hash_original_field = "0B6D06FC66AB1A3316E7702989E3F923", hash_generated_field = "BA207E645FA463C53A82992C378F82FC")

    protected boolean closed;
    
    @DSComment("Package priviledge")
    @DSBan(DSCat.DEFAULT_MODIFIER)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-17 10:25:24.894 -0400", hash_original_method = "2835FA09B3F183CC926451AC7D6D78D7", hash_generated_method = "2835FA09B3F183CC926451AC7D6D78D7")
    public AbstractHttpOutputStream ()
    {
        //Synthesized constructor
    }

    @DSSink({DSSinkKind.NETWORK})
    @DSSpec(DSCat.IO)
    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:02:32.494 -0500", hash_original_method = "BEB37A4CC4B7ECAA5E509CB7A19DC490", hash_generated_method = "B3DF0522007999A58192C1F1F8F64747")
    
@Override public final void write(int data) throws IOException {
        write(new byte[] { (byte) data });
    }

    @DSGenerator(tool_name = "Doppelganger", tool_version = "2.0", generated_on = "2013-12-30 13:02:32.497 -0500", hash_original_method = "9C8C395306DF0EF2B124A9030249421B", hash_generated_method = "BA3B426D1C469E8B524063D3FE13D093")
    
protected final void checkNotClosed() throws IOException {
        if (closed) {
            throw new IOException("stream closed");
        }
    }
    
}
