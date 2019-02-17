import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBinarySearch {

    int[] arr = {1,2,3};


    @Test
    public void testIfIsSearched(){
        BinarySearch binarySearch = new BinarySearch();
        assertTrue(binarySearch.binarySearch( arr, 2 ));
    }

    @Test
    public void testIfIsNotSearched(){
        BinarySearch binarySearch = new BinarySearch();
        assertFalse(binarySearch.binarySearch( arr, 10 ));
    }


}
