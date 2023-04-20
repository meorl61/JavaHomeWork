/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D0427_映射容器Map_自我挑戰_設計ExtraData存放App額外資料;

import java.util.HashMap;

/**
 *
 * @author 華美娟
 */
public class ExtraData {

    private HashMap<String, Object> map;

    public ExtraData() {
        map = new HashMap();
    }

    public void putExtra(String name, int value) {
        map.put(name, value);
    }

    public int getIntExtra(String name) {
        return (int) map.get(name);
    }

    public void putExtra(String name, CharSequence value) {
        map.put(name, value);
    }

    public CharSequence getCharSequenceExtra(String name) {
        return (CharSequence) map.get(name);
    }

    public void putExtra(String name, Object value) {
        map.put(name, value);
    }

    public Object getObjectExtra(String name) {
        return map.get(name);
    }
}
