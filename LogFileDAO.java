package com.fmr.dao;

import com.fmr.LogEntry;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public  class LogFileDAO {
    String logfiledir = "C:\\\\Projects\\\\LogAnalyzer";

  public   List<LogEntry> data = new ArrayList<>();
    //int maxlines =50;



    public LogFileDAO(String filepath) throws IOException {
        data = loadEntries(filepath);



    }

    public List loadEntries(String filepath) throws IOException {
//
//        BufferedReader br = new BufferedReader(new FileReader("C:\\Projects\\LogAnalyzer\\logEntries.csv"));
//        String s = null;
//
//        while ((s = br.readLine()) != null) {
//
//            System.out.println(s);
//        }
//        return br;
//
//
//    }
        Reader reader = new InputStreamReader(new FileInputStream(filepath));
        CsvToBeanBuilder<LogEntry> builder = new CsvToBeanBuilder<>(reader);
        CsvToBean<LogEntry> csvToBean = builder.withType(LogEntry.class).build();
        List<LogEntry> entries = csvToBean.parse();
        return entries;

    }
//    public void print(int maxlines){
//        for (int i=0;i<maxlines; i++){
//        System.out.println("printting "+ i + "   "  +   data.get(i));
////        for(int j=0; j<data.size(); j++)
////        {
////            System.out.println("data is  "  + data.get(j));
//////        }
//        }

//    }


}


