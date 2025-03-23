package com.sipriano.desafio.services;

import com.sipriano.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shippment(Order order) {
        double result = 0;
        if (order.getBasic() < 100.0) {
            result = 20.0;
        } else if (order.getBasic() < 200) {
            result = 12.0;
        }

        return result;
    }

}
