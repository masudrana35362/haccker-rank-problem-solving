class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName,String lastName, int idNumber, int[] scores){
        super(firstName,lastName,idNumber);
        this.testScores=scores;

    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate(){
        int av= getAverage(testScores);
        char grade = 0;
        if (90 <= av && av <=100){
            grade= 'O';
        }else if(80 <= av && av <90){
            grade= 'E';
        }else if(70 <= av && av < 80){
            grade= 'A';
        }else if(55 <= av && av <70){
            grade= 'P';
        }else if(40 <= av && av < 55){
            grade= 'D';
        }else if (av<40){
            grade= 'T';
        }
        return  grade;
    }

    public int getAverage(int[] scores){
        int total=0;
        for (int number: scores){
            total+=number;
        }
       return total/scores.length;
    }
}