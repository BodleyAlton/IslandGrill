/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IGGUI;

/**
 *
 * @author AltonJr
 */
import java.util.*;
public class Order {
    private static int ordNum;
   private float price;
   //private Menu item, combo,special,customizedItem;
   //private Time time;
   private Payment subtl, total;
   private float gct,p;
   private int q;
   private ArrayList order;

   private Menu combo = new Menu();
   private Menu special = new Menu();
   private Menu customizedItem = new Menu();
   private Menu item = new Menu();
   private Time time = new Time();
   private Payment subtotal = new Payment();
   private Mcombo ord = new Mcombo();
   /***
    * Constructor for order class. 
    * @param: null
    * @return: null
    */
   public Order()
   {
       //this.item = item;
       ordNum = getOrdNum(); // Associates Order number with Order
       time = getTime(); //Asociates a time/stopwatch with order
       order=ord.getOrdList(); // accepts order as a list
   }
    
   public int getOrdNum()
   {
       return ordNum+=1;
   }
   
   public void setOrdNum(int x)
   {
       ordNum=x;
   }
   
   public Menu getCombo()
   {
       return combo;
   }
   
   /*public Menu getSpecial()
   {
       return special;
   }*/
   
    /*public Menu getCustomizedItem()
   {
       return customizedItem;
   }*/
   
   public Time getTime()
   {
       return time;
   }
   
   public void setGct(float gct)
   {
       this.gct=gct;       
   }
   
   public float getGct()
   {
       return gct;
   }
   
  /* public float getTotalPrice()
   {
       subtl = (subtotal.totalPrice(float p, int q));
        //totalPrice;
       return (subtl * (1+gct));
}*/
}
