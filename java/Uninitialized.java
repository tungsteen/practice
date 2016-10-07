public class Uninitialized
{
    public static class Dog
    {
        public Dog()
        {
            System.out.println("Bark!");
        }   
    }

    public static void main(String[] args)
    {
        // yes, they are uninitialized!
        int xvar;
        Integer xobj;
        Dog xdog;

        // compile error => means no executable
        System.out.println(xvar);
        System.out.println(xobj);
        System.out.println(xdog);
    }
}
