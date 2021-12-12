package interfacedefaultmethods;

import java.io.File;
import java.util.List;

public class LongWord implements FileOperations {
    @Override
    public String getLongWord(List<String> wordMatrix) {
        StringBuilder sb = new StringBuilder(wordMatrix.get(0));
        for (int i = 1; i < wordMatrix.size(); i++) {
            sb.append(wordMatrix.get(i).charAt(wordMatrix.get(i).length()-1));
        }
        return sb.toString();
    }
}
