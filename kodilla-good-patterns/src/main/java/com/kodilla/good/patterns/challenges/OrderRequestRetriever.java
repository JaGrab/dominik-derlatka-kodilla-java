package com.kodilla.good.patterns.challenges;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new OrdinaryUser("johndoe", "johndoe@neverland");
        List<String>  listOfUnits = new ArrayList<>();
        listOfUnits.add("pcs");
        listOfUnits.add("packs");
        Article article = new OrdinaryArticle("Sandwich", listOfUnits);
        Quantity quantity = new Quantity("pcs", new BigDecimal("3"));

        return new OrderRequest(user, article, quantity);
    }
}
