import java.util.ArrayList;
public class Order {
     
    private   String name ;
    private   double total ;
    private   boolean ready ;

    public ArrayList<Item> items = new ArrayList<Item> () ;


    
    public String getName () {
        return this.name ;
    }
    public double getTotal () {
        return this.total;
    
    }
    public boolean getReady (){
        return this.ready ;
    }
    

}