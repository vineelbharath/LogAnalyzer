package com.fmr;

import com.fmr.services.LogFileLoader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogFileReaderApp {

    public static void main(String[] args) throws IOException {
        LogAnalyzer newloader = new LogAnalyzer("C:\\Projects\\LogAnalyzer\\logEntries.csv", 100);
//        System.out.println(loader.data.get(0));



    }
}
