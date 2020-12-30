public class SignComparator {
    String comparator;
    public String compare(int number){

            if(number>0) comparator = "Number is positive";
            else if (number<0) comparator = "Number is negative";
            else comparator = "Number is equal to zero";
            return comparator;
    }

}
