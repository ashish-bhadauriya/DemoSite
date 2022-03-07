package RecursionBacktracking;
import java.util.*;
public class GetStairsPaths {
         public static void main(String[]args) {
        	@SuppressWarnings("resource")
			Scanner scn=new Scanner(System.in);
        	int n=scn.nextInt();
        	ArrayList<String>res=getPaths(n);
        	System.out.print(res);
        	 
         }
         
         public static ArrayList<String>getPaths(int n)
         {
        	 if(n==0) {
        		 ArrayList<String>bres=new ArrayList<>();
        		 bres.add("");
        		 return bres;
        	 }
        	 else if(n<0) {
        		 ArrayList<String>bres=new ArrayList<>();
        		 return bres;
        	 }
        	 
        	 ArrayList<String>path1=getPaths(n-1);
        	 ArrayList<String>path2=getPaths(n-2);
        	 ArrayList<String>path3=getPaths(n-3);
        	 
        	 ArrayList<String>paths=new ArrayList<>();
        	 for(String path:path1) {
        		 paths.add(1+path);
        	 }
        	 
        	 for(String path:path2) {
        		 paths.add(2+path);
        	 }
        	 
        	 for(String path:path3) {
        		 paths.add(3+path);
        	 }
        	 
        	 return paths;
         }
        		
}
//Ashish Bhadauriya