class Insertion_Sort{
      void sorting(int a1[],int n){
		 for(int i=1;i<n;i++){ 
		 int temp=a1[i];
		 int j=i-1;
		while(j>=0 && a1[j]>temp){
			a1[j+1]=a1[j];
			j=j-1;
			display(a1,n);
			 System.out.println();
		}	 
		a1[j+1]=temp;	 
		 } 
	  }
	  void display(int a1[],int n){
		 for(int i=0;i<n;i++){ 
		 System.out.print(a1[i]+" ");
		 }  
	  }

  public static void main(String[] args){
	  Insertion_Sort s1=new Insertion_Sort();
       int a1[]={2 ,4 ,6 ,8 ,3};
	   int n=a1.length;
	   System.out.println("size of array is:: "+a1.length);
	      System.out.println("Before sorting..!");
	   s1.display(a1,n);
		  System.out.println();
		  System.out.println("After sorting..!");
       s1.sorting(a1,n);
	   
	   s1.display(a1,n);
  }
  }