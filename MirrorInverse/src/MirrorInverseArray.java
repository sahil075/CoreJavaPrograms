public class MirrorInverseArray
{  
public static void main (String args[])  
{  
int count = 0;  
//array to be inversed  
int arr[ ] = { 3, 4, 5, 0, 1, 2 };  
//loop iterates over the array   
for ( int i = 0 ; i < arr.length ; i ++ )  
{  
if ( arr [ arr [ i ] ] == 1 )  
{  
//increments the count variable by 1 if the above condition returns true  
count ++;  
}  
}  
if (count != 0)  
{  
System.out.println ( "The given array is mirror inverse.") ;  
}  
else  
{  
System.out.println ("The given array is not mirrored inverse.");  
}  
}  
}  