package stringmethods.filename;

public class FileNameManipulator {
    public char findLastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        return fileName.substring(fileName.indexOf(".")+1);
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        return fileName.substring(fileName.indexOf(".")+1).equals(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.equals(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        return fileName.substring(0, fileName.indexOf(".")) +
                fileName.toLowerCase().substring(fileName.indexOf("."));
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.replace(present,target);
    }

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        System.out.println(fileNameManipulator.findLastCharacter("SKYROADS.EXE"));
        System.out.println(fileNameManipulator.findFileExtension("SKYROADS.EXE"));
        System.out.println(fileNameManipulator.identifyFilesByExtension("EXE","SKYROADS.EXE"));
        System.out.println((fileNameManipulator.compareFilesByName(
                "SKYROADS.EXE", "SKYROADS.EXE")));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase("SKYROADS.EXE"));
        System.out.println(fileNameManipulator.replaceStringPart("SKYROADS.EXE","ROADS","FALL"));
    }
}
