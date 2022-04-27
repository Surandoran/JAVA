package Ch28;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class C06SetMain {

    public static void main(String[] args) {

        Set<Integer> M = new HashSet();
        //난수 만들기
        Random rand = new Random();
        int i = 1;
        while (M.size() < 6){
            int ran = rand.nextInt(45) + 1;
            M.add(ran);
            System.out.println(i + "번째 번호는 " + ran + " 입니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
        //로또만들기
        //set을 이용해서 6자리 난수를 넣어줍니다
        //1-45까지 입니다
        //저장된 난수는 정렬상관없습니다(조금있다 정렬해보죠!)

        Random R = new Random();
        Set<Integer> lotto = new HashSet<>();
        while (lotto.size() < 7){
            lotto.add(rand.nextInt() + 1);
        }

        Iterator<Integer> iter = lotto.iterator();
        while (iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        //정렬
        List<Integer> list = new ArrayList<>(lotto);
        Collections.sort(list); //오름차순 정렬

        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        Collections.sort(list,Collections.reverseOrder()); //내림차순 정렬
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

}
