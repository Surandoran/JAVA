package Ch29;

import java.util.HashMap;
import java.util.Map;

public interface Service {
    Map<String, String> map = new HashMap();

    //등록
    void Insert();
    //수정
    void Update();

    //조회
    void inquiry();
    //삭제
    void Delete();
}
