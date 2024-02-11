public class MultipleChoiceTestGrader {
    public static void main(String[] args) {
        int i, j, m;
        char stud[][] = {
                { 'D', 'C', 'A', 'B' },
                { 'C', 'B', 'D', 'A' },
                { 'B', 'C', 'D', 'A' }
        };
        char ans[] = { 'C', 'B', 'D', 'A' };

        System.out.println("Student Answers-");
        for (i = 0; i < stud.length; i++) {
            for (j = 0; j < stud[i].length; j++) {
                System.out.print(stud[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Answer key-");
        for (i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        for (i = 0; i < stud.length; i++) {
            m = 0;
            for (j = 0; j < stud[i].length; j++) {
                if (stud[i][j] == ans[j]) {
                    m = m + 1;
                }
            }
            System.out.println("Mark of student " + (i+1) + ":" + m);
        }
    }
}
