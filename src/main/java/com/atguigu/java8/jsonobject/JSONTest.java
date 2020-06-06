package com.atguigu.java8.jsonobject;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class JSONTest {
    private Student student1 = new Student(15, "小明", "三年一班");

    @Test
    public void test1() {
        // 生成Json对象
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","tom");
        jsonObject.put("age","18");
        // JSONObject转JSONStr
        System.out.println(JSON.toJSONString(jsonObject));

        // JSONStr转JSONObject
        String jsonStr = "{\"name\":\"小王\",\"age\":18}";
        JSONObject jsonObject1 = JSON.parseObject(jsonStr);
        System.out.println(jsonObject1);

        // JSONStr转JavaBean  18 与 \"18\" 与 \"十八\"
        String jsonStr1 = "{\"age\":\"18\",\"name\":\"小王\",\"school\":\"四年一班\"}";
        Student student = JSON.parseObject(jsonStr1,Student.class);
        System.out.println(student);

        // JavaBean转JSONStr
        String str = JSON.toJSONString(student1);
        System.out.println(str);

        // JavaBean转JSONObject
        JSONObject jsonObject2 = (JSONObject) JSON.toJSON(student1);
        System.out.println(jsonObject2);
    }
}
