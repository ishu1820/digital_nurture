package com.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;

public class Test {

    @Test
    public void testExternalApi() {
        
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

       
        when(mockApi.getData()).thenReturn("Mock Data");

        
        Service service = new Service(mockApi);

        
        String result = service.fetchData();

        
        assertEquals("Mock Data", result);
    }
}
