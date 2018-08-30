package tv.yuyin.logutil.data;

import tv.yuyin.logutil.LLog;

public class TestCls {

    //反例！！！ ==> 注意这种定义TAG的方式是不可取的，因为TestCls 被混淆后就可能变成a  b  c这样的了,根本不知道这个Log 是由谁打印的
    private static final String TAG = TestCls.class.getSimpleName();

    private String name,address;
    private int age;

    public TestCls() {
        LLog.d("Called on TestCls constructor");
        LLog.iWithTag(TAG,"Test TestCls tag");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestCls{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
