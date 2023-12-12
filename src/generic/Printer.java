package generic;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    void  printArray(T[] A){
        for (T element: A){
            System.out.println(element);
        }
    }
    

}