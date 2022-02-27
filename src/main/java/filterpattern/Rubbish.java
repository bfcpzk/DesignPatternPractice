package filterpattern;

public class Rubbish {

    private String name; // 垃圾名称

    private boolean isHarm; // 是否有害垃圾
    private boolean isRecycled; // 是否可回收
    private boolean isDry; // 是否干垃圾
    private boolean isWet; // 是否湿垃圾

    public Rubbish(String name, boolean isHarm, boolean isRecycled, boolean isDry, boolean isWet) {
        this.name = name;
        this.isHarm = isHarm;
        this.isRecycled = isRecycled;
        this.isDry = isDry;
        this.isWet = isWet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHarm() {
        return isHarm;
    }

    public void setHarm(boolean harm) {
        isHarm = harm;
    }

    public boolean isRecycled() {
        return isRecycled;
    }

    public void setRecycled(boolean recycled) {
        isRecycled = recycled;
    }

    public boolean isDry() {
        return isDry;
    }

    public void setDry(boolean dry) {
        isDry = dry;
    }

    public boolean isWet() {
        return isWet;
    }

    public void setWet(boolean wet) {
        isWet = wet;
    }

    @Override
    public String toString() {
        return "Rubbish{" +
                "name='" + name + '\'' +
                ", isHarm=" + isHarm +
                ", isRecycled=" + isRecycled +
                ", isDry=" + isDry +
                ", isWet=" + isWet +
                '}';
    }
}
