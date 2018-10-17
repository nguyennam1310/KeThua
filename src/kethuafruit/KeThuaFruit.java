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
public class KeThuaFruit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cam c = new Cam();
        c.Fruits(10000, "Korea", "1/1/1111", 10);
        System.out.println("----------------------------");
        CamSanh cs = new CamSanh();
        cs.Cam("xanh");
        cs.Fruits(500000, "VietNam", "1/12/2018", 30);
        System.out.println("----------------------------");
        Tao t=new Tao();
        t.tao(1);
        t.Fruits(1000000, "USA", "20/9/2018", 10);
    }

}
