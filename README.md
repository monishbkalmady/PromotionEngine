
# Promotion Engine
# Overview
This is a simple promotion engine for a checkout process. The cart contains four items A, B, C and D each with different price and quantities. Based on promotional benefits a set of items are offered in a discounted price.

Here I have used Test-driven Development to write Junit test cases before the application logic is implemented. Different sets of scenarios are tested with varying Items and their quantities. Promotional benefits are applied to the items which meet quantity requirements.
## Dictionary Tree
```
├── src 
    ├── junit
        ├── PromotionJUnit.java
    ├── main
        ├── ShoppingCartUtil.java
    ├── model
        ├── Item.java
```
## Promotional offers
Individual Prices:

A = 50, B = 30, C = 20, D = 15

Promo offers:

3 of A's for 130

2 of B's for 45

C & D for 30

## Tehnologies Used
![](https://marsner.com/wp-content/uploads/test-driven-development-TDD.png)
![](https://www.graycelltech.com/wp-content/uploads/2021/11/c6c4202f79.jpg)
![](https://img.electronicdesign.com/files/base/ebm/electronicdesign/image/2019/03/electronicdesign_9314_106951promo.png?auto=format,compress&fit=crop&h=556&w=1000&q=45)
## Future Scope
* Adding more parameters for Items
* Increasing complexity of promotions
