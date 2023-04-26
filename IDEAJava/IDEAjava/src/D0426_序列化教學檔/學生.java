/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0426_序列化教學檔;

import java.io.Serializable;

/**
 *
 * @author 華美娟
 */
public class 學生 implements Serializable {

    public String name;
    public int eng;
    public int math;

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "name=" + name + ", eng=" + eng + ", math=" + math;
    }

}
