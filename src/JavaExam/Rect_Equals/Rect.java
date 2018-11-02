package JavaExam.Rect_Equals;

public class Rect {
    int width;
    int height;

    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }
    public boolean equals(Rect p){
        if(width * height == p.width * p.height)
            return true;
        else
            return false;
    }
}
