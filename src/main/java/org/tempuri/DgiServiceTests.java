package org.tempuri;

import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentRequest;
import org.datacontract.schemas._2004._07.businesslogiclayer.DocumentResponse;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@RunWith(JUnit4.class)
public class DgiServiceTests {

    private static IService1 dgiService;

    @BeforeClass
    public static void setup() {
        Service1 service = new Service1();
        dgiService = service.getBasicHttpBindingIService1();
    }

    @Test
    public void givenDgiService_isNull() {
        DocumentResponse docResp = dgiService.getData(new DocumentRequest());
        assertEquals("ok", docResp.getStatus().value());
    }

}
