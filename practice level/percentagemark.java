public class percentagemark {
        public static void main(String[] args) {
            // Marks obtained by Robert in three subjects
            int subject1Marks = 78;
            int subject2Marks = 45;
            int subject3Marks = 62;
    
            // Total marks calculation
            int totalMarks = subject1Marks + subject2Marks + subject3Marks;
    
            // Percentage calculation
            double percentage = (totalMarks / 300.0) * 100;
    
            // Displaying the results
            System.out.println("Marks in Subject 1: " + subject1Marks);
            System.out.println("Marks in Subject 2: " + subject2Marks);
            System.out.println("Marks in Subject 3: " + subject3Marks);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage Marks: " + percentage + "%");
        }
    }
    

