public class Infiniteloop {
   
    static void print(String value)
	{
        System.out.println(value);
    }
    
    public static void main(String[] args) 
	{
        while(true){
            print("printing...");
        }
    }
}