public class MyClass {
    public static void main(String args[]) {
      int n1=26674;
      int n2=105;
      int n3=37943;
      int n4=95278;
      int n5=27845;
      int ans=findSumeetSum(n1,n2,n3,n4,n5);
      System.out.println(ans);
    }
    
    static int findSumeetSum(int n1,int n2,int n3,int n4,int n5){
      
      int[]a1=integerToArray(n1);
      int []a2=integerToArray(n2);
      int[]a3=integerToArray(n3);
      int[]a4=integerToArray(n4);
      int[]a5=integerToArray(n5);
      
      int[]sum1=printResult(a1); //973
      int[]sum2=printResult(a2); //732
      int[]sum3=printResult(a3);
      int[]sum4=printResult(a4);
      int[]sum5=printResult(a5);
      
      int sum=ArraytoInteger(sum1)+ArraytoInteger(sum2)+ArraytoInteger(sum3)+ArraytoInteger(sum4)+ArraytoInteger(sum5);
      return sum;
      
      //System.out.println(sum1);
      //System.out.println(sum2);
      //System.out.println(sum1+sum2+sum3+sum4+sum5);
      //for(int i=0;i<sum2.length;i++){
       //   System.out.println(sum2[i]);
      //}
      
      
      
      
    }
    static int[] integerToArray(int n){
      String str=Integer.toString(n);
      int[]a=new int[str.length()];
      for(int i=0;i<str.length();i++){
          a[i]=str.charAt(i)-'0';
          //System.out.println(a[i]);
      }
      return a;
    
        
    }
    
    static int ArraytoInteger(int[]a){
        StringBuilder sb=new StringBuilder();
        for(int i:a){
            sb.append(i);
        }
        int num=Integer.parseInt(sb.toString());
        return num;
    }
    
    static int[] printResult(int[]a){
      int sum=0;    
      int[]b=new int[a.length];
      int[]c=new int[3];
      b=sortArray(a);
      int blen=b.length;
      if(blen==3){
        for(int i=0;i<blen;i++){
              //sum+=b[i];
              c[i]=b[i];
             
         }
          
      }
       if(blen>3){
          for(int i=0;i<=2;i++){
              //sum+=b[i];
              c[i]=b[i];
              
          }
          
          
      }
      return c;
   }

    static int[] sortArray(int[] a){
        int temp=0;
        for(int i=0;i<a.length;i++){
          for(int j=i+1;j<a.length;j++){
              if(a[i]<a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
          }
        }
        return a;
      
    }
        
    
}      
