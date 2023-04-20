package 繼承_老師的作業;

public class View extends Object {

    int id;
    int width;
    int height;

    View(int id, int width, int height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    int getId() {
        return id;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    void show() {
        System.out.println("----"+this.getClass().getSimpleName()+"----");
        System.out.println("id:" + id + " width:" + width + " height:" + height);
    }
    
}
