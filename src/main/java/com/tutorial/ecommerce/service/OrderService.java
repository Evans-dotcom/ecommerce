package com.tutorial.ecommerce.service;

import com.tutorial.ecommerce.model.Dao.WebOrderDAO;
import com.tutorial.ecommerce.model.LocalUser;
import com.tutorial.ecommerce.model.WebOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    /** The Web Order DAO. */
    private WebOrderDAO webOrderDAO;

    /**
     * Constructor for spring injection.
     * @param webOrderDAO
     */
    public OrderService(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    /**
     * Gets the list of orders for a given user.
     * @param user The user to search for.
     * @return The list of orders.
     */
    public List<WebOrder> getOrders(LocalUser user) {
        return webOrderDAO.findByUser(user);
    }
}
