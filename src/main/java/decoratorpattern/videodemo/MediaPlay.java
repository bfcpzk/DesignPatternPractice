package decoratorpattern.videodemo;

/**
 * 定义 媒体播放 抽象类，用于模拟多媒体播放功能（Component 抽象构件角色）
 */
public abstract class MediaPlay {
    public abstract String getMediaName(); // 获取要播放的媒体文件名称
    public abstract int getMediaSeconds(); // 获取要播放的媒体文件的播放时长（s）
    public abstract String getMediaContent(); // 获取需要播放的媒体文件内容

    // 模拟媒体播放
    public final void play() {
        System.out.println("Media：" + getMediaName() + "(累计时长：" + getMediaSeconds() + " 秒) 正在播放");
        try {
            for (int i = 1; i <= getMediaSeconds(); i++) {
                Thread.sleep(1000);
                System.out.println("当前播放第 " + i + " 秒，" + getMediaContent() + "...");
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}