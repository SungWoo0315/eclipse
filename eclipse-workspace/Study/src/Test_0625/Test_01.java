package Test_0625;

public class Test_01 {

	public static void main(String[] args) {
		
			 
//			    int a = 3;
//			    if( a-->4 )
//			      a++;
//			    if( ++a>7 )
//			      ++a;
//			    else
//			      a = ++a + a++;
//			    System.out.println( a );  
			  
			
			    
//			    int a = 2;
//			    switch( a ) {
//			      case 1 : a++;
//			      case 2 : a++; 
//			      case 4 : a++;
//			    }
//			    System.out.println( a );  
			    
			    
			
//		   	    int b=1, c=0;
//		   	    for( int a=2; a<5; a++) {
//		   	    	if( c++>b ) { b=a+c; }
//		   	    }
//		   	    System.out.println( a+b+c );  
			    	  
			    	
		   	    
//		   	  int a=0, b=5;
//		      jump : for(; ; a++) {
//		            for(; ; --b) {
//		              if(a>b) break jump;
//		            }
//		      }
//		      System.out.println( a+b );   
			    
	    int a=1, b=5;
	    jump : for(; ;) {
	      a++;
	          for(; ;) {
	                if(a>--b) break jump;
	          }
	    }
	    System.out.println( a+b );
			    
	}

}
