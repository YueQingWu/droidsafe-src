package libcore.io;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import java.io.IOException;
import java.net.SocketException;

public final class ErrnoException extends Exception {
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:15.516 -0400", hash_original_field = "18B5CA8CBD35BC4F1D1B026A63E1062E", hash_generated_field = "3A7419DC5D02B665865D1D41C31D2769")

    private String functionName;
    @DSGeneratedField(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:15.516 -0400", hash_original_field = "70106D0D821513F45702B7D25664AB7C", hash_generated_field = "D05FB512281BC7A92BFD5BEF738B1D62")

    public int errno;
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:15.517 -0400", hash_original_method = "0DF4193C9C2664F33DC38063504784DA", hash_generated_method = "3D8190007CF210EB668925FD8B43A62F")
    public  ErrnoException(String functionName, int errno) {
        this.functionName = functionName;
        this.errno = errno;
        // ---------- Original Method ----------
        //this.functionName = functionName;
        //this.errno = errno;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:15.518 -0400", hash_original_method = "BE4619378388F8812C9CF2AE8895CE85", hash_generated_method = "1C95F3F0A3540A5B91F0986792E8A559")
    public  ErrnoException(String functionName, int errno, Throwable cause) {
        super(cause);
        addTaint(cause.getTaint());
        this.functionName = functionName;
        this.errno = errno;
        // ---------- Original Method ----------
        //this.functionName = functionName;
        //this.errno = errno;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:15.518 -0400", hash_original_method = "911EB712B1CEA729911922ADFC942179", hash_generated_method = "817D6A7B5685BDF0287C6D8E3B5EDBBE")
    @Override
    public String getMessage() {
        String errnoName = OsConstants.errnoName(errno);
    if(errnoName == null)        
        {
            errnoName = "errno " + errno;
        } //End block
        String description = Libcore.os.strerror(errno);
String var369F48B7B1F222C81180E74744106A24_1103990961 =         functionName + " failed: " + errnoName + " (" + description + ")";
        var369F48B7B1F222C81180E74744106A24_1103990961.addTaint(taint);
        return var369F48B7B1F222C81180E74744106A24_1103990961;
        // ---------- Original Method ----------
        //String errnoName = OsConstants.errnoName(errno);
        //if (errnoName == null) {
            //errnoName = "errno " + errno;
        //}
        //String description = Libcore.os.strerror(errno);
        //return functionName + " failed: " + errnoName + " (" + description + ")";
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:15.518 -0400", hash_original_method = "F39DB956D71AD491CF421ED6963B5FCE", hash_generated_method = "574E1E0D543774C29845C24687064B3C")
    public IOException rethrowAsIOException() throws IOException {
        IOException newException = new IOException(getMessage());
        newException.initCause(this);
        newException.addTaint(taint);
        throw newException;
        // ---------- Original Method ----------
        //IOException newException = new IOException(getMessage());
        //newException.initCause(this);
        //throw newException;
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 11:03:15.519 -0400", hash_original_method = "8BB4A81BC702A752206578FEF42C6BB1", hash_generated_method = "B5C4BE5FFD76B69DD0467375049DAA8C")
    public SocketException rethrowAsSocketException() throws SocketException {
        SocketException var8159138B8EC3EF5E2E6E61C739DFD5D9_963796440 = new SocketException(getMessage(), this);
        var8159138B8EC3EF5E2E6E61C739DFD5D9_963796440.addTaint(taint);
        throw var8159138B8EC3EF5E2E6E61C739DFD5D9_963796440;
        // ---------- Original Method ----------
        //throw new SocketException(getMessage(), this);
    }

    
}

