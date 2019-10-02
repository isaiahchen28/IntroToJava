public class Calls{

    public static void main(String [ ] args){
	
    	System.out.println("main starts");
    	System.out.println("main calls bar");
    	bar("    ");
    	System.out.println("back in main from bar");
    	System.out.println("main calls foo(4)");
    	foo(4, "    ");
    	System.out.println("back in main from foo(4)");
    	System.out.println("main calls foo(6)");
    	foo(6, "    ");
    	System.out.println("back in main from foo(4)");
    	System.out.println("main ends");
    }
    
    public static void bar(String indent){
	
    	System.out.println(indent + "bar starts");
    	System.out.println(indent + "bar calls foo(10)");
    	foo(10, indent + "    ");
    	System.out.println(indent + "back in bar from foo(10)");
    	System.out.println(indent + "bar ends");
    }

    public static void foo(int j, String indent){
	
    	System.out.println(indent + "foo starts j is "+j);
    	System.out.println(indent + "foo ends");
    }
}