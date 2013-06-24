package org.mozilla.charsetdetector;

public class CharsetDetector
{
    static {
        System.loadLibrary("CharsetDetector");
    }
    
    public static String getEncoding(String file)
    {
        return get_encoding(file);
    }
    
    private native static String get_encoding(String file);
}
