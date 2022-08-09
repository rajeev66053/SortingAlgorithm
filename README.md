# Sorting Algorithm 

* Sorting refers to arranging data in a particular format. 
* Sorting algorithm specifies the way to arrange data in a particular order.

### In-place Sorting and Not-in-place Sorting
* Algorithms do not require any extra space and sorting is said to happen in-place or for example, within the array itself. This is called in-place sorting. Bubble sort is an example of in-place sorting.
* Some sorting algorithms, the program requires space which is more than or equal to the elements being sorted. Sorting which uses equal or more space is called not-in-place sorting. Merge-sort is an example of not-in-place sorting.

### Stable and Not Stable Sorting
* If a sorting algorithm, after sorting the contents, does not change the sequence of similar content in which they appear, it is called stable sorting.
* If a sorting algorithm, after sorting the contents, changes the sequence of similar content in which they appear, it is called unstable sorting.

### Bubble Sorting
* Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order. 
* This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n*n) where n is the number of items.

### Insertion Sorting
* This is an in-place comparison-based sorting algorithm.
* An element which is to be 'insert'ed in this sorted sub-list, has to find its appropriate place and then it has to be inserted there. Hence the name, insertion sort.
* The array is searched sequentially and unsorted items are moved and inserted into the sorted sub-list (in the same array).
* This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2), where n is the number of items.

### Selection Sorting
* This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts, the sorted part at the left end and the unsorted part at the right end.
* Initially, the sorted part is empty and the unsorted part is the entire list.
* The smallest element is selected from the unsorted array and swapped with the leftmost element, and that element becomes a part of the sorted array.
* This algorithm is not suitable for large data sets as its average and worst case complexities are of Ο(n2), where n is the number of items.

