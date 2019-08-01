package com.customer.management.resources;

import com.customer.management.models.Customer;
import com.customer.management.services.CustomerServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

      @Autowired
    private MockMvc mockMvc;

    @Mock
    CustomerServiceImpl customerService;
    @InjectMocks
     CustomerController customerController;





    @Test
    public void testGetCustomers() throws Exception {
       /* MvcResult mvcResult =
                mockMvc.perform(MockMvcRequestBuilders.get("/customers")).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        String contentAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentAsString);*/

        Mockito.when(customerService.getAllCustomers()).thenReturn(getCustomers());
        List<Customer> customers = customerController.getCustomers();


        Assert.assertEquals(false,customers.isEmpty());
        Assert.assertEquals("John",customers.get(0).getFirstName());
        Assert.assertEquals(100,customers.get(0).getCustomerId());
        Assert.assertNotNull(customers.get(0).getCustomerId());

    }

    private Customer buildCustomer() {
        return new Customer(100, "John", "Doe",
                LocalDate.now().minusYears(20));
    }

    private List<Customer> getCustomers() {
        return Collections.singletonList(buildCustomer());
    }

}
