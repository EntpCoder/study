package day02;

public class MyContainer {
    private final static int DEFAULT_CAPACITY = 10;
    private  int[] defaultArray;
    private int size = 0;
    public MyContainer(){
        this(DEFAULT_CAPACITY);
    }
    public MyContainer(int capacity){
        defaultArray = new int[capacity];
    }
    //添加新元素
    public void add(int element){
        if (size == defaultArray.length){
            ensureCapacityInternal(size + 1);
        }
        defaultArray[size] = element;
        size++;
    }
    public void add(int index, int element){
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("添加的索引超出范围");
        }
        if (size == defaultArray.length){
            ensureCapacityInternal(size + 1);
        }
        System.arraycopy(defaultArray, index, defaultArray, index + 1, size - index);
        defaultArray[index] = element;
        size++;
    }
    // 扩容
    private void ensureCapacityInternal(int minCapacity){
        if (minCapacity - defaultArray.length > 0){
            int newSize = (defaultArray.length << 1) + 1;
            if (newSize - minCapacity < 0){
                newSize = minCapacity;
            }
            int[] newArray = new int[newSize];
            System.arraycopy(defaultArray, 0, newArray, 0, defaultArray.length);
            defaultArray = newArray;
        }
    }
    // 遍历容器中已有的元素
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(defaultArray[i] + " ");
        }
    }
}
