
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello world!"+"\n");
		
		/*
		for(int i=5; i>0; i--) { 
			System.out.print("\n");
			
			for(int j=5; j>i; j--)
			System.out.print("|");
		}
		
		for(int x=5; x>0; x--) { 
			System.out.println();
			for(int y=0;y<x;y++)
			System.out.print("*");
		}*/
		
		/*
		for(int i=4; i>0; i--) { 			
			for(int j=5; j>i; j--)
			System.out.print("_");
						 				
			for(int y=0; y<i; y++)
			System.out.print("O");
			
			System.out.println();		
		}*/
		
		/*
		for(int i=0; i<5; i++) { 			
			for(int j=0; j<i; j++)
			System.out.print("_");
			
			System.out.println();			 				
			
			for(int y=4; y>i; y--)
			System.out.print("O");
								
		}*/
		
		
		
		// Upper Half Diamond
		for(int i=0; i<=5; i++) { 			
			
			//Right side of top edged half diamond
			for(int n=6; n>i; n--)
				System.out.print("_");	
			
			if(i>=0) System.out.print("O");
			
			for(int o=0; o<i; o++)	
				System.out.print("O");	

			
			//Left side of top edged half diamond
			for(int j=0; j<i; j++)
			System.out.print("O");
			
			if(i<=5) System.out.print("_");
			
			for(int k=5; k>i; k--)
			System.out.print("_");
			
			
			System.out.println();		
		
		}
		
		
		for (int i=0;i<13;i++) System.out.print("O");
		
		System.out.println();
		
		
		// Lower half Diamond
		for(int i=5; i>=0; i--) { 			
			
			//Left side of bottom edged half diamond
			for(int j=6; j>i; j--)
			System.out.print("_");
			
			if(i==0) System.out.print("O");
			
			for(int k=0; k<i; k++)
			System.out.print("O");

			
			//Right side of bottom edged half diamond
			for(int n=0; n<i; n++)
				System.out.print("O");	
			
			if(i>=1) System.out.print("O");
			
			for(int o=6; o>i; o--)	
				System.out.print("_");	

			
			System.out.println();		
		}
				
				
		
		/**Basics of system-defined variable use.
	    int a, b;
	    float temp=0;
	    
	    //a=7; b=31;
			    
	    temp = (a=10)/(b=5);
	    
	    System.out.println(temp);
	    System.out.print(a);
	    */
	    
	}

}
