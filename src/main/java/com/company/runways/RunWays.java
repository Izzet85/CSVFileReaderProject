package com.company.runways;

import com.company.airports.Airports;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RunWays {

    String [] runways ;
    Airports aiports;


    public RunWays(String[] runwaysId) {
        this.runways = runways;
    }

    public void CSVreaderRunways(){

        String path = "/Users/iates/Desktop/runways.csv";
//     storing each line
        String line;

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null){
                String[] runways = line.split(",");


                System.out.println(runways[0] + "   " +  runways[1]);



                this.runways =   runways;


            }

        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }


        System.out.println(runways);

    }





    

}
