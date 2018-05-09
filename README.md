# 234project-backend
  Group Name: HALFOfTFBOYS
  This Group has 2 handsome boys:
    Xiao Tao -- 592115515 -- markandxiaotao@gmail.com
    Zihao Yu -- 592115521 -- zihaoyu23@gmail.com
  URL: http://52.39.163.150:8091/
  Backend: http://52.39.163.150:8090/
  Katalon Test Respository Link: https://github.com/markxiaotao/SE234-project-Katalon
  Detail of Project Requirment: 
    1.Doing the Unit test:
        AuthenticationServiceImpl, the test of it implements in 234project-backend\src\test\java\camt\se234\project\service\AuthenticationServiceImplTests.java
        ProductServiceImpl, the test of it implements in 234project-backend\src\test\java\camt\se234\project\service\ProductServiceImplTests.java
        SaleOrderServiceImpl, the test of it implements in 234project-backend\src\test\java\camt\se234\project\service\SaleOrderServiceImplTest.java
    2.Deploy the web application and Deploy the application instance of your choice:
        Dockerfile, implements in 234project-backend\Dockerfile
        docker-compose.yml, implements in 234project-backend\docker-compose.yml
        .travis.yml, implements in 234project-backend\.travis.yml
    3.Provide the system test:
        Katalon Test Respository Link: https://github.com/markxiaotao/SE234-project-Katalon
            All the system tests in SE234-project-Katalon\Test Suites\ , because of the data-driven test need variables and data files.
            a.When the user opens the web site, the system will bring the user to the login page. It implements in SE234-project-Katalon\Test Suites\TestLoginPageAfterOpenWeb
            b.At the login page, The user can login to the system
              o If the user is admin role, the system will go to the admin page which consists of “Products”, and “Total Transaction” menus.
              It implements in SE234-project-Katalon\Test Suites\TestAdminLoginShowMenus
              o If the user is user role, the system will go to the user page which consists of “Products” and “Carts” menus.
              It implements in SE234-project-Katalon\Test Suites\TestUserRoleLoginShowMenus
              o If the user name and password is not correct, the error message, “Username/password is incorrect” is shown.
              It implements in SE234-project-Katalon\Test Suites\TestShowErrorMessageAfterWrongUsernameAndPassword
              o If the user empties the user name box, the warning message “Username is required” is shown
              o If the user empties the password box, the warning message “Password is required” is shown
              They implements in SE234-project-Katalon\Test Suites\TestShowMessagesAfterUserEmptiesBoxes
            c.When the user is in the Products page, all the available products are shown in the web page.
              It implements in SE234-project-Katalon\Test Suites\TestShowAllProductsInProductsPage
            d.When the user enters the Products page, and clicked at the add to cart button, the button will be changed to already added, and the number of selected products is shown next to the Carts menu.
              It implements in SE234-project-Katalon\Test Suites\TestAddProduct
            e.After selecting the products, if the user moves to the Carts page, all the selected products is shown in the cart page. The user can change the amount of products for each type of product, 
            and the total price will be changed regarding to the input value. If the user clicks confirm button, the transaction will be added.
              It implements in SE234-project-Katalon\Test Suites\TestCheckTransactions
            f.When the user clicks logout button, the system will return to the login page.
              It implements in SE234-project-Katalon\Test Suites\TestLogout
            g.If the user login to the admin page, when open the “Total Transaction” menu, all the carts, which have been added must be shown with the summaries of all carts.
              It implements in SE234-project-Katalon\Test Suites\TestShowALLTransactionsAfterAdminClickTotalTransaction


  
      
