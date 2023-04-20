/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0427_映射容器Map_老師範例;

/**
 *
 * @author 華美娟
 */
public class Student {

    String name;
    int eng;
    int math;

    public Student(String name, int eng, int math) {
        this.name = name;
        this.eng = eng;
        this.math = math;
    }

    public void show() {
        System.out.println("name " + this.name);
        System.out.println("eng " + this.eng);
        System.out.println("math " + this.math);
        System.out.println("tot " + 工具.加總(eng, math));
        System.out.println("avg " + 工具.平均(eng, math));
    }
}
