import java.util.Stack;

public class Mystack {
    public static void main(String[] args) {
        Stack<Integer>Lishnumber=new Stack<>();
        Lishnumber.push(1);
        Lishnumber.push(2);
        Lishnumber.push(3);
        Lishnumber.push(4);
        while (!Lishnumber.isEmpty()){
            System.out.println(Lishnumber.pop());
        }

    }
}
