package decoratorpattern.videodemo;

/**
 * 视频播放类，模拟视频播放功能，属于真正被装饰的角色
 */
public class VideoPlay extends MediaPlay {

    private String videoContent; // 播放的视频内容
    private String videoName; // 播放的视频名称

    public VideoPlay(String videoName, String videoContent) {
        this.videoName = videoName;
        this.videoContent = videoContent;
    }

    @Override
    public String getMediaName() { // 获取媒体文件（视频）名称
        return videoName;
    }

    @Override
    public int getMediaSeconds() { // 获取媒体文件的播放时长
        return videoContent.length();
    }

    @Override
    public String getMediaContent() { // 获取媒体文件的播放内容
        return videoContent;
    }
}