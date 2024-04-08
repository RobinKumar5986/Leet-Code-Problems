class Solution {
    public int countStudents(int[] student, int[] sand) {
        int q=0;
        int miss=0;

        while(true){
            if(student[q]==sand[q]){
                student[q]=-1;
                sand[q]=-1;

                q++;
                miss=0;
                
            }
            else{
                miss++;
                int temp=student[q];
                for(int i=q;i<student.length-1;i++){
                    student[i]=student[i+1];
                }
                student[student.length-1]=temp;

            }
            int newLen=student.length-q;

            if(q==student.length || miss==newLen)
                break;
        }
        return student.length - q;
    }
}