public class expection {
    public static void main(String[] args) {
        int x,y;
        x=5;
        y=0;
        int z;
        try
        {
            z=x/y;
        } catch (Exception e)
        {
            System.out.println("Exception generated from main method  in catch block" +e);
        }
    }
}
