public interface List<T> {
    public void insert(T t);
    public T remove(int index);
    public T getValue(int index);
    public void setValue(int index, T t);
}
