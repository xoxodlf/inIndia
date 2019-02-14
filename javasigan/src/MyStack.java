
class GStack<T> {
   int tos;
   Object [] stck;
   public GStack() {
      tos = 0;
      stck = new Object [10];
   }
   public void push(T item) {
      if(tos == 10)
         return;
      stck[tos] = item;
      tos++;
   }
   public T pop() {
      if(tos == 0)
         return null;
      tos--;
      return (T)stck[tos];
   }
}

public class MyStack {
   public static <T> GStack<T> reverse(GStack<T> a){
      GStack<T> s = new GStack<T>();
      while (true) {
         T tmp;
         tmp = a.pop();
         if (tmp == null)
            break;
         else {
        	 s.push(tmp);
         }
      }
      return s;
   }
   
   public static <T> void printStack (GStack<T> b) {
      b=reverse(b);
      
      for (int n=0; n<b.tos; n++) {
         System.out.println(b.stck[n]);
      }
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      GStack<String> stringStack = new GStack<String>();
      stringStack.push("seoul");
      stringStack.push("busan");
      stringStack.push("LA");
      
      printStack(stringStack);
      
      GStack<Integer> intStack = new GStack<Integer>();
      intStack.push(1);
      intStack.push(3);
      intStack.push(5);
      
      
   }

}