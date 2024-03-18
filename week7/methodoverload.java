class multiplication{
    public void multi(int a,int b)
    {
        System.out.println(a*b);
    }
    public void multi(float a,float b,float c)
    {
        System.out.println(a*b*c);
    }
    public void multi(double a,double b,double c,double d)
    {
        System.out.println(a*b*c*d);
    }

    public static void main(String[] args) {
        multiplication product = new multiplication();
        product.multi(12,67);
        product.multi(0.5f,0.4f,0.6f);
        product.multi(3.344,53.45,34.314,34.477);
    }
}
