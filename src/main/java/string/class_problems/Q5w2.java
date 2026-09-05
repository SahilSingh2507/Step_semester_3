package string.practice;

    public class Q5w2 {

        // Normalize
        static String normalizeReference(String raw) {
            raw = raw.trim();
            return raw.substring(0, 3).toUpperCase() + raw.substring(3);
        }

        // Validate and Format
        static String validateAndFormat(String reference) {

            if (reference.length() != 14) {
                return "Invalid: wrong length";
            }

            // First 3 must be letters
            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(reference.charAt(i))) {
                    return "Invalid: bank code must be 3 letters";
                }
            }

            // Remaining 11 must be digits
            for (int i = 3; i < 14; i++) {
                if (!Character.isDigit(reference.charAt(i))) {
                    return "Invalid: body must contain only digits";
                }
            }

            StringBuilder sb = new StringBuilder();

            sb.append("[")
                    .append(reference.substring(0, 3))
                    .append("] DATE: ")
                    .append(reference.substring(3, 5))
                    .append("/")
                    .append(reference.substring(5, 7))
                    .append("/")
                    .append(reference.substring(7, 9))
                    .append(" | SEQ: ")
                    .append(reference.substring(9));

            return sb.toString();
        }

        public static void main(String[] args) {

            String ref1 = normalizeReference(" hdf03022600042 ");
            System.out.println(validateAndFormat(ref1));

            String ref2 = normalizeReference("12F03022600042");
            System.out.println(validateAndFormat(ref2));
        }
    }

