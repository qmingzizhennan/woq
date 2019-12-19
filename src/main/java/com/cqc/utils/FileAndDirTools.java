package com.cqc.utils;

import java.io.File;
import java.util.List;

public class FileAndDirTools {

    private List<String> actors;

    private List<String> country;

    private String[] types;


    public void createDir(String base){

     for(String coun:country){
        for(String ac:actors){
            for(String ty:types){
             File f = new File(base+File.separator+coun+File.separator+ac+File.separator+ty);
             if (!f.exists()){
                f.mkdirs();
            }


        }
    }
}



    }




}
