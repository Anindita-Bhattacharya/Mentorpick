void printBinaryCounting(int n) 
{ 
	// Complete only the given function
  	// Do not Read any input
  	// There is hidden code that reads the input for each test case and calls this function with Input value n (for every single test case)
  	// Print output only for this one test case, no newline in the end
	Queue<String>q=new LinkedList<>();
		String arr[]=new String[n+1];
		arr[0]="0";
		q.add("1");
		for(int i=1;i<n;i++)
		{
		    q.add(q.peek()+"0");
		    q.add(q.peek()+"1");
		    arr[i]=q.remove();
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(arr[i]+" ");
		}

}
