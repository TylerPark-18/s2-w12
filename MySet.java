public class MySet{
    private int[] myElements;
    private int myElementCount;

    public MySet(int count){
        myElements = new int[count];
        myElementCount = count;
        for(int x = 0; x < count; x++){
            myElements[x] = x * 10;
        }
        System.out.println(this);
        boolean isIn = contains(10);
        System.out.println(isIn);
        isIn = contains(132);
        System.out.println(isIn);
        boolean remove = removeAll(10);
        System.out.println(remove);
    }

    public boolean contains(int x){
        return containsHelper(x, 0);
    }

    public boolean containsHelper(int value, int index){
       if(index ==myElementCount)
        return false;
       else if(value==myElements[index]){
        return true;
       }
       return containsHelper(value, index+1);
    }
    public boolean removeAll(int x){
        return removeHelper(x, 0,0);
    }

    public boolean removeHelper(int value, int index,int x){
        
        if(index==myElementCount){
            if(x>0){
                return true;
            }
            return false;
        } else if(value==myElements[index]){
            for (int i = index; i < myElementCount-1; i++) {
                myElements[i] = myElements[i+1];
                
            }
            myElementCount--;
            x++;
            index--;
        }
        return removeHelper(value, index+1,x);    
    }
    public String toString(){
        return myElements.toString();
    }

    public static void main(String[] args) {
        new MySet(10);
        
    }
}