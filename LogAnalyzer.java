package com.fmr;

import com.fmr.services.LogFileLoader;

import java.io.IOException;
import java.util.List;

public class LogAnalyzer {



    public LogAnalyzer(String filepath, int maxlines) throws IOException {
        LogFileLoader  newdata  = new LogFileLoader(filepath);
        for (int i = 0; i < maxlines; i++) {
            System.out.println("printting " + i + "   " + newdata.data.get(i));


        }
    }

    public  List print(String filepath, int maxlines) throws IOException {
        LogFileLoader  newdata  = new LogFileLoader(filepath);
        for (int i = 0; i < maxlines; i++) {
            System.out.println("printting " + i + "   " + newdata.data.get(i));
            List<> newList = newdata.data.get(i);
            return newList;

        }



    }
}