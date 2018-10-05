

/*
 *
 * 201504003 구본익
 * 2018-10-09 24:00 까지 과제
 *
 * */

public class Music {

    private String song;
    private String singer;
    private int day;
    public void result(){
        System.out.println("노래 이름 : " + this.song + "  가수 : " + this.singer + "  발매일 : " + this.day);
    }
    Music(String song, String singer, int day){
        this.song = song;
        this.singer = singer;
        this.day = day;
    }


}
