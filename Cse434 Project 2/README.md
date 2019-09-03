# Project 2 Report

This is project 2 Report

<p align="center">
<img src="https://github.com/BarunRoy1521257042/CSE434/blob/master/Cse434%20Project%202/NSU%20Logo/NSU%20logo.png">
</p>

<div align="center">

# North South University </h5>
##  Department of Electrical and Computer Engineering </h3>


## Project Name : Automated Functional Testing Using Selemium

**Course Code:** CSE 434

**Semester:** Summer2019

**Name:** Barun Roy

**ID:** 1521257042

**Faculty:** Shaikh Shawon Arefin Shimon(SAS3)

**Section:** 01

**Email:** roy.barun@northsouth.edu

**Github Repository:** https://github.com/BarunRoy1521257042/CSE434

**Date Prepared:** 03/09/2019
</div>





**Description:**

In this project I performed automated functional testing on a website naming http://automationpractice.com/index.php using selenium server - 3.9.1. This website is an e-commerce website where they sell all kinds of female dresses and shoes. I tested the title, logo, sign in, contact us and the full buying process of a product that is summary, address, shipping and payment.




**Snapshots of Features Tested:**

<p align="center">
<img src="https://github.com/BarunRoy1521257042/CSE434/blob/master/Cse434%20Project%202/Snapshots%20of%20features%20Tested/Features%20tested%20on%20the%20homepage.png">
</p>

<div align="center">


<p align="center">
<img src="https://github.com/BarunRoy1521257042/CSE434/blob/master/Cse434%20Project%202/Snapshots%20of%20features%20Tested/Snapshot%20of%20features%20tested%202.png">
</p>

<div align="center">


<p align="center">
<img src="https://github.com/BarunRoy1521257042/CSE434/blob/master/Cse434%20Project%202/Snapshots%20of%20features%20Tested/Snapshot%20of%20features%20tested%203.png">
</p>

<div align="center">


<p align="center">
<img src="https://github.com/BarunRoy1521257042/CSE434/blob/master/Cse434%20Project%202/Snapshots%20of%20features%20Tested/Snapshot%20of%20features%20tested%204.png">
</p>

<div align="center">


<p align="center">
<img src="https://github.com/BarunRoy1521257042/CSE434/blob/master/Cse434%20Project%202/Snapshots%20of%20features%20Tested/Snapshot%20of%20features%20tested%205.png">
</p>

<div align="center">



<p align="center">
<img src="https://github.com/BarunRoy1521257042/CSE434/blob/master/Cse434%20Project%202/Snapshots%20of%20features%20Tested/Snapshot%20of%20features%20tested%206.png">
</p>

<div align="center">




**Packages used:**

1) Selenium-server-3.9.1
2) Selenium-server-standalone-3.9.1
3) Chromedriver_win32
4) Eclipse-Java 2019-06
5) TestNG




**How different parts of the website is tested:**

I tested different parts of this website using TESTNG. I tested the title, logo, sign in, add product to cart, remove product from cart and the full buying process of a product that is summary, address, shipping and payment. In my TestNG class there is a before method, the respective test cases and an after method. Every time a test runs each test pairs up with the before method and the after method. In the before method the chrome driver gets launched at first then it loads the website that is http://automationpractice.com/index.php and then automatically signs in using the given email and password that I have sent to the desired Xpath using sendKeys. For the title test at first I get the title by String title = driver.getTitle(); and then compares it with actual and the expected that is actual is what I am getting after the test runs and expected is what I have declared the title to be and the code for this is: Assert.assertEquals (title, "My account - My Store");.
For the logo and signin test I stored the xpath of logo and signin in a boolean value and then gave Assert.assertTrue(b);. For the addtocart test at first selected the product automatically using the respective Xpaths and when it comes written that your cart has 1 product that I stored this text using xpath in a string naming extracted and in another string naming pattern I stored the pattern that I am expecting in this case that is "1 Product". Then compare it with Assert.assertEquals(extracted,pattern);. Similarily I performed this test in evry step of the buying process till the confirmation message comes that "Your order on My Store is complete." In the after method the driver gets closed after automatically performing the respective test cases. There are nine test cases in the TESTNG class and all the test cases passed successfully.
