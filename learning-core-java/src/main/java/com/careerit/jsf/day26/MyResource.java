package com.careerit.jsf.day26;

import java.io.Closeable;
import java.io.IOException;

public class MyResource implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Closing the resource");
    }
}
