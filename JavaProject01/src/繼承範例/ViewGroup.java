package 繼承範例;

import java.util.ArrayList;

public class ViewGroup extends View {

    ArrayList<View> views;

    ViewGroup(int id, int width, int height) {
        super(id, width, height);
        views = new ArrayList();
    }

    void addView(View v) {
        views.add(v);
    }

    @Override
    void show() {
        for (View v : views) {
            v.show();
        }
    }

    View findViewById(int vid) {        
        for (View v : views) {
            if (v.id == vid) {
                return v;
            }
        }
        return null;
    }
}
