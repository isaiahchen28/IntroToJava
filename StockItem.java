public class StockItem{
    
    String name;
    int price;
    boolean taxable;
    
    public StockItem(String name, int price, boolean taxable){
        this.name = name;
        this.price = price;
        this.taxable = taxable;
    }
    
    public static void main(String [ ] args){
        StockItem firstSI = new StockItem("milk", 139, false); 
        StockItem secondSI = new StockItem("broom", 99, true);
        int tax = firstSI . itemTax( );
        int tax2 = secondSI . itemTax( );
	InvoiceItem II1 = new InvoiceItem("tuneup", 2, 5000);
	System.out.println(II1.itemTax( ));
        System.out.println(tax + " " + tax2);
        System.out.println(firstSI.discount(200)+" "+secondSI.discount(300));
    }
    public int itemTax ( ){
	if (this.taxable){
	    return (int)(this.price * .06);
	} else {
	    return 0;
	}
    }
    public int discount(int quantity){
        if (quantity < 100){
            return 0;
        } else {
            return (int)(this.price * .1);
        }
    }
}
