package com.companyname.com;

public class TestData {

    // Open file to write
    public void writeData(String filename, String data, int numOfRecords){
        OpenFile fileOpen = new OpenFile();
        String dataFormat = generateData(data, numOfRecords);
        fileOpen.openFileToWrite(filename, dataFormat);
   }

    // generate Data
    public String generateData(String data, int numOfRecords){
            StringBuilder line = new StringBuilder();
            for (int i =0; i <= numOfRecords; i++) {
                line.append(data + ",");
            }
            return line.toString();

    }

    // Random User
    public String randomUser(data){

    }

}
