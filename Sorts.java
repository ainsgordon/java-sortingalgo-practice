public class Sorts {

    public static void main (String[] args){

        Group group = new Group();

        group.addMember(new Member("Bob Jones", 29));
        group.addMember(new Member("Susan Little", 23));
        group.addMember(new Member("Kathy White", 21));
        group.addMember(new Member("John Smith", 27));
        group.addMember(new Member("Mike Ross", 48));
        group.addMember(new Member("Jennifer Hunt", 32));
        group.addMember(new Member("Walter Brown", 55));
        group.addMember(new Member("Samantha Goings", 47));
        group.addMember(new Member("Steve Barber", 86));
        group.addMember(new Member("Terry Manson", 37));

        int sum = group.recursiveSum(0);
        System.out.println("Sum: " + sum);
        System.out.println("Avg: " + (sum/group.getSize()));

//        group.mergeSortMembers(1, group.getSize());
        group.quickSort(0, group.getSize()-1);

        group.printMembers();






    }

//    public static void quickSort(int[] array, int min, int max){
//        int pivot;
//        if(min < max){
//            pivot = partition(array, min, max);
//            quickSort(array, min, (pivot-1));
//            quickSort(array, (pivot + 1), max);
//        }
//    }
//
//    public static int partition(int[] array, int min, int max){
//
//        int pivot = array[min];
//        int left = min;
//        int right = max;
//        while(left < right){
//            while(array[left] <= pivot && left < right){
//                left++;
//            }
//            while(array[right] > pivot){
//                right--;
//            }
//            if(left < right){
//                swap(array, left, right);
//            }
//        }
//        swap(array, min, right);
//
//        return right;
//    }
//
//    public static void swap(int[] array, int left, int right){
//        int temp = array[left];
//        array[left] = array[right];
//        array[right] = temp;
//    }
//
//    public static void mergeSort(int[] array, int min, int max){
//        if(min < max){
//            int mid = (min + max)/2;
//            mergeSort(array, min, mid);
//            mergeSort(array, mid+1, max);
//            merge(array, min, mid, max);
//        }
//    }
//
//    public static void merge(int[] array, int first, int mid, int last){
//        int[] temp = new int[array.length];
//        int first1 = first;
//        int last1 = mid;
//        int first2 = mid + 1;
//        int last2 = last;
//        int index = first1;
//
//        while(first1 <= last1 && first2 <= last2){
//            if(array[first1] < array[first2]){
//                temp[index] = array[first1];
//                first1++;
//            }
//            else {
//                temp[index] = array[first2];
//                first2++;
//            }
//            index++;
//        }
//        while(first1 <= last1){
//            temp[index] = array[first1];
//            first1++;
//            index++;
//        }
//        while(first2 <= last2){
//            temp[index] = array[first2];
//            first2++;
//            index++;
//        }
//        for(index = first; index <= last; index++){
//            array[index] = temp[index];
//        }
//    }
}
