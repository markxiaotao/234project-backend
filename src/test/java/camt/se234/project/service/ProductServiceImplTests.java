package camt.se234.project.service;

import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceImplTests {
    ProductServiceImpl productService;
    ProductDao productDao;
    @Before
    public void setup(){
        productService = new ProductServiceImpl();
        productDao =  mock(ProductDao.class);
        productService.setProductDao(productDao);
    }
    @Test
    public void testGetAllProducts(){
        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(new Product(000001L,"P000001","Laptop","Mobile computer","GoodImage",55.0));
        mockProducts.add(new Product(000002L,"P000002","Phone","Mobile phone","GoodImage2",22.0));
        mockProducts.add(new Product(000003L,"P000003","Paid","Mini mac","GoodImage3",30.0));
        when(productDao.getProducts()).thenReturn(mockProducts);
        assertThat(productService.getAllProducts(),hasItems(new Product(000001L,"P000001","Laptop","Mobile computer","GoodImage",55.0)
            ,new Product(000002L,"P000002","Phone","Mobile phone","GoodImage2",22.0)
            ,new Product(000003L,"P000003","Paid","Mini mac","GoodImage3",30.0)));
    }

}
