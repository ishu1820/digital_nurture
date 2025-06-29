package com.example;

import  org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;;


public class AppTest 
{
    
    @Test
    public void toverify()
    {
        App mockApp = mock(App.class);
        Service service = new Service(mockApp);
        service.fetchData();
        verify(mockApp).getData();
    }
}
