package com.company.countries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Countries {


    public void CSVreaderCountries(){

        String path = "/Users/iates/Desktop/countries.csv";
//     storing each line
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null){
                String[] runways = line.split(",");
                System.out.println(runways[0] + "   " +  runways[1]);

            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }






    }
}
