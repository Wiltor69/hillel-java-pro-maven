import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class FileLoggerConfiguration implements Serializable {
    private String name;
    private String level;
    private long size;

    public FileLoggerConfiguration(String name, String level, long size) {
        this.name = name;
        this.level = level;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileLoggerConfiguration that = (FileLoggerConfiguration) o;
        return size == that.size && Objects.equals(name, that.name) && Objects.equals(level, that.level);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level, size);
    }

    @Override
    public String toString() {
        return "FileLoggerConfiguration{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", size=" + size +
                '}';
    }
}
