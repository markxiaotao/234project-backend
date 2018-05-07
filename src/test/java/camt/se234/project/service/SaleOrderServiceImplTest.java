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
        mockSaleOrder.add(new SaleOrder(000201L,"S000002",new ArrayList<SaleTransaction>()));
        mockSaleOrder.add(new SaleOrder(000202L,"S000003",new ArrayList<SaleTransaction>()));
        mockSaleOrder.add(new SaleOrder(000203L,"S000004",new ArrayList<SaleTransaction>()));
        when(orderDao.getOrders()).thenReturn(mockSaleOrder);
        assertThat(SaleOrderService.getSaleOrders(),hasItems(new SaleOrder(000201L,"S000002",new ArrayList<SaleTransaction>())
                ,new SaleOrder(000202L,"S000003",new ArrayList<SaleTransaction>())
                ,new SaleOrder(000203L,"S000004",new ArrayList<SaleTransaction>())));
    }
}
