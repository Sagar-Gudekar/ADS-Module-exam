
class Two_Stack{
  int arr[];
  int size;
  int top1,top2;
    Two_Stack(int n){
		size=n;
		arr=new int[n];
		top1=n/2 +1;
		top2=n/2;
	}
	
	void push1(int y){
		if(top1 >0){
			top1--;
			arr[top1]=y;
			
		}
		else{
			System.out.println("Stack overflow..!");
			return;
		}
	}
	void push2(int y){
		if(top2 < size-1){
			top2++;
			arr[top2]=y;
			
		}
		else{
			System.out.println("Stack overflow..!");
			return;
		}
	}
	int pop1(){
		if(top1<=size /2){
			int y=arr[top1];
			top1++;
			return y;
		}
		else{
			System.out.println("Stack underflow..!");
			System.exit(1);
		}
		return 0;
	}
  
  
  int pop2(){
		if(top2>=size /2 + 1){
			int y=arr[top2];
			top2--;
			return y;
		}
		else{
			System.out.println("Stack underflow..!");
			System.exit(1);
		}
		return 1;
	}
  
  public static void main(String[] args){

   Two_Stack s1=new Two_Stack(5);
  s1.push1(5);
  s1.push2(10);
   s1.push2(40);
   s1.push2(15);
    s1.push1(11);
    s1.push2(7);
	
    System.out.println("popped element from stack1 is= "+s1.pop1());
 
  System.out.println("popped element from stack2 is= "+s1.pop2());
  }
  }
  