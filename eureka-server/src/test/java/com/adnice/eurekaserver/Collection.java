package com.adnice.eurekaserver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class Collection {


    public void arrayListTest(){
        ArrayList<Object> objects = new ArrayList<>();
    }

    @Test
    public void test01() throws IOException {
        File file = new File("/Users/dubaoming/Desktop/c.xls");
        try {
            Workbook workbook = Workbook.getWorkbook(file);
            Sheet sheet = workbook.getSheet(0);
            for (int i = 0; i < sheet.getRows(); i++) {
                for (int j = 0; j < sheet.getColumns(); j++) {
                    Cell cell = sheet.getCell(j, i);
                    if (cell!=null){
                        System.out.print(cell.getContents()+"");
                    }else{
                        System.out.print("null");
                    }
                    System.out.print("\n");
                }

            }
//            String contents = sheet.getCell(0, 0).getContents();
//            String contents1 = sheet.getCell(1,0 ).getContents();
//            System.out.println(contents);
//            System.out.println(contents1);

        } catch (BiffException e) {
            e.printStackTrace();
        }

    }

    @Test
    public  void test(){

    }
}
