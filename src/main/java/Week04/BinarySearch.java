package Week04;

/**
 * @CLASSNAME:BinarySearch
 * @AUTHOR: wangteng
 * @TIME: 2020-07-0110:13
 */
public class BinarySearch {


    public static void main(String[] args) {
        int[] c = new int[]{-1,0,1,2,4};

//        int i = deBS(c, 8, 0, c.length-1 );
        System.out.println(getEIndex(c));
//        int i = binarySerach(c, 7);
//        System.out.println(i);
    }

    /**
     * 查找与数组下标相等的数字
     *
     *
     */
    private static int getEIndex(int[] arry){
        int hi = arry.length-1;
        int low = 0;
        int mid = 0;
        while(low <= hi){
            mid = (hi+low)/2;
            if(arry[mid] < mid){
                low = mid+1;
            }else if(arry[mid] > mid){
                hi = mid-1;
            }else {
                return mid;
            }

        }
        return -1;


    }







    private static int binarySerach(int[] array, int key){

        int heigh = array.length-1;
        int low = 0;
        int mid = 0;

        while (low <= heigh){
            mid  = (heigh + low)/2;
            if(array[mid] == key){
                return mid;
            }else if(array[mid] > key){
                heigh = mid-1;
            }else if(array[mid]< key){
                low = mid+1;

            }

        }
        return -1;
    }



    private static int deBS(int[] array, int key, int begin, int end){
        if(begin > end || key <0 || begin<0 || end<0){
            return -1;
        }
        int mid = (begin+end)/2;
        if(array[mid] > key){
            return deBS(array,key,begin,mid-1);
        }else if(array[mid] < key){
            return deBS(array,key,mid+1,end);
        }else {
            return mid;
        }
    }
}
