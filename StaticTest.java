public class StaticTest {
    private static int x; // shared among all the objects which means it's value will be considered according to the latest declaration value of X in the latest object 
    private int y; // all different kind of objects has its own value means if one object y has the value of 5 then the other object value if y can have 6 in it .

    public StaticTest(int val){ // ye ik constructor ha aur isme humne  ( val )ref varible dia ha agr hum jb bhi ye call krenge aur uske and value pass krenge to wo value neeche diye gaye interger means x aur y ko assign krdi jayegi 
        // is constructor ka name hota ha parameterized constructor 
        x = val ; 
        y = val ; 
    }
    
    public void show(){
        System.out.println(x + " " + y);
    }
    public static int getX(){ // ye humne x ke liye isliye kia ha takkay agr class ke bahir se hum x ki value get krna chahain to wo hum is trha se krenge if that x is private 
        return x ;
    }

    public static void main(String[] args) { 
        StaticTest s1 = new StaticTest(1); // idr humne value enter ki ha 1 iska mean ha ke x = 1 and y = 1 ye print hoga jb tk hum koi new value X ( STATIC VARIBLE ) ki define nh krdete .
        
        // like humne neeche 2 ke liye method call kia ha so idr bh X ki value 2 hojayegi 
        
        StaticTest s2 = new StaticTest(2); // idr humne value enter ki ha 2 so ab X jo ha vo humne static rkha ha to uski value ab hur function/method overwrite hokr 2 hojayegi aur Y ki value 1st time ma 1 hogi second time ma 2 hojayegi and so on.
        s2.show(); 
        s1.show(); 
    }

}