public class PreAndPostIncrement{
    public static void main(String[] args){
        int x=5;
        int postIncrement= x++;
        int preIncrement= ++x;
        System.out.println(postIncrement);
        System.out.println(preIncrement);
    }
}