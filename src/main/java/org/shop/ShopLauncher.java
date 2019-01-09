package org.shop;


import org.shop.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The ShopLauncher class.
 */
public class ShopLauncher {
    
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        DataInitializer dataInitializer = context.getBean(DataInitializer.class);
        ProductInitializer productInitializer = context.getBean(ProductInitializer.class);
        SellerInitializer sellerInitializer = context.getBean(SellerInitializer.class);
        UserInitializer userInitializer = context.getBean(UserInitializer.class);
    }
}
