package decoratorpattern.videodemo;

public class Client {

    public static void main(String[] args) {
        MediaPlay mediaPlay = new VideoPlay("射雕英雄传", "郭靖大战欧阳锋");
        MediaPlay mediaPlay1 = new BarrageRedVideoPlay(mediaPlay);
        mediaPlay.play(); // 不加装饰时
        mediaPlay1.play(); // 添加弹幕装饰时
    }
}
