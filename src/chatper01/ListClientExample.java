package chatper01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExample
{
    private List list;
    public ListClientExample(){
        // 여기서 어느 쪽을 주석처리 하느냐에 따라서 동작이 달라짐
//        list = new LinkedList<>();
        list = new ArrayList();
    }

    public List getList(){
        return list;
    }

}
