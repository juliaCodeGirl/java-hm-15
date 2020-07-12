package ru.netology.manager;
import java.util.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
public class FileOpenManager {
    HashMap<String, String> maps = new HashMap<>();

    public HashMap<String, String> getMaps() {
        return maps;
    }

    public void registerApp(String file, String app) {
        maps.put(file, app);
    }

    public String getApp(String file) {
        return maps.get(file);
    }

    public void removeKey(String file) {
        maps.remove(file);
    }

    public List<String> getAllKeys() {
        Comparator byAlphabet = Comparator.naturalOrder();
        Set<String> files = new HashSet<>(maps.keySet());
        ArrayList<String> listFiles = new ArrayList<>(files);
        listFiles.sort(byAlphabet);
        return listFiles;
    }

    public List<String> getAllValues() {
        Comparator byAlphabet = Comparator.naturalOrder();
        Set<String> files = new HashSet<>(maps.values());
        ArrayList<String> listFiles = new ArrayList<>(files);
        listFiles.sort(byAlphabet);
        return listFiles;
    }
}