package model;

import java.io.IOException;

public interface Savable {
    void save(String string) throws IOException;
}
