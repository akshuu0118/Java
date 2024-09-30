class reltional
{
    public static void main (String args[])
    {
        System.out.println("enetr the three number");
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if((a>b)&& (a>c))
        {
            System.out.println("a is maximum"+a);
        }
        else if((b>a)&& (b>c))
        {
            System.out.println("b is maximum"+b);
        }
        else if((c>a)&& (c>b))
        {
            System.out.println("c is a maximum"+c);

        }
        else
        {
            System.out.println("they are equal");
        }
    }
}