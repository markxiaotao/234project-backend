package camt.se234.project.service;

import camt.se234.project.dao.OrderDao;
import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SaleOrderServiceImplTest {
    SaleOrderServiceImpl SaleOrderService;
    OrderDao orderDao;

    @Before
    public void setup(){
        SaleOrderService = new SaleOrderServiceImpl();
        orderDao =  mock(OrderDao.class);
        SaleOrderService.setOrderDao(orderDao);
    }

    @Test
    public void testGetSaleOrders(){
        List<SaleOrder> mockSaleOrder = new ArrayList<>();
        List<SaleTransaction> mockTransactions = new ArrayList<>();
        mockTransactions.add(new SaleTransaction(000001L,"T000001",new SaleOrder(),new Product(000001L,"P000001","Laptop","Mobile computer","GoodImage",5500.0),3));
        mockTransactions.add(new SaleTransaction(000002L,"T000002",new SaleOrder(),new Product(000002L,"P000002","Phone","Mobile phone","GoodImage2",6800.0),4));
        mockTransactions.add(new SaleTransaction(000003L,"T000003",new SaleOrder(),new Product(000003L,"P000003","Paid","Mini mac","GoodImage3",3200.0),5));
        mockSaleOrder.add(new SaleOrder(000201L,"S000001",mockTransactions));
        when(orderDao.getOrders()).thenReturn(mockSaleOrder);
        assertThat(SaleOrderService.getSaleOrders(),hasItems(new SaleOrder(000201L,"S000001",mockTransactions)));
    }

    @Test
    public void testGetAverageSaleOrderPrice(){
        List<SaleOrder> mockSaleOrder = new ArrayList<>();
        List<SaleTransaction> mockTransactions = new ArrayList<>();
        mockTransactions.add(new SaleTransaction(000001L,"T000001",new SaleOrder(),new Product(000001L,"P000001","Laptop","Mobile computer","GoodImage",5500.0),3));
        mockTransactions.add(new SaleTransaction(000002L,"T000002",new SaleOrder(),new Product(000002L,"P000002","Phone","Mobile phone","GoodImage2",6800.0),4));
        mockTransactions.add(new SaleTransaction(000003L,"T000003",new SaleOrder(),new Product(000003L,"P000003","Paid","Mini mac","GoodImage3",3200.0),5));
        List<SaleTransaction> mockTransactions2 = new ArrayList<>();
        mockTransactions2.add(new SaleTransaction(000001L,"T000004",new SaleOrder(),new Product(000001L,"P000001","ps4","Game Machine","GoodImage",1500.0),2));
        mockTransactions2.add(new SaleTransaction(000002L,"T000005",new SaleOrder(),new Product(000002L,"P000002","psp","Game Machine","GoodImage2",3000.0),1));
        mockTransactions2.add(new SaleTransaction(000003L,"T000006",new SaleOrder(),new Product(000003L,"P000003","NDS","Game Machine","GoodImage3",2000.0),6));
        mockSaleOrder.add(new SaleOrder(000201L,"S000001",mockTransactions));
        mockSaleOrder.add(new SaleOrder(000202L,"S000002",mockTransactions2));
        when(orderDao.getOrders()).thenReturn(mockSaleOrder);
        assertThat(SaleOrderService.getAverageSaleOrderPrice(),is(38850.0));
    }
}
