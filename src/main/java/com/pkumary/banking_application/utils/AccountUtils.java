package com.pkumary.banking_application.utils;

import java.time.Year;

public class AccountUtils {
    //account number to have current year and random six digit


    public  static final String ACCOUNT_EXISTS_CODE="001";

    public static  final String ACCOUNT_EXISTS_MESSAGE="This user already exist!";

    public static final String ACCOUNT_CREATION_SUCCESS="002";

    public static final String ACCOUNT_CREATION_MESSAGE="Accoutn has been created successfully";



    public static String generateAccountNumber(){
        Year currentYear=Year.now();
        int min=100000;
        int max=999999;

        //generate a random number betweeen min and max;
        int randNumber=(int)Math.floor(Math.random()*(max-min+1)+min);


        //convert the current and randNumber to string and concatenate them;

        String year=String.valueOf(currentYear);
        String randomNumber=String.valueOf(randNumber);

        StringBuilder accountNUmber=new StringBuilder();
       return accountNUmber.append(year).append(randomNumber).toString();

    }
}
