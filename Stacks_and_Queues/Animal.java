public class Animal {
    private int order;
    protected String name;

    public Animal(String s) { name = s;}

    public String getName(){return name;}
    public int getOrder() {return order;}
    public void setOrder(int ord) {order = ord;}
    public boolean isOlderThan(Animal a){return this.order < a.getOrder();}
}
