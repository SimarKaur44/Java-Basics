public class Static_variable{
    static int a=40;
    int b=50;
    void simpleDisplay(){
        System.out.println(a);
        System.out.println(b);
    }
    static void staticDisplay(){
        System.out.println(a);
    }
	public static void main(String[] args) {
	    Static_variable obj= new Static_variable();
	    obj.simpleDisplay();
	    
	    Static_variable.staticDisplay();
	    staticDisplay();
	}
}
