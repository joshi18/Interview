package List;

public class LinkedListabc{


    // It is also a implementation of  List.
    // In java LinkedList internally uses doubly linked list.
    // A node to store the data and another node and pointer to next and pointer to previous.
    // LinkedList has better performance in case of deletion and insertion.

//    ArrayList (based on dynamic arrays):
//    Access (get):
//    O(1) - Elements are stored in contiguous memory locations, allowing direct access by index.
//            Insertion/Deletion at end (add/removeLast):
//    O(1) - If space is available, adding to the end is constant time. Resizing the underlying array can lead to O(N) in worst-case scenarios, but amortized average is O(1). Removing from the end is also O(1).
//    Insertion/Deletion at beginning/middle (add/remove at index):
//    O(N) - Requires shifting elements to make space or close gaps, which scales linearly with the number of elements after the insertion/deletion point.
//    Search (contains/indexOf):
//    O(N) - Requires iterating through elements to find a match.
//    LinkedList (based on doubly linked lists):
//    Access (get):
//    O(N) - Requires traversing the list from the beginning or end to reach the desired index.
//    Insertion/Deletion at beginning/end (addFirst/addLast/removeFirst/removeLast):
//    O(1) - With pointers to the head and tail, these operations involve simply updating a few pointers.
//    Insertion/Deletion at middle (add/remove at index):
//    O(N) - Requires traversing the list to find the insertion/deletion point, then updating pointers.
//    Search (contains/indexOf):
//    O(N) - Requires traversing the list to find a match.
//    Summary:
//    ArrayList excels at random access (O(1)): but can be slow for insertions/deletions in the middle (O(N)).
//    LinkedList excels at insertions/deletions at the ends (O(1)): but is slow for random access and middle insertions/deletions (O(N)).
//    The choice between ArrayList and LinkedList depends on the specific use case and the frequency of different operations.


}
