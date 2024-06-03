package pattern;
import java.util.*;
public class countsort {
    public static void main(String []args){
        int []A = {1,5,3,6,2,3,0,9};
        int []B=new int [A.length];
        countSort(A,B,9);
    }
        public static void countSort(int A[],int B[],int k){ //k is index bound
            int []C=new int [k+1];
            for (int j=1;j<A.length;j++){
                C[A[j]]= C[A[j]]+1;
            }
            for(int i =1;i<=k;i++){
                C[i]=C[i]+C[i-1];
            }
            for (int i =A.length - 1;i>=0;i--){
                B[C[A[i]]] = A[i];
                C[A[i]] = C[A[i]] - 1;
            }
            System.out.println(Arrays.toString(B));
            System.out.println("\n"+"RAJVEER SINGH "  );
            System.out.println("22SCSE10341 ");
        }
    }

