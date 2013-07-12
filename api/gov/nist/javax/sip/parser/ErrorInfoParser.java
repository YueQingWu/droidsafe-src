package gov.nist.javax.sip.parser;

// Droidsafe Imports
import droidsafe.helpers.*;
import droidsafe.annotations.*;
import droidsafe.runtime.*;
import gov.nist.javax.sip.header.*;
import gov.nist.javax.sip.address.*;
import java.text.ParseException;

public class ErrorInfoParser extends ParametersParser {
    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:40.432 -0400", hash_original_method = "5AFF5330EA4A2771143BBB17EF4E79AC", hash_generated_method = "83D3B9F618EFC876DDE2B0F01045EEC6")
    public  ErrorInfoParser(String errorInfo) {
        super(errorInfo);
        addTaint(errorInfo.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:40.432 -0400", hash_original_method = "8F205A65B870DAE08BD525603424E427", hash_generated_method = "5E6090731FD6E4E3002E0DA957BD8102")
    protected  ErrorInfoParser(Lexer lexer) {
        super(lexer);
        addTaint(lexer.getTaint());
        // ---------- Original Method ----------
    }

    
    @DSGenerator(tool_name = "Doppelganger", tool_version = "0.4.2", generated_on = "2013-07-12 09:48:40.432 -0400", hash_original_method = "A1D86D832E01EE0ED40EBBDB518014BA", hash_generated_method = "526265750CF76B4C310DDBF998A4B5EA")
    public SIPHeader parse() throws ParseException {
    if(debug)        
        dbg_enter("ErrorInfoParser.parse");
        ErrorInfoList list = new ErrorInfoList();
        try 
        {
            headerName(TokenTypes.ERROR_INFO);
            while
(lexer.lookAhead(0) != '\n')            
            {
                do {
                    {
                        ErrorInfo errorInfo = new ErrorInfo();
                        errorInfo.setHeaderName(SIPHeaderNames.ERROR_INFO);
                        this.lexer.SPorHT();
                        this.lexer.match('<');
                        URLParser urlParser = new URLParser((Lexer) this.lexer);
                        GenericURI uri = urlParser.uriReference( true );
                        errorInfo.setErrorInfo(uri);
                        this.lexer.match('>');
                        this.lexer.SPorHT();
                        super.parse(errorInfo);
                        list.add(errorInfo);
    if(lexer.lookAhead(0) == ',')                        
                        {
                            this.lexer.match(',');
                        } //End block
                        else
                        break;
                    } //End block
} while (true);
            } //End block
SIPHeader varED12C351C2E8CA4F85F097DDC7E77B4D_410240638 =             list;
            varED12C351C2E8CA4F85F097DDC7E77B4D_410240638.addTaint(taint);
            return varED12C351C2E8CA4F85F097DDC7E77B4D_410240638;
        } //End block
        finally 
        {
    if(debug)            
            dbg_leave("ErrorInfoParser.parse");
        } //End block
        // ---------- Original Method ----------
        // Original Method Too Long, Refer to Original Implementation
    }

    
}

