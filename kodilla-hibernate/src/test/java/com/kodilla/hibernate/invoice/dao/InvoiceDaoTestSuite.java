package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product onion = new Product("Onion");
        Product ham = new Product("Ham");
        Product bread = new Product("Bread");
        Invoice invoice1 = new Invoice("1/11");
        Invoice invoice2 = new Invoice("2/11");
        Item item1 = new Item(new BigDecimal(2.3), 2);
        Item item2 = new Item(new BigDecimal(10.21), 3);
        Item item3 = new Item(new BigDecimal(3.5), 1);
        item1.setProduct(onion);
        item2.setProduct(ham);
        item3.setProduct(bread);
        onion.getItems().add(item1);
        ham.getItems().add(item2);
        bread.getItems().add(item3);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);
        int id1 = invoice1.getId();
        int id2 = invoice2.getId();

        //Then
        Assert.assertNotEquals(0, id1);
        Assert.assertNotEquals(0, id2);

        //CleanUp
        invoiceDao.delete(id1);
        invoiceDao.delete(id2);
    }
}