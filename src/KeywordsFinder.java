import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileFindVisitor extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;

    public MyFileFindVisitor(String pattern) {
        try {
            matcher = FileSystems.getDefault().getPathMatcher(pattern);
        } catch (IllegalArgumentException iae) {
            System.err
                    .println("Invalid pattern");
            System.exit(1);
        }
    }

    public FileVisitResult visitFile(Path path,
                                     BasicFileAttributes fileAttributes) {
        find(path);






        return FileVisitResult.CONTINUE;
    }



    private void find(Path path) {
        Path name = path.getFileName();
        if (matcher.matches(name))
            System.out.println("Matching file: " + path.getFileName());
    }




    public FileVisitResult preVisitDirectory(Path path,
                                             BasicFileAttributes fileAttributes) {
        find(path);
        return FileVisitResult.CONTINUE;
    }
}



public class KeywordsFinder {
    public static void main(String[] args) {
        Path startPath = Paths.get("/Users/Van-ess0/IdeaProjects/java-homework/aaa");

        //Строка с glob-шаблоном  
        String pattern = "glob:*volatile*";

        try {
            Files.walkFileTree(startPath, new MyFileFindVisitor(pattern));
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 