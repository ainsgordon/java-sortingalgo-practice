import java.util.ArrayList;

public class Group {
    private ArrayList<Member> members = new ArrayList<Member>();


    public void addMember(Member m) {
        members.add(m);
    }

    public int getSize() {
        return members.size();
    }

    // GET CODE FOR THIS
    public int recursiveSum(int num) {
        if(num == members.size() - 1) {
            return members.get(num).getAge();
        }
        return members.get(num).getAge() + recursiveSum(num+1);
    }

    public void mergeSortMembers(int min, int max){
        if(min < max){
            int mid = (min + max)/2;
            mergeSortMembers(min, mid);
            mergeSortMembers(mid+1, max);
            mergeMembers(min, mid, max);
        }
    }


    public void mergeMembers(int first, int mid, int last) {
        ArrayList<Member> temp = new ArrayList<Member>();
        int first1 = first;
        int last1 = mid;
        int first2 = mid + 1;
        int last2 = last;
        int index = first1;

        while(first1 <= last1 && first2 <= last2){
            if(members.get(first1).getAge() < members.get(first2).getAge()){
                temp.set(index, members.get(first1));
                first1++;
            }
            else {
                temp.set(index, members.get(first2));
                first2++;
            }
            index++;
        }
        while(first1 <= last1){
            temp.set(index, members.get(first1));
            first1++;
            index++;
        }
        while(first2 <= last2){
            temp.set(index, members.get(first2));
            first2++;
            index++;
        }
        for(index = first; index <= last; index++){
            members.set(index, temp.get(index));
        }
    }

    public void printMembers() {
        for(int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).toString());
        }
    }

    public void quickSort(int min, int max){
        int pivot;
        if(min < max){
            pivot = partition(min, max);
            quickSort(min, (pivot-1));
            quickSort((pivot + 1), max);
        }
    }

    public int partition(int min, int max){

        Member pivot = members.get(min);
        int left = min;
        int right = max;
        while(left < right){
            while(members.get(left).getAge() <= pivot.getAge() && left < right){
                left++;
            }
            while(members.get(right).getAge() > pivot.getAge()){
                right--;
            }
            if(left < right){
                swap(left, right);
            }
        }
        swap(min, right);

        return right;
    }

    public void swap(int left, int right){
        Member temp = members.get(left);
        members.set(left, members.get(right));
        members.set(right, temp);
    }


}
