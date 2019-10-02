public class InvoiceItem{
    
    String service;
    int hours;
    int price;
    
    public InvoiceItem(String service, int hours, int price){
        this.service = service;
        this.hours = hours;
        this.price = price;
    }
    
    public static void main(String [ ] args){
        InvoiceItem firstII = new InvoiceItem("rotate tires", 1, 5000);
        int tax = firstII . itemTax( );
        System.out.println(tax);
    }
    public int itemTax ( ){
        return (int)(price*.05);
    }
}
