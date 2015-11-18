
/**
 * Write a description of class khh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Order
{
   private static int ordNum;
   private float price;
   //private Menu item; //combo,special,customizedItem;
  // private Date time;
   private Payment subtotal, total;
   private float gct;
   
//combo = new Menu;
   Menu special = new Menu();
   Menu customizedItem = new Menu();
   Date time = new Date();  
   
   public Order(Menu item)
   {
       this.ordNum = ordNum;
       this.item = item; 
       
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
   
   public Menu getSpecial()
   {
       return special;
   }
   
    public Menu getCustomizedItem()
   {
       return customizedItem;
   }
   
   public Date getTime()
   {
       return time;
   }
   
   
   public Payment getTotalPrice()
   {
       subtotal= price;
       return (subtotal+total);
   
   }
   
   
}
