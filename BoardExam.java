// BoardExam percentage calculate in this program

public class BoardExam{
    public static void main(String[] args){

      // variable declaration
      float Hindi = 70 ;
      float Maths = 60 ;
      float Science = 62 ;
      float sst = 75 ;
      float English = 80;
      float Percentage ;
      float scored_mark ;

      scored_mark = Hindi + Maths + Science + sst + English;

      Percentage =  (scored_mark /500)*100 ;

      //Calculate all marks of subject
         System.out.println("scored_mark =" +scored_mark);
        //Calculate the percentage
        System.out.println("Percentage =" +Percentage );
    }

}
