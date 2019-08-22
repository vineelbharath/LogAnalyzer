package com.fmr;

import com.fmr.services.LogFileLoader;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LogFileLoaderTest {

    public LogFileLoaderTest() throws IOException {
    }

    @Test
    public void loadEntries() throws IOException {

        LogFileLoader loader  = new LogFileLoader("C:\\\\Projects\\\\LogAnalyzer\\\\logEntries.csv");
         assertNotNull(loader);


    }

    @Test
    public void print() throws IOException {

        LogAnalyzer newloader = new LogAnalyzer("C:\\Projects\\LogAnalyzer\\logEntries.csv", 100);
        newloader.print();
        assertEquals(100, newloader.print(100));
    }





    //Do File Not Found

//    @Test
//
//    public void contentNotFound() throws IOException{
//
//        LogFileLoader loader  = new LogFileLoader();
//        BufferedReader br = new BufferedReader;
//        assertNotNull(loader.loadEntries(br.readLine()));
//
//
//    }
}
