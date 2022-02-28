package decoratorpattern.videodemo;

// 实现弹幕播放的类，具体的装饰器的实现类，这里我们使用红色字体进行弹幕视频播放
public class BarrageRedVideoPlay extends BarrageVideoPlay{

    public BarrageRedVideoPlay(MediaPlay mediaPlay) {
        super(mediaPlay);
    }

    @Override
    public String getMediaName() {
        return mediaPlay.getMediaName() + "（已开启弹幕）";
    }

    @Override
    public int getMediaSeconds() {
        return mediaPlay.getMediaSeconds();
    }

    @Override
    public String getMediaContent() {
        return "---+++*** " + mediaPlay.getMediaContent() + "（弹幕中）---+++***";
    }
}
