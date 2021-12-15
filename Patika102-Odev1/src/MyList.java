import java.util.ArrayList;

public class MyList<T> {

    ArrayList<T> liste = new ArrayList<T>(10);
    private int capacity = 10;

    public MyList() {
        int[] liste = new int[10];
    }

    public MyList(int capacity){
        int[] list = new int[capacity];
    }

    public int size(){
        return liste.size();
    }

    public void add(T data){
        if (liste.size()>=capacity) {
            setCapacity(getCapacity()*2);
        }
        liste.add(data);
    }

    public ArrayList<T> getList() {
        return liste;
    }

    public T get(int index){
        if (index<0 && index>=liste.size()){
            return null;
        }
        return liste.get(index);
    }

    public T remove(int index){
        if (index<0 && index>=liste.size()){
            return null;
        }
        return liste.remove(index);
    }

    public T set(int index, T data){
        if (index<0 && index>=liste.size()){
            return null;
        }
        return liste.set(index,data);
    }

    public String toString(){
        return liste.toString();
    }

    public void setList(ArrayList<T> liste) {
        this.liste = liste;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return liste.isEmpty();
    }

    public int indexOf(T data) {
        return liste.indexOf(data);
    }

    public int lastIndexOf(T data) {
        return liste.lastIndexOf(data);
    }

    public void clear(){
        liste.clear();
    }

    public boolean contains(T data) {
        return liste.contains(data);
    }

}
