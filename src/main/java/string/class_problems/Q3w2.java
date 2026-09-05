package string.practice;

public class Q3w2 {

        static String validateFileExtension(String filename) {

            int index = filename.lastIndexOf('.');

            if (index == -1) {
                return "Rejected - invalid file type";
            }

            String extension = filename.substring(index + 1);

            if (extension.equalsIgnoreCase("pdf") ||
                    extension.equalsIgnoreCase("docx") ||
                    extension.equalsIgnoreCase("zip")) {
                return "Accepted";
            } else {
                return "Rejected - invalid file type";
            }
        }

        public static void main(String[] args) {

            System.out.println(validateFileExtension("Assignment1.PDF"));
            System.out.println(validateFileExtension("notes.txt"));
        }
    }

