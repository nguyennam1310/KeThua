/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethuafruit;

/**
 *
 * @author DELL
 */
public class Fruits {
         private int gia;
         private String madein;
         private String date;
         private int soluong;
        
         
         public void Fruits(int gia,String madein,String date,int soluong){ 
             this.gia = gia;
             this.madein = madein;
             this.date = date;
             this.soluong = soluong;
             
             System.out.println("giá:"+gia);
             System.out.println("xuất sứ:"+madein);
             System.out.println("ngày nhập:"+date);
             System.out.println("số lượng"+soluong);
             
         }
    
 
   
    
}