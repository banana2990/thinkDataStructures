import chatper01.ListClientExample;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        ListClientExample lce = new ListClientExample(); // 처음 생성하면서 새롭게 LinkedList 또는 ArrayList 생성
        List list = lce.getList(); // 구체적인 클래스를 알 수 없는 형태 >> 캡슐화 / List 인터페이스 사용
        System.out.println(list);


    }
}