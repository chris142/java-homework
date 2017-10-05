import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileFindVisitor extends SimpleFileVisitor<Path> {

    private static final String KEY_WORD_FIRST = "transient";
    private static final String KEY_WORD_SECOND = "volatile";

    public FileVisitResult visitFile(Path path, BasicFileAttributes fileAttributes) {


        if (path.getFileName().toString().contains(".java"))
            try {
                String content = new String(Files.readAllBytes(path));

                boolean containsFirst = false;
                if (KEY_WORD_FIRST != null && content.contains(KEY_WORD_FIRST))
                    containsFirst = true;

                boolean containsSecond = false;
                if (KEY_WORD_SECOND != null && content.contains(KEY_WORD_SECOND))
                    containsSecond = true;

                if (containsFirst && containsSecond)
                    System.out.println(path);

            } catch (IOException e) {
                System.out.println(e);
            }

        return FileVisitResult.CONTINUE;
    }
}


public class KeywordsFinder {
    public static void main(String[] args) {
        Path startPath = Paths.get("/Users/Van-ess0/IdeaProjects/java-homework/aaa/src"); //ToChange


        try {
            Files.walkFileTree(startPath, new MyFileFindVisitor());
            System.out.println("Checked!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 