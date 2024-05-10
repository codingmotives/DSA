import com.temp.basics.BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] inputArr= {1,3,4,6,9,11,12};
        BinarySearch binarySearch= new BinarySearch();
        boolean isFound= binarySearch.searchElement(inputArr,2);
        System.out.println("element found: "+ isFound);
    }
}