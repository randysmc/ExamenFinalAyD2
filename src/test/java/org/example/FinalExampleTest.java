package org.example;

import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

public class FinalExampleTest {

    @Mock
    FinalExample fe;

    final static String NAME = "usuario";
    final static String EMAIL = "usuario@gmail.com";
    final static String PHONE = "123456";
    final static String ADDRESS = "av 1";
    final static String CITY = "Gua";
    final static String ZIP = "zip";

    final static String INPUT = "nuevapalabra";






    @Test
    public void testProccesData() {

        fe.processData(INPUT);





    }

    @Test
    public void createUser(){


        FinalExample finalExample = new FinalExample();
        finalExample.createUser(NAME, EMAIL, PHONE, ADDRESS, CITY, ZIP);

        //when
        given(new FinalExample().createUser("usuario", "usuario@gmail.com", "123456",
                "av 1", "Gua", "zip" ));

        ass


    }

    @Test
    public void createOrderTest(){
        String customerName=  "customer1";


    }
}




