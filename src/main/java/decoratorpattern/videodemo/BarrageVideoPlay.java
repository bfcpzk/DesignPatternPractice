package decoratorpattern.videodemo;

// 弹幕视频播放：定义弹幕播放的抽象角色，具体的弹幕实现交给子类
public abstract class BarrageVideoPlay extends MediaPlay{

    protected MediaPlay mediaPlay;

    public BarrageVideoPlay(MediaPlay mediaPlay) {
        this.mediaPlay = mediaPlay;
    }
}