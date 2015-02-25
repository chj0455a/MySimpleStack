package dcll.jcha.mysimplestack.MySimpleStack;

/**
 * Created by 21103468 on 25/02/2015.
 */
public class ImplStack implements SimpleStack{

    private Item[] stack;
    private int size;

    public ImplStack() {
        this.stack = new Item[10];
        this.size = 0;
    }

    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty(){
        return this.size == 0;
//        boolean empty = true;
//        for(int i = 0; i < this.stack.length)
//        {
//                empty = empty && (this.stack[i] == null) ;
//        }
//        return empty;
    }
    /**
     * Returns the number of items in this stack.
     */
    public int getSize(){
        return this.stack.length;
    }
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item){
        this.stack[this.size] = item;
        this.size++;
    }
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek(){
        return this.stack[this.size];
    }
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     */
    public Item pop(){
        Item i = this.stack[this.size];
        this.stack[this.size] = null;
        return i;
    }
}
