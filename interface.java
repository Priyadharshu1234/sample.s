interface Camera{
    void clickphoto();
}
interface Musicplayer{
    void PlayMusic();
}
Class phone implements Camera,Musicplayer{
    public void clickphoto(){
        System.out.println("photo taken from mobile");
            }
public void playMusic(){
    System.out.println("Music playing in phone");
}
}
public class interface{
    public static void main(Strings[] args){
        phone p=new phone();
        p.clickPhoto();
        p.playMusic();
    }
}